package com.yyyu.ssh.biz.impl;

import com.yyyu.ssh.biz.BaseDictBiz;
import com.yyyu.ssh.dao.BaseDictDao;
import com.yyyu.ssh.pojo.BaseDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能：base_dict表对应的业务逻辑接口实现
 *
 * @author yu
 * @date 2017/7/28.
 */
@Service
public class BaseDictBizImpl implements BaseDictBiz{

    @Autowired
    private BaseDictDao baseDictDao;

    @Override
    public List<BaseDict> getBaseDictListByCode(String code) {

        return baseDictDao.getBaseDictListByCode(code);
    }
}
