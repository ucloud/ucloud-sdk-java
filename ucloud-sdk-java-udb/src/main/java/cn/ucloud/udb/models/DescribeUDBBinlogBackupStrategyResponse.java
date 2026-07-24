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
package cn.ucloud.udb.models;


import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

public class DescribeUDBBinlogBackupStrategyResponse extends Response {

    /** 是否开启binlog自动备份，false:关闭,true:开启 */
    @SerializedName("EnableBinlogBackup")
    private Boolean enableBinlogBackup;

    /** 远端binlog保存时长(天) */
    @SerializedName("BinlogRemoteSaveDays")
    private Integer binlogRemoteSaveDays;

    public Boolean getEnableBinlogBackup() {
        return enableBinlogBackup;
    }

    public void setEnableBinlogBackup(Boolean enableBinlogBackup) {
        this.enableBinlogBackup = enableBinlogBackup;
    }

    public Integer getBinlogRemoteSaveDays() {
        return binlogRemoteSaveDays;
    }

    public void setBinlogRemoteSaveDays(Integer binlogRemoteSaveDays) {
        this.binlogRemoteSaveDays = binlogRemoteSaveDays;
    }
}
