package cn.ucloud.ulb.client;

import cn.ucloud.common.client.DefaultUcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.http.UcloudHttp;
import cn.ucloud.common.http.UcloudHttpImpl;
import cn.ucloud.ulb.model.*;
import cn.ucloud.ulb.pojo.ULBConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 09:35
 **/

public class DefaultULBClient extends DefaultUcloudClient implements ULBClient {

    public DefaultULBClient(ULBConfig config) {
        super(config);
    }


    @Override
    public CreateULBResult createULB(CreateULBParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateULBResult.class);
        return (CreateULBResult) http.doPost(param, config, null);
    }

    @Override
    public void createULB(CreateULBParam param, UcloudHandler<CreateULBResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateULBResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeULBResult describeULB(DescribeULBParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeULBResult.class);
        return (DescribeULBResult) http.doPost(param, config, null);
    }

    @Override
    public void describeULB(DescribeULBParam param, UcloudHandler<DescribeULBResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeULBResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteULBResult deleteULB(DeleteULBParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteULBResult.class);
        return (DeleteULBResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteULB(DeleteULBParam param, UcloudHandler<DeleteULBResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteULBResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateULBAttributeResult updateULBAttribute(UpdateULBAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateULBAttributeResult.class);
        return (UpdateULBAttributeResult) http.doPost(param, config, null);
    }

    @Override
    public void updateULBAttribute(UpdateULBAttributeParam param, UcloudHandler<UpdateULBAttributeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateULBAttributeResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateVServerResult createVServer(CreateVServerParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateVServerResult.class);
        return (CreateVServerResult) http.doPost(param, config, null);
    }

    @Override
    public void createVServer(CreateVServerParam param, UcloudHandler<CreateVServerResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateVServerResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeVServerResult describeVServer(DescribeVServerParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeVServerResult.class);
        return (DescribeVServerResult) http.doPost(param, config, null);
    }

    @Override
    public void describeVServer(DescribeVServerParam param, UcloudHandler<DescribeVServerResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeVServerResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteVServerResult deleteVServer(DeleteVServerParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteVServerResult.class);
        return (DeleteVServerResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteVServer(DeleteVServerParam param, UcloudHandler<DeleteVServerResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteVServerResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateVServerAttributeResult updateVServerAttribute(UpdateVServerAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateVServerAttributeResult.class);
        return (UpdateVServerAttributeResult) http.doPost(param, config, null);
    }

    @Override
    public void updateVServerAttribute(UpdateVServerAttributeParam param, UcloudHandler<UpdateVServerAttributeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateVServerAttributeResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AllocateBackendResult allocateBackend(AllocateBackendParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AllocateBackendResult.class);
        return (AllocateBackendResult) http.doPost(param, config, null);
    }

    @Override
    public void allocateBackend(AllocateBackendParam param, UcloudHandler<AllocateBackendResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AllocateBackendResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public ReleaseBackendResult releaseBackend(ReleaseBackendParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ReleaseBackendResult.class);
        return (ReleaseBackendResult) http.doPost(param, config, null);
    }

    @Override
    public void releaseBackend(ReleaseBackendParam param, UcloudHandler<ReleaseBackendResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ReleaseBackendResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AllocateBackendBatchResult allocateBackendBatch(AllocateBackendBatchParam param) throws Exception {
        // 测试未通过
        UcloudHttp http = new UcloudHttpImpl(AllocateBackendBatchResult.class);
        return (AllocateBackendBatchResult) http.doPost(param, config, null);
    }

    @Override
    public void allocateBackendBatch(AllocateBackendBatchParam param, UcloudHandler<AllocateBackendBatchResult> handler, Boolean... asyncFlag) {
        // 测试未通过
        UcloudHttp http = new UcloudHttpImpl(AllocateBackendBatchResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateBackendAttributeResult updateBackendAttribute(UpdateBackendAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateBackendAttributeResult.class);
        return (UpdateBackendAttributeResult) http.doPost(param, config, null);
    }

    @Override
    public void updateBackendAttribute(UpdateBackendAttributeParam param, UcloudHandler<UpdateBackendAttributeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateBackendAttributeResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreatePolicyResult createPolicy(CreatePolicyParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreatePolicyResult.class);
        return (CreatePolicyResult) http.doPost(param, config, null);
    }

    @Override
    public void createPolicy(CreatePolicyParam param, UcloudHandler<CreatePolicyResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreatePolicyResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdatePolicyResult updatePolicy(UpdatePolicyParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdatePolicyResult.class);
        return (UpdatePolicyResult) http.doPost(param, config, null);
    }

    @Override
    public void updatePolicy(UpdatePolicyParam param, UcloudHandler<UpdatePolicyResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdatePolicyResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeletePolicyResult deletePolicy(DeletePolicyParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeletePolicyResult.class);
        return (DeletePolicyResult) http.doPost(param, config, null);
    }

    @Override
    public void deletePolicy(DeletePolicyParam param, UcloudHandler<DeletePolicyResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeletePolicyResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteSSLResult deleteSSL(DeleteSSLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteSSLResult.class);
        return (DeleteSSLResult) http.doPost(param, config, null);
    }

    @Override
    public void deleteSSL(DeleteSSLParam param, UcloudHandler<DeleteSSLResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteSSLResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public BindSSLResult bindSSL(BindSSLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(BindSSLResult.class);
        return (BindSSLResult) http.doPost(param, config, null);
    }

    @Override
    public void bindSSL(BindSSLParam param, UcloudHandler<BindSSLResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(BindSSLResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UnbindSSLResult unbindSSL(UnbindSSLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UnbindSSLResult.class);
        return (UnbindSSLResult) http.doPost(param, config, null);
    }

    @Override
    public void unbindSSL(UnbindSSLParam param, UcloudHandler<UnbindSSLResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UnbindSSLResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateSSLResult createSSL(CreateSSLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateSSLResult.class);
        return (CreateSSLResult) http.doPost(param, config, null);
    }

    @Override
    public void createSSL(CreateSSLParam param, UcloudHandler<CreateSSLResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateSSLResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeSSLResult describeSSL(DescribeSSLParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeSSLResult.class);
        return (DescribeSSLResult) http.doPost(param, config, null);
    }

    @Override
    public void describeSSL(DescribeSSLParam param, UcloudHandler<DescribeSSLResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeSSLResult.class);
        try {
            http.doPost(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
