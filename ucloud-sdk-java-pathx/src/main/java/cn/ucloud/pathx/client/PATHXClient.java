package cn.ucloud.pathx.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.pathx.model.*;

/**
 * @Description : PATHX 客户端接口
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-12 04:27
 **/
public interface PATHXClient extends UcloudClient {

    /**
     * 删除UPath
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUPathResult deleteUPath(
            DeleteUPathParam param) throws Exception;

    /**
     * 删除UPath (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUPath(DeleteUPathParam param,
                     UcloudHandler<DeleteUPathResult> handler,
                     Boolean... asyncFlag);

    /**
     * 创建GlobalSSH实例
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateGlobalSSHInstanceResult createGlobalSSHInstance(
            CreateGlobalSSHInstanceParam param) throws Exception;

    /**
     * 创建GlobalSSH实例 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createGlobalSSHInstance(CreateGlobalSSHInstanceParam param,
                                 UcloudHandler<CreateGlobalSSHInstanceResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 获取UGA更新价格
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUGAUpdatePriceResult getUGAUpdatePrice(
            GetUGAUpdatePriceParam param) throws Exception;

    /**
     * 获取UGA更新价格 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUGAUpdatePrice(GetUGAUpdatePriceParam param,
                           UcloudHandler<GetUGAUpdatePriceResult> handler,
                           Boolean... asyncFlag);

    /**
     * 更改加速线路名字
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyUPathNameResult modifyUPathName(
            ModifyUPathNameParam param) throws Exception;

    /**
     * 更改加速线路名字 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyUPathName(ModifyUPathNameParam param,
                         UcloudHandler<ModifyUPathNameResult> handler,
                         Boolean... asyncFlag);

    /**
     * 修改加速线路带宽
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyUPathBandwidthResult modifyUPathBandwidth(
            ModifyUPathBandwidthParam param) throws Exception;

    /**
     * 修改加速线路带宽 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyUPathBandwidth(ModifyUPathBandwidthParam param,
                              UcloudHandler<ModifyUPathBandwidthResult> handler,
                              Boolean... asyncFlag);

    /**
     * 获取加速线路信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUPathResult describeUPath(
            DescribeUPathParam param) throws Exception;

    /**
     * 获取加速线路信息 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUPath(DescribeUPathParam param,
                       UcloudHandler<DescribeUPathResult> handler,
                       Boolean... asyncFlag);

    /**
     * UGA与UPath解绑
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    UGAUnBindUPathResult uGAUnBindUPath(
            UGAUnBindUPathParam param) throws Exception;

    /**
     * UGA与UPath解绑 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void uGAUnBindUPath(UGAUnBindUPathParam param,
                        UcloudHandler<UGAUnBindUPathResult> handler,
                        Boolean... asyncFlag);

    /**
     * UGA绑定UPath
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    UGABindUPathResult uGABindUPath(
            UGABindUPathParam param) throws Exception;

    /**
     * UGA绑定UPath (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void uGABindUPath(UGABindUPathParam param,
                      UcloudHandler<UGABindUPathResult> handler,
                      Boolean... asyncFlag);

    /**
     * 查询UPath的监控模板
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUPathTemplateResult describeUPathTemplate(
            DescribeUPathTemplateParam param) throws Exception;

    /**
     * 查询UPath的监控模板 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUPathTemplate(DescribeUPathTemplateParam param,
                               UcloudHandler<DescribeUPathTemplateResult> handler,
                               Boolean... asyncFlag);

    /**
     * 修改UPath监控告警项
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyUPathTemplateResult modifyUPathTemplate(
            ModifyUPathTemplateParam param) throws Exception;

    /**
     * 修改UPath监控告警项 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyUPathTemplate(ModifyUPathTemplateParam param,
                             UcloudHandler<ModifyUPathTemplateResult> handler,
                             Boolean... asyncFlag);

    /**
     * 获取UPath升级价格
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUPathUpdatePriceResult getUPathUpdatePrice(
            GetUPathUpdatePriceParam param) throws Exception;

    /**
     * 获取UPath升级价格 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUPathUpdatePrice(GetUPathUpdatePriceParam param,
                             UcloudHandler<GetUPathUpdatePriceResult> handler,
                             Boolean... asyncFlag);

    /**
     * 获取苹果加速通道价格
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetCommonUGAPriceResult getCommonUGAPrice(
            GetCommonUGAPriceParam param) throws Exception;

    /**
     * 获取苹果加速通道价格 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getCommonUGAPrice(GetCommonUGAPriceParam param,
                           UcloudHandler<GetCommonUGAPriceResult> handler,
                           Boolean... asyncFlag);

    /**
     * 删除苹果加速通道
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteCommonUGAInstanceResult deleteCommonUGAInstance(
            DeleteCommonUGAInstanceParam param) throws Exception;

    /**
     * 删除苹果加速通道 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteCommonUGAInstance(DeleteCommonUGAInstanceParam param,
                                 UcloudHandler<DeleteCommonUGAInstanceResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 删除加速配置端口
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUGATaskResult deleteUGATask(
            DeleteUGATaskParam param) throws Exception;

    /**
     * 删除加速配置端口 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUGATask(DeleteUGATaskParam param,
                       UcloudHandler<DeleteUGATaskResult> handler,
                       Boolean... asyncFlag);

    /**
     * 添加加速配置端口
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    AddUGATaskResult addUGATask(
            AddUGATaskParam param) throws Exception;

    /**
     * 添加加速配置端口 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void addUGATask(AddUGATaskParam param,
                    UcloudHandler<AddUGATaskResult> handler,
                    Boolean... asyncFlag);

    /**
     * 创建全球加速配置项
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUGAInstanceResult createUGAInstance(
            CreateUGAInstanceParam param) throws Exception;

    /**
     * 创建全球加速配置项 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUGAInstance(CreateUGAInstanceParam param,
                           UcloudHandler<CreateUGAInstanceResult> handler,
                           Boolean... asyncFlag);

    /**
     * 删除全球加速服务加速配置
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUGAInstanceResult deleteUGAInstance(
            DeleteUGAInstanceParam param) throws Exception;

    /**
     * 删除全球加速服务加速配置 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUGAInstance(DeleteUGAInstanceParam param,
                           UcloudHandler<DeleteUGAInstanceResult> handler,
                           Boolean... asyncFlag);

    /**
     * 获取全球加速服务加速配置信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeUGAInstanceResult describeUGAInstance(
            DescribeUGAInstanceParam param) throws Exception;

    /**
     * 获取全球加速服务加速配置信息 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeUGAInstance(DescribeUGAInstanceParam param,
                             UcloudHandler<DescribeUGAInstanceResult> handler,
                             Boolean... asyncFlag);

    /**
     * 获取苹果加速通道信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeCommonUGAInstanceResult describeCommonUGAInstance(
            DescribeCommonUGAInstanceParam param) throws Exception;

    /**
     * 获取苹果加速通道信息 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeCommonUGAInstance(DescribeCommonUGAInstanceParam param,
                                   UcloudHandler<DescribeCommonUGAInstanceResult> handler,
                                   Boolean... asyncFlag);

    /**
     * 获取全球加速监控信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetPathXMetricResult getPathXMetric(
            GetPathXMetricParam param) throws Exception;

    /**
     * 获取全球加速监控信息 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getPathXMetric(GetPathXMetricParam param,
                        UcloudHandler<GetPathXMetricResult> handler,
                        Boolean... asyncFlag);

    /**
     * 获取全球加速线路信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribePathXLineConfigResult describePathXLineConfig(
            DescribePathXLineConfigParam param) throws Exception;

    /**
     * 获取全球加速线路信息 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describePathXLineConfig(DescribePathXLineConfigParam param,
                                 UcloudHandler<DescribePathXLineConfigResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 删除GlobalSSH实例
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteGlobalSSHInstanceResult deleteGlobalSSHInstance(
            DeleteGlobalSSHInstanceParam param) throws Exception;

    /**
     * 删除GlobalSSH实例 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteGlobalSSHInstance(DeleteGlobalSSHInstanceParam param,
                                 UcloudHandler<DeleteGlobalSSHInstanceResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 增量插入白名单
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    InsertPathXWhitelistResult insertPathXWhitelist(
            InsertPathXWhitelistParam param) throws Exception;

    /**
     * 增量插入白名单 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void insertPathXWhitelist(InsertPathXWhitelistParam param,
                              UcloudHandler<InsertPathXWhitelistResult> handler,
                              Boolean... asyncFlag);

    /**
     * 获取UGA价格
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUGAPriceResult getUGAPrice(
            GetUGAPriceParam param) throws Exception;

    /**
     * 获取UGA价格 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUGAPrice(GetUGAPriceParam param,
                     UcloudHandler<GetUGAPriceResult> handler,
                     Boolean... asyncFlag);

    /**
     * 删除PathX SSL证书
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeletePathXSSLResult deletePathXSSL(
            DeletePathXSSLParam param) throws Exception;

    /**
     * 删除PathX SSL证书 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deletePathXSSL(DeletePathXSSLParam param,
                        UcloudHandler<DeletePathXSSLResult> handler,
                        Boolean... asyncFlag);

    /**
     * 获取UPath价格
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUPathPriceResult getUPathPrice(
            GetUPathPriceParam param) throws Exception;

    /**
     * 获取UPath价格 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUPathPrice(GetUPathPriceParam param,
                       UcloudHandler<GetUPathPriceResult> handler,
                       Boolean... asyncFlag);

    /**
     * 修改GlobalSSH端口
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyGlobalSSHPortResult modifyGlobalSSHPort(
            ModifyGlobalSSHPortParam param) throws Exception;

    /**
     * 修改GlobalSSH端口 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyGlobalSSHPort(ModifyGlobalSSHPortParam param,
                             UcloudHandler<ModifyGlobalSSHPortResult> handler,
                             Boolean... asyncFlag);

    /**
     * 添加或更新入口白名单
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    UpdatePathXWhitelistResult updatePathXWhitelist(
            UpdatePathXWhitelistParam param) throws Exception;

    /**
     * 添加或更新入口白名单 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void updatePathXWhitelist(UpdatePathXWhitelistParam param,
                              UcloudHandler<UpdatePathXWhitelistResult> handler,
                              Boolean... asyncFlag);

    /**
     * 获取入口白名单列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribePathXWhitelistResult describePathXWhitelist(
            DescribePathXWhitelistParam param) throws Exception;

    /**
     * 获取入口白名单列表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describePathXWhitelist(DescribePathXWhitelistParam param,
                                UcloudHandler<DescribePathXWhitelistResult> handler,
                                Boolean... asyncFlag);

    /**
     * 修改GlobalSSH备注
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyGlobalSSHRemarkResult modifyGlobalSSHRemark(
            ModifyGlobalSSHRemarkParam param) throws Exception;

    /**
     * 修改GlobalSSH备注 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyGlobalSSHRemark(ModifyGlobalSSHRemarkParam param,
                               UcloudHandler<ModifyGlobalSSHRemarkResult> handler,
                               Boolean... asyncFlag);

    /**
     * 获取GlobalSSH出入带宽数据
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetGlobalSSHMetricResult getGlobalSSHMetric(
            GetGlobalSSHMetricParam param) throws Exception;

    /**
     * 获取GlobalSSH出入带宽数据 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getGlobalSSHMetric(GetGlobalSSHMetricParam param,
                            UcloudHandler<GetGlobalSSHMetricResult> handler,
                            Boolean... asyncFlag);

    /**
     * 获取GlobalSSH覆盖的地区列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeGlobalSSHAreaResult describeGlobalSSHArea(
            DescribeGlobalSSHAreaParam param) throws Exception;

    /**
     * 获取GlobalSSH覆盖的地区列表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeGlobalSSHArea(DescribeGlobalSSHAreaParam param,
                               UcloudHandler<DescribeGlobalSSHAreaResult> handler,
                               Boolean... asyncFlag);

    /**
     * 获取GlobalSSH价格
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetGlobalSSHPriceResult getGlobalSSHPrice(
            GetGlobalSSHPriceParam param) throws Exception;

    /**
     * 获取GlobalSSH价格 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getGlobalSSHPrice(GetGlobalSSHPriceParam param,
                           UcloudHandler<GetGlobalSSHPriceResult> handler,
                           Boolean... asyncFlag);

    /**
     * 获取线路数
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetLinesResult getLines(
            GetLinesParam param) throws Exception;

    /**
     * 获取线路数 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getLines(GetLinesParam param,
                  UcloudHandler<GetLinesResult> handler,
                  Boolean... asyncFlag);

    /**
     * 获取全球运维通道流量统计数据
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetGlobalSSHTrafficResult getGlobalSSHTraffic(
            GetGlobalSSHTrafficParam param) throws Exception;

    /**
     * 获取全球运维通道流量统计数据 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getGlobalSSHTraffic(GetGlobalSSHTrafficParam param,
                             UcloudHandler<GetGlobalSSHTrafficResult> handler,
                             Boolean... asyncFlag);

    /**
     * （deprecated）检查三级域名合法性和唯一性
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CheckPreCNameResult checkPreCName(
            CheckPreCNameParam param) throws Exception;

    /**
     * （deprecated）检查三级域名合法性和唯一性 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void checkPreCName(CheckPreCNameParam param,
                       UcloudHandler<CheckPreCNameResult> handler,
                       Boolean... asyncFlag);

    /**
     * 创建UPath
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUPathResult createUPath(
            CreateUPathParam param) throws Exception;

    /**
     * 创建UPath (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUPath(CreateUPathParam param,
                     UcloudHandler<CreateUPathResult> handler,
                     Boolean... asyncFlag);

    /**
     * 创建苹果审核加速通道
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateCommonUGAInstanceResult createCommonUGAInstance(
            CreateCommonUGAInstanceParam param) throws Exception;

    /**
     * 创建苹果审核加速通道 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createCommonUGAInstance(CreateCommonUGAInstanceParam param,
                                 UcloudHandler<CreateCommonUGAInstanceResult> handler,
                                 Boolean... asyncFlag);

    /**
     * 获取GlobalSSH实例列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribeGlobalSSHInstanceResult describeGlobalSSHInstance(
            DescribeGlobalSSHInstanceParam param) throws Exception;

    /**
     * 获取GlobalSSH实例列表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describeGlobalSSHInstance(DescribeGlobalSSHInstanceParam param,
                                   UcloudHandler<DescribeGlobalSSHInstanceResult> handler,
                                   Boolean... asyncFlag);

    /**
     * 获取SSL证书信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DescribePathXSSLResult describePathXSSL(
            DescribePathXSSLParam param) throws Exception;

    /**
     * 获取SSL证书信息 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void describePathXSSL(DescribePathXSSLParam param,
                          UcloudHandler<DescribePathXSSLResult> handler,
                          Boolean... asyncFlag);

    /**
     * 创建证书
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreatePathXSSLResult createPathXSSL(
            CreatePathXSSLParam param) throws Exception;

    /**
     * 创建证书 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createPathXSSL(CreatePathXSSLParam param,
                        UcloudHandler<CreatePathXSSLResult> handler,
                        Boolean... asyncFlag);

    /**
     * 绑定PathX SSL证书
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    BindPathXSSLResult bindPathXSSL(
            BindPathXSSLParam param) throws Exception;

    /**
     * 绑定PathX SSL证书 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void bindPathXSSL(BindPathXSSLParam param,
                      UcloudHandler<BindPathXSSLResult> handler,
                      Boolean... asyncFlag);

    /**
     * 解绑PathX SSL 证书
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    UnBindPathXSSLResult unBindPathXSSL(
            UnBindPathXSSLParam param) throws Exception;

    /**
     * 解绑PathX SSL 证书 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void unBindPathXSSL(UnBindPathXSSLParam param,
                        UcloudHandler<UnBindPathXSSLResult> handler,
                        Boolean... asyncFlag);
}