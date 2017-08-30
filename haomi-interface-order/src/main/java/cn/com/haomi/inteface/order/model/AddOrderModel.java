package cn.com.haomi.inteface.order.model;

import cn.com.haomi.common.model.BaseModel;

public class AddOrderModel extends BaseModel {
		
	private String custom_id;

	private String customer_name;
	
	private String customer_phone;
	
	private String city;
	
	private String province;
	
	private String area;
	
	private String address;
	
	private String order_time;
	
	private char order_from;
	
	
	private String remark;
	
	private Integer order_address;
	
	private char house_type;
	
	private String house_area;
	
	private String house_age;
	
	private char is_checked;
	
	private String agent_name;
	
	private String agent_code;
	
	private String agent_address;
	
	private String agent_phone;
	
	private String amount;
	
	private Integer order_status;
	
	private Long project_id;
	
	

	public Long getProject_id() {
		return project_id;
	}

	public void setProject_id(Long project_id) {
		this.project_id = project_id;
	}

	public String getCustom_id() {
		return custom_id;
	}

	public void setCustom_id(String custom_id) {
		this.custom_id = custom_id;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
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

	public String getOrder_time() {
		return order_time;
	}

	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}

	public char getOrder_from() {
		return order_from;
	}

	public void setOrder_from(char order_from) {
		this.order_from = order_from;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOrder_address() {
		return order_address;
	}

	public void setOrder_address(Integer order_address) {
		this.order_address = order_address;
	}

	public char getHouse_type() {
		return house_type;
	}

	public void setHouse_type(char house_type) {
		this.house_type = house_type;
	}

	public String getHouse_area() {
		return house_area;
	}

	public void setHouse_area(String house_area) {
		this.house_area = house_area;
	}

	public String getHouse_age() {
		return house_age;
	}

	public void setHouse_age(String house_age) {
		this.house_age = house_age;
	}

	public char getIs_checked() {
		return is_checked;
	}

	public void setIs_checked(char is_checked) {
		this.is_checked = is_checked;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Integer getOrder_status() {
		return order_status;
	}

	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}
	
	
	
}
