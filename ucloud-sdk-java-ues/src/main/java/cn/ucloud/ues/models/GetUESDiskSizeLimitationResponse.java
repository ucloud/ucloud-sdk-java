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
package cn.ucloud.ues.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUESDiskSizeLimitationResponse extends Response {

    /** 各磁盘类型容量限制列表 */
    @SerializedName("DiskSizeLimitationSet")
    private List<DiskSizeLimitation> diskSizeLimitationSet;

    public List<DiskSizeLimitation> getDiskSizeLimitationSet() {
        return diskSizeLimitationSet;
    }

    public void setDiskSizeLimitationSet(List<DiskSizeLimitation> diskSizeLimitationSet) {
        this.diskSizeLimitationSet = diskSizeLimitationSet;
    }

    public static class DiskSizeLimitation extends Response {

        /**
         * 数据盘类别，包含普通云盘|CLOUD_NORMAL、SSD云盘|CLOUD_SSD和RSSD云盘|CLOUD_RSSD。普通本地盘只包含普通本地盘|LOCAL_NORMAL一种。SSD本地盘只包含SSD本地盘|LOCAL_SSD一种。
         */
        @SerializedName("DiskType")
        private String diskType;

        /** 最大值，单位GB */
        @SerializedName("MaxSize")
        private Integer maxSize;

        /** 最小值，单位GB */
        @SerializedName("MinSize")
        private Integer minSize;

        public String getDiskType() {
            return diskType;
        }

        public void setDiskType(String diskType) {
            this.diskType = diskType;
        }

        public Integer getMaxSize() {
            return maxSize;
        }

        public void setMaxSize(Integer maxSize) {
            this.maxSize = maxSize;
        }

        public Integer getMinSize() {
            return minSize;
        }

        public void setMinSize(Integer minSize) {
            this.minSize = minSize;
        }
    }
}
