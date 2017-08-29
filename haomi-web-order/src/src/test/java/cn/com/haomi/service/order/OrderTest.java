/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.service.order;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSONObject;
import cn.com.haomi.inteface.order.service.OrderService;
import cn.com.haomi.service.JUnit4ClassRunner;


@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-context.xml")
public class OrderTest{
	
	@Resource
	private OrderService orderService;
		
	@Test
	public void main() {
		
		System.out.println("start AddressService test");
		//returnModel = projectList();
		//returnModel = updateOrderStatus();
		//returnModel = updatereservationtime();
		//returnModel = getcustomandagent();
		//returnModel = updatecustomandagent();
		//returnModel = updatecancelreason();
		//returnModel = orderactualreservationtesttime();
		//returnModel = updateTime();
		//returnModel = updateComplete();
		//returnModel = list();
		//returnModel = updateOrderMaterialStatus();
		test();
		System.out.println("AddressService returnModel:");
		//System.out.print(JSONObject.toJSONString(returnModel));
		System.out.println("end AddressService test");
	}	
	
	public void test() {
		String a = orderService.buildOrderNo();
		System.out.println("OrderTest.test()"+a);
	}
}