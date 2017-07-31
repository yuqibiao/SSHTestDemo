package com.yyyu.ssh.utils;

/**
 * 功能：字符串相关工具类
 *
 * @author yu
 * @date 2017/7/31.
 */
public class TextUtils {

    /**
     * 判断一个字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str==null || "".equals(str)){
            return true;
        }else{
            return false;
        }
    }

}
