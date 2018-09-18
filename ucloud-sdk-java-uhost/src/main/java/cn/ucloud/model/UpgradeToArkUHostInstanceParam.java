package cn.ucloud.model;

import cn.ucloud.annotation.UcloudParam;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 普通升级为方舟机型 参数对象
 * 升级注意事项：仅支持普通型+本地盘的组合，需要关机进行，且整个升级过程较慢，每100G约需要等待30分钟。
 * @author: codezhang
 * @date: 2018-09-18 18:34
 **/

public class UpgradeToArkUHostInstanceParam extends BaseRequestParam {

    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 可用区。参见 [可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "zone can not be empty")
    @UcloudParam("Zone")
    private String zone;

    /**
     * require UHost主机的资源ID，例如UHostIds.0代表希望升级的主机1，UHostIds.1代表主机2。
     */
    private List<String> uhostIds;

    @UcloudParam("UHostIds")
    public List<Param> checkUhostIds() throws Exception {
        List<Param> list = new ArrayList<>();
        if (this.uhostIds == null) {
            throw new ValidationException("uhostIds can not be null");
        } else {
            int len = this.uhostIds.size();
            for (int i = 0; i < len; i++) {
                String id = this.uhostIds.get(i);
                if (id == null || id.length() <= 0){
                    throw  new ValidationException("uhostIds."+i+" can not be null or empty");
                }else {
                    list.add(new Param("UHostIds."+i,id));
                }
            }
        }
        return list;
    }

    /**
     * optional 代金券ID 请参考DescribeCoupon接口
     */
    @UcloudParam("CouponId")
    private String couponId;

    public UpgradeToArkUHostInstanceParam(@NotEmpty(message = "region can not be empty") String region,
                                          @NotEmpty(message = "zone can not be empty")String zone) {
        super("UpgradeToArkUHostInstance");
        this.region = region;
        this.zone = zone;
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

    public List<String> getUhostIds() {
        return uhostIds;
    }

    public void setUhostIds(List<String> uhostIds) {
        this.uhostIds = uhostIds;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }
}
