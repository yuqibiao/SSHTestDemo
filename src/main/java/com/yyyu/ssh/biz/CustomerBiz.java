package com.yyyu.ssh.biz;

import com.yyyu.ssh.bean.CustomerQueryVo;
import com.yyyu.ssh.pojo.Customer;
import com.yyyu.ssh.utils.page.Page;

import java.util.List;

/**
 * 功能：customer表对应数据操作接口
 *
 * @author yu
 * @date 2017/7/28.
 */
public interface CustomerBiz {
    void deleteCustomerByCustId(long custId);

    Customer getCustomerByCustId(long custId);

    List<Customer> getCustomersByQueryVo(CustomerQueryVo queryVo);

    Page<Customer> getPageByQueryVo(CustomerQueryVo queryVo);

    void modifyCustomerByCustId(Customer customer);
}
