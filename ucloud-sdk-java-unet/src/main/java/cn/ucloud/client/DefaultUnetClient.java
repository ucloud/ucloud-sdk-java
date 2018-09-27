package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.http.UcloudHttp;
import cn.ucloud.http.UcloudHttpImpl;
import cn.ucloud.model.*;
import cn.ucloud.pojo.BaseRequestParam;
import cn.ucloud.pojo.UnetConfig;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-25 18:57
 **/

public class DefaultUnetClient implements UnetClient {

    private UnetConfig config;

    public DefaultUnetClient(UnetConfig config) {
        this.config = config;
    }


    @Override
    public AllocateEIPResult allocateEIP(AllocateEIPParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(AllocateEIPResult.class);
        AllocateEIPResult result = (AllocateEIPResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void allocateEIP(AllocateEIPParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(AllocateEIPResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public DescribeEIPResult describeEIP(DescribeEIPParam param) throws Exception {
        UcloudHttp http = new UcloudHttpImpl(DescribeEIPResult.class);
        DescribeEIPResult result = (DescribeEIPResult) http.doGet(param, config, null);
        return result;
    }

    @Override
    public void describeEIP(DescribeEIPParam param, UcloudHandler handler, Boolean... asyncFlag) {
        UcloudHttp http = new UcloudHttpImpl(DescribeEIPResult.class);
        try {
            http.doGet(param, config, handler,asyncFlag);
        } catch (Exception e) {
        }
    }

    @Override
    public BaseRequestParam updateEIPAttribute(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateEIPAttribute(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam releaseEIP(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void releaseEIP(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam bindEIP(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void bindEIP(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam unBindEIP(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void unBindEIP(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam modifyEIPBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void modifyEIPBandwidth(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam modifyEIPWeight(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void modifyEIPWeight(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam getEIPPrice(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void getEIPPrice(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam getEIPUpgradePrice(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void getEIPUpgradePrice(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam getEIPPayMode(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void getEIPPayMode(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam setEIPPayMode(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void setEIPPayMode(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam allocateVIP(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void allocateVIP(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeVIP(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeVIP(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam releaseVIP(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void releaseVIP(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam createBandwidthPackage(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createBandwidthPackage(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeBandwidthPackage(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeBandwidthPackage(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam deleteBandwidthPackage(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deleteBandwidthPackage(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam allocateShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void allocateShareBandwidth(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeShareBandwidth(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam resizeShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void resizeShareBandwidth(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam releaseShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void releaseShareBandwidth(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam associateEIPWithShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void associateEIPWithShareBandwidth(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam disassociateEIPWithShareBandwidth(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void disassociateEIPWithShareBandwidth(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeBandwidthUsage(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeBandwidthUsage(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam deleteFirewall(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void deleteFirewall(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam updateFirewallAttribute(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateFirewallAttribute(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam updateFirewall(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void updateFirewall(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeFirewallResource(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeFirewallResource(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam describeFirewall(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void describeFirewall(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam grantFirewall(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void grantFirewall(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }

    @Override
    public BaseRequestParam createFirewall(BaseRequestParam param) throws Exception {
        return null;
    }

    @Override
    public void createFirewall(BaseRequestParam param, UcloudHandler handler, Boolean... asyncFlag) {

    }
}
