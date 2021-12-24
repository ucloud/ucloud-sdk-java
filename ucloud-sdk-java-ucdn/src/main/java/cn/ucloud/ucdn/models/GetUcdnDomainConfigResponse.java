/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.ucdn.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetUcdnDomainConfigResponse extends Response {

    /** 获取的域名信息，具体参考下面DomainConfig */
    @SerializedName("DomainList")
    private List<DomainConfigInfo> domainList;

    public List<DomainConfigInfo> getDomainList() {
        return domainList;
    }

    public void setDomainList(List<DomainConfigInfo> domainList) {
        this.domainList = domainList;
    }

    public static class CacheConf extends Response {

        /** 路径模式，支持正则 */
        @SerializedName("PathPattern")
        private String pathPattern;

        /** 缓存时间 */
        @SerializedName("CacheTTL")
        private Integer cacheTTL;

        /** 缓存时间的单位。sec（秒），min（分钟），hour（小时），day（天）。上限1年。 */
        @SerializedName("CacheUnit")
        private String cacheUnit;

        /** 是否缓存，true为缓存，flase为不缓存。为flase的情况下，CacheTTL和CacheUnit强制不生效 */
        @SerializedName("CacheBehavior")
        private Boolean cacheBehavior;

        /** 状态码模式，非200，206状态码，多个状态码用竖线(|)分隔，该属性仅仅在状态码缓存配置列表中返回 */
        @SerializedName("HttpCodePattern")
        private String httpCodePattern;

        /** 缓存规则描述 */
        @SerializedName("Description")
        private String description;

        /** 是否优先遵循源站头部缓存策略，false为不优先遵循源站，true为优先遵循源站缓存头部。默认为0 */
        @SerializedName("FollowOriginRule")
        private Boolean followOriginRule;

        public String getPathPattern() {
            return pathPattern;
        }

        public void setPathPattern(String pathPattern) {
            this.pathPattern = pathPattern;
        }

        public Integer getCacheTTL() {
            return cacheTTL;
        }

        public void setCacheTTL(Integer cacheTTL) {
            this.cacheTTL = cacheTTL;
        }

        public String getCacheUnit() {
            return cacheUnit;
        }

        public void setCacheUnit(String cacheUnit) {
            this.cacheUnit = cacheUnit;
        }

        public Boolean getCacheBehavior() {
            return cacheBehavior;
        }

        public void setCacheBehavior(Boolean cacheBehavior) {
            this.cacheBehavior = cacheBehavior;
        }

        public String getHttpCodePattern() {
            return httpCodePattern;
        }

        public void setHttpCodePattern(String httpCodePattern) {
            this.httpCodePattern = httpCodePattern;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Boolean getFollowOriginRule() {
            return followOriginRule;
        }

        public void setFollowOriginRule(Boolean followOriginRule) {
            this.followOriginRule = followOriginRule;
        }
    }

    public static class DomainConfigInfo extends Response {

        /** 查询带宽区域 cn代表国内 abroad代表海外 all表示全部区域 */
        @SerializedName("AreaCode")
        private String areaCode;

        /** 加速域名的业务类型，web代表网站，stream代表视频 ，download 代表下载 */
        @SerializedName("CdnType")
        private String cdnType;

        /**
         * 创建的加速域名的当前的状态。check代表审核中，checkSuccess代表审核通过，checkFail代表审核失败，enable代表加速中，disable代表停止加速，delete代表删除加速
         * enableing代表正在开启加速，disableing代表正在停止加速中，deleteing代表删除中
         */
        @SerializedName("Status")
        private String status;

        /** cdn域名。创建加速域名生成的cdn域名，用于设置CNAME记录 */
        @SerializedName("Cname")
        private String cname;

        /** 域名创建的时间。格式：时间戳 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 测试url。用于域名创建加速时的测试 */
        @SerializedName("TestUrl")
        private String testUrl;

        /** 国内https状态 enableing-开启中 fail-开启失败 enable-启用 disable-未启用 */
        @SerializedName("HttpsStatusCn")
        private String httpsStatusCn;

        /** 国外https状态 enableing-开启中 fail-开启失败 enable-启用 disable-未启用 */
        @SerializedName("HttpsStatusAbroad")
        private String httpsStatusAbroad;

        /** 国内证书名称 */
        @SerializedName("CertNameCn")
        private String certNameCn;

        /** 国外证书名称 */
        @SerializedName("CertNameAbroad")
        private String certNameAbroad;

        /** 业务组：Default */
        @SerializedName("Tag")
        private String tag;

        /** 域名Id */
        @SerializedName("DomainId")
        private String domainId;

        /** 域名 */
        @SerializedName("Domain")
        private String domain;

        /** 源站配置 参考OriginConf */
        @SerializedName("OriginConf")
        private OriginConf originConf;

        /** 访问控制配置 参考AccessControlConf */
        @SerializedName("AccessControlConf")
        private AccessControlConf accessControlConf;

        /** 缓存配置 参考CacheAllConfig */
        @SerializedName("CacheConf")
        private CacheAllConfig cacheConf;

        /** 高级配置 参考AdvancedConf */
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

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
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

        public AccessControlConf getAccessControlConf() {
            return accessControlConf;
        }

        public void setAccessControlConf(AccessControlConf accessControlConf) {
            this.accessControlConf = accessControlConf;
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

    public static class AdvancedConf extends Response {

        /** 客户端响应http头列表 */
        @SerializedName("HttpClientHeader")
        private List<String> httpClientHeader;

        /** 源站http头列表 */
        @SerializedName("HttpOriginHeader")
        private List<String> httpOriginHeader;

        /** http转https回源 true是，false否 */
        @SerializedName("Http2Https")
        private Boolean http2Https;

        public List<String> getHttpClientHeader() {
            return httpClientHeader;
        }

        public void setHttpClientHeader(List<String> httpClientHeader) {
            this.httpClientHeader = httpClientHeader;
        }

        public List<String> getHttpOriginHeader() {
            return httpOriginHeader;
        }

        public void setHttpOriginHeader(List<String> httpOriginHeader) {
            this.httpOriginHeader = httpOriginHeader;
        }

        public Boolean getHttp2Https() {
            return http2Https;
        }

        public void setHttp2Https(Boolean http2Https) {
            this.http2Https = http2Https;
        }
    }

    public static class CacheKeyInfo extends Response {

        /** 是否忽略 */
        @SerializedName("Ignore")
        private Boolean ignore;

        /** 路径模式，支持正则 */
        @SerializedName("PathPattern")
        private String pathPattern;

        /** 自定义变量,以$符号开头，多个变量用加号(+)连接，$querystring表示所有变量 */
        @SerializedName("QueryString")
        private String queryString;

        public Boolean getIgnore() {
            return ignore;
        }

        public void setIgnore(Boolean ignore) {
            this.ignore = ignore;
        }

        public String getPathPattern() {
            return pathPattern;
        }

        public void setPathPattern(String pathPattern) {
            this.pathPattern = pathPattern;
        }

        public String getQueryString() {
            return queryString;
        }

        public void setQueryString(String queryString) {
            this.queryString = queryString;
        }
    }

    public static class ReferConf extends Response {

        /** Refer防盗链配置 0白名单，1黑名单 */
        @SerializedName("ReferType")
        private Integer referType;

        /** ReferType为白名单时（删除），NullRefer为0代表不允许NULL refer访问，为1代表允许Null refer访问 */
        @SerializedName("NullRefer")
        private Integer nullRefer;

        /** Refer防盗链规则列表，支持正则表达式 */
        @SerializedName("ReferList")
        private List<String> referList;

        public Integer getReferType() {
            return referType;
        }

        public void setReferType(Integer referType) {
            this.referType = referType;
        }

        public Integer getNullRefer() {
            return nullRefer;
        }

        public void setNullRefer(Integer nullRefer) {
            this.nullRefer = nullRefer;
        }

        public List<String> getReferList() {
            return referList;
        }

        public void setReferList(List<String> referList) {
            this.referList = referList;
        }
    }

    public static class OriginConf extends Response {

        /** 源站ip即cdn服务器回源访问的ip地址。多个源站ip，可以这样表述，如：["1.1.1.1","2.2.2.2"] */
        @SerializedName("OriginIpList")
        private List<String> originIpList;

        /** 回源Http请求头部Host，默认是加速域名 */
        @SerializedName("OriginHost")
        private String originHost;

        /** 回源端口 */
        @SerializedName("OriginPort")
        private Integer originPort;

        /**
         * 1如果为false表示BackupOriginIp为空，表示没有备份源站，忽略BackupOriginIp，BackupOriginHost字段
         * 2如果为true表示BackupOriginIp.n必须至少有一个备份源站地址
         */
        @SerializedName("BackupOriginEnable")
        private Boolean backupOriginEnable;

        /** 备份源站ip即cdn服务器回源访问的ip地址。多个源站ip，可以这样表述，如：["1.1.1.1","2.2.2.2"] */
        @SerializedName("BackupOriginIpList")
        private List<String> backupOriginIpList;

        /** 备份回源Http请求头部Host，默认是加速域名 */
        @SerializedName("BackupOriginHost")
        private String backupOriginHost;

        /** 主源响应的回源错误码（如：404|500），默认空字符串 */
        @SerializedName("OriginErrorCode")
        private String originErrorCode;

        /** 回主源的回源失败数，默认1 */
        @SerializedName("OriginErrorNum")
        private Integer originErrorNum;

        /** 源站协议http，http|https 默认http */
        @SerializedName("OriginProtocol")
        private String originProtocol;

        /** 跟随301跳转 0=不跟随 1=跟随 */
        @SerializedName("OriginFollow301")
        private Integer originFollow301;

        public List<String> getOriginIpList() {
            return originIpList;
        }

        public void setOriginIpList(List<String> originIpList) {
            this.originIpList = originIpList;
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

        public Boolean getBackupOriginEnable() {
            return backupOriginEnable;
        }

        public void setBackupOriginEnable(Boolean backupOriginEnable) {
            this.backupOriginEnable = backupOriginEnable;
        }

        public List<String> getBackupOriginIpList() {
            return backupOriginIpList;
        }

        public void setBackupOriginIpList(List<String> backupOriginIpList) {
            this.backupOriginIpList = backupOriginIpList;
        }

        public String getBackupOriginHost() {
            return backupOriginHost;
        }

        public void setBackupOriginHost(String backupOriginHost) {
            this.backupOriginHost = backupOriginHost;
        }

        public String getOriginErrorCode() {
            return originErrorCode;
        }

        public void setOriginErrorCode(String originErrorCode) {
            this.originErrorCode = originErrorCode;
        }

        public Integer getOriginErrorNum() {
            return originErrorNum;
        }

        public void setOriginErrorNum(Integer originErrorNum) {
            this.originErrorNum = originErrorNum;
        }

        public String getOriginProtocol() {
            return originProtocol;
        }

        public void setOriginProtocol(String originProtocol) {
            this.originProtocol = originProtocol;
        }

        public Integer getOriginFollow301() {
            return originFollow301;
        }

        public void setOriginFollow301(Integer originFollow301) {
            this.originFollow301 = originFollow301;
        }
    }

    public static class CacheAllConfig extends Response {

        /** 缓存Host，不同的域名可以配置为同一个CacheHost来实现缓存共享，默认为加速域名 */
        @SerializedName("CacheHost")
        private String cacheHost;

        /** 缓存配置列表，参见CacheConf */
        @SerializedName("CacheList")
        private List<CacheConf> cacheList;

        /** 状态码缓存配置列表，参见CacheConf */
        @SerializedName("HttpCodeCacheList")
        private List<CacheConf> httpCodeCacheList;

        /** 忽略参数缓存配置列表，参见CacheKeyInfo */
        @SerializedName("CacheKeyList")
        private List<CacheKeyInfo> cacheKeyList;

        public String getCacheHost() {
            return cacheHost;
        }

        public void setCacheHost(String cacheHost) {
            this.cacheHost = cacheHost;
        }

        public List<CacheConf> getCacheList() {
            return cacheList;
        }

        public void setCacheList(List<CacheConf> cacheList) {
            this.cacheList = cacheList;
        }

        public List<CacheConf> getHttpCodeCacheList() {
            return httpCodeCacheList;
        }

        public void setHttpCodeCacheList(List<CacheConf> httpCodeCacheList) {
            this.httpCodeCacheList = httpCodeCacheList;
        }

        public List<CacheKeyInfo> getCacheKeyList() {
            return cacheKeyList;
        }

        public void setCacheKeyList(List<CacheKeyInfo> cacheKeyList) {
            this.cacheKeyList = cacheKeyList;
        }
    }

    public static class AccessControlConf extends Response {

        /** ip黑名单，多个ip，可表示为： IpBlackList.0=1.1.1.1，IpBlackList.1=2.2.2.2 */
        @SerializedName("IpBlackList")
        private List<String> ipBlackList;

        /** refer配置 */
        @SerializedName("ReferConf")
        private ReferConf referConf;

        public List<String> getIpBlackList() {
            return ipBlackList;
        }

        public void setIpBlackList(List<String> ipBlackList) {
            this.ipBlackList = ipBlackList;
        }

        public ReferConf getReferConf() {
            return referConf;
        }

        public void setReferConf(ReferConf referConf) {
            this.referConf = referConf;
        }
    }
}
