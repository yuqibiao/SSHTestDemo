package com.yyyu.ssh.dao.impl;

import com.yyyu.ssh.dao.CustomerDao;
import com.yyyu.ssh.pojo.Customer;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 功能：对应customer表的数据操作实现
 *
 * @author yu
 * @date 2017/7/28.
 */
@Repository
public class CustomerDaoImpl extends BaseDaoImpl<Customer> implements CustomerDao{

}
