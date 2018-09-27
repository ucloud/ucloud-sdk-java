package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.*;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: unet客户端
 * @author: codezhang
 * @date: 2018-09-25 11:24
 **/

public interface UnetClient {

    /**
     * 申请弹性IP
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    AllocateEIPResult allocateEIP(AllocateEIPParam param) throws  Exception;

    /**
     * 申请弹性IP
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void allocateEIP(AllocateEIPParam param, UcloudHandler<AllocateEIPResult> handler, Boolean... asyncFlag);


    /**
     * 获取弹性IP信息
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    DescribeEIPResult describeEIP(DescribeEIPParam param) throws  Exception;

    /**
     * 获取弹性IP信息
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void describeEIP(DescribeEIPParam param, UcloudHandler<DescribeEIPResult> handler,Boolean... asyncFlag);


    /**
     * 更新弹性IP名称，业务组，备注等属性字段
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    UpdateEIPAttributeResult updateEIPAttribute(UpdateEIPAttributeParam param) throws  Exception;

    /**
     * 更新弹性IP名称，业务组，备注等属性字段
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void updateEIPAttribute(UpdateEIPAttributeParam param, UcloudHandler<UpdateEIPAttributeResult> handler, Boolean... asyncFlag);


    /**
     * 释放弹性IP资源, 所释放弹性IP必须为非绑定状态.
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    ReleaseEIPResult releaseEIP(ReleaseEIPParam param) throws  Exception;

    /**
     * 释放弹性IP资源, 所释放弹性IP必须为非绑定状态.
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void releaseEIP(ReleaseEIPParam param, UcloudHandler<ReleaseEIPResult> handler,Boolean... asyncFlag);


    /**
     * 将尚未使用的弹性IP绑定到指定的资源
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BindEIPResult bindEIP(BindEIPParam param) throws  Exception;

    /**
     * 将尚未使用的弹性IP绑定到指定的资源
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void bindEIP(BindEIPParam param, UcloudHandler<BindEIPResult> handler,Boolean... asyncFlag);


    /**
     * 将弹性IP从资源上解绑
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    UnBindEIPResult unBindEIP(UnBindEIPParam param) throws  Exception;

    /**
     * 将弹性IP从资源上解绑
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void unBindEIP(UnBindEIPParam param, UcloudHandler<UnBindEIPResult> handler,Boolean... asyncFlag);


    /**
     * 调整弹性IP的外网带宽
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    ModifyEIPBandwidthResult modifyEIPBandwidth(ModifyEIPBandwidthParam param) throws  Exception;

    /**
     * 调整弹性IP的外网带宽
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void modifyEIPBandwidth(ModifyEIPBandwidthParam param, UcloudHandler<ModifyEIPBandwidthResult> handler,Boolean... asyncFlag);


    /**
     * 修改弹性IP的外网出口权重
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    ModifyEIPWeightResult modifyEIPWeight(ModifyEIPWeightParam param) throws  Exception;

    /**
     * 修改弹性IP的外网出口权重
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void modifyEIPWeight(ModifyEIPWeightParam param, UcloudHandler<ModifyEIPWeightResult> handler,Boolean... asyncFlag);



    /**
     * 获取弹性IP价格
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    GetEIPPriceResult getEIPPrice(GetEIPPriceParam param) throws  Exception;

    /**
     * 获取弹性IP价格
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void getEIPPrice(GetEIPPriceParam param, UcloudHandler<GetEIPPriceResult> handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam getEIPUpgradePrice(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void getEIPUpgradePrice(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam getEIPPayMode(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void getEIPPayMode(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam setEIPPayMode(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void setEIPPayMode(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam allocateVIP(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void allocateVIP(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam describeVIP(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void describeVIP(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam releaseVIP(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void releaseVIP(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam createBandwidthPackage(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void createBandwidthPackage(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam describeBandwidthPackage(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void describeBandwidthPackage(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam deleteBandwidthPackage(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void deleteBandwidthPackage(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam allocateShareBandwidth(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void allocateShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam describeShareBandwidth(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void describeShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam resizeShareBandwidth(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void resizeShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam releaseShareBandwidth(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void releaseShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam associateEIPWithShareBandwidth(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void associateEIPWithShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam disassociateEIPWithShareBandwidth(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void disassociateEIPWithShareBandwidth(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam describeBandwidthUsage(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void describeBandwidthUsage(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam deleteFirewall(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void deleteFirewall(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam updateFirewallAttribute(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void updateFirewallAttribute(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam updateFirewall(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void updateFirewall(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam describeFirewallResource(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void describeFirewallResource(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam describeFirewall(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void describeFirewall(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam grantFirewall(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void grantFirewall(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam createFirewall(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void createFirewall(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler,Boolean... asyncFlag);


}
