package com.yyyu.ssh.dao.impl;

import com.yyyu.ssh.dao.BaseDao;
import com.yyyu.ssh.dao.BaseDictDao;
import com.yyyu.ssh.pojo.BaseDict;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能：对应base_dict表的数据操作
 *
 * @author yu
 * @date 2017/7/28.
 */
@Repository
public class BaseDictDaoImpl extends BaseDaoImpl<BaseDict> implements BaseDictDao {

    @Override
    public List<BaseDict> getBaseDictListByCode(String code) {
        DetachedCriteria criteria = getCriteria();
        criteria.add(Restrictions.eq("dictTypeCode" , code));
        List<BaseDict> pageList = getPageList(criteria, -1, -1);
        return pageList;
    }
}
