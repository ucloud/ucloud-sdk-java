package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 17:59
 */
public class DomainConfigInfo {
    /**
     * 查询带宽区域 cn代表国内 abroad代表海外 all表示全部区域
     */
    @SerializedName("AreaCode")
    private String areaCode;
    /**
     * 加速域名的业务类型，web代表网站，stream代表视频 ，download 代表下载
     */
    @SerializedName("CdnType")
    private String cdnType;
    /**
     * 创建的加速域名的当前的状态。check代表审核中，checkSuccess代表审核通过，checkFail代表审核失败，enable代表加速中，disable代表停止加速，delete代表删除加速enableing代表正在开启加速，disableing代表正在停止加速中，deleteing代表删除中
     */
    @SerializedName("Status")
    private String status;
    /**
     * cdn域名。创建加速域名生成的cdn域名，用于设置CNAME记录
     */
    @SerializedName("Cname")
    private String cname;
    /**
     * 域名创建的时间。格式：时间戳
     */
    @SerializedName("CreateTime")
    private Long createTime;
    /**
     * 测试url。用于域名创建加速时的测试
     */
    @SerializedName("TestUrl")
    private String testUrl;
    /**
     * 国内https状态 enableing-开启中 fail-开启失败 enable-启用 disable-未启用
     */
    @SerializedName("HttpsStatusCn")
    private String httpsStatusCn;
    /**
     * 国外https状态 enableing-开启中 fail-开启失败 enable-启用 disable-未启用
     */
    @SerializedName("HttpsStatusAbroad")
    private String httpsStatusAbroad;
    /**
     * 国内证书名称
     */
    @SerializedName("CertNameCn")
    private String certNameCn;
    /**
     * 国外证书名称
     */
    @SerializedName("CertNameAbroad")
    private String certNameAbroad;
    /**
     * 业务组：Default
     */
    @SerializedName("Tag")
    private String tag;
    /**
     * 域名Id
     */
    @SerializedName("DomainId")
    private String domainId;
    /**
     * 域名
     */
    @SerializedName("Domain")
    private String domain;
    /**
     * 源站配置
     */
    @SerializedName("OriginConf")
    private OriginConf originConf;
    /**
     * 访问控制配置
     */
    @SerializedName("AccessConfig")
    private AccessAllConfig accessConf;
    /**
     * 缓存配置
     */
    @SerializedName("CacheConf")
    private CacheAllConfig cacheConf;
    /**
     * 高级配置
     */
    @SerializedName("AdvancedConf")
    private AdvancedConf advancedConf;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCdnType() {
        return cdnType;
    }

    public void setCdnType(String cdnType) {
        this.cdnType = cdnType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getTestUrl() {
        return testUrl;
    }

    public void setTestUrl(String testUrl) {
        this.testUrl = testUrl;
    }

    public String getHttpsStatusCn() {
        return httpsStatusCn;
    }

    public void setHttpsStatusCn(String httpsStatusCn) {
        this.httpsStatusCn = httpsStatusCn;
    }

    public String getHttpsStatusAbroad() {
        return httpsStatusAbroad;
    }

    public void setHttpsStatusAbroad(String httpsStatusAbroad) {
        this.httpsStatusAbroad = httpsStatusAbroad;
    }

    public String getCertNameCn() {
        return certNameCn;
    }

    public void setCertNameCn(String certNameCn) {
        this.certNameCn = certNameCn;
    }

    public String getCertNameAbroad() {
        return certNameAbroad;
    }

    public void setCertNameAbroad(String certNameAbroad) {
        this.certNameAbroad = certNameAbroad;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public OriginConf getOriginConf() {
        return originConf;
    }

    public void setOriginConf(OriginConf originConf) {
        this.originConf = originConf;
    }

    public AccessAllConfig getAccessConf() {
        return accessConf;
    }

    public void setAccessConf(AccessAllConfig accessConf) {
        this.accessConf = accessConf;
    }

    public CacheAllConfig getCacheConf() {
        return cacheConf;
    }

    public void setCacheConf(CacheAllConfig cacheConf) {
        this.cacheConf = cacheConf;
    }

    public AdvancedConf getAdvancedConf() {
        return advancedConf;
    }

    public void setAdvancedConf(AdvancedConf advancedConf) {
        this.advancedConf = advancedConf;
    }
}
