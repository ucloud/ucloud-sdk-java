package cn.ucloud.ulb.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 批量添加VServer后端节点 参数类
 * @author: codezhang
 * @date: 2018-09-19 15:32
 **/

public class AllocateBackendBatchParam extends BaseRequestParam {


    public static class Backend {
        /**
         * require
         * 所添加的后端资源的资源ID
         */
        private String resourceId;

        /**
         * require
         * 所添加的后端资源的类型，枚举值：
         * UHost -> 云主机；
         * UPM -> 物理云主机；
         * UDHost -> 私有专区主机；
         * UDocker -> 容器，
         * 默认值为“UHost”
         */
        private String resourceType;

        /**
         * optional
         * 所添加的后端资源服务端口，取值范围[1-65535]
         */
        private Integer port;

        /**
         * optional
         * 后端实例状态开关，枚举值： 1：启用； 0：禁用
         */
        private Integer enabled;

        /**
         * optional
         * 后端资源内网ip
         */
        private String ip;

        public Backend(String resourceId, String resourceType,Integer port,Integer enabled,String ip) {
            this.resourceId = resourceId;
            this.resourceType = resourceType;
            this.port = port;
            this.enabled = enabled;
            this.ip = ip;
        }

        public String getResourceId() {
            return resourceId;
        }

        public void setResourceId(String resourceId) {
            this.resourceId = resourceId;
        }

        public String getResourceType() {
            return resourceType;
        }

        public void setResourceType(String resourceType) {
            this.resourceType = resourceType;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Integer getEnabled() {
            return enabled;
        }

        public void setEnabled(Integer enabled) {
            this.enabled = enabled;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }
    }


    /**
     * require 地域。 参见 [地域和可用区列表](../summary/regionlist.htm
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
    @NotEmpty(message = "vserverId can not be empty")
    @UcloudParam("VServerId")
    private String vserverId;

    /**
     * require
     */
    private List<Backend> backends;


    @UcloudParam("Backends")
    public List<Param> checkBackends() throws Exception {
        List<Param> list = new ArrayList<>();
        if (this.backends != null) {
            int len = this.backends.size();
            for (int i = 0; i < len; i++) {
                Backend backend = this.backends.get(i);
                StringBuilder valueBuild=new StringBuilder();
                if (backend.resourceId == null || backend.resourceId.length() <=0 ){
                    throw new ValidationException("backend["+i+"].resourceId can not be empty");
                }else {
                    valueBuild.append(backend.resourceId);
                }
                if (backend.resourceType == null || backend.resourceType.length() <= 0){
                    throw new ValidationException("backend["+i+"].resourceType can not be empty");
                }else {
                    valueBuild.append("|"+backend.resourceType);
                }
                if (backend.port != null){
                    valueBuild.append("|"+backend.port);
                }else {
                    throw new ValidationException("backend["+i+"].port can not be null");
                }
                if (backend.enabled != null){
                    valueBuild.append("|"+backend.enabled);
                }else {
                    throw new ValidationException("backend["+i+"].enabled can not be null");
                }
                if (backend.ip != null && backend.ip.length() > 0){
                    valueBuild.append("|"+backend.ip);
                }else {
                    throw new ValidationException("backend["+i+"].ip can not be empty");
                }
                list.add(new Param("Backends."+i,valueBuild.toString()));
            }
        } else {
            throw new ValidationException("backends can not be null");
        }
        return list;
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

    public List<Backend> getBackends() {
        return backends;
    }

    public void setBackends(List<Backend> backends) {
        this.backends = backends;
    }

    public AllocateBackendBatchParam(@NotEmpty(message = "region can not be empty") String region,
                                     @NotEmpty(message = "ulbId can not be empty") String ulbId,
                                     @NotEmpty(message = "vserverId can not be empty") String vserverId) {
        super("AllocateBackendBatch");
        this.region = region;
        this.ulbId = ulbId;
        this.vserverId = vserverId;
    }


}
