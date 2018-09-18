package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;

/**
 * @description: 修改主机配置 参数类
 * 修改指定UHost实例的资源配置，如CPU核心数，内存容量大小，磁盘空间大小,网络增强等。
 * 警示信息: 1.修改配置前，请确认该实例已经被关闭。 2.修改磁盘空间大小后，请在启动后按照说明，进入操作系统进行操作。
 * 提示信息: 须按照控制台标准机型配置创建主机（例如：无法创建16核1G的非标准机型）。详情请参考控制台。
 * @author: codezhang
 * @date: 2018-09-18 11:52
 **/
public class ResizeUHostInstanceParam extends BaseRequestParam {


    public ResizeUHostInstanceParam(@NotEmpty(message = "action can not be empty") String action) {
        super(action);
    }

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be null")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * require UHost实例ID 参见 [DescribeUHostInstance](describe_uhost_instance.html)
     */
    @NotEmpty(message = "uhostId can not be null")
    @UcloudParam("UHostId")
    private String uhostId;

    /**
     * optional 虚拟CPU核数，单位：个，
     * 系列1范围：[1,16]，系列2范围：[1,32]，最小值为1，其他值是2的倍数，
     * 默认值为当前实例的CPU核数
     */
    @UcloudParam("CPU")
    private Integer cpu;

    private Integer memory;
}
