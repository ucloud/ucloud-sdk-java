package cn.ucloud.pathx.model;

import cn.ucloud.common.annotation.UcloudParam;
import cn.ucloud.common.pojo.BaseRequestParam;

import javax.validation.constraints.NotEmpty;


/**
 * @Description : 删除加速配置端口 参数类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 10:02
 **/
public class DeleteUGATaskParam extends BaseRequestParam {
    /**
     * 全球加速实例ID
     */
    @UcloudParam("UGAId")
    @NotEmpty(message = "uGAId can not be empty")
    private String uGAId;
    // TODO 需要人工接入 DeleteUGATask =》 TCP.n
    // TODO 需要人工接入 DeleteUGATask =》 UDP.n
    // TODO 需要人工接入 DeleteUGATask =》 HTTP.n
    // TODO 需要人工接入 DeleteUGATask =》 HTTPS.n


    public DeleteUGATaskParam(String projectId
            , String uGAId
    ) {
        super("DeleteUGATask");
        this.projectId = projectId;
        this.uGAId = uGAId;
    }


    public String getuGAId() {
        return this.uGAId;
    }

    public void setuGAId(String uGAId) {
        this.uGAId = uGAId;
    }


}