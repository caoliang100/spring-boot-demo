package com.imooc.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@Table(name = "t_api_user")
public class TApiUser {
    /**
     * 接口账户PKID
     */
    @Id
    @Column(name = "api_pkid")
    private Long apiPkid;

    /**
     * 接入方公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 对接人姓名
     */
    @Column(name = "docking_name")
    private String dockingName;

    /**
     * 对接人手机
     */
    @JsonInclude(Include.NON_NULL)
    @Column(name = "docking_mobile")
    private String dockingMobile;

    /**
     * 对接人邮箱
     */
    @Column(name = "docking_email")
    private String dockingEmail;

    /**
     * 对接人QQ
     */
    @Column(name = "docking_qq")
    private String dockingQq;

    /**
     * 公钥(GUID)
     */
    @Column(name = "public_key")
    private String publicKey;

    /**
     * 私钥
     */
    @Column(name = "private_key")
    private String privateKey;

    /**
     * 启用IP白名单：启用=1;禁用=0;
     */
    @Column(name = "enable_ip_white_list")
    private Boolean enableIpWhiteList;

    /**
     * 多个IP以英文','等号隔开，IP段为：8.8.8.*
     */
    @Column(name = "ip_white_list")
    private String ipWhiteList;

    /**
     * 开关：0=关(不接收数据)；1=开(接收数据)
     */
    @Column(name = "on_off")
    private Boolean onOff;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取接口账户PKID
     *
     * @return api_pkid - 接口账户PKID
     */
    public Long getApiPkid() {
        return apiPkid;
    }

    /**
     * 设置接口账户PKID
     *
     * @param apiPkid 接口账户PKID
     */
    public void setApiPkid(Long apiPkid) {
        this.apiPkid = apiPkid;
    }

    /**
     * 获取接入方公司名称
     *
     * @return company_name - 接入方公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置接入方公司名称
     *
     * @param companyName 接入方公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取对接人姓名
     *
     * @return docking_name - 对接人姓名
     */
    public String getDockingName() {
        return dockingName;
    }

    /**
     * 设置对接人姓名
     *
     * @param dockingName 对接人姓名
     */
    public void setDockingName(String dockingName) {
        this.dockingName = dockingName;
    }

    /**
     * 获取对接人手机
     *
     * @return docking_mobile - 对接人手机
     */
    public String getDockingMobile() {
        return dockingMobile;
    }

    /**
     * 设置对接人手机
     *
     * @param dockingMobile 对接人手机
     */
    public void setDockingMobile(String dockingMobile) {
        this.dockingMobile = dockingMobile;
    }

    /**
     * 获取对接人邮箱
     *
     * @return docking_email - 对接人邮箱
     */
    public String getDockingEmail() {
        return dockingEmail;
    }

    /**
     * 设置对接人邮箱
     *
     * @param dockingEmail 对接人邮箱
     */
    public void setDockingEmail(String dockingEmail) {
        this.dockingEmail = dockingEmail;
    }

    /**
     * 获取对接人QQ
     *
     * @return docking_qq - 对接人QQ
     */
    public String getDockingQq() {
        return dockingQq;
    }

    /**
     * 设置对接人QQ
     *
     * @param dockingQq 对接人QQ
     */
    public void setDockingQq(String dockingQq) {
        this.dockingQq = dockingQq;
    }

    /**
     * 获取公钥(GUID)
     *
     * @return public_key - 公钥(GUID)
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * 设置公钥(GUID)
     *
     * @param publicKey 公钥(GUID)
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * 获取私钥
     *
     * @return private_key - 私钥
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * 设置私钥
     *
     * @param privateKey 私钥
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * 获取启用IP白名单：启用=1;禁用=0;
     *
     * @return enable_ip_white_list - 启用IP白名单：启用=1;禁用=0;
     */
    public Boolean getEnableIpWhiteList() {
        return enableIpWhiteList;
    }

    /**
     * 设置启用IP白名单：启用=1;禁用=0;
     *
     * @param enableIpWhiteList 启用IP白名单：启用=1;禁用=0;
     */
    public void setEnableIpWhiteList(Boolean enableIpWhiteList) {
        this.enableIpWhiteList = enableIpWhiteList;
    }

    /**
     * 获取多个IP以英文','等号隔开，IP段为：8.8.8.*
     *
     * @return ip_white_list - 多个IP以英文','等号隔开，IP段为：8.8.8.*
     */
    public String getIpWhiteList() {
        return ipWhiteList;
    }

    /**
     * 设置多个IP以英文','等号隔开，IP段为：8.8.8.*
     *
     * @param ipWhiteList 多个IP以英文','等号隔开，IP段为：8.8.8.*
     */
    public void setIpWhiteList(String ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }

    /**
     * 获取开关：0=关(不接收数据)；1=开(接收数据)
     *
     * @return on_off - 开关：0=关(不接收数据)；1=开(接收数据)
     */
    public Boolean getOnOff() {
        return onOff;
    }

    /**
     * 设置开关：0=关(不接收数据)；1=开(接收数据)
     *
     * @param onOff 开关：0=关(不接收数据)；1=开(接收数据)
     */
    public void setOnOff(Boolean onOff) {
        this.onOff = onOff;
    }

    /**
     * 获取是否删除
     *
     * @return is_delete - 是否删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除
     *
     * @param isDelete 是否删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {

        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}