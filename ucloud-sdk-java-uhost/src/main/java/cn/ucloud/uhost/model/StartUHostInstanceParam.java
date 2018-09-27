package cn.ucloud.uhost.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 启动主机参数类
 * @author: codezhang
 * @date: 2018-09-14 16:10
 **/

public class StartUHostInstanceParam extends BaseRequestParam {

    /**
     * require 地域，https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;
    /**
     * optional 可用区，https://docs.ucloud.cn/api/summary/regionlist.html
     */
    @UcloudParam("Zone")
    private String zone;
    /**
     * require UHost实例ID 参见 DescribeUHostInstance
     */
    @UcloudParam("UHostId")
    @NotEmpty(message = "uhostId can not be empty")
    private String uhostId;


    /**
     * optional 加密盘密码
     */
    @UcloudParam("DiskPassword")
    private String diskPssword;

    public StartUHostInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                   @NotEmpty(message = "uhostId can not be empty") String uhostId) {
        super("StartUHostInstance");
        this.region = region;
        this.uhostId = uhostId;
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

    public String getUhostId() {
        return uhostId;
    }

    public void setUhostId(String uhostId) {
        this.uhostId = uhostId;
    }


    public String getDiskPssword() {
        return diskPssword;
    }

    public void setDiskPssword(String diskPssword) {
        this.diskPssword = diskPssword;
    }
}
