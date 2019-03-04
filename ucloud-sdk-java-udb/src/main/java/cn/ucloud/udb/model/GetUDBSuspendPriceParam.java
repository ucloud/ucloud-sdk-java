package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 删除资源时的回退差价 结果类
 * @Author : codezhang
 * @Date : 2019-03-04 17:30
 **/
public class GetUDBSuspendPriceParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * DBIds.0 代表第一个待删除实例id，对于一次删除多个实例的退费查询，后面为 DBIds.1, DBIds.2 以此类推
     */
    private List<String> dbIds;

    public GetUDBSuspendPriceParam(@NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "zone can not be empty") String zone,
                                   List<String> dbIds) {
        super("GetUDBSuspendPrice");
        this.region = region;
        this.zone = zone;
        this.dbIds = dbIds;
    }

    @UcloudParam("DBIds")
    public List<Param> checkDBIds() throws ValidationException {
        List<Param> list = new ArrayList<>();
        if (dbIds == null || dbIds.size() <= 0) {
            throw new ValidationException("dbIds can not be empty");
        } else {
            for (int i = 0; i < dbIds.size(); i++) {
                if (dbIds.get(i) == null || dbIds.get(i).length() <= 0) {
                    throw new ValidationException(String.format("dbIds[%d] can not be empty", i));
                } else {
                    list.add(new Param(String.format("DBIds.%d", i), dbIds.get(i)));
                }
            }
        }
        return list;
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

    public List<String> getDbIds() {
        return dbIds;
    }

    public void setDbIds(List<String> dbIds) {
        this.dbIds = dbIds;
    }

    @Override
    public String toString() {
        return "GetUDBSuspendPriceParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", dbIds=" + dbIds +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
