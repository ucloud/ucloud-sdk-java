package cn.ucloud.ufs.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import org.apache.commons.lang3.StringUtils;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 更新文件系统白名单 参数类
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/10/8 14:55
 */
public class UpdateUFSVolumeWhiteListParam extends BaseRequestParam {
    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @UcloudParam("Region")
    @NotEmpty(message = "region can not be empty")
    private String region;

    /**
     * require 文件系统ID
     */
    @UcloudParam("VolumeId")
    @NotEmpty(message = "volumeId can not be empty")
    private String volumeId;

    /**
     * optional 云主机ID，至少一个
     */
    @NotNull(message = "uHostIds can not be null")
    private List<String> uHostIds;

    @UcloudParam("UHostId")
    public List<Param> checkUHostIds() throws ValidatorException {
        List<Param> list = new ArrayList<>();
        if (this.getuHostIds() != null && !this.getuHostIds().isEmpty()) {
            List<String> ids = this.getuHostIds();
            for (int i = 0, len = ids.size(); i < len; i++) {
                String uHostId = ids.get(i);

                if (StringUtils.isBlank(uHostId))
                    throw new ValidatorException("uHostId[" + i + "] can not be empty");
                else
                    list.add(new Param("UHostId." + i, uHostId));
            }
        }
        return list;
    }

    public UpdateUFSVolumeWhiteListParam(@NotEmpty(message = "region can not be empty") String region,
                                         @NotEmpty(message = "volumeId can not be empty") String volumeId,
                                         @NotNull(message = "uHostIds can not be null") List<String> uHostIds) {
        super("UpdateUFSVolumeWhiteList");
        this.region = region;
        this.volumeId = volumeId;
        this.uHostIds = uHostIds;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public List<String> getuHostIds() {
        return uHostIds;
    }

    public void setuHostIds(List<String> uHostIds) {
        this.uHostIds = uHostIds;
    }
}
