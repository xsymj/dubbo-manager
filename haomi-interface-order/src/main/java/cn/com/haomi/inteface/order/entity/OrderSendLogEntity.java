package cn.com.haomi.inteface.order.entity;

import cn.com.haomi.common.entity.BaseEntity;

public class OrderSendLogEntity extends BaseEntity {
	
	private static final long serialVersionUID = -2202399222564231628L;

		
		private Long order_id;
		
		private String user_id;

		/* 0:指派；1改派；2：接单  */
		private Character status='1';

		/*订单状态 创建：-1 未分配：0；已分配/未接单：1；已接单：2；已检测：3 ;
		已签约未付款：4；已签约已付款：5;已分派:6; 工长接单:7;  已交底:8;
		已开工:9;验收中:10;已验收:11;未结款:12;竣工: 13;已取消:14*/
		private Integer order_status;

		/* 管家:0   工长:1  订单全状态：3 */
		private Integer type;
		

		public Integer getOrder_status() {
			return order_status;
		}

		public void setOrder_status(Integer order_status) {
			this.order_status = order_status;
		}

		public Integer getType() {
			return type;
		}

		public void setType(Integer type) {
			this.type = type;
		}	

		public Long getOrder_id() {
			return order_id;
		}

		public void setOrder_id(Long order_id) {
			this.order_id = order_id;
		}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}
	
	
	
}
