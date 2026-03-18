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
package cn.ucloud.uhost.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CopyCustomImageResponse extends Response {

    /** 目标镜像Id，只有非批量复制的时候该字段才存在 */
    @SerializedName("TargetImageId")
    private String targetImageId;

    /** 目标镜像复制的任务Id，只有非批量复制的时候该字段才存在 */
    @SerializedName("TaskId")
    private String taskId;

    /** 批量复制时的任务信息，参考下方的CopyImageTaskInfo */
    @SerializedName("Infos")
    private List<CopyImageTaskInfo> infos;

    public String getTargetImageId() {
        return targetImageId;
    }

    public void setTargetImageId(String targetImageId) {
        this.targetImageId = targetImageId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public List<CopyImageTaskInfo> getInfos() {
        return infos;
    }

    public void setInfos(List<CopyImageTaskInfo> infos) {
        this.infos = infos;
    }

    public static class CopyImageTaskInfo extends Response {

        /** 目标镜像复制的任务Id */
        @SerializedName("TaskId")
        private String taskId;

        /** 目标镜像Id */
        @SerializedName("TargetImageId")
        private String targetImageId;

        /** 目标地域 */
        @SerializedName("TargetRegion")
        private String targetRegion;

        public String getTaskId() {
            return taskId;
        }

        public void setTaskId(String taskId) {
            this.taskId = taskId;
        }

        public String getTargetImageId() {
            return targetImageId;
        }

        public void setTargetImageId(String targetImageId) {
            this.targetImageId = targetImageId;
        }

        public String getTargetRegion() {
            return targetRegion;
        }

        public void setTargetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
        }
    }
}
