/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.service.order;


import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.haomi.inteface.order.entity.OrderEntity;
import cn.com.haomi.inteface.order.service.OrderService;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-context.xml")
public class OrderTest{
	
	@Resource
	private OrderService orderService;
		 
	@Test 
	public void main() {
		
		System.out.println("start AddressService test");
	test();
		System.out.println("AddressService returnModel:");
		//System.out.print(JSONObject.toJSONString(returnModel));
		System.out.println("end AddressService test");
	}	
	
	public void test() {
		List<OrderEntity> a = orderService.list();
		System.out.println("OrderTest.test()"+a);
	}
}