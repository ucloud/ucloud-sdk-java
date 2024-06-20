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
package cn.ucloud.ulog.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUserOperationEventsResponse extends Response {

    /** 用于于请求下一页查询结果。请求参数必须与上次请求一致 */
    @SerializedName("NextToken")
    private String nextToken;

    /** 操作事件列表 */
    @SerializedName("Events")
    private List<UserOperationEvent> events;

    public String getNextToken() {
        return nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public List<UserOperationEvent> getEvents() {
        return events;
    }

    public void setEvents(List<UserOperationEvent> events) {
        this.events = events;
    }

    public static class RelatedResource extends Response {

        /** 资源 ID */
        @SerializedName("ResourceId")
        private String resourceId;

        /** 资源名称 */
        @SerializedName("ResourceName")
        private String resourceName;

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }
    }

    public static class UserOperationEvent extends Response {

        /** 地域 */
        @SerializedName("Region")
        private String region;

        /** 操作的 API */
        @SerializedName("Api")
        private String api;

        /** 是否成功 */
        @SerializedName("IsSuccess")
        private Boolean isSuccess;

        /** 操作时间 */
        @SerializedName("OperateTime")
        private Integer operateTime;

        /** 用户名 */
        @SerializedName("UserName")
        private String userName;

        /** 用户邮箱 */
        @SerializedName("UserEmail")
        private String userEmail;

        /** 操作事件关联的资源 */
        @SerializedName("RelatedResource")
        private List<RelatedResource> relatedResource;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getApi() {
            return api;
        }

        public void setApi(String api) {
            this.api = api;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }

        public void setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
        }

        public Integer getOperateTime() {
            return operateTime;
        }

        public void setOperateTime(Integer operateTime) {
            this.operateTime = operateTime;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public List<RelatedResource> getRelatedResource() {
            return relatedResource;
        }

        public void setRelatedResource(List<RelatedResource> relatedResource) {
            this.relatedResource = relatedResource;
        }
    }
}
