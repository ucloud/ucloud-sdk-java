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
package cn.ucloud.ufs.models;


import cn.ucloud.common.response.Response;
import com.google.gson.annotations.SerializedName;

public class CreateUFSVolumeResponse extends Response {

    /** 文件系统名称 */
    @SerializedName("VolumeName")
    private String volumeName;

    /** 文件系统ID */
    @SerializedName("VolumeId")
    private String volumeId;

    /** 文件系统挂载点状态 */
    @SerializedName("VolumeStatus")
    private String volumeStatus;

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public String getVolumeStatus() {
        return volumeStatus;
    }

    public void setVolumeStatus(String volumeStatus) {
        this.volumeStatus = volumeStatus;
    }
}
