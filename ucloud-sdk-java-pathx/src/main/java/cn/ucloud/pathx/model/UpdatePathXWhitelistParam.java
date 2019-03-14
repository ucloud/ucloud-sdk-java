package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.Param;

import javax.validation.ValidationException;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;


/**
 * @Description : 添加或更新入口白名单 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class UpdatePathXWhitelistParam extends BaseRequestParam {
    /**
     * 实例ID，资源唯一标识
     */
    @UcloudParam("InstanceId")
    @NotEmpty(message = "instanceId can not be empty")
    private String instanceId;

    /**
     * 白名单规则，例如 'Whitelist.0: 192.168.1.1/24|tcp|22'，
     * 'Whitelist.1: 192.168.1.2|tcp|8080:8090'，
     * 第一个参数为ip或ip段，第二个参数代表协议（tcp/udp），
     * 第三个参数代表端口号或端口范围（使用 ':' 隔开）；
     * 可以添加多条规则（递增Rule.n字段内的n值）；
     * 此接口需要列出全部规则，例如不填则为清空白名单规则，
     * 如若需要增量添加，使用InsertPathXWhitelist接口
     */
    private List<PathXWhitelist> whiteList;

    public UpdatePathXWhitelistParam(String projectId
            , String instanceId
    ) {
        super("UpdatePathXWhitelist");
        this.projectId = projectId;
        this.instanceId = instanceId;
    }

    @UcloudParam("WhiteList")
    public List<Param> checkWhitelist() throws ValidationException {
        List<Param> params = new ArrayList<>();
        if (whiteList != null) {
            int size = whiteList.size();
            for (int i = 0; i < size; i++) {
                PathXWhitelist wl = whiteList.get(i);
                if (wl == null) {
                    throw new ValidationException(String.format("whiteList[%d] can not be empty", i));
                }
                if (wl.getIp() == null || wl.getIp().length() <= 0) {
                    throw new ValidationException(String.format("whiteList[%d].ip can not be empty", i));
                }
                if (wl.getProtocol() == null || wl.getProtocol().length() <= 0) {
                    throw new ValidationException(String.format("whiteList[%d].protocol can not be empty", i));
                }
                if (wl.getPort() == null || wl.getPort().length() <= 0) {
                    throw new ValidationException(String.format("whiteList[%d].port can not be empty", i));
                }
                params.add(new Param(String.format("Whitelist.%d", i),
                        String.format("%s|%s|%s", wl.getIp(), wl.getProtocol(), wl.getPort())));
            }
        }
        return params;
    }

    public List<PathXWhitelist> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(List<PathXWhitelist> whiteList) {
        this.whiteList = whiteList;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


}