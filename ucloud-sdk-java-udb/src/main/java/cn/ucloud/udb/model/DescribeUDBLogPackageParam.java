package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description : UDB实例日志备份信息列表
 * @Author : codezhang
 * @Date : 2019-03-04 15:19
 **/
public class DescribeUDBLogPackageParam extends BaseRequestParam {
    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
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
     * 分页显示的条目数，列表操作则指定
     */
    @NotNull(message = "limit can not be null")
    @UcloudParam("Limit")
    private Integer limit;

    /**
     * 分页显示的起始偏移，列表操作则指定
     */
    @UcloudParam("Offset")
    @NotNull(message = "offset can not be null")
    private Integer offset;

    /**
     * 需要列出的备份文件类型，每种文件的值如下
     * 2 : BINLOG\_BACKUP 3 : SLOW\_QUERY\_BACKUP 4 : ERRORLOG\_BACKUP
     */
    @UcloudParam("Type")
    private Integer type;

    /**
     * Types作为Type的补充，支持多值传入，可以获取多个类型的日志记录，如：Types.0=2&Types.1=3
     */
    private List<Integer> types;

    /**
     * 实例的Id,该值可以通过DescribeUDBInstance获取
     */
    @UcloudParam("DBId")
    private String dbId;

    @UcloudParam("BeginTime")
    private Integer beginTime;

    @UcloudParam("EndTime")
    private Integer endTime;

    public DescribeUDBLogPackageParam(@NotEmpty(message = "region can not be empty") String region,
                                      @NotNull(message = "limit can not be null") Integer limit,
                                      @NotNull(message = "offset can not be null") Integer offset) {
        super("DescribeUDBLogPackage");
        this.region = region;
        this.limit = limit;
        this.offset = offset;
    }

    @UcloudParam("Types")
    public List<Param> checkTypes() throws ValidationException {
        List<Param> list = new ArrayList<>();
        if (types != null) {
            for (int i = 0; i < types.size(); i++) {
                if (types.get(i) == null) {
                    throw new ValidationException(String.format("types[%d] can not be null", i));
                } else {
                    list.add(new Param(String.format("Types.%d", i), types.get(i)));
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

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Integer> getTypes() {
        return types;
    }

    public void setTypes(List<Integer> types) {
        this.types = types;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "DescribeUDBLogPackageParam{" +
                "region='" + region + '\'' +
                ", zone='" + zone + '\'' +
                ", limit=" + limit +
                ", offset=" + offset +
                ", type=" + type +
                ", types=" + types +
                ", dbId='" + dbId + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", action='" + action + '\'' +
                ", signature='" + signature + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", projectId='" + projectId + '\'' +
                '}';
    }
}
