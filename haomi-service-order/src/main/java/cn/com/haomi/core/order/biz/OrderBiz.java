/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.core.order.biz;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.com.haomi.common.constant.Constant;
import cn.com.haomi.common.page.PageBean;
import cn.com.haomi.common.page.PageParam;
import cn.com.haomi.common.utils.DateUtils;
import cn.com.haomi.core.order.dao.OrderDao;
import cn.com.haomi.inteface.order.entity.OrderEntity;
import cn.com.haomi.inteface.order.model.AddOrderModel;

@Component("orderBiz")
public class OrderBiz {
	
	@Autowired
	 private OrderDao orderDao;
	
	@Autowired
	private OrderLogBiz orderLogBiz;
	
	@Autowired
	private OrderExtendBiz orderExtendBiz;
	
	
	
	
	public PageBean list(PageParam pageParam,Map<String, Object> paramMap){
			return  orderDao.listPage(pageParam, paramMap);
	}
	
	/**
	 * 订单添加
	 * @param addOrderModel
	 * @return
	 */
	@Transactional
	public void insertOrder(AddOrderModel addOrderModel) {
		OrderEntity orderEntity = new OrderEntity();
		long order_id = orderDao.getSeqNextValue(Constant.HAOMI_ORDER);
		orderEntity.setId(order_id);
		orderEntity.setOrder_code(orderDao.buildOrderNo(order_id));
		orderEntity.setOrder_from(addOrderModel.getOrder_from());
		orderEntity.setUser_id(addOrderModel.getUc_code());
		orderEntity.setProject_id(addOrderModel.getProject_id());
		orderEntity.setCreate_id(addOrderModel.getUc_code());
		orderEntity.setCreate_time(DateUtils.toString(new Date(), "yyyy-MM-dd HH:mm:ss"));
		orderEntity.setUpdate_id(addOrderModel.getUc_code());
		orderEntity.setUpdate_time(DateUtils.toString(new Date(), "yyyy-MM-dd HH:mm:ss"));
		orderEntity.setOrder_address(addOrderModel.getOrder_address());
		orderEntity.setHouse_type(addOrderModel.getHouse_type());
		orderEntity.setHouse_area(new BigDecimal(addOrderModel.getHouse_area()==null?"0":addOrderModel.getHouse_area()));
		orderEntity.setHouse_age(addOrderModel.getHouse_age());
		orderEntity.setIs_checked(addOrderModel.getIs_checked());
		orderEntity.setOrder_time(addOrderModel.getOrder_time());
		orderEntity.setAmount(new BigDecimal(addOrderModel.getAmount()==null?"0.00":addOrderModel.getAmount()));
		//订单添加
		orderDao.insert(orderEntity);
		
		//订单扩展信息
		orderExtendBiz.insert(addOrderModel, order_id);
		
		/**
		 * 添加order_amount表
		 */
		
		//订单日志
		orderLogBiz.insert(order_id, null, 0, 3, addOrderModel.getUc_code(), DateUtils.toString(new Date(), "yyyy-MM-dd HH:mm:ss"), addOrderModel.getUc_code());
	}
	
	

}