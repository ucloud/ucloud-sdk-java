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

public class RegisterUMemDefragRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 资源ID */
    @NotEmpty
    @UCloudParam("ResourceId")
    private String resourceId;

    /** 开始时间戳 */
    @UCloudParam("StartTime")
    private Integer startTime;

    /** 关闭时间戳 */
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 操作类型： “Once”： 表示单次执行， “Open”：表示开启策略 “Close”: 表示关闭策略（分布式实例只支持Once）。 */
    @UCloudParam("OperateType")
    private String operateType;

    /** 任务时间周期，单位为分钟。 */
    @UCloudParam("FragTime")
    private Integer fragTime;

    /** 碎片整理阈值，范围为 100-200（分布式实例该参数无效）。 */
    @UCloudParam("FragSize")
    private Integer fragSize;

    /** 开始整点数值（分布式实例该参数无效）。 */
    @UCloudParam("StartHour")
    private Integer startHour;

    /** 开始分钟数（分布式实例该参数无效）。 */
    @UCloudParam("StartMin")
    private Integer startMin;

    /** 结束整点数值（分布式实例该参数无效）。 */
    @UCloudParam("EndHour")
    private Integer endHour;

    /** 结束分钟数（分布式实例该参数无效）。 */
    @UCloudParam("EndMin")
    private Integer endMin;

    /** AND逻辑字段，表示 阈值和时间段都满足（分布式实例该参数无效）。 */
    @UCloudParam("IsUnion")
    private Boolean isUnion;

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

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public Integer getFragTime() {
        return fragTime;
    }

    public void setFragTime(Integer fragTime) {
        this.fragTime = fragTime;
    }

    public Integer getFragSize() {
        return fragSize;
    }

    public void setFragSize(Integer fragSize) {
        this.fragSize = fragSize;
    }

    public Integer getStartHour() {
        return startHour;
    }

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }

    public Integer getStartMin() {
        return startMin;
    }

    public void setStartMin(Integer startMin) {
        this.startMin = startMin;
    }

    public Integer getEndHour() {
        return endHour;
    }

    public void setEndHour(Integer endHour) {
        this.endHour = endHour;
    }

    public Integer getEndMin() {
        return endMin;
    }

    public void setEndMin(Integer endMin) {
        this.endMin = endMin;
    }

    public Boolean getIsUnion() {
        return isUnion;
    }

    public void setIsUnion(Boolean isUnion) {
        this.isUnion = isUnion;
    }
}
