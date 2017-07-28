package com.yyyu.ssh.biz;

import com.yyyu.ssh.pojo.BaseDict;

import java.util.List;

/**
 * 功能：base_dict表对应的业务逻辑接口
 *
 * @author yu
 * @date 2017/7/28.
 */
public interface BaseDictBiz{

     List<BaseDict> getBaseDictListByCode(String code);
}
