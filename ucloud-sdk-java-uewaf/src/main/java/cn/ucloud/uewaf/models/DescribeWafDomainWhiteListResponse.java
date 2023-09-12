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

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeWafDomainWhiteListResponse extends Response {

    /** 白名单返回结果，参考BWInfoRes */
    @SerializedName("Res")
    private BWInfoRes res;

    public BWInfoRes getRes() {
        return res;
    }

    public void setRes(BWInfoRes res) {
        this.res = res;
    }

    public static class BWInfo extends Response {

        /** 黑名单/白名单规则ID */
        @SerializedName("ID")
        private Integer id;

        /** 类型 */
        @SerializedName("Type")
        private String type;

        /** 加入方式(黑) */
        @SerializedName("Source")
        private String source;

        /** IP列表 */
        @SerializedName("CIDRS")
        private List<String> cidrs;

        /** 加入时间 */
        @SerializedName("CreateTime")
        private String createTime;

        /** 过期时间 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 状态 */
        @SerializedName("State")
        private Integer state;

        /** 加入方式(白) */
        @SerializedName("SRC")
        private String src;

        /** 规则名称 */
        @SerializedName("Name")
        private String name;

        /** 备注信息 */
        @SerializedName("Remark")
        private String remark;

        public Integer getID() {
            return id;
        }

        public void setID(Integer id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public List<String> getCIDRS() {
            return cidrs;
        }

        public void setCIDRS(List<String> cidrs) {
            this.cidrs = cidrs;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
        }

        public String getSRC() {
            return src;
        }

        public void setSRC(String src) {
            this.src = src;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }

    public static class BWInfoRes extends Response {

        /** 总数 */
        @SerializedName("Total")
        private Integer total;

        /** 返回数量 */
        @SerializedName("Count")
        private Integer count;

        /** 详情列表，参考BWInfo */
        @SerializedName("Info")
        private List<BWInfo> info;

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public List<BWInfo> getInfo() {
            return info;
        }

        public void setInfo(List<BWInfo> info) {
            this.info = info;
        }
    }
}
