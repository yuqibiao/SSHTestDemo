package com.yyyu.test.biz;

import com.yyyu.ssh.biz.SysUserBiz;
import com.yyyu.ssh.pojo.SysUser;
import com.yyyu.test.BaseTest;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/28.
 */
public class SysUserBizTest extends BaseTest{

    private static org.apache.log4j.Logger logger = Logger.getLogger(SysUserBizTest.class);

    @Autowired
    private SysUserBiz sysUserBiz;

    @Override
    public void initTest() {
        logger.info("单元测试日志记录===================");
    }

    @Test
    public void testSave(){
        SysUser sysUser = new SysUser();
        sysUser.setUserName("yu1");
        sysUser.setUserPassword("123");
        sysUser.setUserCode("m001");
        sysUser.setUserState("1");
        logger.info("123123" + sysUser);
    }

    @Test
    public void testCheckUser(){
        SysUser sysUser = sysUserBiz.checkUser("小军", "123");
        logger.info(sysUser);
    }

}
