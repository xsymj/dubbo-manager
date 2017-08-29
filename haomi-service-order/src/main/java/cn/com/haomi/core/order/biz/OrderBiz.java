/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.core.order.biz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.haomi.core.order.dao.OrderDao;

@Component("orderBiz")
public class OrderBiz {
	
	@Autowired
	 private OrderDao orderDao;
	
	
}