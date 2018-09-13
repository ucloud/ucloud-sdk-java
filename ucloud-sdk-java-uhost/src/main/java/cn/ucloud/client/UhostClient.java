package cn.ucloud.client;


import cn.ucloud.model.GetUhostInstanceVncInfoParam;

/**
 * @description: 云主机的client
 * @author: codezhang
 * @date: 2018-09-13 10:48
 **/

public class UhostClient {

    public void getUhostInstanceVncInfo(){
        GetUhostInstanceVncInfoParam param = new GetUhostInstanceVncInfoParam();
        param.setProjectId("");
        param.setUhostId("");
        param.setRegion("");
        param.setZone("");
    }
}
