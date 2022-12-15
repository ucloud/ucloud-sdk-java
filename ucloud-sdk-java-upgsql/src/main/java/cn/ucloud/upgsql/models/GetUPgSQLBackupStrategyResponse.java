/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.ucloud.upgsql.models;

import java.util.List;


import com.google.gson.annotations.SerializedName;

import cn.ucloud.common.response.Response;

public class GetUPgSQLBackupStrategyResponse extends Response {

    
        
    /**
     * 自动备份预计开始时间范围
     */
    @SerializedName("BackupTimeRange")
    private String backupTimeRange;
        
    
        
    /**
     * 自动备份预期星期几(1~7)开始
     */
    @SerializedName("BackupWeek")
    private String backupWeek;
        
    
        
    /**
     * 默认的备份方式
     */
    @SerializedName("BackupMethod")
    private String backupMethod;
        
    
    public String getBackupTimeRange() {
        return backupTimeRange;
    }

    public void setBackupTimeRange(String backupTimeRange) {
        this.backupTimeRange = backupTimeRange;
    }
    
    public String getBackupWeek() {
        return backupWeek;
    }

    public void setBackupWeek(String backupWeek) {
        this.backupWeek = backupWeek;
    }
    
    public String getBackupMethod() {
        return backupMethod;
    }

    public void setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
    }
    
}









