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

public class ResizeAttachedDiskResponse extends Response {

    /** 改配成功的磁盘id: false */
    @SerializedName("DiskId")
    private String diskId;

    /** 扩容后的状态。NeedRestart = true，必须关闭后启动实例才能使用扩容的磁盘空间。NeedRestart = false,磁盘扩容后无需重启操作。: false */
    @SerializedName("NeedRestart")
    private Boolean needRestart;

    public String getDiskId() {
        return diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public Boolean getNeedRestart() {
        return needRestart;
    }

    public void setNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
    }
}
