package com.yyyu.ssh.biz.impl;

import com.yyyu.ssh.bean.CustomerQueryVo;
import com.yyyu.ssh.biz.CustomerBiz;
import com.yyyu.ssh.dao.CustomerDao;
import com.yyyu.ssh.pojo.Customer;
import com.yyyu.ssh.utils.page.Page;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/28.
 */
@Service
public class CustomerBizImpl  implements CustomerBiz {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public void deleteCustomerByCustId(long custId) {
        customerDao.delete(custId);
    }

    @Override
    public Customer getCustomerByCustId(long custId) {
        return customerDao.getById(custId);
    }

    @Override
    public List<Customer> getCustomersByQueryVo(CustomerQueryVo queryVo) {
        int start = (queryVo.getPage()-1)*queryVo.getSize();
        int pageSize = queryVo.getSize();
        DetachedCriteria criteria = customerDao.getCriteria();
        if (queryVo.getCustName()!=null){
            criteria.add(Restrictions.eq("custName" , queryVo.getCustName()));
        }
        if(queryVo.getCustIndustry()!=null){
            criteria.add(Restrictions.eq("custIndustry" , queryVo.getCustIndustry()));
        }
        if(queryVo.getCustLevel()!=null){
            criteria.add(Restrictions.eq("custLevel" , queryVo.getCustLevel()));
        }
        if(queryVo.getCustSource()!=null){
            criteria.add(Restrictions.eq("custSource" , queryVo.getCustSource()));
        }
        return customerDao.getPageList(criteria  , start , pageSize);
    }

    @Override
    public Page<Customer> getPageByQueryVo(CustomerQueryVo queryVo) {
        Page<Customer> page = new Page<>();
        int total = customerDao.getTotalCount(customerDao.getCriteria());
        int pageNum = queryVo.getPage();
        int size = queryVo.getSize();
        List<Customer> rows = getCustomersByQueryVo( queryVo);
        page.setTotal(total);
        page.setPage(pageNum);
        page.setSize(size);
        page.setRows(rows);
        return page;
    }

    @Override
    public void modifyCustomerByCustId(Customer customer) {
        customerDao.update(customer);
    }
}
