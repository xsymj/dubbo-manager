package cn.com.haomi.inteface.order.entity;

import java.math.BigDecimal;

import cn.com.haomi.common.entity.BaseEntity;

public class OrderExtendEntity extends BaseEntity {
	
	private static final long serialVersionUID = 9003819691753815775L;

		private Long order_id;
		
		private String customer_name;
		
		private String customer_phone;
		
		private String customer_id;
		
		private String city;
		
		private String province;
		
		private String area;
		
		private String address;
		
		private String agent_name;
		
		private String agent_code;
		
		private String agent_address;
		
		private String agent_phone;
		
		private String remark;
		
		
		private String cancel_reason;

		private BigDecimal original_price;

		public BigDecimal getOriginal_price() {
			return original_price;
		}

		public void setOriginal_price(BigDecimal original_price) {
			this.original_price = original_price;
		}

		public String getProvince() {
				return province;
			}

		public void setProvince(String province) {
			this.province = province;
		}
	

		public Long getOrder_id() {
			return order_id;
		}

		public void setOrder_id(Long order_id) {
			this.order_id = order_id;
		}

		public String getCustomer_name() {
			return customer_name;
		}

		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}

		public String getCustomer_phone() {
			return customer_phone;
		}

		public void setCustomer_phone(String customer_phone) {
			this.customer_phone = customer_phone;
		}

		public String getCustomer_id() {
			return customer_id;
		}

		public void setCustomer_id(String customer_id) {
			this.customer_id = customer_id;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getAgent_name() {
			return agent_name;
		}

		public void setAgent_name(String agent_name) {
			this.agent_name = agent_name;
		}

		public String getAgent_code() {
			return agent_code;
		}

		public void setAgent_code(String agent_code) {
			this.agent_code = agent_code;
		}

		public String getAgent_address() {
			return agent_address;
		}

		public void setAgent_address(String agent_address) {
			this.agent_address = agent_address;
		}

		public String getAgent_phone() {
			return agent_phone;
		}

		public void setAgent_phone(String agent_phone) {
			this.agent_phone = agent_phone;
		}

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}


		public String getCancel_reason() {
			return cancel_reason;
		}

		public void setCancel_reason(String cancel_reason) {
			this.cancel_reason = cancel_reason;
		}
		
		

}
