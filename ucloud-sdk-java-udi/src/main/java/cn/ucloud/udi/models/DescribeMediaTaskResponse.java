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
package cn.ucloud.udi.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeMediaTaskResponse extends Response {

    /** 任务 */
    @SerializedName("Tasks")
    private List<MediaTask> tasks;

    public List<MediaTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<MediaTask> tasks) {
        this.tasks = tasks;
    }

    public static class MediaTask extends Response {

        /** */
        @SerializedName("Function")
        private String function;

        /** */
        @SerializedName("Status")
        private String status;

        /** */
        @SerializedName("Id")
        private String id;

        public String getFunction() {
            return function;
        }

        public void setFunction(String function) {
            this.function = function;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
