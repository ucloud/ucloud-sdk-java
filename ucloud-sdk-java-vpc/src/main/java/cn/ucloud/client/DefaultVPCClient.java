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
    public CreateSubnetResult createSubnet(CreateSubnetParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateSubnetResult.class);
        CreateSubnetResult result = (CreateSubnetResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createSubnet(CreateSubnetParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateSubnetResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DeleteSubnetResult deleteSubnet(DeleteSubnetParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteSubnetResult.class);
        DeleteSubnetResult result = (DeleteSubnetResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteSubnet(DeleteSubnetParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteSubnetResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DescribeSubnetResult describeSubnet(DescribeSubnetParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResult.class);
        DescribeSubnetResult result = (DescribeSubnetResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeSubnet(DescribeSubnetParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DescribeSubnetResourceResult describeSubnetResource(DescribeSubnetResourceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResourceResult.class);
        DescribeSubnetResourceResult result = (DescribeSubnetResourceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeSubnetResource(DescribeSubnetResourceParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResourceResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public UpdateSubnetAttributeResult updateSubnetAttribute(UpdateSubnetAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateSubnetAttributeResult.class);
        UpdateSubnetAttributeResult result = (UpdateSubnetAttributeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updateSubnetAttribute(UpdateSubnetAttributeParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateSubnetAttributeResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public CreateVPCIntercomResult createVPCIntercom(CreateVPCIntercomParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateVPCIntercomResult.class);
        CreateVPCIntercomResult result = (CreateVPCIntercomResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createVPCIntercom(CreateVPCIntercomParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateVPCIntercomResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DescribeVPCIntercomResult describeVPCIntercom(DescribeVPCIntercomParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCIntercomResult.class);
        DescribeVPCIntercomResult result = (DescribeVPCIntercomResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeVPCIntercom(DescribeVPCIntercomParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCIntercomResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public DeleteVPCIntercomResult deleteVPCIntercom(DeleteVPCIntercomParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteVPCIntercomResult.class);
        DeleteVPCIntercomResult result = (DeleteVPCIntercomResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteVPCIntercom(DeleteVPCIntercomParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteVPCIntercomResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
    }

    @Override
    public CreateRouteTableResult createRouteTable(CreateRouteTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateRouteTableResult.class);
        CreateRouteTableResult result = (CreateRouteTableResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createRouteTable(CreateRouteTableParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateRouteTableResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) { }
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
