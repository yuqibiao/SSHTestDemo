package com.yyyu.ssh.pojo;

import java.io.Serializable;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/24.
 */
public class SysUser implements Serializable {
    private long userId;
    private String userCode;
    private String userName;
    private String userPassword;
    private String userState;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    @Override
    public String toString() {
        return "userId="+userId+"  userCode="+userCode+"  userName="+userName
                +"  userPassword="+userPassword+"  userState="+userState;
    }
}
