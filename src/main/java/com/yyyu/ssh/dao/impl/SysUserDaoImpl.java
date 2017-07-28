package com.yyyu.ssh.dao.impl;

import com.yyyu.ssh.dao.SysUserDao;
import com.yyyu.ssh.pojo.SysUser;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/27.
 */
@Repository
public class SysUserDaoImpl extends BaseDaoImpl<SysUser> implements SysUserDao{

    @Override
    public SysUser getSysUserByNameAndPwd(String username, String password) {
        DetachedCriteria criteria = getCriteria();
        criteria.add(Restrictions.eq("userName" , username) );
        criteria.add(Restrictions.eq("userPassword" , password) );
        List<SysUser> pageList = getPageList(criteria, 0, 1);
        if (pageList.size()<=0){
            return null;
        }else{
            SysUser sysUser = pageList.get(0);
            evict(sysUser);
            sysUser.setUserPassword("");
            return sysUser;
        }
    }
}
