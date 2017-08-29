package cn.com.haomi.inteface.order.entity;

import java.math.BigDecimal;

import cn.com.haomi.common.entity.BaseEntity;

public class PurchaseOrderEntity extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	private Integer ordertype;
	
	private Long customer_id;
	
	private String billsn;
	
	private BigDecimal order_amt;
	
	private String sign_date;
	
	private String head_id;
	
	private Integer audit_status;
	
	private Integer pay_status;
	
	private String company_id;
	
	private String pay_datetime;
	
	private String address;
	
	private String purchase_id;
	
	private Long depot_id;
	
	
	private String delivery_date;

	//提交状态 状态0生成；1提交；2撤回
	private Integer submit_status;

	//撤回原因
	private String revoked_reason;

	public Integer getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(Integer ordertype) {
		this.ordertype = ordertype;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getBillsn() {
		return billsn;
	}

	public void setBillsn(String billsn) {
		this.billsn = billsn;
	}

	public BigDecimal getOrder_amt() {
		return order_amt;
	}

	public void setOrder_amt(BigDecimal order_amt) {
		this.order_amt = order_amt;
	}

	public String getSign_date() {
		return sign_date;
	}

	public void setSign_date(String sign_date) {
		this.sign_date = sign_date;
	}

	public String getHead_id() {
		return head_id;
	}

	public void setHead_id(String head_id) {
		this.head_id = head_id;
	}

	public Integer getAudit_status() {
		return audit_status;
	}

	public void setAudit_status(Integer audit_status) {
		this.audit_status = audit_status;
	}

	public Integer getPay_status() {
		return pay_status;
	}

	public void setPay_status(Integer pay_status) {
		this.pay_status = pay_status;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public String getPay_datetime() {
		return pay_datetime;
	}

	public void setPay_datetime(String pay_datetime) {
		this.pay_datetime = pay_datetime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(String purchase_id) {
		this.purchase_id = purchase_id;
	}

	public Long getDepot_id() {
		return depot_id;
	}

	public void setDepot_id(Long depot_id) {
		this.depot_id = depot_id;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	public Integer getSubmit_status() {
		return submit_status;
	}

	public void setSubmit_status(Integer submit_status) {
		this.submit_status = submit_status;
	}

	public String getRevoked_reason() {
		return revoked_reason;
	}

	public void setRevoked_reason(String revoked_reason) {
		this.revoked_reason = revoked_reason;
	}
	
	

}
