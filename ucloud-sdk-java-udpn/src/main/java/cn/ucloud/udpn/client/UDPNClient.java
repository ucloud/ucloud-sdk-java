package cn.ucloud.udpn.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.udpn.model.*;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2019-03-01 15:40
 */
public interface UDPNClient extends UcloudClient {

    /**
     * 分配 UDPN 专线
     *
     * @param param AllocateUDPNParam 参数对象
     * @return AllocateUDPNResult 结果对象
     * @throws Exception 出错则抛出异常
     */
    AllocateUDPNResult allocateUDPN(AllocateUDPNParam param) throws Exception;

    /**
     * 分配 UDPN 专线
     *
     * @param param     AllocateUDPNParam 参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void allocateUDPN(AllocateUDPNParam param, UcloudHandler<AllocateUDPNResult> handler, Boolean... asyncFlag);

    /**
     * 描述 UDPN
     *
     * @param param DescribeUDPNParam 参数对象
     * @return DescribeUDPNResult 结果对象
     * @throws Exception 出错则抛出异常
     */
    DescribeUDPNResult describeUDPN(DescribeUDPNParam param) throws Exception;

    /**
     * 描述 UDPN
     *
     * @param param     DescribeUDPNParam 参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void describeUDPN(DescribeUDPNParam param, UcloudHandler<DescribeUDPNResult> handler, Boolean... asyncFlag);

    /**
     * 获取当前支持的专线线路列表
     * 提示信息: 两个端点peer1和peer2之间的线路不一定支持，调用GetUDPNLineList查询支持线路
     *
     * @param param GetUDPNLineListParam 参数对象
     * @return GetUDPNLineListResult 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetUDPNLineListResult getUDPNLineList(GetUDPNLineListParam param) throws Exception;

    /**
     * 获取当前支持的专线线路列表
     * 提示信息: 两个端点peer1和peer2之间的线路不一定支持，调用GetUDPNLineList查询支持线路
     *
     * @param param     GetUDPNLineListParam 参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void getUDPNLineList(GetUDPNLineListParam param, UcloudHandler<GetUDPNLineListResult> handler, Boolean... asyncFlag);

    /**
     * 获取 UDPN 价格
     * 提示信息: 两个端点peer1和peer2之间的线路不一定支持，调用GetUDPNLineList查询支持线路
     *
     * @param param GetUDPNPriceParam 参数对象
     * @return GetUDPNPriceResult 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetUDPNPriceResult getUDPNPrice(GetUDPNPriceParam param) throws Exception;

    /**
     * 获取 UDPN 价格
     * 提示信息: 两个端点peer1和peer2之间的线路不一定支持，调用GetUDPNLineList查询支持线路
     *
     * @param param     GetUDPNPriceParam 参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void getUDPNPrice(GetUDPNPriceParam param, UcloudHandler<GetUDPNPriceResult> handler, Boolean... asyncFlag);

    /**
     * 获取专线升级价格
     *
     * @param param GetUDPNUpgradePriceParam 参数对象
     * @return GetUDPNUpgradePriceResult 结果对象
     * @throws Exception 出错则抛出异常
     */
    GetUDPNUpgradePriceResult getUDPNUpgradePrice(GetUDPNUpgradePriceParam param) throws Exception;

    /**
     * 获取专线升级价格
     *
     * @param param     GetUDPNUpgradePriceParam 参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void getUDPNUpgradePrice(GetUDPNUpgradePriceParam param, UcloudHandler<GetUDPNUpgradePriceResult> handler, Boolean... asyncFlag);

    /**
     * 修改带宽值
     *
     * @param param ModifyUDPNBandwidthParam 参数对象
     * @return ModifyUDPNBandwidthResult 结果对象
     * @throws Exception 出错则抛出异常
     */
    ModifyUDPNBandwidthResult modifyUDPNBandwidth(ModifyUDPNBandwidthParam param) throws Exception;

    /**
     * 修改带宽值
     *
     * @param param     ModifyUDPNBandwidthParam 参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void modifyUDPNBandwidth(ModifyUDPNBandwidthParam param, UcloudHandler<ModifyUDPNBandwidthResult> handler, Boolean... asyncFlag);

    /**
     * 释放 UDPN
     *
     * @param param ReleaseUDPNParam 参数对象
     * @return ReleaseUDPNResult 结果对象
     * @throws Exception 出错则抛出异常
     */
    ReleaseUDPNResult releaseUDPN(ReleaseUDPNParam param) throws Exception;

    /**
     * 释放 UDPN
     *
     * @param param     ReleaseUDPNParam 参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记位，仅在handler不为NULL的情况下生效，默认为true，异步的
     */
    void releaseUDPN(ReleaseUDPNParam param, UcloudHandler<ReleaseUDPNResult> handler, Boolean... asyncFlag);
}
