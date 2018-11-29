package com.imooc.o2o.entity;

import java.util.Date;
/**
 * 本地账号
 */
public class LocalAuth {

    private Long localAuthId;

    private String username;

    private String password;

    private Date CreateTime;

    private Date lastEditTime;

    private PersonInfo persionInfo;

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public PersonInfo getPersionInfo() {
        return persionInfo;
    }

    public void setPersionInfo(PersonInfo persionInfo) {
        this.persionInfo = persionInfo;
    }

    @Override
    public String toString() {
        return "LocalAuth{" +
                "localAuthId=" + localAuthId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", CreateTime=" + CreateTime +
                ", lastEditTime=" + lastEditTime +
                ", persionInfo=" + persionInfo +
                '}';
    }
}
