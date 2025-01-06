/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.umem.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.umem.models.CheckUDredisSpaceAllowanceRequest;
import cn.ucloud.umem.models.CheckUDredisSpaceAllowanceResponse;
import cn.ucloud.umem.models.CheckURedisAllowanceRequest;
import cn.ucloud.umem.models.CheckURedisAllowanceResponse;
import cn.ucloud.umem.models.CreateScanHotBigKeysRequest;
import cn.ucloud.umem.models.CreateScanHotBigKeysResponse;
import cn.ucloud.umem.models.CreateUMemBackupRequest;
import cn.ucloud.umem.models.CreateUMemBackupResponse;
import cn.ucloud.umem.models.CreateUMemSpaceRequest;
import cn.ucloud.umem.models.CreateUMemSpaceResponse;
import cn.ucloud.umem.models.CreateUMemcacheGroupRequest;
import cn.ucloud.umem.models.CreateUMemcacheGroupResponse;
import cn.ucloud.umem.models.CreateURedisBackupRequest;
import cn.ucloud.umem.models.CreateURedisBackupResponse;
import cn.ucloud.umem.models.CreateURedisGroupRequest;
import cn.ucloud.umem.models.CreateURedisGroupResponse;
import cn.ucloud.umem.models.DeleteUMemSpaceRequest;
import cn.ucloud.umem.models.DeleteUMemSpaceResponse;
import cn.ucloud.umem.models.DeleteUMemcacheGroupRequest;
import cn.ucloud.umem.models.DeleteUMemcacheGroupResponse;
import cn.ucloud.umem.models.DeleteURedisGroupRequest;
import cn.ucloud.umem.models.DeleteURedisGroupResponse;
import cn.ucloud.umem.models.DescribeUDRedisProxyInfoRequest;
import cn.ucloud.umem.models.DescribeUDRedisProxyInfoResponse;
import cn.ucloud.umem.models.DescribeUDRedisSlowlogRequest;
import cn.ucloud.umem.models.DescribeUDRedisSlowlogResponse;
import cn.ucloud.umem.models.DescribeUMemBackupRequest;
import cn.ucloud.umem.models.DescribeUMemBackupResponse;
import cn.ucloud.umem.models.DescribeUMemBackupURLRequest;
import cn.ucloud.umem.models.DescribeUMemBackupURLResponse;
import cn.ucloud.umem.models.DescribeUMemBlockInfoRequest;
import cn.ucloud.umem.models.DescribeUMemBlockInfoResponse;
import cn.ucloud.umem.models.DescribeUMemPriceRequest;
import cn.ucloud.umem.models.DescribeUMemPriceResponse;
import cn.ucloud.umem.models.DescribeUMemRequest;
import cn.ucloud.umem.models.DescribeUMemResponse;
import cn.ucloud.umem.models.DescribeUMemSpaceRequest;
import cn.ucloud.umem.models.DescribeUMemSpaceResponse;
import cn.ucloud.umem.models.DescribeUMemUpgradePriceRequest;
import cn.ucloud.umem.models.DescribeUMemUpgradePriceResponse;
import cn.ucloud.umem.models.DescribeUMemcacheGroupRequest;
import cn.ucloud.umem.models.DescribeUMemcacheGroupResponse;
import cn.ucloud.umem.models.DescribeUMemcachePriceRequest;
import cn.ucloud.umem.models.DescribeUMemcachePriceResponse;
import cn.ucloud.umem.models.DescribeUMemcacheUpgradePriceRequest;
import cn.ucloud.umem.models.DescribeUMemcacheUpgradePriceResponse;
import cn.ucloud.umem.models.DescribeURedisBackupRequest;
import cn.ucloud.umem.models.DescribeURedisBackupResponse;
import cn.ucloud.umem.models.DescribeURedisBackupURLRequest;
import cn.ucloud.umem.models.DescribeURedisBackupURLResponse;
import cn.ucloud.umem.models.DescribeURedisConfigRequest;
import cn.ucloud.umem.models.DescribeURedisConfigResponse;
import cn.ucloud.umem.models.DescribeURedisGroupRequest;
import cn.ucloud.umem.models.DescribeURedisGroupResponse;
import cn.ucloud.umem.models.DescribeURedisPriceRequest;
import cn.ucloud.umem.models.DescribeURedisPriceResponse;
import cn.ucloud.umem.models.DescribeURedisSlowlogRequest;
import cn.ucloud.umem.models.DescribeURedisSlowlogResponse;
import cn.ucloud.umem.models.DescribeURedisUpgradePriceRequest;
import cn.ucloud.umem.models.DescribeURedisUpgradePriceResponse;
import cn.ucloud.umem.models.DescribeURedisVersionRequest;
import cn.ucloud.umem.models.DescribeURedisVersionResponse;
import cn.ucloud.umem.models.FlushallURedisGroupRequest;
import cn.ucloud.umem.models.FlushallURedisGroupResponse;
import cn.ucloud.umem.models.GetUMemSpaceStateRequest;
import cn.ucloud.umem.models.GetUMemSpaceStateResponse;
import cn.ucloud.umem.models.ISolationURedisGroupRequest;
import cn.ucloud.umem.models.ISolationURedisGroupResponse;
import cn.ucloud.umem.models.ModifyUMemSpaceNameRequest;
import cn.ucloud.umem.models.ModifyUMemSpaceNameResponse;
import cn.ucloud.umem.models.ModifyURedisConfigRequest;
import cn.ucloud.umem.models.ModifyURedisConfigResponse;
import cn.ucloud.umem.models.ModifyURedisGroupNameRequest;
import cn.ucloud.umem.models.ModifyURedisGroupNameResponse;
import cn.ucloud.umem.models.ModifyURedisGroupPasswordRequest;
import cn.ucloud.umem.models.ModifyURedisGroupPasswordResponse;
import cn.ucloud.umem.models.RegisterUMemDefragRequest;
import cn.ucloud.umem.models.RegisterUMemDefragResponse;
import cn.ucloud.umem.models.RemoveUDRedisDataRequest;
import cn.ucloud.umem.models.RemoveUDRedisDataResponse;
import cn.ucloud.umem.models.ResizeUDRedisBlockSizeRequest;
import cn.ucloud.umem.models.ResizeUDRedisBlockSizeResponse;
import cn.ucloud.umem.models.ResizeUMemSpaceRequest;
import cn.ucloud.umem.models.ResizeUMemSpaceResponse;
import cn.ucloud.umem.models.ResizeURedisGroupRequest;
import cn.ucloud.umem.models.ResizeURedisGroupResponse;
import cn.ucloud.umem.models.RestartUMemcacheGroupRequest;
import cn.ucloud.umem.models.RestartUMemcacheGroupResponse;
import cn.ucloud.umem.models.RestartURedisGroupRequest;
import cn.ucloud.umem.models.RestartURedisGroupResponse;
import cn.ucloud.umem.models.UpdateURedisBackupStrategyRequest;
import cn.ucloud.umem.models.UpdateURedisBackupStrategyResponse;
import cn.ucloud.umem.models.UpdateURedisRewriteTimeRequest;
import cn.ucloud.umem.models.UpdateURedisRewriteTimeResponse;

