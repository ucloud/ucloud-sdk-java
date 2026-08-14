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
package cn.ucloud.ufile.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUFileRefererResponse extends Response {

    /** 防盗链Referer类型，支持两种类型，1黑名单，2白名单；未开启referer时不返回此参数 */
    @SerializedName("RefererType")
    private Integer refererType;

    /** 防盗链Referer规则列表；未开启referer时不返回此参数 */
    @SerializedName("RefererList")
    private List<String> refererList;

    /** ReferType为白名单时，NullRefer为false代表不允许NULL refer访问，为true代表允许Null refer访问; 未开启referer时不返回此参数 */
    @SerializedName("NullRefer")
    private Boolean nullRefer;

    /** 防盗链功能是否开启，"on"表示开启，"off"表示关闭 */
    @SerializedName("RefererStatus")
    private String refererStatus;

    /** 黑名单列表 */
    @SerializedName("BlackList")
    private List<String> blackList;

    /** 白名单列表 */
    @SerializedName("WhiteList")
    private List<String> whiteList;

    public Integer getRefererType() {
        return refererType;
    }

    public void setRefererType(Integer refererType) {
        this.refererType = refererType;
    }

    public List<String> getRefererList() {
        return refererList;
    }

    public void setRefererList(List<String> refererList) {
        this.refererList = refererList;
    }

    public Boolean getNullRefer() {
        return nullRefer;
    }

    public void setNullRefer(Boolean nullRefer) {
        this.nullRefer = nullRefer;
    }

    public String getRefererStatus() {
        return refererStatus;
    }

    public void setRefererStatus(String refererStatus) {
        this.refererStatus = refererStatus;
    }

    public List<String> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    public List<String> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(List<String> whiteList) {
        this.whiteList = whiteList;
    }
}
