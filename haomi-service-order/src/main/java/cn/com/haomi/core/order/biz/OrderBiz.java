/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.core.order.biz;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.haomi.common.page.PageBean;
import cn.com.haomi.common.page.PageParam;
import cn.com.haomi.core.order.dao.OrderDao;
import cn.com.haomi.inteface.order.entity.OrderEntity;

@Component("orderBiz")
public class OrderBiz {
	
	@Autowired
	 private OrderDao orderDao;
	
	
	public PageBean list(PageParam pageParam,Map<String, Object> paramMap){
			return  orderDao.listPage(pageParam, paramMap);
	}
}