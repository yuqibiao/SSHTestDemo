package com.yyyu.ssh.action;

import com.yyyu.ssh.bean.CustomerQueryVo;
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
        logger.error("======================="+queryVo);
        List<BaseDict> fromType = baseDictBiz.getBaseDictListByCode(fromTypeCode);
        List<BaseDict> industryType = baseDictBiz.getBaseDictListByCode(industryTypeCode);
        List<BaseDict> levelType = baseDictBiz.getBaseDictListByCode(levelTypeCode);
        Page<Customer> page = customerBiz.getPageByQueryVo(queryVo);
        getSession().put("fromType" , fromType);
        getSession().put("industryType" , industryType);
        getSession().put("levelType" , levelType);
        getSession().put("page" , page);
        return SUCCESS;
    }

}
