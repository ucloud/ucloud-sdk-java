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


    BaseResponseResult deleteSSL(BaseRequestParam param) throws Exception;

    void deleteSSL(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult bindSSL(BaseRequestParam param) throws Exception;

    void bindSSL(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult unbindSSL(BaseRequestParam param) throws Exception;

    void unbindSSL(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult createSSL(BaseRequestParam param) throws Exception;

    void createSSL(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult describeSSL(BaseRequestParam param) throws Exception;

    void describeSSL(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult deletePolicyGroup(BaseRequestParam param) throws Exception;

    void deletePolicyGroup(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult describePolicyGroup(BaseRequestParam param) throws Exception;

    void describePolicyGroup(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult createPolicyGroup(BaseRequestParam param) throws Exception;

    void createPolicyGroup(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult updatePolicyGroupAttribute(BaseRequestParam param) throws Exception;

    void updatePolicyGroupAttribute(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);



}
