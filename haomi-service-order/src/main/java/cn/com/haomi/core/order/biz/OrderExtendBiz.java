package cn.com.haomi.core.order.biz;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.haomi.common.constant.Constant;
import cn.com.haomi.common.utils.DateUtils;
import cn.com.haomi.core.order.dao.OrderExtendDao;
import cn.com.haomi.inteface.order.entity.OrderEntity;
import cn.com.haomi.inteface.order.entity.OrderExtendEntity;
import cn.com.haomi.inteface.order.model.AddOrUpdateOrderModel;

@Component("orderExtendBiz")
public class OrderExtendBiz {
		
		@Autowired
		private OrderExtendDao orderExtendDao;
		
		
		
		public Long insert(AddOrUpdateOrderModel addOrderModel,Long order_id) {
			OrderExtendEntity orderExtendEntity = new OrderExtendEntity();
			orderExtendEntity.setCustomer_name(addOrderModel.getCustomer_name());
			orderExtendEntity.setCustomer_phone(addOrderModel.getCustomer_phone());
			orderExtendEntity.setCity(addOrderModel.getCity());
			orderExtendEntity.setProvince(addOrderModel.getProvince());
			orderExtendEntity.setArea(addOrderModel.getArea());
			orderExtendEntity.setAddress(addOrderModel.getAddress());
			orderExtendEntity.setAgent_name(addOrderModel.getAgent_name());
			orderExtendEntity.setAgent_code(addOrderModel.getAgent_code());
			orderExtendEntity.setAgent_address(addOrderModel.getAgent_address());
			orderExtendEntity.setAgent_phone(addOrderModel.getAgent_phone());
			orderExtendEntity.setRemark(addOrderModel.getRemark());
			orderExtendEntity.setUpdate_id(addOrderModel.getUc_code());
			orderExtendEntity.setUpdate_time( DateUtils.toString(new Date(), "yyyy-MM-dd HH:mm:ss"));
			orderExtendEntity.setCustomer_id(addOrderModel.getCustom_id());
			orderExtendEntity.setId(orderExtendDao.getSeqNextValue(Constant.ORDER_EXT_SEQ));
			orderExtendEntity.setOrder_id(order_id);
			orderExtendEntity.setCreate_id(addOrderModel.getUc_code());
			orderExtendEntity.setCreate_time(DateUtils.toString(new Date(), "yyyy-MM-dd HH:mm:ss"));
			return orderExtendDao.insert(orderExtendEntity);
		}
}
