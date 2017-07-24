package com.yyyu.ssh.pojo;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/24.
 */
public class SysUser {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysUser sysUser = (SysUser) o;

        if (userId != sysUser.userId) return false;
        if (userCode != null ? !userCode.equals(sysUser.userCode) : sysUser.userCode != null) return false;
        if (userName != null ? !userName.equals(sysUser.userName) : sysUser.userName != null) return false;
        if (userPassword != null ? !userPassword.equals(sysUser.userPassword) : sysUser.userPassword != null)
            return false;
        if (userState != null ? !userState.equals(sysUser.userState) : sysUser.userState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userCode != null ? userCode.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userState != null ? userState.hashCode() : 0);
        return result;
    }
}
