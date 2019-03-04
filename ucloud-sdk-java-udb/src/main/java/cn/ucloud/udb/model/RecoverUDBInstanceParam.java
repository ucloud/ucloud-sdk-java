package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description : 将db恢复到某个指定时间点 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 18:56
 **/
public class RecoverUDBInstanceParam extends BaseRequestParam {

    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * DB实例ID
     */
    @NotEmpty(message = "srcDBId can not be empty")
    @UcloudParam("SrcDBId")
    private String srcDBId;

    /**
     * 目标DB实例ID
     */
    @NotEmpty(message = "dstDBId can not be empty")
    @UcloudParam("DstDBId")
    private String dstDBId;

    /**
     * 恢复到某个时间点的时间戳
     */
    @NotNull(message = "time can not be null")
    @UcloudParam("Time")
    private Integer time;

    public RecoverUDBInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "srcDBId can not be empty") String srcDBId,
                                   @NotEmpty(message = "dstDBId can not be empty") String dstDBId,
                                   @NotNull(message = "time can not be null") Integer time) {
        super("RecoverUDBInstance");
        this.region = region;
        this.srcDBId = srcDBId;
        this.dstDBId = dstDBId;
        this.time = time;
    }

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

    public String getSrcDBId() {
        return srcDBId;
    }

    public void setSrcDBId(String srcDBId) {
        this.srcDBId = srcDBId;
    }

    public String getDstDBId() {
        return dstDBId;
    }

    public void setDstDBId(String dstDBId) {
        this.dstDBId = dstDBId;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "RecoverUDBInstanceParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", srcDBId='" + srcDBId + '\'' +
                ", dstDBId='" + dstDBId + '\'' +
                ", time=" + time +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
