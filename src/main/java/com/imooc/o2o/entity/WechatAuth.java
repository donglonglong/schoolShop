package com.imooc.o2o.entity;

import java.util.Date;

/**
 * 微信账号
 */
public class WechatAuth {
    //微信ID
    private Long wechatAuthId;
    //微信openID
    private String openId;
    //创建时间
    private Date createTime;
    //跟用户表关联，创建用户类
    private PersonInfo persionInfo;

    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersionInfo() {
        return persionInfo;
    }

    public void setPersionInfo(PersonInfo persionInfo) {
        this.persionInfo = persionInfo;
    }

    @Override
    public String toString() {
        return "WechatAuth{" +
                "wechatAuthId=" + wechatAuthId +
                ", openId='" + openId + '\'' +
                ", createTime=" + createTime +
                ", persionInfo=" + persionInfo +
                '}';
    }
}
