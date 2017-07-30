package com.yyyu.ssh.bean;

/**
 * 功能：
 *
 * @author yyyu
 * @date 2017/7/30
 */
public class ResultMessage<T> {

    //返回码 200 成功 500异常
    private int RESULT_CODE;
    private T RESULT_DATA;

    public ResultMessage() {
    }

    public int getRESULT_CODE() {
        return RESULT_CODE;
    }

    public void setRESULT_CODE(int RESULT_CODE) {
        this.RESULT_CODE = RESULT_CODE;
    }

    public T getRESULT_DATA() {
        return RESULT_DATA;
    }

    public void setRESULT_DATA(T RESULT_DATA) {
        this.RESULT_DATA = RESULT_DATA;
    }
}
