package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.CreateVPCParam;
import cn.ucloud.model.CreateVPCResult;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.BaseResponseResult;
import cn.ucloud.pojo.VPCConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-21 11:22
 **/

public class DefaultVPCClient implements VPCClient {

    /**
     * VPC环境配置
     */
    private VPCConfig config;

    public DefaultVPCClient(VPCConfig config) {
        this.config = config;
    }

    @Override
    public CreateVPCResult createVPC(CreateVPCParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateVPCResult.class);
        CreateVPCResult result = (CreateVPCResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createVPC(CreateVPCParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateVPCResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public BaseResponseResult deleteVPC(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deleteVPC(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describeVPC(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeVPC(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult addVPCNetwork(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void addVPCNetwork(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult createSubnet(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createSubnet(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult deleteSubnet(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deleteSubnet(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describeSubnet(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeSubnet(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describeSubnetResource(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeSubnetResource(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult updateSubnetAttribute(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateSubnetAttribute(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult createVPCIntercom(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createVPCIntercom(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describeVPCIntercom(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeVPCIntercom(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult deleteVPCIntercom(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deleteVPCIntercom(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult createRouteTable(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createRouteTable(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult associateRouteTable(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void associateRouteTable(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult cloneRouteTable(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void cloneRouteTable(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult deleteRouteTable(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deleteRouteTable(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult describeRouteTable(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeRouteTable(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult modifyRouteRule(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void modifyRouteRule(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseResponseResult updateRouteTableAttribute(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateRouteTableAttribute(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }
}
