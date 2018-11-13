package cn.ucloud.ulb.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.ulb.model.*;

/**
 * @description: 负载均衡 客户端接口
 * @author: codezhang
 * @date: 2018-09-19 09:17
 **/

public interface ULBClient extends UcloudClient {

    /**
     * 创建ULB
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CreateULBResult createULB(CreateULBParam param) throws Exception;

    /**
     * 创建ULB
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，默认异步true
     */
    void createUlb(CreateULBParam param, UcloudHandler<CreateULBResult> handler, Boolean... asyncFlag);


    /**
     * 获取ULB信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeULBResult describeULB(DescribeULBParam param) throws Exception;

    /**
     * 获取ULB信息
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeUlb(DescribeULBParam param, UcloudHandler<DescribeULBResult> handler, Boolean... asyncFlag);


    /**
     * 删除ULB
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 异步标记，默认异步true
     */
    DeleteULBResult deleteULB(DeleteULBParam param) throws Exception;

    /**
     * 删除ULB
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteULB(DeleteULBParam param, UcloudHandler<DeleteULBResult> handler, Boolean... asyncFlag);

    /**
     * 更新ULB属性
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    UpdateULBAttributeResult updateULBAttribute(UpdateULBAttributeParam param) throws Exception;

    /**
     * 更新ULB属性
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateULBAttribute(UpdateULBAttributeParam param, UcloudHandler<UpdateULBAttributeResult> handler, Boolean... asyncFlag);

    /**
     * 创建VServer
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CreateVServerResult createVServer(CreateVServerParam param) throws Exception;

    /**
     * 创建VServer
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createVServer(CreateVServerParam param, UcloudHandler<CreateVServerResult> handler, Boolean... asyncFlag);

    /**
     * 获取VServer信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeVServerResult describeVServer(DescribeVServerParam param) throws Exception;

    /**
     * 获取VServer信息
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeVServer(DescribeVServerParam param, UcloudHandler<DescribeVServerResult> handler, Boolean... asyncFlag);

    /**
     * 删除VServer
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DeleteVServerResult deleteVServer(DeleteVServerParam param) throws Exception;

    /**
     * 删除VServer
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteVServer(DeleteVServerParam param, UcloudHandler<DeleteVServerResult> handler, Boolean... asyncFlag);

    /**
     * 更新VServer
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    UpdateVServerAttributeResult updateVServerAttribute(UpdateVServerAttributeParam param) throws Exception;

    /**
     * 更新VServer
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateVServerAttribute(UpdateVServerAttributeParam param, UcloudHandler<UpdateVServerAttributeResult> handler, Boolean... asyncFlag);

    /**
     * 增加后端实例
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    AllocateBackendResult allocateBackend(AllocateBackendParam param) throws Exception;

    /**
     * 增加后端实例
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void allocateBackend(AllocateBackendParam param, UcloudHandler<AllocateBackendResult> handler, Boolean... asyncFlag);


    /**
     * 移除后端实例
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    ReleaseBackendResult releaseBackend(ReleaseBackendParam param) throws Exception;

    /**
     * 移除后端实例
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void releaseBackend(ReleaseBackendParam param, UcloudHandler<ReleaseBackendResult> handler, Boolean... asyncFlag);


    /**
     * 批量增加后端实例
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    AllocateBackendBatchResult allocateBackendBatch(AllocateBackendBatchParam param) throws Exception;

    /**
     * 批量增加后端实例
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void allocateBackendBatch(AllocateBackendBatchParam param, UcloudHandler<AllocateBackendBatchResult> handler, Boolean... asyncFlag);


    /**
     * 更新后端实例属性
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    UpdateBackendAttributeResult updateBackendAttribute(UpdateBackendAttributeParam param) throws Exception;

    /**
     * 更新后端实例属性
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateBackendAttribute(UpdateBackendAttributeParam param, UcloudHandler<UpdateBackendAttributeResult> handler, Boolean... asyncFlag);


    /**
     * 创建转发策略
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CreatePolicyResult createPolicy(CreatePolicyParam param) throws Exception;

    /**
     * 创建转发策略
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createPolicy(CreatePolicyParam param, UcloudHandler<CreatePolicyResult> handler, Boolean... asyncFlag);


    /**
     * 更新转发策略
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    UpdatePolicyResult updatePolicy(UpdatePolicyParam param) throws Exception;

    /**
     * 更新转发策略
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updatePolicy(UpdatePolicyParam param, UcloudHandler<UpdatePolicyResult> handler, Boolean... asyncFlag);

    /**
     * 删除转发策略
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DeletePolicyResult deletePolicy(DeletePolicyParam param) throws Exception;

    /**
     * 删除转发策略
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deletePolicy(DeletePolicyParam param, UcloudHandler<DeletePolicyResult> handler, Boolean... asyncFlag);


    /**
     * 删除SSL
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DeleteSSLResult deleteSSL(DeleteSSLParam param) throws Exception;

    /**
     * 删除SSL
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void deleteSSL(DeleteSSLParam param, UcloudHandler<DeleteSSLResult> handler, Boolean... asyncFlag);


    /**
     * 绑定SSL到VServer
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BindSSLResult bindSSL(BindSSLParam param) throws Exception;

    /**
     * 绑定SSL到VServer
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void bindSSL(BindSSLParam param, UcloudHandler<BindSSLResult> handler, Boolean... asyncFlag);

    /**
     * 解绑SSL VServer
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    UnbindSSLResult unbindSSL(UnbindSSLParam param) throws Exception;

    /**
     * 解绑SSL VServer
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void unbindSSL(UnbindSSLParam param, UcloudHandler<UnbindSSLResult> handler, Boolean... asyncFlag);


    /**
     * 创建SSL
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    CreateSSLResult createSSL(CreateSSLParam param) throws Exception;

    /**
     * 创建SSL
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createSSL(CreateSSLParam param, UcloudHandler<CreateSSLResult> handler, Boolean... asyncFlag);

    /**
     * 获取SSL信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeSSLResult describeSSL(DescribeSSLParam param) throws Exception;

    /**
     * 获取SSL信息
     *
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeSSL(DescribeSSLParam param, UcloudHandler<DescribeSSLResult> handler, Boolean... asyncFlag);


}
