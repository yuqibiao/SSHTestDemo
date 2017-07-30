package com.yyyu.ssh.action;

import com.yyyu.ssh.biz.SysUserBiz;
import com.yyyu.ssh.pojo.SysUser;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * 功能：登录相关Action
 *
 * @author yu
 * @date 2017/7/28.
 */


@Namespace("/view/sysUser")
public class LoginAction extends BaseAction{

    @Autowired
    private SysUserBiz sysUserBiz;

    @Action(value ="checkUser" , results = {
            @Result (name = SUCCESS  ,location = "/customer/list" ,type="redirect"),
            @Result(name = ERROR , location = "/WEB-INF/view/login.jsp")
    })
    public  String checkUser( ){
        String username = getRequestParm().getParameter("username");
        String password = getRequestParm().getParameter("password");
        SysUser sysUser = sysUserBiz.checkUser(username, password);
        if (sysUser==null){
            return ERROR;
        }else{
            getSession().put("sysUser" , sysUser);
            return SUCCESS;
        }
    }

}
