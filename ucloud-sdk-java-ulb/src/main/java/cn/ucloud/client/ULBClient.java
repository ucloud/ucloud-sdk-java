package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.*;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description: 负载均衡 客户端接口
 * @author: codezhang
 * @date: 2018-09-19 09:17
 **/

public interface ULBClient {

    CreateULBResult createULB(CreateULBParam param) throws Exception;

    void createUlb(CreateULBParam param, UcloudHandler handler, Boolean... asyncFlag);



    DescribeULBResult describeULB(DescribeULBParam param) throws Exception;

    void describeUlb(DescribeULBParam param, UcloudHandler handler, Boolean... asyncFlag);



    DeleteULBResult deleteULB(DeleteULBParam param) throws Exception;

    void deleteULB(DeleteULBParam param, UcloudHandler handler, Boolean... asyncFlag);



    UpdateULBAttributeResult updateULBAttribute (UpdateULBAttributeParam param) throws  Exception;

    void updateULBAttribute(UpdateULBAttributeParam param,UcloudHandler handler,Boolean... asyncFlag);


    CreateVServerResult createVServer(CreateVServerParam param) throws  Exception;

    void createVServer(CreateVServerParam param,UcloudHandler handler,Boolean... asyncFlag);


    DescribeVServerResult describeVServer(DescribeVServerParam param) throws Exception;

    void describeVServer(DescribeVServerParam param,UcloudHandler handler,Boolean... asyncFlag);


    DeleteVServerResult deleteVServer(DeleteVServerParam param) throws Exception;

    void deleteVServer(DeleteVServerParam param,UcloudHandler handler,Boolean... asyncFlag);


    UpdateVServerAttributeResult updateVServerAttribute(UpdateVServerAttributeParam param) throws Exception;

    void updateVServerAttribute(UpdateVServerAttributeParam param,UcloudHandler handler,Boolean... asyncFlag);


    AllocateBackendResult allocateBackend(AllocateBackendParam param) throws Exception;

    void allocateBackend(AllocateBackendParam param,UcloudHandler handler,Boolean... asyncFlag);


    ReleaseBackendResult releaseBackend(ReleaseBackendParam param) throws Exception;

    void releaseBackend(ReleaseBackendParam param,UcloudHandler handler,Boolean... asyncFlag);



    // todo  测试
    AllocateBackendBatchResult allocateBackendBatch(AllocateBackendBatchParam param) throws Exception;

    void allocateBackendBatch(AllocateBackendBatchParam param,UcloudHandler handler,Boolean... asyncFlag);



    UpdateBackendAttributeResult updateBackendAttribute(UpdateBackendAttributeParam param) throws Exception;

    void updateBackendAttribute(UpdateBackendAttributeParam param,UcloudHandler handler,Boolean... asyncFlag);


    CreatePolicyResult createPolicy(CreatePolicyParam param) throws Exception;

    void createPolicy(CreatePolicyParam param,UcloudHandler handler,Boolean... asyncFlag);


    UpdatePolicyResult updatePolicy(UpdatePolicyParam param) throws Exception;

    void updatePolicy(UpdatePolicyParam param,UcloudHandler handler,Boolean... asyncFlag);


    DeletePolicyResult deletePolicy(DeletePolicyParam param) throws Exception;

    void deletePolicy(DeletePolicyParam param,UcloudHandler handler,Boolean... asyncFlag);


    // todo  测试
    DeleteSSLResult deleteSSL(DeleteSSLParam param) throws Exception;

    void deleteSSL(DeleteSSLParam param,UcloudHandler handler,Boolean... asyncFlag);


    // todo  测试
    BindSSLResult bindSSL(BindSSLParam param) throws Exception;

    void bindSSL(BindSSLParam param,UcloudHandler handler,Boolean... asyncFlag);

    // todo  测试
    UnbindSSLResult unbindSSL(UnbindSSLParam param) throws Exception;

    void unbindSSL(UnbindSSLParam param,UcloudHandler handler,Boolean... asyncFlag);


    // todo  测试
    CreateSSLResult createSSL(CreateSSLParam param) throws Exception;

    void createSSL(CreateSSLParam param,UcloudHandler handler,Boolean... asyncFlag);

    // todo  测试
    DescribeSSLResult describeSSL(DescribeSSLParam param) throws Exception;

    void describeSSL(DescribeSSLParam param,UcloudHandler handler,Boolean... asyncFlag);


    DeletePolicyGroupResult deletePolicyGroup(DeletePolicyGroupParam param) throws Exception;

    void deletePolicyGroup(DeletePolicyGroupParam param,UcloudHandler handler,Boolean... asyncFlag);


    DescribePolicyGroupResult describePolicyGroup(DescribePolicyGroupParam param) throws Exception;

    void describePolicyGroup(DescribePolicyGroupParam param,UcloudHandler handler,Boolean... asyncFlag);


    CreatePolicyGroupResult createPolicyGroup(CreatePolicyGroupParam param) throws Exception;

    void createPolicyGroup(CreatePolicyGroupParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult updatePolicyGroupAttribute(BaseRequestParam param) throws Exception;

    void updatePolicyGroupAttribute(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);



}
