/**
 * 
 */
/**
 * @author xusiyuan
 *
 */
package cn.com.haomi.common.core.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import cn.com.haomi.common.page.PageBean;
import cn.com.haomi.common.page.PageParam;

/**
 *  数据访问层基类
 * @author xusiyuan
 *
 */
public interface BaseDao<T>{
	
	 /**
	  *  根据实体插入对象
	  * @param entity
	  * @return
	  */
	long insert(T entity);
	
	/**
	 * 根据实体批量插入对象
	 * @param list
	 * @return
	 */
	long insert(List<T> list);
	
	/**
	 * 根据实体更新
	 * @return
	 */
	long update(T entity);
	
	/**
	 * 根据id查找
	 * @param id
	 * @return
	 */
	T getById(long id);
	
	
	
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	long deleteById(long id);
	
	
	
	
	/**
	 * 分页查询 .
	 * 
	 * @param pageParam
	 *            分页参数.
	 * @param paramMap
	 *            业务条件查询参数.
	 * @return
	 */
	PageBean listPage(PageParam pageParam, Map<String, Object> paramMap);

	PageBean listPage(PageParam pageParam, Map<String, Object> paramMap, String sqlId);
	
	
	/**
	 * 根据条件查询 listBy: <br/>
	 * 
	 * @param paramMap
	 * @return 返回集合
	 */
	List<T> listBy(Map<String, Object> paramMap);

	List<Object> listBy(Map<String, Object> paramMap, String sqlId);

	/**
	 * 根据条件查询 listBy: <br/>
	 * 
	 * @param paramMap
	 * @return 返回实体
	 */
	T getBy(Map<String, Object> paramMap);

	Object getBy(Map<String, Object> paramMap, String sqlId);

	/**
	 * 根据序列名称获取下一个值
	 * 
	 * @return
	 */
	String getSeqNextValue(String seqName);

	SqlSessionTemplate getSessionTemplate();

	SqlSession getSqlSession();
}