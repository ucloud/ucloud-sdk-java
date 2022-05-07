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
package cn.ucloud.vpc.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class DescribeNetworkInterfaceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 所属VPC */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 所属子网 */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 虚拟网卡ID,可指定 0~n */
    @UCloudParam("InterfaceId")
    private List<String> interfaceId;

    /** 若为true 只返回默认网卡 默认为false */
    @UCloudParam("OnlyDefault")
    private Boolean onlyDefault;

    /** 若为true 过滤绑定在回收站主机中的网卡。默认为false。 */
    @UCloudParam("NoRecycled")
    private Boolean noRecycled;

    /** 业务组 */
    @UCloudParam("Tag")
    private String tag;

    /** 默认为20 */
    @UCloudParam("Limit")
    private Integer limit;

    /** 默认为0 */
    @UCloudParam("Offset")
    private Integer offset;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getVPCId() {
        return vpcId;
    }

    public void setVPCId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public List<String> getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(List<String> interfaceId) {
        this.interfaceId = interfaceId;
    }

    public Boolean getOnlyDefault() {
        return onlyDefault;
    }

    public void setOnlyDefault(Boolean onlyDefault) {
        this.onlyDefault = onlyDefault;
    }

    public Boolean getNoRecycled() {
        return noRecycled;
    }

    public void setNoRecycled(Boolean noRecycled) {
        this.noRecycled = noRecycled;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
