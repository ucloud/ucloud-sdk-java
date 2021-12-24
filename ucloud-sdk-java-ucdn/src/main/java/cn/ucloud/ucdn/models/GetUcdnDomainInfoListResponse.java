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
package cn.ucloud.ucdn.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetUcdnDomainInfoListResponse extends Response {

    /** 账户下域名总个数: false */
    @SerializedName("TotalCount")
    private Integer totalCount;

    /** 域名基本信息: false */
    @SerializedName("DomainInfoList")
    private List<DomainBaseInfo> domainInfoList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<DomainBaseInfo> getDomainInfoList() {
        return domainInfoList;
    }

    public void setDomainInfoList(List<DomainBaseInfo> domainInfoList) {
        this.domainInfoList = domainInfoList;
    }

    public static class DomainBaseInfo extends Response {

        /** 域名: false */
        @SerializedName("Domain")
        private String domain;

        /** 域名的资源id: false */
        @SerializedName("DomainId")
        private String domainId;

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getDomainId() {
            return domainId;
        }

        public void setDomainId(String domainId) {
            this.domainId = domainId;
        }
    }
}
