/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.inteface.order.service;

import java.util.List;
import java.util.Map;

import cn.com.haomi.inteface.order.entity.OrderEntity;

public interface OrderService{
		
		/**
		 * 获取订单code
		 * @return
		 */
		String buildOrderNo();
		
		List<OrderEntity> list();
}