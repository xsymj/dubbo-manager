/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.inteface.order.service;

import java.util.Map;
import cn.com.haomi.common.page.PageBean;
import cn.com.haomi.common.page.PageParam;
import cn.com.haomi.inteface.order.model.AddOrUpdateOrderModel;

public interface OrderService{
		
		/**
		 * 获取订单code
		 * @return
		 */
		//String buildOrderNo();
		
		PageBean list(PageParam pageParam,Map<String, Object> paramMap);
		
		void insertOrder(AddOrUpdateOrderModel addOrUpdateOrderModel);
		
		void updateOrder(AddOrUpdateOrderModel addOrUpdateOrderModel);
}