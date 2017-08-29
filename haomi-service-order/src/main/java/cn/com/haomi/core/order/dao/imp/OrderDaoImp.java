/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.core.order.dao.imp;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import cn.com.haomi.common.constant.Constant;
import cn.com.haomi.common.core.dao.imp.BaseDaoImp;
import cn.com.haomi.common.utils.DateUtils;
import cn.com.haomi.common.utils.StringUtils;
import cn.com.haomi.core.order.dao.OrderDao;
import cn.com.haomi.inteface.order.emuns.SeqTypeEnum;
import cn.com.haomi.inteface.order.entity.OrderEntity;

@Component("orderDaoImp")
public class OrderDaoImp extends BaseDaoImp<OrderEntity> implements OrderDao{
	
	/**
	 * 获取订单code
	 */
	public String buildOrderNo() {
		return "BJ"+DateUtils.toString(new Date(), "yyyyMMdd")+StringUtils.coverZero(Long.parseLong(super.getSeqNextValue(Constant.SCM_ORDER)),SeqTypeEnum.SEQUENCE_ORDER.getValue());
	}
	
		
}