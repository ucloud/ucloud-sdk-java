package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.*;
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
    public DeleteVPCResult deleteVPC(DeleteVPCParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteVPCResult.class);
        DeleteVPCResult result = (DeleteVPCResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteVPC(DeleteVPCParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteVPCResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DescribeVPCResult describeVPC(DescribeVPCParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCResult.class);
        DescribeVPCResult result = (DescribeVPCResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeVPC(DescribeVPCParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public AddVPCNetworkResult addVPCNetwork(AddVPCNetworkParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AddVPCNetworkResult.class);
        AddVPCNetworkResult result = (AddVPCNetworkResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void addVPCNetwork(AddVPCNetworkParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AddVPCNetworkResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
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
