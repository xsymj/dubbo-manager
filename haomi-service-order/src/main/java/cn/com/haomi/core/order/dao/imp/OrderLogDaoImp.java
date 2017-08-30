package cn.com.haomi.core.order.dao.imp;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.com.haomi.common.core.dao.imp.BaseDaoImp;
import cn.com.haomi.core.order.dao.OrderLogDao;
import cn.com.haomi.inteface.order.entity.OrderSendLogEntity;

@Repository("orderLogDaoImp")
public class OrderLogDaoImp extends BaseDaoImp<OrderSendLogEntity> implements OrderLogDao {

	
	public List<OrderSendLogEntity> logListByUser(Map<String, Object> params) {
		return super.listBy(params);
	}

}
