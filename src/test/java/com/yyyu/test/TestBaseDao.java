package com.yyyu.test;

import com.yyyu.ssh.dao.SysUserDao;
import com.yyyu.ssh.pojo.SysUser;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/26.
 */
public class TestBaseDao extends BaseTest {

    private static Logger logger = Logger.getLogger(TestBaseDao.class);

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public void initTest() {
        logger.info("单元测试日志记录===================");
    }

    @Test
    public void testSave() {
        SysUser sysUser = new SysUser();
        sysUser.setUserName("yu");
        sysUser.setUserPassword("123");
        sysUser.setUserCode("m001");
        sysUser.setUserState("1");
        logger.info("123123" + sysUser);
        sysUserDao.save(sysUser);
    }

    @Test
    public  void testDelete(){
        sysUserDao.delete(20l);
    }

    @Test
    public void getByIdTest(){
        SysUser sysUser = sysUserDao.getById(22L);
        logger.info(sysUser);
    }

    @Test
    public void getPageListByHql(){
        String hql = "from SysUser where userId<?";
        Object[] values = new Object[]{18l};
       List<SysUser> sysUserList= sysUserDao.getPageListByHql(hql , values , 0 ,10);
        for (SysUser sysUser: sysUserList) {
            logger.info(sysUser);
        }
    }

    @Test
    public void getPageListByHql2(){
        String hql = "select customer.custName , user.userId from SysUser as user , Customer as customer where user.userId=customer.custUserId and user.userId=?";
        Object[] values = new Object[]{5l};
        List<Object[]> sysUserList= sysUserDao.getPageListByHql(hql , values , 0 ,10);
        for (Object[] result: sysUserList) {
            logger.info(result[0]);
        }
    }

    @Test
    public void  testGetPageListBySql(){
        String sql = "select customer.cust_name , user.user_id " +
                "from sys_user as user , customer as customer " +
                "where user.user_id=customer.cust_user_Id and user.user_id=?";
        Object[] values = new Object[]{5l};
        List<Object[]> sysUserList= sysUserDao.getPageListBySql(sql , values , 0 ,10);
        for (Object[] result: sysUserList) {
            logger.info(result[0]);
        }
    }





}
