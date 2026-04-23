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
package cn.ucloud.uewaf.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class AddWafRegionBlockRuleRequest extends Request {

    /** 项目ID。不填写为默认项目，子帐号必须填写。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 域名 */
    @NotEmpty
    @UCloudParam("FullDomain")
    private String fullDomain;

    /** 规则名称 */
    @NotEmpty
    @UCloudParam("Name")
    private String name;

    /**
     * 封堵地域编码，格式：国家代码:区域列表 大陆区支持省级和市级细分，其他只支持国家，e.g.: CN:110000|440300|320000代表对北京市 深圳市 江苏省 的ip进行封堵;
     * US表示对美国ip进行封堵
     */
    @NotEmpty
    @UCloudParam("BlockRegion")
    private String blockRegion;

    /** 匹配Action，Accept or Deny（默认），Accept暂不支持 */
    @NotEmpty
    @UCloudParam("ActionType")
    private String actionType;

    /** 备注信息 */
    @UCloudParam("Description")
    private String description;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getFullDomain() {
        return fullDomain;
    }

    public void setFullDomain(String fullDomain) {
        this.fullDomain = fullDomain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlockRegion() {
        return blockRegion;
    }

    public void setBlockRegion(String blockRegion) {
        this.blockRegion = blockRegion;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
