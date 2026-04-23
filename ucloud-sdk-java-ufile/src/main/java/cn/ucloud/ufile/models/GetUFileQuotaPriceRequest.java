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

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class GetUFileQuotaPriceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 存储容量，单位: GB*天，范围: [0, 30 000 000]，步长：100GB*天 */
    @UCloudParam("StorageVolume")
    private Integer storageVolume;

    /** 下载流量，单位: GB，范围: [0, 60 000]，步长：1GB */
    @UCloudParam("DownloadTraffic")
    private Integer downloadTraffic;

    /** 请求次数，单位：万次，范围：[0, 1 000 000]，步长：1万次 */
    @UCloudParam("RequestCount")
    private Integer requestCount;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(Integer storageVolume) {
        this.storageVolume = storageVolume;
    }

    public Integer getDownloadTraffic() {
        return downloadTraffic;
    }

    public void setDownloadTraffic(Integer downloadTraffic) {
        this.downloadTraffic = downloadTraffic;
    }

    public Integer getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }
}
