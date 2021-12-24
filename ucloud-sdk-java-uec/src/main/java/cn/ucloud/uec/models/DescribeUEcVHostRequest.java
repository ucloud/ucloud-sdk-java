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
package cn.ucloud.uec.models;

import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;
import java.util.List;

public class DescribeUEcVHostRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list): false
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** Idc机房id。默认全部机房: false */
    @UCloudParam("IdcId")
    private List<String> idcId;

    /** 节点id，创建节点时生成的id。默认全部节点: false */
    @UCloudParam("NodeId")
    private List<String> nodeId;

    /** 数据偏移量，默认0，非负整数: false */
    @UCloudParam("Offset")
    private Integer offset;

    /** 返回数据长度， 默认20，非负整数: false */
    @UCloudParam("Limit")
    private Integer limit;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<String> getIdcId() {
        return idcId;
    }

    public void setIdcId(List<String> idcId) {
        this.idcId = idcId;
    }

    public List<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(List<String> nodeId) {
        this.nodeId = nodeId;
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
