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
package cn.ucloud.usnap.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateSnapshotServiceRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 磁盘ID */
    @NotEmpty
    @UCloudParam("VDiskId")
    private String vDiskId;

    /** Year , Month, Dynamic 默认: Month */
    @UCloudParam("ChargeType")
    private String chargeType;

    /** 购买时长 默认: 1 */
    @UCloudParam("Quantity")
    private Integer quantity;

    /** 业务组 默认：Default */
    @UCloudParam("Tag")
    private String tag;

    /** 默认采用基础版套餐开通，“Base”：基础版，“ Ultimate”：旗舰版，“ Custom”：自定义备份链 */
    @UCloudParam("BackupMode")
    private String backupMode;

    /** BackupMode为Custom时，进行设置, 以12小时秒级为基础进行倍数扩增，如12、24、36、48 */
    @UCloudParam("Journal")
    private Integer journal;

    /** BackupMode为Custom时，进行设置, 以24小时级为基础进行倍数扩增，如24、48、72、96 */
    @UCloudParam("Hour")
    private Integer hour;

    /** BackupMode为Custom时，进行设置, 以5天级为基础进行倍数扩增，如5、10、15、20、25、30 */
    @UCloudParam("Day")
    private Integer day;

    /** 代金券ID */
    @UCloudParam("CouponId")
    private String couponId;

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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getVDiskId() {
        return vDiskId;
    }

    public void setVDiskId(String vDiskId) {
        this.vDiskId = vDiskId;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getBackupMode() {
        return backupMode;
    }

    public void setBackupMode(String backupMode) {
        this.backupMode = backupMode;
    }

    public Integer getJournal() {
        return journal;
    }

    public void setJournal(Integer journal) {
        this.journal = journal;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
