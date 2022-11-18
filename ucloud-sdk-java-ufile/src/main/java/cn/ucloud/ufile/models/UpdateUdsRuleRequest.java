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
package cn.ucloud.ufile.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class UpdateUdsRuleRequest extends Request {

    /** 规则的唯一Id */
    @NotEmpty
    @UCloudParam("RuleId")
    private String ruleId;

    /** 规则名称 */
    @NotEmpty
    @UCloudParam("RuleName")
    private String ruleName;

    /** 源Bucket名字，全局唯一 */
    @NotEmpty
    @UCloudParam("SrcBucket")
    private String srcBucket;

    /** 源bucket的token之一的tokenId */
    @NotEmpty
    @UCloudParam("SrcTokenId")
    private String srcTokenId;

    /** 目标Bucket名字，全局唯一 */
    @NotEmpty
    @UCloudParam("DstBucket")
    private String dstBucket;

    /** 目标bucket的token之一的tokenId */
    @NotEmpty
    @UCloudParam("DstTokenId")
    private String dstTokenId;

    /** 解压后的目标目录 */
    @NotEmpty
    @UCloudParam("DstDirectory")
    private String dstDirectory;

    /** 是否以压缩文件的前缀为最后一层目录 */
    @NotEmpty
    @UCloudParam("KeepUS3Name")
    private Boolean keepUS3Name;

    /** 触发解压缩的前缀 */
    @NotEmpty
    @UCloudParam("Prefixes")
    private String prefixes;

    /** 操作的ops数组,"Ops.0":"unzip" */
    @UCloudParam("Ops")
    private List<String> ops;

    /** 通知的事件数组 */
    @UCloudParam("Events")
    private List<String> events;

    /** 联系的用户组ID */
    @UCloudParam("ContactGroupId")
    private String contactGroupId;

    /** 通知的类型数组 */
    @UCloudParam("NotificationTypes")
    private List<String> notificationTypes;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getSrcBucket() {
        return srcBucket;
    }

    public void setSrcBucket(String srcBucket) {
        this.srcBucket = srcBucket;
    }

    public String getSrcTokenId() {
        return srcTokenId;
    }

    public void setSrcTokenId(String srcTokenId) {
        this.srcTokenId = srcTokenId;
    }

    public String getDstBucket() {
        return dstBucket;
    }

    public void setDstBucket(String dstBucket) {
        this.dstBucket = dstBucket;
    }

    public String getDstTokenId() {
        return dstTokenId;
    }

    public void setDstTokenId(String dstTokenId) {
        this.dstTokenId = dstTokenId;
    }

    public String getDstDirectory() {
        return dstDirectory;
    }

    public void setDstDirectory(String dstDirectory) {
        this.dstDirectory = dstDirectory;
    }

    public Boolean getKeepUS3Name() {
        return keepUS3Name;
    }

    public void setKeepUS3Name(Boolean keepUS3Name) {
        this.keepUS3Name = keepUS3Name;
    }

    public String getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(String prefixes) {
        this.prefixes = prefixes;
    }

    public List<String> getOps() {
        return ops;
    }

    public void setOps(List<String> ops) {
        this.ops = ops;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public String getContactGroupId() {
        return contactGroupId;
    }

    public void setContactGroupId(String contactGroupId) {
        this.contactGroupId = contactGroupId;
    }

    public List<String> getNotificationTypes() {
        return notificationTypes;
    }

    public void setNotificationTypes(List<String> notificationTypes) {
        this.notificationTypes = notificationTypes;
    }
}
