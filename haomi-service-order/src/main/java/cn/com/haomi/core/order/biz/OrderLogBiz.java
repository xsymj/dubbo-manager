package cn.com.haomi.core.order.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.haomi.common.constant.Constant;
import cn.com.haomi.core.order.dao.OrderLogDao;
import cn.com.haomi.inteface.order.entity.OrderSendLogEntity;

@Component("orderLogBiz")
public class OrderLogBiz {
			
			@Autowired
			private OrderLogDao orderLogDao;
			
			public long insert(Long orderId,String status,Integer order_status,Integer type,String uc_code,String nowTime,String user_id) {
				OrderSendLogEntity orderSendLogEntity = new OrderSendLogEntity();
				 orderSendLogEntity.setId(orderLogDao.getSeqNextValue(Constant.ORDER_SEND_LOG));
				 orderSendLogEntity.setOrder_id(orderId);
			     orderSendLogEntity.setStatus(status!=null?status.charAt(0):null);
			     orderSendLogEntity.setOrder_status(order_status);
			     orderSendLogEntity.setType(type);
			     orderSendLogEntity.setCreate_id(uc_code);
			     orderSendLogEntity.setCreate_time(nowTime);
			     orderSendLogEntity.setUpdate_id(uc_code);
			     orderSendLogEntity.setUpdate_time(nowTime);
			     orderSendLogEntity.setUser_id(user_id);
			     return orderLogDao.insert(orderSendLogEntity);
			}
}
