package com.yyyu.ssh.dao;

import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;

/**
 * 功能：Dao层通用基类
 *
 * 对HibernateDaoSupport封装，因为不同的hibernate和spring版本中HibernateTemplate包路径不同，
 * 封装一层是为了方便修改以后hibernate版本的更迭。
 *
 * @author yu
 * @date 2017/7/25.
 */
public interface BaseDao<T> {

    //增或修改
    void saveOrUpdate(T t);
    //增
    void save(T t);
    //删
    void delete(T t);
    //删
    void delete(Serializable id);
    //改
    void update(T t);
    //查 根据id查询
    T	getById(Serializable id);
    //通过Hql语句查询
    //查 符合条件的总记录数
    Integer	getTotalCount(DetachedCriteria dc);
    //查 查询分页列表数据
    List<T> getPageList(DetachedCriteria dc,Integer start,Integer pageSize);
    //查 查询分页列表数据(hql)
    <E> List<E>getPageListByHql(String hql , Object[] values , Integer start , Integer pageSize);
    //查 查询分页列表数据(sql)
    <E>List<E>getPageListBySql(String sql , Object[] values , Integer start , Integer pageSize);

}
