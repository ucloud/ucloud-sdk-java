package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.*;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: vpc客户端
 * @author: codezhang
 * @date: 2018-09-21 10:56
 **/

public interface VPCClient {

    /**
     * 创建VPC
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CreateVPCResult createVPC(CreateVPCParam param) throws Exception;

    /**
     * 创建VPC
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createVPC(CreateVPCParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     * 删除VPC
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DeleteVPCResult deleteVPC(DeleteVPCParam param) throws Exception;

    /**
     * 删除VPC
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteVPC(DeleteVPCParam param, UcloudHandler handler, Boolean... asyncFlag);

    /**
     * 获取VPC信息
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult describeVPC(BaseRequestParam param) throws Exception;

    /**
     * 获取VPC信息
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeVPC(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);



    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult addVPCNetwork(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void addVPCNetwork(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult createSubnet(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createSubnet(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);



    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult deleteSubnet(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteSubnet(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult describeSubnet(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeSubnet(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);



    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult describeSubnetResource(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeSubnetResource(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult updateSubnetAttribute(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateSubnetAttribute(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult createVPCIntercom(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createVPCIntercom(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult describeVPCIntercom(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeVPCIntercom(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult deleteVPCIntercom(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteVPCIntercom(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult createRouteTable(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createRouteTable(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult associateRouteTable(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void associateRouteTable(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult cloneRouteTable(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void cloneRouteTable(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult deleteRouteTable(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteRouteTable(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult describeRouteTable(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeRouteTable(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult modifyRouteRule(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void modifyRouteRule(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult updateRouteTableAttribute(BaseRequestParam param) throws Exception;

    /**
     *
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateRouteTableAttribute(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag);
}
