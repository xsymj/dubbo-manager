/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.inteface.order.entity;

import java.math.BigDecimal;

import cn.com.haomi.common.entity.BaseEntity;

public class OrderEntity extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	private String order_code=null;
	
	private String op_code=null;
	
	private BigDecimal amount=null;
	
	private Character order_from;
	
	/*
	 * 订单状态 
	 * 未接单：0
	 * 已分配/未接单：1
	 * 已接单/未检测：2
	 * 已检测：3 
	 * 已签约：4
	 * 已取消：9
	 */
	private Integer order_status;
	
	private String order_type;
	
	private Character house_type;
	
	private BigDecimal house_area;
	
	private String house_age;
	
	private Character is_checked;
	
	private String order_time;
	
	private Integer order_address;
	
	private String housekeeper_id;
	
	private String reservation_test_time;
	
	//实际检测状态
	private String actual_reservation_test_time;
	
	//报价状态
	private Integer offer_status;
	
	//选材状态
	private Integer material_status;
	
	//上传施工图状态
	private Integer up_constructionpic_status;

	//增项标示
	private Integer incre_status;

	//减项标示
	private Integer decre_status;

	//预约交底时间
	private String reservation_complete_time;

	//实际交底时间
	private String complete_time;

	//工长id
	private String worker_id;

	//预约开工时间
	private String start_work_time;

	//工期
	private Integer work_days;

	//材料增项状态
	private Integer incre_material_status;

	//材料减项状态
	private Integer decre_material_status;
	
	private Integer pic_status;

	//签约时间
	private String signing_time;

	private Long project_id;
	
	private String user_id;

	//接单时间
	private String accept_order_time;

	//分配工长时间
	private String assigned_worker_time;

	//验收时间
	private String acceptance_time;

	//验收人员
	private String accept_user_id;

	//验收成功时间
	private String accept_succ_time;

	//竣工时间
	private String over_time;

	public String getOrder_code() {
		return order_code;
	}

	public void setOrder_code(String order_code) {
		this.order_code = order_code;
	}

	public String getOp_code() {
		return op_code;
	}

	public void setOp_code(String op_code) {
		this.op_code = op_code;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Character getOrder_from() {
		return order_from;
	}

	public void setOrder_from(Character order_from) {
		this.order_from = order_from;
	}

	public Integer getOrder_status() {
		return order_status;
	}

	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public Character getHouse_type() {
		return house_type;
	}

	public void setHouse_type(Character house_type) {
		this.house_type = house_type;
	}

	public BigDecimal getHouse_area() {
		return house_area;
	}

	public void setHouse_area(BigDecimal house_area) {
		this.house_area = house_area;
	}

	public String getHouse_age() {
		return house_age;
	}

	public void setHouse_age(String house_age) {
		this.house_age = house_age;
	}

	public Character getIs_checked() {
		return is_checked;
	}

	public void setIs_checked(Character is_checked) {
		this.is_checked = is_checked;
	}

	public String getOrder_time() {
		return order_time;
	}

	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}

	public Integer getOrder_address() {
		return order_address;
	}

	public void setOrder_address(Integer order_address) {
		this.order_address = order_address;
	}

	public String getHousekeeper_id() {
		return housekeeper_id;
	}

	public void setHousekeeper_id(String housekeeper_id) {
		this.housekeeper_id = housekeeper_id;
	}

	public String getReservation_test_time() {
		return reservation_test_time;
	}

	public void setReservation_test_time(String reservation_test_time) {
		this.reservation_test_time = reservation_test_time;
	}

	public String getActual_reservation_test_time() {
		return actual_reservation_test_time;
	}

	public void setActual_reservation_test_time(String actual_reservation_test_time) {
		this.actual_reservation_test_time = actual_reservation_test_time;
	}

	public Integer getOffer_status() {
		return offer_status;
	}

	public void setOffer_status(Integer offer_status) {
		this.offer_status = offer_status;
	}

	public Integer getMaterial_status() {
		return material_status;
	}

	public void setMaterial_status(Integer material_status) {
		this.material_status = material_status;
	}

	public Integer getUp_constructionpic_status() {
		return up_constructionpic_status;
	}

	public void setUp_constructionpic_status(Integer up_constructionpic_status) {
		this.up_constructionpic_status = up_constructionpic_status;
	}

	public Integer getIncre_status() {
		return incre_status;
	}

	public void setIncre_status(Integer incre_status) {
		this.incre_status = incre_status;
	}

	public Integer getDecre_status() {
		return decre_status;
	}

	public void setDecre_status(Integer decre_status) {
		this.decre_status = decre_status;
	}

	public String getReservation_complete_time() {
		return reservation_complete_time;
	}

	public void setReservation_complete_time(String reservation_complete_time) {
		this.reservation_complete_time = reservation_complete_time;
	}

	public String getComplete_time() {
		return complete_time;
	}

	public void setComplete_time(String complete_time) {
		this.complete_time = complete_time;
	}

	public String getWorker_id() {
		return worker_id;
	}

	public void setWorker_id(String worker_id) {
		this.worker_id = worker_id;
	}

	public String getStart_work_time() {
		return start_work_time;
	}

	public void setStart_work_time(String start_work_time) {
		this.start_work_time = start_work_time;
	}

	public Integer getWork_days() {
		return work_days;
	}

	public void setWork_days(Integer work_days) {
		this.work_days = work_days;
	}

	public Integer getIncre_material_status() {
		return incre_material_status;
	}

	public void setIncre_material_status(Integer incre_material_status) {
		this.incre_material_status = incre_material_status;
	}

	public Integer getDecre_material_status() {
		return decre_material_status;
	}

	public void setDecre_material_status(Integer decre_material_status) {
		this.decre_material_status = decre_material_status;
	}

	public Integer getPic_status() {
		return pic_status;
	}

	public void setPic_status(Integer pic_status) {
		this.pic_status = pic_status;
	}

	public String getSigning_time() {
		return signing_time;
	}

	public void setSigning_time(String signing_time) {
		this.signing_time = signing_time;
	}

	public Long getProject_id() {
		return project_id;
	}

	public void setProject_id(Long project_id) {
		this.project_id = project_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getAccept_order_time() {
		return accept_order_time;
	}

	public void setAccept_order_time(String accept_order_time) {
		this.accept_order_time = accept_order_time;
	}

	public String getAssigned_worker_time() {
		return assigned_worker_time;
	}

	public void setAssigned_worker_time(String assigned_worker_time) {
		this.assigned_worker_time = assigned_worker_time;
	}

	public String getAcceptance_time() {
		return acceptance_time;
	}

	public void setAcceptance_time(String acceptance_time) {
		this.acceptance_time = acceptance_time;
	}

	public String getAccept_user_id() {
		return accept_user_id;
	}

	public void setAccept_user_id(String accept_user_id) {
		this.accept_user_id = accept_user_id;
	}

	public String getAccept_succ_time() {
		return accept_succ_time;
	}

	public void setAccept_succ_time(String accept_succ_time) {
		this.accept_succ_time = accept_succ_time;
	}

	public String getOver_time() {
		return over_time;
	}

	public void setOver_time(String over_time) {
		this.over_time = over_time;
	}
	
	
}