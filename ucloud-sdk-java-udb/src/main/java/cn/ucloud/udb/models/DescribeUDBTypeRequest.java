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


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DescribeUDBTypeRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](../summary/regionlist.html) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /** 跨可用区高可用DB的备库所在区域，仅当该可用区支持跨可用区高可用时填入。参见 [可用区列表](../summary/regionlist.html) */
    @UCloudParam("BackupZone")
    private String backupZone;

    /** DB实例类型，如mysql，sqlserver，mongo，postgresql */
    @UCloudParam("DBClusterType")
    private String dbClusterType;

    /** 返回支持某种实例类型的DB类型。如果没传，则表示任何实例类型均可。 normal:单点,ha:高可用,sharded_cluster:分片集群 */
    @UCloudParam("InstanceMode")
    private String instanceMode;

    /** 返回支持某种磁盘类型的DB类型，如Normal、SSD、NVMe_SSD。如果没传，则表示任何磁盘类型均可。 */
    @UCloudParam("DiskType")
    private String diskType;

    /** 返回从备份创建实例时，该版本号所支持的备份创建版本。如果没传，则表示不是从备份创建。 */
    @UCloudParam("CompatibleWithDBType")
    private String compatibleWithDBType;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getBackupZone() {
        return backupZone;
    }

    public void setBackupZone(String backupZone) {
        this.backupZone = backupZone;
    }

    public String getDBClusterType() {
        return dbClusterType;
    }

    public void setDBClusterType(String dbClusterType) {
        this.dbClusterType = dbClusterType;
    }

    public String getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(String instanceMode) {
        this.instanceMode = instanceMode;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getCompatibleWithDBType() {
        return compatibleWithDBType;
    }

    public void setCompatibleWithDBType(String compatibleWithDBType) {
        this.compatibleWithDBType = compatibleWithDBType;
    }
}
