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
package cn.ucloud.ulighthost.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class TerminateULHostInstanceResponse extends Response {

    /** 用于判断主机删除时是否进入回收站。放入回收站:"Yes", 彻底删除：“No”。 */
    @SerializedName("InRecycle")
    private String inRecycle;

    /** ULHost 实例 Id */
    @SerializedName("ULHostId")
    private String ulHostId;

    public String getInRecycle() {
        return inRecycle;
    }

    public void setInRecycle(String inRecycle) {
        this.inRecycle = inRecycle;
    }

    public String getULHostId() {
        return ulHostId;
    }

    public void setULHostId(String ulHostId) {
        this.ulHostId = ulHostId;
    }
}
