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
package cn.ucloud.ucompshare.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class ListCompShareTeamOperateLogRequest extends Request {

    /** 起始时间，需使用时间戳 */
    @NotEmpty
    @UCloudParam("BeginTime")
    private Integer beginTime;

    /** 结束时间，需使用时间戳，结束时间需大于起始时间 */
    @NotEmpty
    @UCloudParam("EndTime")
    private Integer endTime;

    /** 团队ID */
    @NotEmpty
    @UCloudParam("TeamId")
    private Integer teamId;

    /** 返回数据长度，默认为25，最大100 */
    @UCloudParam("Limit")
    private Integer limit;

    /** 列表起始位置偏移量，默认为0 */
    @UCloudParam("Offset")
    private Integer offset;

    /** 操作类型，详细参考返回值 */
    @UCloudParam("OperateType")
    private List<String> operateType;

    /** 操作状态，详细参考返回值 */
    @UCloudParam("Status")
    private List<String> status;

    /** 排序方式：true表示按创建时间升序，false表示降序（默认） */
    @UCloudParam("OrderByASC")
    private Boolean orderByASC;

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
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

    public List<String> getOperateType() {
        return operateType;
    }

    public void setOperateType(List<String> operateType) {
        this.operateType = operateType;
    }

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public Boolean getOrderByASC() {
        return orderByASC;
    }

    public void setOrderByASC(Boolean orderByASC) {
        this.orderByASC = orderByASC;
    }
}
