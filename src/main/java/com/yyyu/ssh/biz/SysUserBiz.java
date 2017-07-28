package com.yyyu.ssh.biz;

import com.yyyu.ssh.dao.BaseDao;
import com.yyyu.ssh.pojo.SysUser;
import org.springframework.stereotype.Service;

/**
 * 功能：sys_user表对应的业务逻辑接口
 *
 * @author yu
 * @date 2017/7/28.
 */

public interface SysUserBiz {

    SysUser checkUser(String username , String password);

}
