package com.yyyu.ssh.dao;

import com.yyyu.ssh.pojo.BaseDict;

import java.util.List;

/**
 * 功能：对应base_dict表的数据操作接口
 *
 * @author yu
 * @date 2017/7/28.
 */
public interface BaseDictDao extends BaseDao<BaseDict>{

    List<BaseDict> getBaseDictListByCode(String code);

}
