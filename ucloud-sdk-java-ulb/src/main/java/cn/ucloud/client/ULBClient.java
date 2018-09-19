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


    BaseResponseResult createVServer(BaseRequestParam param) throws  Exception;

    void createVServer(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult describeVServer(BaseRequestParam param) throws Exception;

    void describeVServer(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult deleteVServer(BaseRequestParam param) throws Exception;

    void deleteVServer(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult updateVServerAttribute(BaseRequestParam param) throws Exception;

    void updateVServerAttribute(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult allocateBackend(BaseRequestParam param) throws Exception;

    void allocateBackend(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult releaseBackend(BaseRequestParam param) throws Exception;

    void releaseBackend(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);



    BaseResponseResult allocateBackendBatch(BaseRequestParam param) throws Exception;

    void allocateBackendBatch(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult updateBackendAttribute(BaseRequestParam param) throws Exception;

    void updateBackendAttribute(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult createPolicy(BaseRequestParam param) throws Exception;

    void createPolicy(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult updatePolicy(BaseRequestParam param) throws Exception;

    void updatePolicy(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


    BaseResponseResult deletePolicy(BaseRequestParam param) throws Exception;

    void deletePolicy(BaseRequestParam param,UcloudHandler handler,Boolean... asyncFlag);


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