/** This client is used to call actions of **UMem** service */
public interface UMemClientInterface extends Client {

    /**
     * CheckUDredisSpaceAllowance - 检查高性能UMem剩余资源
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CheckUDredisSpaceAllowanceResponse checkUDredisSpaceAllowance(
            CheckUDredisSpaceAllowanceRequest request) throws UCloudException;

    /**
     * CheckURedisAllowance - 检查URedis资源是否足够
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CheckURedisAllowanceResponse checkURedisAllowance(CheckURedisAllowanceRequest request)
            throws UCloudException;

    /**
     * CreateScanHotBigKeys - 创建扫大key和热key的任务
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateScanHotBigKeysResponse createScanHotBigKeys(CreateScanHotBigKeysRequest request)
            throws UCloudException;

    /**
     * CreateUMemBackup - 创建分布式redis备份
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUMemBackupResponse createUMemBackup(CreateUMemBackupRequest request)
            throws UCloudException;

    /**
     * CreateUMemSpace - 创建内存空间
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUMemSpaceResponse createUMemSpace(CreateUMemSpaceRequest request)
            throws UCloudException;

    /**
     * CreateUMemcacheGroup - 创建单机Memcache
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUMemcacheGroupResponse createUMemcacheGroup(CreateUMemcacheGroupRequest request)
            throws UCloudException;

    /**
     * CreateURedisBackup - 创建主备Redis备份
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateURedisBackupResponse createURedisBackup(CreateURedisBackupRequest request)
            throws UCloudException;

    /**
     * CreateURedisGroup - 创建主备redis
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateURedisGroupResponse createURedisGroup(CreateURedisGroupRequest request)
            throws UCloudException;

    /**
     * DeleteUMemSpace - 删除空间
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUMemSpaceResponse deleteUMemSpace(DeleteUMemSpaceRequest request)
            throws UCloudException;

    /**
     * DeleteUMemcacheGroup - 删除单机Memcache
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUMemcacheGroupResponse deleteUMemcacheGroup(DeleteUMemcacheGroupRequest request)
            throws UCloudException;

    /**
     * DeleteURedisGroup - 删除主备redis
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteURedisGroupResponse deleteURedisGroup(DeleteURedisGroupRequest request)
            throws UCloudException;

    /**
     * DescribeUDRedisProxyInfo - 拉取udredis代理信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUDRedisProxyInfoResponse describeUDRedisProxyInfo(
            DescribeUDRedisProxyInfoRequest request) throws UCloudException;

    /**
     * DescribeUDRedisSlowlog - 查询UDRedis慢日志
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUDRedisSlowlogResponse describeUDRedisSlowlog(
            DescribeUDRedisSlowlogRequest request) throws UCloudException;

    /**
     * DescribeUMem - 获取UMem列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUMemResponse describeUMem(DescribeUMemRequest request) throws UCloudException;

    /**
     * DescribeUMemBackup - 查询分布式redis备份
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUMemBackupResponse describeUMemBackup(DescribeUMemBackupRequest request)
            throws UCloudException;

    /**
     * DescribeUMemBackupURL - 获取分布式redis 备份下载链接
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUMemBackupURLResponse describeUMemBackupURL(DescribeUMemBackupURLRequest request)
            throws UCloudException;

    /**
     * DescribeUMemBlockInfo - 拉取UDRedis分片信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUMemBlockInfoResponse describeUMemBlockInfo(DescribeUMemBlockInfoRequest request)
            throws UCloudException;

    /**
     * DescribeUMemPrice - 获取价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUMemPriceResponse describeUMemPrice(DescribeUMemPriceRequest request)
            throws UCloudException;

    /**
     * DescribeUMemSpace - 查询空间
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUMemSpaceResponse describeUMemSpace(DescribeUMemSpaceRequest request)
            throws UCloudException;

    /**
     * DescribeUMemUpgradePrice - 获取升级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUMemUpgradePriceResponse describeUMemUpgradePrice(
            DescribeUMemUpgradePriceRequest request) throws UCloudException;

    /**
     * DescribeUMemcacheGroup - 显示Memcache
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUMemcacheGroupResponse describeUMemcacheGroup(
            DescribeUMemcacheGroupRequest request) throws UCloudException;

    /**
     * DescribeUMemcachePrice - 获取umemcache组价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUMemcachePriceResponse describeUMemcachePrice(
            DescribeUMemcachePriceRequest request) throws UCloudException;

    /**
     * DescribeUMemcacheUpgradePrice - 获取umemcache升级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUMemcacheUpgradePriceResponse describeUMemcacheUpgradePrice(
            DescribeUMemcacheUpgradePriceRequest request) throws UCloudException;

    /**
     * DescribeURedisBackup - 查询主备redis备份
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeURedisBackupResponse describeURedisBackup(DescribeURedisBackupRequest request)
            throws UCloudException;

    /**
     * DescribeURedisBackupURL - 获取主备Redis备份下载链接
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeURedisBackupURLResponse describeURedisBackupURL(
            DescribeURedisBackupURLRequest request) throws UCloudException;

    /**
     * DescribeURedisConfig - 查询主备Redis所有配置文件
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeURedisConfigResponse describeURedisConfig(DescribeURedisConfigRequest request)
            throws UCloudException;

    /**
     * DescribeURedisGroup - 查询主备Redis
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeURedisGroupResponse describeURedisGroup(DescribeURedisGroupRequest request)
            throws UCloudException;

    /**
     * DescribeURedisPrice - 获取URedis价格信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeURedisPriceResponse describeURedisPrice(DescribeURedisPriceRequest request)
            throws UCloudException;

    /**
     * DescribeURedisSlowlog - 查询URedis慢日志
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeURedisSlowlogResponse describeURedisSlowlog(DescribeURedisSlowlogRequest request)
            throws UCloudException;

    /**
     * DescribeURedisUpgradePrice - 获取uredis升级价格信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeURedisUpgradePriceResponse describeURedisUpgradePrice(
            DescribeURedisUpgradePriceRequest request) throws UCloudException;

    /**
     * DescribeURedisVersion - 获取主Redis可用版本
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeURedisVersionResponse describeURedisVersion(DescribeURedisVersionRequest request)
            throws UCloudException;

    /**
     * FlushallURedisGroup - 清除主备redis数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public FlushallURedisGroupResponse flushallURedisGroup(FlushallURedisGroupRequest request)
            throws UCloudException;

    /**
     * GetUMemSpaceState - 获取空间状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUMemSpaceStateResponse getUMemSpaceState(GetUMemSpaceStateRequest request)
            throws UCloudException;

    /**
     * ISolationURedisGroup - 打开/关闭URedis
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ISolationURedisGroupResponse iSolationURedisGroup(ISolationURedisGroupRequest request)
            throws UCloudException;

    /**
     * ModifyUMemSpaceName - 修改名称
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUMemSpaceNameResponse modifyUMemSpaceName(ModifyUMemSpaceNameRequest request)
            throws UCloudException;

    /**
     * ModifyURedisConfig - 修改主备Redis配置文件参数
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyURedisConfigResponse modifyURedisConfig(ModifyURedisConfigRequest request)
            throws UCloudException;

    /**
     * ModifyURedisGroupName - 修改名称
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyURedisGroupNameResponse modifyURedisGroupName(ModifyURedisGroupNameRequest request)
            throws UCloudException;

    /**
     * ModifyURedisGroupPassword - 修改主备密码
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyURedisGroupPasswordResponse modifyURedisGroupPassword(
            ModifyURedisGroupPasswordRequest request) throws UCloudException;

    /**
     * RegisterUMemDefrag - 动态开关redis碎片整理选项
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RegisterUMemDefragResponse registerUMemDefrag(RegisterUMemDefragRequest request)
            throws UCloudException;

    /**
     * RemoveUDRedisData - 清除udredis实例数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RemoveUDRedisDataResponse removeUDRedisData(RemoveUDRedisDataRequest request)
            throws UCloudException;

    /**
     * ResizeUDRedisBlockSize - 更改udredis分片容量
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResizeUDRedisBlockSizeResponse resizeUDRedisBlockSize(
            ResizeUDRedisBlockSizeRequest request) throws UCloudException;

    /**
     * ResizeUMemSpace - 调整容量
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResizeUMemSpaceResponse resizeUMemSpace(ResizeUMemSpaceRequest request)
            throws UCloudException;

    /**
     * ResizeURedisGroup - 调整容量
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResizeURedisGroupResponse resizeURedisGroup(ResizeURedisGroupRequest request)
            throws UCloudException;

    /**
     * RestartUMemcacheGroup - 重启单机Memcache
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RestartUMemcacheGroupResponse restartUMemcacheGroup(RestartUMemcacheGroupRequest request)
            throws UCloudException;

    /**
     * RestartURedisGroup - 重启主备实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RestartURedisGroupResponse restartURedisGroup(RestartURedisGroupRequest request)
            throws UCloudException;

    /**
     * UpdateURedisBackupStrategy - 更改主备Redis备份策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateURedisBackupStrategyResponse updateURedisBackupStrategy(
            UpdateURedisBackupStrategyRequest request) throws UCloudException;

    /**
     * UpdateURedisRewriteTime - 修改主备redis重写时间
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateURedisRewriteTimeResponse updateURedisRewriteTime(
            UpdateURedisRewriteTimeRequest request) throws UCloudException;
}
