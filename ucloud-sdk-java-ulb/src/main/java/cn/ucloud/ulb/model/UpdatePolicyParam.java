package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 更新内容转发规则 参数类
 * @author: codezhang
 * @date: 2018-09-19 18:33
 **/

public class UpdatePolicyParam  extends BaseRequestParam {
    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.html)
     */
    @NotEmpty(message = "region can not be empty")
    @UcloudParam("Region")
    private String region;

    /**
     * require 负载均衡实例的ID
     */
    @NotEmpty(message = "ulbId can not be empty")
    @UcloudParam("ULBId")
    private String ulbId;

    /**
     * require VServer实例的ID
     */
    @UcloudParam("VServerId")
    @NotEmpty(message = "vserverId can not be empty")
    private String vserverId;

    /**
     * require 内容转发策略应用的后端资源实例的ID，
     * 来源于 AllocateBackend 返回的 BackendId
     */
    private List<String> backendIds;

    @UcloudParam("BackendIds")
    public List<Param> checkBackendIds() throws Exception {
        List<Param> list = new ArrayList<>();
        if (this.backendIds == null) {
            throw new ValidationException("backendIds can not be null");
        } else {
            int len = backendIds.size();
            if (len == 0) {
                throw new ValidationException("backendIds can not be empty");
            } else {
                for (int i = 0; i < len; i++) {
                    String id = backendIds.get(i);
                    if (id == null || id.length() <= 0) {
                        throw new ValidationException("backendIds.[" + i + "] can not be empty");
                    } else {
                        list.add(new Param("BackendId." + i  ,id));
                    }
                }
            }
        }
        return list;
    }

    /**
     * require 转发规则的ID
     */
    @NotEmpty(message = "policy can not be empty")
    @UcloudParam("PolicyId")
    private String policyId;

    /**
     * require 内容转发匹配字段
     */
    @NotEmpty(message = "match can not be empty")
    @UcloudParam("Match")
    private String match;

    /**
     * optional 内容转发匹配字段的类型
     */
    @UcloudParam("Type")
    private String type;


    public UpdatePolicyParam(@NotEmpty(message = "region can not be empty") String region,
                             @NotEmpty(message = "ulbId can not be empty") String ulbId,
                             @NotEmpty(message = "vserverId can not be empty") String vserverId,
                             @NotEmpty(message = "policy can not be empty") String policyId,
                             @NotEmpty(message = "match can not be empty") String match) {
        super("UpdatePolicy");
        this.region = region;
        this.ulbId = ulbId;
        this.vserverId = vserverId;
        this.policyId = policyId;
        this.match = match;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUlbId() {
        return ulbId;
    }

    public void setUlbId(String ulbId) {
        this.ulbId = ulbId;
    }

    public String getVserverId() {
        return vserverId;
    }

    public void setVserverId(String vserverId) {
        this.vserverId = vserverId;
    }

    public List<String> getBackendIds() {
        return backendIds;
    }

    public void setBackendIds(List<String> backendIds) {
        this.backendIds = backendIds;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
