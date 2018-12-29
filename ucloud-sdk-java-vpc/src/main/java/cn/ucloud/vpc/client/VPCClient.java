package cn.ucloud.vpc.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.vpc.model.*;

/**
 * @description: vpc客户端
 * @author: codezhang
 * @date: 2018-09-21 10:56
 **/

public interface VPCClient extends UcloudClient {

    /**
     * 创建VPC
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CreateVPCResult createVPC(CreateVPCParam param) throws Exception;

    /**
     * 创建VPC
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createVPC(CreateVPCParam param, UcloudHandler<CreateVPCResult> handler, Boolean... asyncFlag);


    /**
     * 删除VPC
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DeleteVPCResult deleteVPC(DeleteVPCParam param) throws Exception;

    /**
     * 删除VPC
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteVPC(DeleteVPCParam param, UcloudHandler<DeleteVPCResult> handler, Boolean... asyncFlag);

    /**
     * 获取VPC信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeVPCResult describeVPC(DescribeVPCParam param) throws Exception;

    /**
     * 获取VPC信息
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeVPC(DescribeVPCParam param, UcloudHandler<DescribeVPCResult> handler, Boolean... asyncFlag);


    /**
     * 添加VPC网段
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    AddVPCNetworkResult addVPCNetwork(AddVPCNetworkParam param) throws Exception;

    /**
     * 添加VPC网段
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void addVPCNetwork(AddVPCNetworkParam param, UcloudHandler<AddVPCNetworkResult> handler, Boolean... asyncFlag);


    /**
     * 创建子网
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CreateSubnetResult createSubnet(CreateSubnetParam param) throws Exception;

    /**
     * 创建子网
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createSubnet(CreateSubnetParam param, UcloudHandler<CreateSubnetResult> handler, Boolean... asyncFlag);


    /**
     * 删除子网
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DeleteSubnetResult deleteSubnet(DeleteSubnetParam param) throws Exception;

    /**
     * 删除子网
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteSubnet(DeleteSubnetParam param, UcloudHandler<DeleteSubnetResult> handler, Boolean... asyncFlag);


    /**
     * 获取子网信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeSubnetResult describeSubnet(DescribeSubnetParam param) throws Exception;

    /**
     * 获取子网信息
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeSubnet(DescribeSubnetParam param, UcloudHandler<DescribeSubnetResult> handler, Boolean... asyncFlag);


    /**
     * 获取子网资源信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeSubnetResourceResult describeSubnetResource(DescribeSubnetResourceParam param) throws Exception;

    /**
     * 获取子网资源信息
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeSubnetResource(DescribeSubnetResourceParam param, UcloudHandler<DescribeSubnetResourceResult> handler, Boolean... asyncFlag);


    /**
     * 更新子网信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    UpdateSubnetAttributeResult updateSubnetAttribute(UpdateSubnetAttributeParam param) throws Exception;

    /**
     * 更新子网信息
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateSubnetAttribute(UpdateSubnetAttributeParam param, UcloudHandler<UpdateSubnetAttributeResult> handler, Boolean... asyncFlag);


    /**
     * 新建VPC互通
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CreateVPCIntercomResult createVPCIntercom(CreateVPCIntercomParam param) throws Exception;

    /**
     * 新建VPC互通
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createVPCIntercom(CreateVPCIntercomParam param, UcloudHandler<CreateVPCIntercomResult> handler, Boolean... asyncFlag);


    /**
     * 获取VPC互通信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeVPCIntercomResult describeVPCIntercom(DescribeVPCIntercomParam param) throws Exception;

    /**
     * 获取VPC互通信息
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeVPCIntercom(DescribeVPCIntercomParam param, UcloudHandler<DescribeVPCIntercomResult> handler, Boolean... asyncFlag);


    /**
     * 删除VPC互通
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DeleteVPCIntercomResult deleteVPCIntercom(DeleteVPCIntercomParam param) throws Exception;

    /**
     * 删除VPC互通
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteVPCIntercom(DeleteVPCIntercomParam param, UcloudHandler<DeleteVPCIntercomResult> handler, Boolean... asyncFlag);


    /**
     * 创建路由表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CreateRouteTableResult createRouteTable(CreateRouteTableParam param) throws Exception;

    /**
     * 创建路由表
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createRouteTable(CreateRouteTableParam param, UcloudHandler<CreateRouteTableResult> handler, Boolean... asyncFlag);


    /**
     * 绑定子网的路由表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    AssociateRouteTableResult associateRouteTable(AssociateRouteTableParam param) throws Exception;

    /**
     * 绑定子网的路由表
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void associateRouteTable(AssociateRouteTableParam param, UcloudHandler<AssociateRouteTableResult> handler, Boolean... asyncFlag);


    /**
     * 克隆路由表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CloneRouteTableResult cloneRouteTable(CloneRouteTableParam param) throws Exception;

    /**
     * 克隆路由表
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void cloneRouteTable(CloneRouteTableParam param, UcloudHandler<CloneRouteTableResult> handler, Boolean... asyncFlag);


    /**
     * 删除自定义路由表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DeleteRouteTableResult deleteRouteTable(DeleteRouteTableParam param) throws Exception;

    /**
     * 删除自定义路由表
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteRouteTable(DeleteRouteTableParam param, UcloudHandler<DeleteRouteTableResult> handler, Boolean... asyncFlag);


    /**
     * 获取路由表详细信息(包括路由策略)
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeRouteTableResult describeRouteTable(DescribeRouteTableParam param) throws Exception;

    /**
     * 获取路由表详细信息(包括路由策略)
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeRouteTable(DescribeRouteTableParam param, UcloudHandler<DescribeRouteTableResult> handler, Boolean... asyncFlag);


    /**
     * 路由策略增、删、改
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    ModifyRouteRuleResult modifyRouteRule(ModifyRouteRuleParam param) throws Exception;

    /**
     * 路由策略增、删、改
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void modifyRouteRule(ModifyRouteRuleParam param, UcloudHandler<ModifyRouteRuleResult> handler, Boolean... asyncFlag);


    /**
     * 更新路由表基本信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    UpdateRouteTableAttributeResult updateRouteTableAttribute(UpdateRouteTableAttributeParam param) throws Exception;

    /**
     * 更新路由表基本信息
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateRouteTableAttribute(UpdateRouteTableAttributeParam param, UcloudHandler<UpdateRouteTableAttributeResult> handler, Boolean... asyncFlag);
}
