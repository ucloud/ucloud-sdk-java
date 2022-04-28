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
package cn.ucloud.uphone.models;

import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DescribeUPhoneIpRegionsResponse extends Response {

    /** 独立IP地域信息。 */
    @SerializedName("Regions")
    private List<IpRegion> regions;

    /** 总数量 */
    @SerializedName("TotalCount")
    private Integer totalCount;

    public List<IpRegion> getRegions() {
        return regions;
    }

    public void setRegions(List<IpRegion> regions) {
        this.regions = regions;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public static class IpRegion extends Response {

        /** 已开通地域。参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
        @SerializedName("Id")
        private String id;

        /** 库存状态。枚举值：有库存：Available；无库存：SoldOut */
        @SerializedName("StockStatus")
        private String stockStatus;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getStockStatus() {
            return stockStatus;
        }

        public void setStockStatus(String stockStatus) {
            this.stockStatus = stockStatus;
        }
    }
}
