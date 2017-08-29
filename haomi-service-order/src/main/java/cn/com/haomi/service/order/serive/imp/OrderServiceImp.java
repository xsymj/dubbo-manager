/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.service.order.serive.imp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import cn.com.haomi.core.order.dao.OrderDao;
import cn.com.haomi.inteface.order.service.OrderService;

@Component("orderService")
public class OrderServiceImp implements OrderService{
	
	@Autowired
	private OrderDao orderDao;
	
	
	public String buildOrderNo() {
		return orderDao.buildOrderNo();
	}
	
	
		
			
}