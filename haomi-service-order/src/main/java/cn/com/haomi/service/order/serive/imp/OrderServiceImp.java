/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.service.order.serive.imp;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import cn.com.haomi.common.page.PageBean;
import cn.com.haomi.common.page.PageParam;
import cn.com.haomi.core.order.biz.OrderBiz;
import cn.com.haomi.inteface.order.model.AddOrUpdateOrderModel;
import cn.com.haomi.inteface.order.service.OrderService;

@Component("orderService")
public class OrderServiceImp implements OrderService{
	
	
	@Autowired
	private OrderBiz orderBiz;
	
	
	public PageBean list(PageParam pageParam,Map<String, Object> paramMap) {
		return orderBiz.list(pageParam,paramMap);
	}


	
	public void insertOrder(AddOrUpdateOrderModel addOrderModel) {
		 orderBiz.insertOrder(addOrderModel);
	}

	public void updateOrder(AddOrUpdateOrderModel addOrUpdateOrderModel) {
		
	}
		
}