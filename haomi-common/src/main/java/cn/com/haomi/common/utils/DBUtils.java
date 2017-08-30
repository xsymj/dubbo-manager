package cn.com.haomi.common.utils;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 
 * @author 创建人 韩峥
 * 
 *         说明：工具类,获得一条生成的sql语句.
 */
public class DBUtils {
	private static final Log LOG = LogFactory.getLog(DBUtils.class);

	/**
	 * 获取sql和params
	 * 
	 * @param bean
	 *            对象
	 * @param table
	 *            表名
	 * 
	 *            说明：通过反射获得一条sql语句
	 */
	public static String getInsertSqlEx(Object bean, String table) {

		String param = "";
		ArrayList<Object> params = new ArrayList<Object>();
	 
		// 获得bean字段
		Class<?> beanClass = bean.getClass();
		Field[] fields = beanClass.getDeclaredFields();
		String fiename = "";
		String methodname = "";
		Method method = null;
		Object fieldvalue = null;
		 
		try {
			String sql = "insert into " + table + " (";
			int yz = 0;
			for (int i = 0; i < fields.length; i++) {
				fiename = fields[i].getName();
				if (!"serialVersionUID".equals(fiename) && checkMethodName(fiename, "orth_")) {
					methodname = getMethodName(fiename, "get");
					method = beanClass.getMethod(methodname);
					fieldvalue = method.invoke(bean);
					if (fieldvalue != null) {

						if (yz == 0) {
							sql += fiename;
							param += "#{bean."+fiename+"}";
							yz = 1;
						} else {
							sql += ", " + fiename;
							param += ","+"#{bean."+fiename+"}";
						}

						params.add(fieldvalue);
					}
				}
			}
			sql += ") values(" + param + ")";

		 
			return sql;
		} catch (Exception e) {
			LOG.error("异常：" + e.getMessage());
		}
		return null;
	}

	/**
	 * 获取sql和params
	 * 
	 * @param bean
	 *            对象
	 * @param table
	 *            表名
	 * 
	 *            说明：通过反射获得一条sql语句
	 */
	public static String getInsertSql(Object bean, String table) {

		String param = "";
		ArrayList<Object> params = new ArrayList<Object>();
		
		// 获得bean字段
		Class<?> beanClass = bean.getClass();
		Field[] fields = beanClass.getDeclaredFields();
		String fiename = "";
		String methodname = "";
		Method method = null;
		Object fieldvalue = null;
		
		try {
			String sql = "insert into " + table + " (";
			int yz = 0;
			for (int i = 0; i < fields.length; i++) {
				fiename = fields[i].getName();
				methodname = getMethodName(fiename, "get");
				method = beanClass.getMethod(methodname);
				fieldvalue = method.invoke(bean);
				if (yz == 0) {
					sql += fiename;
					param += "#{bean."+fiename+"}";;
					yz = 1;
				} else {
					sql += ", " + fiename;
					param += ","+"#{bean."+fiename+"}";
				}

				params.add(fieldvalue);

			}
			sql += ") values(" + param + ")";
			return sql;
		} catch (Exception e) {
			LOG.error("异常：" + e.getMessage());
		}
		 return null;
	}

