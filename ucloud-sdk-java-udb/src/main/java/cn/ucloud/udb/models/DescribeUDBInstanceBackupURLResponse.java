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

public class DescribeUDBInstanceBackupURLResponse extends Response {

    /** DB实例备份文件公网的地址 */
    @SerializedName("BackupPath")
    private String backupPath;

    /** DB实例备份文件内网的地址 */
    @SerializedName("InnerBackupPath")
    private String innerBackupPath;

    /** 备份文件的md5值 */
    @SerializedName("MD5")
    private String md5;

    public String getBackupPath() {
        return backupPath;
    }

    public void setBackupPath(String backupPath) {
        this.backupPath = backupPath;
    }

    public String getInnerBackupPath() {
        return innerBackupPath;
    }

    public void setInnerBackupPath(String innerBackupPath) {
        this.innerBackupPath = innerBackupPath;
    }

    public String getMD5() {
        return md5;
    }

    public void setMD5(String md5) {
        this.md5 = md5;
    }
}
