package cn.com.haomi.core.order.dao;

import java.util.List;
import java.util.Map;

import cn.com.haomi.common.core.dao.BaseDao;
import cn.com.haomi.inteface.order.entity.OrderSendLogEntity;

public interface OrderLogDao extends BaseDao<OrderSendLogEntity> {
		
		 List<OrderSendLogEntity> logListByUser(Map<String, Object> params);
}
