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
package cn.ucloud.uai_modelverse.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class UpdateUMInferAPIKeyRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** apikey的id */
    @NotEmpty
    @UCloudParam("KeyId")
    private String keyId;

    /** 更新的名称 */
    @UCloudParam("Name")
    private String name;

    /** 是否modelverse可用 0: 启用 1: 禁用 */
    @UCloudParam("ModelverseDisabled")
    private Integer modelverseDisabled;

    /** 是否沙盒可用 0: 启用 1: 禁用 */
    @UCloudParam("SandBoxDisabled")
    private Integer sandBoxDisabled;

    /** 日限额，单位随用户所在渠道。126渠道单位为美元 */
    @UCloudParam("DailyLimitAmount")
    private String dailyLimitAmount;

    /** 月限额，单位随用户所在渠道。126渠道单位为美元 */
    @UCloudParam("MonthlyLimitAmount")
    private String monthlyLimitAmount;

    /** 全部模型访问开关，开启不受 GrantedModels 参数控制，关闭只能访问 GrantedModels 中添加模型 */
    @UCloudParam("GrantAllModels")
    private Boolean grantAllModels;

    /**
     * 授权模型，内容为数组格式。当 GrantAllModels 为false时 当前key只可访问数组中模型。例：["deepseek-ai/DeepSeek-V3.2-Think"]
     */
    @UCloudParam("GrantedModels")
    private String grantedModels;

    /**
     * ip白名单，换行分割的多组ip。支持IPv4和网段,输入后回车生效,最多100个, 示例: ﻿ 192.168.1.1 192.168.1.10-192.168.1.100
     * 192.168.1.10/24
     */
    @UCloudParam("IPWhitelist")
    private String ipWhitelist;

    /** 是否开启推理日志 */
    @UCloudParam("InferenceLogEnabled")
    private Integer inferenceLogEnabled;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getModelverseDisabled() {
        return modelverseDisabled;
    }

    public void setModelverseDisabled(Integer modelverseDisabled) {
        this.modelverseDisabled = modelverseDisabled;
    }

    public Integer getSandBoxDisabled() {
        return sandBoxDisabled;
    }

    public void setSandBoxDisabled(Integer sandBoxDisabled) {
        this.sandBoxDisabled = sandBoxDisabled;
    }

    public String getDailyLimitAmount() {
        return dailyLimitAmount;
    }

    public void setDailyLimitAmount(String dailyLimitAmount) {
        this.dailyLimitAmount = dailyLimitAmount;
    }

    public String getMonthlyLimitAmount() {
        return monthlyLimitAmount;
    }

    public void setMonthlyLimitAmount(String monthlyLimitAmount) {
        this.monthlyLimitAmount = monthlyLimitAmount;
    }

    public Boolean getGrantAllModels() {
        return grantAllModels;
    }

    public void setGrantAllModels(Boolean grantAllModels) {
        this.grantAllModels = grantAllModels;
    }

    public String getGrantedModels() {
        return grantedModels;
    }

    public void setGrantedModels(String grantedModels) {
        this.grantedModels = grantedModels;
    }

    public String getIPWhitelist() {
        return ipWhitelist;
    }

    public void setIPWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
    }

    public Integer getInferenceLogEnabled() {
        return inferenceLogEnabled;
    }

    public void setInferenceLogEnabled(Integer inferenceLogEnabled) {
        this.inferenceLogEnabled = inferenceLogEnabled;
    }
}
