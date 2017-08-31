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
import cn.com.haomi.inteface.order.model.AddOrUpdateOrderModel;
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
	   // PageBean pageBean = test();
		   addOrder();
		System.out.println("AddressService returnModel:");
		//System.out.print(JSONObject.toJSONString(pageBean));
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
	
	public void addOrder() {
		AddOrUpdateOrderModel addOrderModel = new AddOrUpdateOrderModel();
		addOrderModel.setAmount("12.12");
		addOrderModel.setOrder_from('0');
		addOrderModel.setOrder_status(0);
		addOrderModel.setOrder_address(1);
		addOrderModel.setHouse_type('1');
		addOrderModel.setHouse_area("99.99");
		addOrderModel.setHouse_age("3");
		addOrderModel.setIs_checked('1');
		addOrderModel.setUc_code("1111");
		addOrderModel.setOrder_time("2017-04-12 20:21:11");
		addOrderModel.setCustomer_name("张三");
		addOrderModel.setCustomer_phone("12388880002");
		addOrderModel.setCity("北京市");
		addOrderModel.setArea("asdasd");
		addOrderModel.setAddress("123123");
//		addOrderModel.setAgent_name("123123");
//		addOrderModel.setAgent_code("123123");
//		addOrderModel.setAgent_address("123123");
//		addOrderModel.setAgent_phone("123123");
		addOrderModel.setRemark("123123");
		orderService.insertOrder(addOrderModel);
		
	}
}