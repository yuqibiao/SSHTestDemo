package com.yyyu.ssh.action;

import com.google.gson.Gson;
import com.yyyu.ssh.bean.CustomerQueryVo;
import com.yyyu.ssh.bean.ResultMessage;
import com.yyyu.ssh.biz.BaseDictBiz;
import com.yyyu.ssh.biz.CustomerBiz;
import com.yyyu.ssh.pojo.BaseDict;
import com.yyyu.ssh.pojo.Customer;
import com.yyyu.ssh.utils.page.Page;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * 功能：Customer对应Action
 *
 * @author yu
 * @date 2017/7/28.
 */

@Namespace("/customer")
public class CustomerAction extends BaseAction{

    private static Logger logger = Logger.getLogger(CustomerAction.class);

    @Value("${fromType.code}")
    private String fromTypeCode;
    @Value("${industryType.code}")
    private String industryTypeCode;
    @Value("${levelType.code}")
    private String levelTypeCode;

    @Autowired
    private BaseDictBiz baseDictBiz;
    @Autowired
    private CustomerBiz customerBiz;

    Customer customer;


    /**
     * 修改customer
     */
    @Action( value = "modifyCustomer")
    public void modifyCustomer(){
        customerBiz.modifyCustomerByCustId(customer);
        ResultMessage<Customer> message = new ResultMessage<>();
        message.setRESULT_CODE(100);
        message.setRESULT_DATA(customer);
        getWriter().print(new Gson().toJson(message));
    }

    @Action(value = "getCustomerByCustId")
    public void getCustomerByCustId(){
        String custIdStr = getRequestParm().getParameter("custId");
        long custId =Long.parseLong( custIdStr);
        Customer customer = customerBiz.getCustomerByCustId(custId);
        ResultMessage<Customer> message = new ResultMessage<>();
        message.setRESULT_CODE(200);
        message.setRESULT_DATA(customer);
        getWriter().print(new Gson().toJson(message));
    }

    /**
     * 根据id删除customer
     */
    @Action( value = "deleteCustomer")
    public void deleteCustomerByCustId(){
        String custIdStr = getRequestParm().getParameter("custId");
        long custId =Long.parseLong( custIdStr);
        customerBiz.deleteCustomerByCustId(custId);
        ResultMessage<String> message = new ResultMessage<>();
        message.setRESULT_CODE(200);
        message.setRESULT_DATA("删除成功");
        getWriter().print(new Gson().toJson(message));
    }

    /**
     * 查询customer数据集合
     * @return
     */
    @Action(value = "list",results = {
            @Result (name = SUCCESS  ,location = "/WEB-INF/view/customer.jsp"),
            @Result(name = ERROR , location = "/WEB-INF/view/login.jsp")
    })
    public String list(){
        CustomerQueryVo queryVo = new CustomerQueryVo();
        String custName = getRequestParm().getParameter("custName");
        String custSource = getRequestParm().getParameter("custSource");
        String custIndustry = getRequestParm().getParameter("custIndustry");
        String custLevel =getRequestParm().getParameter("custLevel");
        String pageNumStr = getRequestParm().getParameter("page");
        if (pageNumStr!=null){
            Integer pageNum = Integer.parseInt(pageNumStr);
            queryVo.setPage(pageNum);
        }
        queryVo.setCustName(custName);
        queryVo.setCustSource(custSource);
        queryVo.setCustIndustry(custIndustry);
        queryVo.setCustLevel(custLevel);
        List<BaseDict> fromType = baseDictBiz.getBaseDictListByCode(fromTypeCode);
        List<BaseDict> industryType = baseDictBiz.getBaseDictListByCode(industryTypeCode);
        List<BaseDict> levelType = baseDictBiz.getBaseDictListByCode(levelTypeCode);
        Page<Customer> page = customerBiz.getPageByQueryVo(queryVo);
        getRequest().put("fromType" , fromType);
        getRequest().put("industryType" , industryType);
        getRequest().put("levelType" , levelType);
        getRequest().put("page" , page);
        return SUCCESS;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
