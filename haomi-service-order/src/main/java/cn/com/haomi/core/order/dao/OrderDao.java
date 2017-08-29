/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.core.order.dao;

import cn.com.haomi.common.core.dao.BaseDao;
import cn.com.haomi.inteface.order.entity.OrderEntity;

public interface OrderDao extends BaseDao<OrderEntity>{
	
		public String buildOrderNo();
		
}