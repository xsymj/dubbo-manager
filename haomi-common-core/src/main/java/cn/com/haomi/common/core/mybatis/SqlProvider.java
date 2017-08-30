package cn.com.haomi.common.core.mybatis;


import cn.com.haomi.common.entity.SaveEntity;
import cn.com.haomi.common.utils.DBUtils;


public class SqlProvider {
	
	/**
	 * 插入bean方法
	 * 
	 * @param bean
	 * @return
	 */
	public String insertBean(SaveEntity bean) {
		return DBUtils.getInsertSql(bean.getBean(), (String) bean.getTable());
	}

	/**
	 * 插入bean方法 不含null方法
	 * @param <T>
	 * 
	 * @param bean
	 * @return
	 */
	public <T> String insertBeanEx(T t,String table) {
		return DBUtils.getInsertSqlEx(t,table);
	}
	

	
	/** 更新bean方法  （单条件）
	 * @param bean
	 * @return
	 */
	public <T> String updateBean(T t,String table,Object keyid,Object
			 keyVal) {
		return DBUtils.getUpdateSql(t, table,
				keyid, keyVal) ;
	}
	/**
	 * 更新bean方法 不含null方法  （单条件）
	 * 
	 * @param bean
	 * @return
	 */
	public <T> String updateBeanEx(T t,String table,Object keyid,Object
			 keyVal) {
		return DBUtils.getUpdateSqlEx(t, table,
				keyid, keyVal) ;
	}
	
	/**
	 * 更新bean方法 不含null方法  （多条件）无 PrepareStatement效果
	 * 
	 * @param bean
	 * @return 
	 * @return
	 */
	public <T> String updateBeanExWhere(T t,String table,String where) {
		return DBUtils.getUpdateSqlEx(t,table,
				where) ;
	}
}
