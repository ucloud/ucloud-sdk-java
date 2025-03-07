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
package cn.ucloud.nlb.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class DescribeNetworkLoadBalancersRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 负载均衡实例的转发类型 */
    @UCloudParam("ForwardingMode")
    private String forwardingMode;

    /** 是否获取监听器和后端服务节点的详细信息 */
    @UCloudParam("ShowDetail")
    private Boolean showDetail;

    /** 负载均衡实例的ID，数组 */
    @UCloudParam("NLBIds")
    private List<String> nlbIds;

    /** 限定所在的VPC */
    @UCloudParam("VPCId")
    private String vpcId;

    /** 限定所在的子网 */
    @UCloudParam("SubnetId")
    private String subnetId;

    /** 数据偏移量，默认为0 */
    @UCloudParam("Offset")
    private Integer offset;

    /** 数据分页值，默认为100 */
    @UCloudParam("Limit")
    private Integer limit;

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

    public String getForwardingMode() {
        return forwardingMode;
    }

    public void setForwardingMode(String forwardingMode) {
        this.forwardingMode = forwardingMode;
    }

    public Boolean getShowDetail() {
        return showDetail;
    }

    public void setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
    }

    public List<String> getNLBIds() {
        return nlbIds;
    }

    public void setNLBIds(List<String> nlbIds) {
        this.nlbIds = nlbIds;
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

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
