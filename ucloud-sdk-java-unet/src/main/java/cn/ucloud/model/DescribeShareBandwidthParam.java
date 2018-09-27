package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 获取共享带宽信息 参数类
 * @author: codezhang
 * @date: 2018-09-27 16:52
 **/

public class DescribeShareBandwidthParam extends BaseRequestParam {

    /**
     * require 地域
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * optional 需要返回的共享带宽Id
     */
    private List<String> shareBandwidthIds;

    @UcloudParam("ShareBandwidthIds")
    public List<Param> checkShareBandwidthIds() throws Exception {
        List<Param> list = new ArrayList<>();
        if (shareBandwidthIds != null) {
            int len = shareBandwidthIds.size();
            for (int i = 0; i < len; i++) {
                String id = shareBandwidthIds.get(i);
                if (id == null || id.length() <= 0) {
                    throw new ValidationException("[shareBandwidthIds["+i+"] can not be empty");
                }
                list.add(new Param("ShareBandwidthIds."+i,id));
            }
        }
        return list;
    }

    public DescribeShareBandwidthParam( @NotEmpty(message = "region can not be empty") String region) {
        super("DescribeShareBandwidth");
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<String> getShareBandwidthIds() {
        return shareBandwidthIds;
    }

    public void setShareBandwidthIds(List<String> shareBandwidthIds) {
        this.shareBandwidthIds = shareBandwidthIds;
    }


}
