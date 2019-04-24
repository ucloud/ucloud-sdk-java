package cn.ucloud.ocr.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.exception.ValidatorException;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;
import com.google.gson.annotations.SerializedName;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description :创建UAI-OCR资源
 * @Author : codezhang
 * @Date : 2019-04-19 15:26
 **/
public class CreateUAIOcrResourceParam extends BaseRequestParam {

    /**
     * 地域。 参见 [地域和可用区列表]
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * 可用区。参见 [可用区列表]
     */
    @UcloudParam("Zone")
    private String zone;

    /**
     * OCR类型。可选类型通过GetUAIOcrAvailResourceType获取。
     */
    private List<Integer> resourceTypeIds;

    /**
     * 资源名称，默认资源名称AutoOcr-timestamp
     */
    @SerializedName("ResourceName")
    private String resourceName;

    /**
     * 资源备注
     */
    @UcloudParam("ResourceMemo")
    private String resourceMemo;

    public CreateUAIOcrResourceParam(@NotEmpty(message = "region can not be empty") String region,
                                     List<Integer> resourceTypeIds) {
        super("CreateUAIOcrResource");
        this.region = region;
        this.resourceTypeIds = resourceTypeIds;
    }

    @UcloudParam("ResourceType")
    public List<Param> checkResourceTypeIds() throws ValidatorException {
        if (resourceTypeIds == null || resourceTypeIds.isEmpty()) {
            throw new ValidatorException("resourceTypeIds is empty");
        }
        List<Param> params = new ArrayList<>();
        int count = resourceTypeIds.size();
        for (int i = 0; i < count; i++) {
            Integer id = resourceTypeIds.get(i);
            if (id == null) {
                throw new ValidatorException(String.format("resourceTypeIds.[%d] is null", i));
            }
            Param param = new Param(String.format("ResourceType.%d", i), id);
            params.add(param);
        }
        return params;
    }

    public List<Integer> getResourceTypeIds() {
        return resourceTypeIds;
    }

    public void setResourceTypeIds(List<Integer> resourceTypeIds) {
        this.resourceTypeIds = resourceTypeIds;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceMemo() {
        return resourceMemo;
    }

    public void setResourceMemo(String resourceMemo) {
        this.resourceMemo = resourceMemo;
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
}
