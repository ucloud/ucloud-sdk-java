package cn.ucloud.client;


import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.*;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 云主机的client接口
 * @author: codezhang
 * @date: 2018-09-13 10:48
 **/

public interface UhostClient extends UcloudClient {


    /**
     * 获取VNC登录信息（同步）
     * @param param     GetUhostInstanceVncInfoParam参数对象
     * @return GetUhostInstanceVncInfoResult结果对象
     * @throws Exception 出错则抛出异常
     */
    GetUhostInstanceVncInfoResult getUHostInstanceVncInfo(GetUhostInstanceVncInfoParam param) throws Exception;

    /**
     * 获取VNC登录信息(回调)；出错则在回调中的error(e)处理
     *
     * @param param  GetUhostInstanceVncInfoParam参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，同步的
     */
    void getUHostInstanceVncInfoCallback(GetUhostInstanceVncInfoParam param, UcloudHandler handler, Boolean... asyncFlag);

    /**
     * 启动主机实例
     * @param param  启动主机实例参数对象
     * @return 启动主机实例结果对象
     * @throws Exception 出错则抛出异常
     */
    StartUHostInstanceResult startUHostInstance(StartUHostInstanceParam param) throws Exception;

    /**
     * 启动主机实例；出错则在回调中的error(e)处理
     * @param param 启动主机实例参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，仅在handler不为NULL的情况下生效，默认为true，同步的
     */
    void startUHostInstanceCallback(StartUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag);

    /**
     * 重启主机实例
     * @param param 重启主机实例参数对象
     * @return 重启主机实例的结果对象
     * @throws Exception 出错则抛出异常
     */
    RebootUHostInstanceResult rebootUHostInstance(RebootUHostInstanceParam param) throws Exception;

    /**
     * 重启主机实例
     * @param param 重启主机实例参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，仅在handler不为NULL的情况下生效，默认为true，同步的
     */
    void rebootUHostInstanceCallback(RebootUHostInstanceParam param, UcloudHandler handler, Boolean... asyncFlag);

    BaseResponseResult stopUHostInstance(BaseRequestParam param);

    BaseResponseResult describeUHostTags(BaseRequestParam param);

    BaseResponseResult createUHostInstance(BaseRequestParam param);

    BaseResponseResult modifyUHostInstanceTag(BaseRequestParam param);

    BaseResponseResult terminateUHostInstance(BaseRequestParam param);

    BaseResponseResult describeUHostInstance(BaseRequestParam param);

    BaseResponseResult getUHostInstancePrice(BaseRequestParam param);

    BaseResponseResult resizeUHostInstance(BaseRequestParam param);

    BaseResponseResult modifyUHostInstanceName(BaseRequestParam param);

    BaseResponseResult resetUHostInstancePassword(BaseRequestParam param);

    BaseResponseResult poweroffUHostInstance(BaseRequestParam param);

    BaseResponseResult importCustomImage(BaseRequestParam param);

    BaseResponseResult copyCustomImage(BaseRequestParam param);

    BaseResponseResult describeImage(BaseRequestParam param);

    BaseResponseResult terminateCustomImage(BaseRequestParam param);

    BaseResponseResult reinstallUHostInstance(BaseRequestParam param);

    BaseResponseResult getUHostUpgradePrice(BaseRequestParam param);

    BaseResponseResult modifyUHostInstanceRemark(BaseRequestParam param);

    BaseResponseResult createCustomImage(BaseRequestParam param);

    BaseResponseResult upgradeToArkUHostInstance(BaseRequestParam param);

}
