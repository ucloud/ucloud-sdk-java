package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.*;
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
    public void createVPC(CreateVPCParam param, UcloudHandler<CreateVPCResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateVPCResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
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
    public void deleteVPC(DeleteVPCParam param, UcloudHandler<DeleteVPCResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteVPCResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeVPCResult describeVPC(DescribeVPCParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCResult.class);
        DescribeVPCResult result = (DescribeVPCResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeVPC(DescribeVPCParam param, UcloudHandler<DescribeVPCResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AddVPCNetworkResult addVPCNetwork(AddVPCNetworkParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AddVPCNetworkResult.class);
        AddVPCNetworkResult result = (AddVPCNetworkResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void addVPCNetwork(AddVPCNetworkParam param, UcloudHandler<AddVPCNetworkResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AddVPCNetworkResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateSubnetResult createSubnet(CreateSubnetParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateSubnetResult.class);
        CreateSubnetResult result = (CreateSubnetResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createSubnet(CreateSubnetParam param, UcloudHandler<CreateSubnetResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateSubnetResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteSubnetResult deleteSubnet(DeleteSubnetParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteSubnetResult.class);
        DeleteSubnetResult result = (DeleteSubnetResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteSubnet(DeleteSubnetParam param, UcloudHandler<DeleteSubnetResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteSubnetResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeSubnetResult describeSubnet(DescribeSubnetParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResult.class);
        DescribeSubnetResult result = (DescribeSubnetResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeSubnet(DescribeSubnetParam param, UcloudHandler<DescribeSubnetResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeSubnetResourceResult describeSubnetResource(DescribeSubnetResourceParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResourceResult.class);
        DescribeSubnetResourceResult result = (DescribeSubnetResourceResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeSubnetResource(DescribeSubnetResourceParam param, UcloudHandler<DescribeSubnetResourceResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeSubnetResourceResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateSubnetAttributeResult updateSubnetAttribute(UpdateSubnetAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateSubnetAttributeResult.class);
        UpdateSubnetAttributeResult result = (UpdateSubnetAttributeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updateSubnetAttribute(UpdateSubnetAttributeParam param, UcloudHandler<UpdateSubnetAttributeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateSubnetAttributeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateVPCIntercomResult createVPCIntercom(CreateVPCIntercomParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateVPCIntercomResult.class);
        CreateVPCIntercomResult result = (CreateVPCIntercomResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createVPCIntercom(CreateVPCIntercomParam param, UcloudHandler<CreateVPCIntercomResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateVPCIntercomResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeVPCIntercomResult describeVPCIntercom(DescribeVPCIntercomParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCIntercomResult.class);
        DescribeVPCIntercomResult result = (DescribeVPCIntercomResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeVPCIntercom(DescribeVPCIntercomParam param, UcloudHandler<DescribeVPCIntercomResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeVPCIntercomResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteVPCIntercomResult deleteVPCIntercom(DeleteVPCIntercomParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteVPCIntercomResult.class);
        DeleteVPCIntercomResult result = (DeleteVPCIntercomResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteVPCIntercom(DeleteVPCIntercomParam param, UcloudHandler<DeleteVPCIntercomResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteVPCIntercomResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CreateRouteTableResult createRouteTable(CreateRouteTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CreateRouteTableResult.class);
        CreateRouteTableResult result = (CreateRouteTableResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void createRouteTable(CreateRouteTableParam param, UcloudHandler<CreateRouteTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CreateRouteTableResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public AssociateRouteTableResult associateRouteTable(AssociateRouteTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AssociateRouteTableResult.class);
        AssociateRouteTableResult result = (AssociateRouteTableResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void associateRouteTable(AssociateRouteTableParam param, UcloudHandler<AssociateRouteTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AssociateRouteTableResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public CloneRouteTableResult cloneRouteTable(CloneRouteTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(CloneRouteTableResult.class);
        CloneRouteTableResult result = (CloneRouteTableResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void cloneRouteTable(CloneRouteTableParam param, UcloudHandler<CloneRouteTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(CloneRouteTableResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DeleteRouteTableResult deleteRouteTable(DeleteRouteTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DeleteRouteTableResult.class);
        DeleteRouteTableResult result = (DeleteRouteTableResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void deleteRouteTable(DeleteRouteTableParam param, UcloudHandler<DeleteRouteTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DeleteRouteTableResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeRouteTableResult describeRouteTable(DescribeRouteTableParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeRouteTableResult.class);
        DescribeRouteTableResult result = (DescribeRouteTableResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeRouteTable(DescribeRouteTableParam param, UcloudHandler<DescribeRouteTableResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeRouteTableResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }


    @Override
    public ModifyRouteRuleResult modifyRouteRule(ModifyRouteRuleParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(ModifyRouteRuleResult.class);
        ModifyRouteRuleResult result = (ModifyRouteRuleResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void modifyRouteRule(ModifyRouteRuleParam param, UcloudHandler<ModifyRouteRuleResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(ModifyRouteRuleResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public UpdateRouteTableAttributeResult updateRouteTableAttribute(UpdateRouteTableAttributeParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(UpdateRouteTableAttributeResult.class);
        UpdateRouteTableAttributeResult result = (UpdateRouteTableAttributeResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void updateRouteTableAttribute(UpdateRouteTableAttributeParam param, UcloudHandler<UpdateRouteTableAttributeResult> handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(UpdateRouteTableAttributeResult.class);
        try {
            http.doGet(param, config, handler, asyncFlag);
        } catch (Exception e) {
        }
    }
}
