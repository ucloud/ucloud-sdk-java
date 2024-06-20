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
package cn.ucloud.umem.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DescribeUMemPriceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 购买umem大小,单位:GB,范围[1~1024] */
    @NotEmpty
    @UCloudParam("Size")
    private Integer size;

    /** 空间类型:single(无热备),double(热备)(默认: double) */
    @NotEmpty
    @UCloudParam("Type")
    private String type;

    /** Year， Month， Dynamic 如果不指定，则一次性获取三种计费 */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买UMem的时长，默认值为1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 实例类型是否为性能增强型。默认为false，或者不填，true为性能增强型。 */
    @UCloudParam("HighPerformance")
    private Boolean highPerformance;

    /** umem 分片个数 */
    @UCloudParam("BlockCnt")
    private Integer blockCnt;

    /** umem 代理CPU核心数 */
    @UCloudParam("ProxySize")
    private Integer proxySize;

    /** umem分布式代理类型，默认false，true为负载均衡型代理 */
    @UCloudParam("UlbMode")
    private String ulbMode;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getHighPerformance() {
        return highPerformance;
    }

    public void setHighPerformance(Boolean highPerformance) {
        this.highPerformance = highPerformance;
    }

    public Integer getBlockCnt() {
        return blockCnt;
    }

    public void setBlockCnt(Integer blockCnt) {
        this.blockCnt = blockCnt;
    }

    public Integer getProxySize() {
        return proxySize;
    }

    public void setProxySize(Integer proxySize) {
        this.proxySize = proxySize;
    }

    public String getUlbMode() {
        return ulbMode;
    }

    public void setUlbMode(String ulbMode) {
        this.ulbMode = ulbMode;
    }
}
