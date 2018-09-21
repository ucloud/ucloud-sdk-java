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
    DescribeVPCResult describeVPC(DescribeVPCParam param) throws Exception;

    /**
     * 获取VPC信息
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeVPC(DescribeVPCParam param, UcloudHandler handler, Boolean... asyncFlag);



    /**
     * 添加VPC网段
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    AddVPCNetworkResult addVPCNetwork(AddVPCNetworkParam param) throws Exception;

    /**
     * 添加VPC网段
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void addVPCNetwork(AddVPCNetworkParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     * 创建子网
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CreateSubnetResult createSubnet(CreateSubnetParam param) throws Exception;

    /**
     * 创建子网
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createSubnet(CreateSubnetParam param, UcloudHandler handler, Boolean... asyncFlag);



    /**
     * 删除子网
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DeleteSubnetResult deleteSubnet(DeleteSubnetParam param) throws Exception;

    /**
     * 删除子网
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteSubnet(DeleteSubnetParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     * 获取子网信息
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeSubnetResult describeSubnet(DescribeSubnetParam param) throws Exception;

    /**
     * 获取子网信息
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeSubnet(DescribeSubnetParam param, UcloudHandler handler, Boolean... asyncFlag);



    /**
     * 获取子网资源信息
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeSubnetResourceResult describeSubnetResource(DescribeSubnetResourceParam param) throws Exception;

    /**
     * 获取子网资源信息
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeSubnetResource(DescribeSubnetResourceParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     * 更新子网信息
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    UpdateSubnetAttributeResult updateSubnetAttribute(UpdateSubnetAttributeParam param) throws Exception;

    /**
     * 更新子网信息
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateSubnetAttribute(UpdateSubnetAttributeParam param, UcloudHandler handler, Boolean... asyncFlag);


    /**
     * 新建VPC互通
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CreateVPCIntercomResult createVPCIntercom(CreateVPCIntercomParam param) throws Exception;

    /**
     * 新建VPC互通
     * @param param 参数对象
     * @param handler 回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createVPCIntercom(CreateVPCIntercomParam param, UcloudHandler handler, Boolean... asyncFlag);


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