	/**
	 * 获取sql和params
	 * 
	 * @param bean
	 *            对象
	 * @param table
	 *            表名
	 * 
	 *            说明：通过反射获得一条sql语句
	 */
	public static String getUpdateSqlEx(Object bean, String table,
			Object keyid, Object keyVal) {
		ArrayList<Object> params = new ArrayList<Object>();
		// 获得bean字段
		Class<?> beanClass = bean.getClass();
		Field[] fields = beanClass.getDeclaredFields();
		String fiename = "";
		String methodname = "";
		Method method = null;
		Object fieldvalue = null;
		 
		try {
			String sql = "update " + table + " set ";
			for (int i = 0; i < fields.length; i++) {
				fiename = fields[i].getName();
				if (!"serialVersionUID".equals(fiename)&&!keyid.equals(fiename)) {
					methodname = getMethodName(fiename, "get");
					method = beanClass.getMethod(methodname);
					fieldvalue = method.invoke(bean);
					// 更新不为null的字段
					if (fieldvalue != null) {
						sql += fiename + "= #{bean."+fiename+"},";
						params.add(fieldvalue);
					}
				}
			}

			sql = sql.substring(0, sql.length() - 1);
			sql += " where " + keyid + "= #{keyVal}";
			params.add(keyVal);
			LOG.info(sql);
			return  sql;

			
		} catch (Exception e) {
			LOG.error("异常：" + e.getMessage());
		}
		return null;
	}
	
 
	/**
	 * 获取sql和params where条件自己拼接
	 * @param bean
	 * @param table
	 * @param where
	 * @return
	 */
	public static String getUpdateSqlEx(Object bean, String table,String where ) {
		ArrayList<Object> params = new ArrayList<Object>();
		// 获得bean字段
		Class<?> beanClass = bean.getClass();
		Field[] fields = beanClass.getDeclaredFields();
		String fiename = "";
		String methodname = "";
		Method method = null;
		Object fieldvalue = null;
		 
		try {
			String sql = "update " + table + " set ";
			for (int i = 0; i < fields.length; i++) {
				fiename = fields[i].getName();
				 
					methodname = getMethodName(fiename, "get");
					method = beanClass.getMethod(methodname);
					fieldvalue = method.invoke(bean);
					// 更新不为null的字段
					if (fieldvalue != null) {
						sql += fiename + "= #{bean."+fiename+"},";
						params.add(fieldvalue);
					}
				}
			 

			sql = sql.substring(0, sql.length() - 1);
			sql += " where "+where;
			LOG.info(sql);
			return  sql;

			
		} catch (Exception e) {
			LOG.error("异常：" + e.getMessage());
		}
		return null;
	}

	/**
	 * 获取sql和params
	 * 
	 * @param bean
	 *            对象
	 * @param table
	 *            表名
	 * 
	 *            说明：通过反射获得一条sql语句
	 */
	public static String getUpdateSql(Object bean, String table,
			Object keyid, Object keyVal) {
		ArrayList<Object> params = new ArrayList<Object>();
	
		// 获得bean字段
		Class<?> beanClass = bean.getClass();
		Field[] fields = beanClass.getDeclaredFields();
		String fiename = "";
		String methodname = "";
		Method method = null;
		Object fieldvalue = null;
	
		try {
			String sql = "update " + table + " set ";
			for (int i = 0; i < fields.length; i++) {
				fiename = fields[i].getName();

				methodname = getMethodName(fiename, "get");
				method = beanClass.getMethod(methodname);
				fieldvalue = method.invoke(bean);

				sql += fiename + "= #{bean."+fiename+"},";
				params.add(fieldvalue);

			}

			sql = sql.substring(0, sql.length() - 1);
			sql += " where " + keyid + "= #{"+keyVal+"}";
		
		 
			return sql;
			
		} catch (Exception e) {
			LOG.error("异常：" + e.getMessage());
		}
		return null;
	}

	/**
	 * 获取字段的get/set方法名
	 * 
	 * @param fieldname
	 * @return
	 */
	private static String getMethodName(String fieldname, String type) {
		char upper = Character.toUpperCase(fieldname.charAt(0));
		return type + upper + fieldname.substring(1);
	}

	/**
	 * 验证字段的名字是否包含 指定的字符
	 * 
	 * @param fieldname
	 * @return
	 */
	private static boolean checkMethodName(String fieldname, String checking) {
		int len = fieldname.indexOf(checking);
		if (len == -1) {
			return true;
		}
		return false;
	}
//  public static void main(String[] args) {
//	  ReturnModel  bb=new ReturnModel();
//	  bb.setMessage("erwerwer");
//	  System.out.println(DBUtils.getInsertSql(bb, "abc"));
//}
}
