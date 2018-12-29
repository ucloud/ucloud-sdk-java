package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 获取主机信息 参数类
 * @author: codezhang
 * @date: 2018-09-18 09:26
 **/

public class DescribeUHostInstanceParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * optional 要查询的业务组名称
     */
    @UcloudParam("Tag")
    private String tag;

    /**
     * optional 【数组】UHost主机的资源ID，例如UHostIds.0代表希望获取信息 的主机1，UHostIds.1代表主机2。
     * 如果不传入，则返回当前Region 所有符合条件的UHost实例。
     */
    private List<String> uhostIds;

    @UcloudParam("UHostIds")
    public List<Param> checkUhostIds() {
        List<Param> list = new ArrayList<>();
        List<String> ids = this.getUhostIds();
        if (ids != null) {
            int len = ids.size();
            for (int i = 0; i < len; i++) {
                String id = ids.get(i);
                if (id != null && id.length() > 0){
                    list.add(new Param("UHostIds."+i,id));
                }
            }
        }
        return list;
    }



    /**
     * optional 1：普通云主机；2：抢占型云主机；如不传此参数，默认全部获取
     */
    @UcloudParam("LifeCycle")
    private Integer lifeCycle;

    /**
     * optional 列表起始位置偏移量，默认为0
     */
    @UcloudParam("Offset")
    private Integer offset;

    /**
     * optional 返回数据长度，默认为20，最大100
     */
    @UcloudParam("Limit")
    private Integer limit;

    public DescribeUHostInstanceParam(@NotEmpty(message = "region can not be empty") String region) {
        super("DescribeUHostInstance");
        this.region = region;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<String> getUhostIds() {
        return uhostIds;
    }

    public void setUhostIds(List<String> uhostIds) {
        this.uhostIds = uhostIds;
    }

    public Integer getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
