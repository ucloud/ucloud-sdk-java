package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.*;
import cn.ucloud.pojo.BaseRequestParam;

/**
 * @description: unet客户端
 * @author: codezhang
 * @date: 2018-09-25 11:24
 **/

public interface UnetClient {

    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam allocateEIP(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void allocateEIP(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


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
    void describeEIP(DescribeEIPParam param, UcloudHandler handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam updateEIPAttribute(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void updateEIPAttribute(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam releaseEIP(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void releaseEIP(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam bindEIP(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void bindEIP(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam unBindEIP(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void unBindEIP(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam modifyEIPBandwidth(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void modifyEIPBandwidth(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam modifyEIPWeight(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void modifyEIPWeight(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



    /**
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception  请求出错则抛出异常
     */
    BaseRequestParam getEIPPrice(BaseRequestParam param) throws  Exception;

    /**
     *
     * @param param 请求参数对象
     * @param handler 异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void getEIPPrice(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


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
    void getEIPUpgradePrice(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void getEIPPayMode(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void setEIPPayMode(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void allocateVIP(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void describeVIP(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void releaseVIP(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void createBandwidthPackage(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void describeBandwidthPackage(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void deleteBandwidthPackage(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void allocateShareBandwidth(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void describeShareBandwidth(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


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
    void resizeShareBandwidth(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


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
    void releaseShareBandwidth(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


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
    void associateEIPWithShareBandwidth(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


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
    void disassociateEIPWithShareBandwidth(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


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
    void describeBandwidthUsage(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


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
    void deleteFirewall(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


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
    void updateFirewallAttribute(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


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
    void updateFirewall(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void describeFirewallResource(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


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
    void describeFirewall(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void grantFirewall(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);



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
    void createFirewall(BaseRequestParam param, UcloudHandler handler,Boolean... asyncFlag);


}
