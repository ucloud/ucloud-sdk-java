package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.CreateULBParam;
import cn.ucloud.model.CreateULBResult;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.ULBConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-19 09:35
 **/

public class DefaultULBClient implements ULBClient {

    /**
     * ULB 配置
     */
    private ULBConfig config;

    public DefaultULBClient(ULBConfig config) {
        this.config = config;
    }


    @Override
    public CreateULBResult createULB(CreateULBParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateULBResult.class);
        CreateULBResult result = (CreateULBResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createUlb(CreateULBParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateULBResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public BaseResponseResult describeULB(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeUlb(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult deleteULB(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deleteULB(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult updateULBAttribute(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateULBAttribute(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult createVServer(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createVServer(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describeVServer(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeVServer(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult deleteVServer(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deleteVServer(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult updateVServerAttribute(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateVServerAttribute(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult allocateBackend(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void allocateBackend(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult releaseBackend(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void releaseBackend(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult allocateBackendBatch(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void allocateBackendBatch(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult updateBackendAttribute(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateBackendAttribute(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult createPolicy(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createPolicy(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult updatePolicy(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updatePolicy(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult deletePolicy(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deletePolicy(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult deleteSSL(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deleteSSL(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult bindSSL(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void bindSSL(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult unbindSSL(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void unbindSSL(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult createSSL(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createSSL(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describeSSL(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeSSL(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult deletePolicyGroup(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deletePolicyGroup(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describePolicyGroup(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describePolicyGroup(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult createPolicyGroup(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createPolicyGroup(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult updatePolicyGroupAttribute(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updatePolicyGroupAttribute(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }
}
