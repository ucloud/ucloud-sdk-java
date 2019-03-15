package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 设置读写分离
 * @Author : codezhang
 * @Date : 2019-03-04 19:19
 **/
public class SetUDBRWSplittingParam extends BaseRequestParam {


    /**
     * 目标库所在地域。 参见 [地域和可用区列表](../summary/regionlist.html)
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
     * DB实例ID（master)
     */
    @NotEmpty(message = "masterDBId can not be empty")
    @UcloudParam("MasterDBId")
    private String masterDBId;

    /**
     * 读写分离策略 DataNodeOnly/Uniform/SlaveUniform/Custom
     */
    @NotEmpty(message = "readMode can not be empty")
    @UcloudParam("ReadModel")
    private String readMode;

    /**
     * udb主从节点的只读比例。ReadPercents.0代表主节点的只读比例，ReadPercents.1代表从节点1的读写比例， 以此类推
     */
    private List<Integer> readPercents;

    /**
     * 时间阙值
     */
    @UcloudParam("DelayThreshold")
    private Integer delayThreshold;

    /**
     * DBIds.0 代表UDB主节点， DBIds.1 到DBIds.n 代表1到N个从节点
     */
    private List<String> dbIds;


    public SetUDBRWSplittingParam(@NotEmpty(message = "region can not be empty") String region,
                                  @NotEmpty(message = "zone can not be empty") String zone,
                                  @NotEmpty(message = "masterDBId can not be empty") String masterDBId,
                                  @NotEmpty(message = "readMode can not be empty") String readMode,
                                  List<String> dbIds) {
        super("SetUDBRWSplitting");
        this.region = region;
        this.zone = zone;
        this.masterDBId = masterDBId;
        this.readMode = readMode;
        this.dbIds = dbIds;
    }

    @UcloudParam("ReadPercents")
    public List<Param> checkReadPercents() throws ValidationException {
        if ("Custom".equals(readMode) && (readPercents == null || readPercents.isEmpty())){
            throw new ValidationException("readPercents can not be empty when read mode is custom");
        }
        List<Param> list = new ArrayList<>();
        if (readPercents != null && !readPercents.isEmpty()) {
            for (int i = 0; i < readPercents.size(); i++) {
                if (readPercents.get(i) == null) {
                    throw new ValidationException(String.format("readPercents[%d] can not be null", i));
                } else {
                    Param param = new Param(String.format("ReadPercents.%d", i), readPercents.get(i));
                    list.add(param);
                }
            }
        }
        return list;
    }

    @UcloudParam("DBIds")
    public List<Param> checkDBIds() throws ValidationException {
        List<Param> list = new ArrayList<>();
        if (dbIds == null || dbIds.isEmpty()) {
            throw new ValidationException("dbIds can not be empty");
        } else {
            for (int i = 0; i < dbIds.size(); i++) {
                if (dbIds.get(i) == null || dbIds.get(i).length() <= 0) {
                    throw new ValidationException(String.format("dbIds[%d] can not be empty", i));
                } else {
                    Param param = new Param(String.format("DBIds.%d", i), dbIds.get(i));
                    list.add(param);
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

    public String getMasterDBId() {
        return masterDBId;
    }

    public void setMasterDBId(String masterDBId) {
        this.masterDBId = masterDBId;
    }

    public String getReadMode() {
        return readMode;
    }

    public void setReadMode(String readMode) {
        this.readMode = readMode;
    }

    public List<Integer> getReadPercents() {
        return readPercents;
    }

    public void setReadPercents(List<Integer> readPercents) {
        this.readPercents = readPercents;
    }

    public Integer getDelayThreshold() {
        return delayThreshold;
    }

    public void setDelayThreshold(Integer delayThreshold) {
        this.delayThreshold = delayThreshold;
    }

    public List<String> getDbIds() {
        return dbIds;
    }

    public void setDbIds(List<String> dbIds) {
        this.dbIds = dbIds;
    }

}
