/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.inteface.order.emuns;

/**
 * 序列类型
 * @author xusiyuan
 *
 */
public enum SeqTypeEnum{
	
	SEQUENCE_ORDER("SEQUENCE_ORDER", 5);
	
	/* 描述 */
	private String desc;
	/* 枚举值 */
	private int value;
	
	private SeqTypeEnum(String desc, int value) {
		this.desc = desc;
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}