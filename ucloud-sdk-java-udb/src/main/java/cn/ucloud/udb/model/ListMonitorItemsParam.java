package cn.ucloud.udb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @Description : 获取某DB类型的所有监控项 参数类
 * @Author : codezhang
 * @Date : 2019-03-04 17:41
 **/
public class ListMonitorItemsParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * DB实例Id,该值可以通过DescribeUDBInstance获取
     */
    @UcloudParam("DBId")
    @NotEmpty(message = "dbId can not be empty")
    private String dbId;

    public ListMonitorItemsParam(@NotEmpty(message = "region can not be empty") String region,
                                 @NotEmpty(message = "dbId can not be empty") String dbId) {
        super("ListMonitorItems");
        this.region = region;
        this.dbId = dbId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }
}
