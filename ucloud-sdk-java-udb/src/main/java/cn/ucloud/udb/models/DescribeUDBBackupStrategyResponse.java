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

public class DescribeUDBBackupStrategyResponse extends Response {

    /** 备份策略，不可修改，开始时间，单位小时计，默认3点 */
    @SerializedName("BackupBeginTime")
    private Integer backupBeginTime;

    /**
     * 备份日期标记位。共7位,每一位为一周中一天的备份情况 0表示关闭当天备份,1表示打开当天备份。最右边的一位 为星期天的备份开关，其余从右到左依次为星期一到星期
     * 六的备份配置开关，每周必须至少设置两天备份。 例如：1100000 表示打开星期六和星期五的自动备份功能
     */
    @SerializedName("BackupDate")
    private String backupDate;

    /**
     * 默认的备份方式，nobackup表示不备份， snapshot 表示使用快照备份，logic 表示使用逻辑备份，xtrabackup表示使用物理备份。ark_snapshot
     * 方舟快照备份
     */
    @SerializedName("BackupMethod")
    private String backupMethod;

    /** 用户转存备份到自己的UFILE配置, 结构参考UFileDataSet */
    @SerializedName("UserUFileData")
    private UFileDataSet userUFileData;

    /** 保留多少天 */
    @SerializedName("SaveDays")
    private Integer saveDays;

    public Integer getBackupBeginTime() {
        return backupBeginTime;
    }

    public void setBackupBeginTime(Integer backupBeginTime) {
        this.backupBeginTime = backupBeginTime;
    }

    public String getBackupDate() {
        return backupDate;
    }

    public void setBackupDate(String backupDate) {
        this.backupDate = backupDate;
    }

    public String getBackupMethod() {
        return backupMethod;
    }

    public void setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
    }

    public UFileDataSet getUserUFileData() {
        return userUFileData;
    }

    public void setUserUFileData(UFileDataSet userUFileData) {
        this.userUFileData = userUFileData;
    }

    public Integer getSaveDays() {
        return saveDays;
    }

    public void setSaveDays(Integer saveDays) {
        this.saveDays = saveDays;
    }

    public static class UFileDataSet extends Response {

        /** Ufile的令牌tokenid */
        @SerializedName("TokenID")
        private String tokenID;

        /** bucket名称 */
        @SerializedName("Bucket")
        private String bucket;

        public String getTokenID() {
            return tokenID;
        }

        public void setTokenID(String tokenID) {
            this.tokenID = tokenID;
        }

        public String getBucket() {
            return bucket;
        }

        public void setBucket(String bucket) {
            this.bucket = bucket;
        }
    }
}
