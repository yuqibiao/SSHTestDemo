package com.yyyu.ssh.biz.impl;

import com.yyyu.ssh.biz.SysUserBiz;
import com.yyyu.ssh.dao.SysUserDao;
import com.yyyu.ssh.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能：ys_user表对应的业务逻辑实现
 *
 * @author yu
 * @date 2017/7/28.
 */
@Service
public class SysUserBizImpl implements SysUserBiz {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public SysUser checkUser(String username, String password) {

        return sysUserDao.getSysUserByNameAndPwd(username , password);
    }
}
