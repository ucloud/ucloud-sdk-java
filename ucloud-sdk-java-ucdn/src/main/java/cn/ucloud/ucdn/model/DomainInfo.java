package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 14:08
 */
public class DomainInfo {
    /**
     * 源站ip即cdn服务器回源访问的ip地址。支持多个源站ip，多个源站ip，可表述为如：[1.1.1.1,2.2.2.2]
     */
    @SerializedName("OriginIp")
    private List<String> originIps;

    /**
     * 测试url，用于域名创建加速时的测试
     */
    @SerializedName("TestUrl")
    private String testUrl;

    /**
     * 加速域名的业务类型，web代表网站，stream代表视频，download代表下载。
     */
    @SerializedName("CdnType")
    private String cdnType;

    /**
     * 缓存配置规则列表
     */
    @SerializedName("CacheConf")
    private List<CacheConf> cacheConfs;

    /**
     * 查询带宽区域 cn代表国内 abroad代表海外 不填默认为全部区域
     */
    @SerializedName("AreaCode")
    private String areaCode;

    /**
     * 回源Http请求头部Host，默认是加速域名
     */
    @SerializedName("OriginHost")
    private String originHost;

    /**
     * 回源端口
     */
    @SerializedName("OriginPort")
    private Integer originPort;

    /**
     * 加速类型http,http|https
     */
    @SerializedName("CdnProtocol")
    private String cdnProtocol;

    /**
     * 源站协议http，http|https 默认http
     */
    @SerializedName("OriginProtocol")
    private String originProtocol;

    /**
     * 证书名称
     */
    @SerializedName("CertName")
    private String certName;

    /**
     * 业务组，默认为Default
     */
    @SerializedName("Tag")
    private String tag;

    /**
     * 缓存Host，不同的域名可以配置为同一个CacheHost来实现缓存共享，默认为加速域名
     */
    @SerializedName("CacheHost")
    private String cacheHost;

    /**
     * 0白名单，1黑名单
     */
    @SerializedName("ReferType")
    private Integer referType;

    /**
     * ReferType为白名单时，NullRefer为false代表不允许NULL refer访问，为true代表允许Null refer访问
     */
    @SerializedName("NullRefer")
    private Boolean nullRefer;

    /**
     * Refer列表，支持正则表达式
     */
    @SerializedName("ReferList")
    private List<String> referList;

    /**
     * 域名，用户创建加速的域名
     */
    @SerializedName("Domain")
    private String domain;

    /**
     * 域名id，创建域名时生成的id
     */
    @SerializedName("DomainId")
    private String domainId;

    /**
     * 创建的加速域名的当前的状态。check代表审核中，checkSuccess代表审核通过，checkFail代表审核失败，enable代表加速中，
     * disable代表停止加速，delete代表删除加速 enableing代表正在开启加速，disableing代表正在停止加速中，deleteing代表删除中
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
     * 开始分配Cname时间。格式：时间戳
     */
    @SerializedName("ValidTime")
    private Long validTime;

    /**
     * 访问控制
     */
    @SerializedName("AccessConf")
    private AccessConf accessConf;

    /**
     * refer配置开关，true打开，false关闭
     */
    @SerializedName("ReferStatus")
    private Boolean referStatus;

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


    public List<String> getOriginIps() {
        return originIps;
    }

    public void setOriginIps(List<String> originIps) {
        this.originIps = originIps;
    }

    public String getTestUrl() {
        return testUrl;
    }

    public void setTestUrl(String testUrl) {
        this.testUrl = testUrl;
    }

    public String getCdnType() {
        return cdnType;
    }

    public void setCdnType(String cdnType) {
        this.cdnType = cdnType;
    }

    public List<CacheConf> getCacheConfs() {
        return cacheConfs;
    }

    public void setCacheConfs(List<CacheConf> cacheConfs) {
        this.cacheConfs = cacheConfs;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getOriginHost() {
        return originHost;
    }

    public void setOriginHost(String originHost) {
        this.originHost = originHost;
    }

    public Integer getOriginPort() {
        return originPort;
    }

    public void setOriginPort(Integer originPort) {
        this.originPort = originPort;
    }

    public String getCdnProtocol() {
        return cdnProtocol;
    }

    public void setCdnProtocol(String cdnProtocol) {
        this.cdnProtocol = cdnProtocol;
    }

    public String getOriginProtocol() {
        return originProtocol;
    }

    public void setOriginProtocol(String originProtocol) {
        this.originProtocol = originProtocol;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCacheHost() {
        return cacheHost;
    }

    public void setCacheHost(String cacheHost) {
        this.cacheHost = cacheHost;
    }

    public Integer getReferType() {
        return referType;
    }

    public void setReferType(Integer referType) {
        this.referType = referType;
    }

    public Boolean getNullRefer() {
        return nullRefer;
    }

    public void setNullRefer(Boolean nullRefer) {
        this.nullRefer = nullRefer;
    }

    public List<String> getReferList() {
        return referList;
    }

    public void setReferList(List<String> referList) {
        this.referList = referList;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
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

    public Long getValidTime() {
        return validTime;
    }

    public void setValidTime(Long validTime) {
        this.validTime = validTime;
    }

    public AccessConf getAccessConf() {
        return accessConf;
    }

    public void setAccessConf(AccessConf accessConf) {
        this.accessConf = accessConf;
    }

    public Boolean getReferStatus() {
        return referStatus;
    }

    public void setReferStatus(Boolean referStatus) {
        this.referStatus = referStatus;
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
}
