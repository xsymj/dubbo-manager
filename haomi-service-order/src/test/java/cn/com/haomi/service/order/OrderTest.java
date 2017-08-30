/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.service.order;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;

import cn.com.haomi.common.page.PageBean;
import cn.com.haomi.common.page.PageParam;
import cn.com.haomi.inteface.order.entity.OrderEntity;
import cn.com.haomi.inteface.order.model.OrderListModel;
import cn.com.haomi.inteface.order.service.OrderService;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-context.xml")
public class OrderTest{
	
	@Resource
	private OrderService orderService;
		 
	@Test 
	public void main() {
		
		System.out.println("start AddressService test");
	    PageBean pageBean = test();
		System.out.println("AddressService returnModel:");
		System.out.print(JSONObject.toJSONString(pageBean));
		System.out.println("end AddressService test");
	}	
	
	public PageBean test() {
		//PageParam pageParam = new PageParam(2, 10);
		OrderListModel orderListModel = new OrderListModel();
		orderListModel.setOrder_status(1);
		Map<String, Object> params = new HashMap<String,Object>();
		params.put("orderListModel", orderListModel);
		PageBean pageBean = orderService.list(null, params);
		System.out.println("OrderTest.test()");
		return pageBean;
	}
}