package cn.com.haomi.common.entity;

public class SaveEntity {
	
	/**
	 * 更新时候 多条件 无PrepareStatement效果
	 */
	private String where = null;
	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	/**
	 * 实体bean名称
	 */
	private Object bean = null;
	/**
	 * 实体bean表名
	 */
	private String table = null;
	/**
	 * 要修改名称
	 */
	Object keyid;
	/**
	 * 要修改的值
	 */
	Object keyVal;
	public Object getKeyid() {
		return keyid;
	}

	public void setKeyid(Object keyid) {
		this.keyid = keyid;
	}

	public Object getKeyVal() {
		return keyVal;
	}

	public void setKeyVal(Object keyVal) {
		this.keyVal = keyVal;
	}

	public Object getBean() {
		return bean;
	}

	public void setBean(Object bean) {
		this.bean = bean;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

}
