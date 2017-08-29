/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.service.order.serive.imp;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.haomi.core.order.biz.OrderBiz;
import cn.com.haomi.core.order.dao.OrderDao;
import cn.com.haomi.inteface.order.entity.OrderEntity;
import cn.com.haomi.inteface.order.service.OrderService;

@Component("orderService")
public class OrderServiceImp implements OrderService{
	
	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private OrderBiz orderBiz;
	
	
	public String buildOrderNo() {
		return orderDao.buildOrderNo();
	}


	
	public List<OrderEntity> list() {
		return orderBiz.list();
	}
	
	
		
			
}