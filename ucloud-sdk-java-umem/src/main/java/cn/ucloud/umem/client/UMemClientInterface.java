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
import cn.ucloud.umem.models.ModifyURedisGroupNameRequest;
import cn.ucloud.umem.models.ModifyURedisGroupNameResponse;
import cn.ucloud.umem.models.ModifyURedisGroupPasswordRequest;
import cn.ucloud.umem.models.ModifyURedisGroupPasswordResponse;
import cn.ucloud.umem.models.RemoveUDRedisDataRequest;
import cn.ucloud.umem.models.RemoveUDRedisDataResponse;
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

/** This client is used to call actions of **UMem** service */
public interface UMemClientInterface extends Client {

    /**
     * CheckUDredisSpaceAllowance - 检查高性能UMem剩余资源
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/CheckUDredisSpaceAllowance
     */
    public CheckUDredisSpaceAllowanceResponse checkUDredisSpaceAllowance(
            CheckUDredisSpaceAllowanceRequest request) throws UCloudException;

    /**
     * CheckURedisAllowance - 检查URedis资源是否足够
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/CheckURedisAllowance
     */
    public CheckURedisAllowanceResponse checkURedisAllowance(CheckURedisAllowanceRequest request)
            throws UCloudException;

    /**
     * CreateUMemBackup - 创建分布式redis备份
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/CreateUMemBackup
     */
    public CreateUMemBackupResponse createUMemBackup(CreateUMemBackupRequest request)
            throws UCloudException;

    /**
     * CreateUMemSpace - 创建内存空间
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/CreateUMemSpace
     */
    public CreateUMemSpaceResponse createUMemSpace(CreateUMemSpaceRequest request)
            throws UCloudException;

    /**
     * CreateUMemcacheGroup - 创建单机Memcache
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/CreateUMemcacheGroup
     */
    public CreateUMemcacheGroupResponse createUMemcacheGroup(CreateUMemcacheGroupRequest request)
            throws UCloudException;

    /**
     * CreateURedisBackup - 创建主备Redis备份
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/CreateURedisBackup
     */
    public CreateURedisBackupResponse createURedisBackup(CreateURedisBackupRequest request)
            throws UCloudException;

    /**
     * CreateURedisGroup - 创建主备redis
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/CreateURedisGroup
     */
    public CreateURedisGroupResponse createURedisGroup(CreateURedisGroupRequest request)
            throws UCloudException;

    /**
     * DeleteUMemSpace - 删除空间
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DeleteUMemSpace
     */
    public DeleteUMemSpaceResponse deleteUMemSpace(DeleteUMemSpaceRequest request)
            throws UCloudException;

    /**
     * DeleteUMemcacheGroup - 删除单机Memcache
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DeleteUMemcacheGroup
     */
    public DeleteUMemcacheGroupResponse deleteUMemcacheGroup(DeleteUMemcacheGroupRequest request)
            throws UCloudException;

    /**
     * DeleteURedisGroup - 删除主备redis
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DeleteURedisGroup
     */
    public DeleteURedisGroupResponse deleteURedisGroup(DeleteURedisGroupRequest request)
            throws UCloudException;

    /**
     * DescribeUDRedisProxyInfo - 拉取udredis代理信息
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUDRedisProxyInfo
     */
    public DescribeUDRedisProxyInfoResponse describeUDRedisProxyInfo(
            DescribeUDRedisProxyInfoRequest request) throws UCloudException;

    /**
     * DescribeUDRedisSlowlog - 查询UDRedis慢日志
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUDRedisSlowlog
     */
    public DescribeUDRedisSlowlogResponse describeUDRedisSlowlog(
            DescribeUDRedisSlowlogRequest request) throws UCloudException;

    /**
     * DescribeUMem - 获取UMem列表
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUMem
     */
    public DescribeUMemResponse describeUMem(DescribeUMemRequest request) throws UCloudException;

    /**
     * DescribeUMemBackup - 查询分布式redis备份
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUMemBackup
     */
    public DescribeUMemBackupResponse describeUMemBackup(DescribeUMemBackupRequest request)
            throws UCloudException;

    /**
     * DescribeUMemBackupURL - 获取分布式redis 备份下载链接
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUMemBackupURL
     */
    public DescribeUMemBackupURLResponse describeUMemBackupURL(DescribeUMemBackupURLRequest request)
            throws UCloudException;

    /**
     * DescribeUMemBlockInfo - 拉取UDRedis分片信息
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUMemBlockInfo
     */
    public DescribeUMemBlockInfoResponse describeUMemBlockInfo(DescribeUMemBlockInfoRequest request)
            throws UCloudException;

    /**
     * DescribeUMemPrice - 获取价格
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUMemPrice
     */
    public DescribeUMemPriceResponse describeUMemPrice(DescribeUMemPriceRequest request)
            throws UCloudException;

    /**
     * DescribeUMemSpace - 查询空间
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUMemSpace
     */
    public DescribeUMemSpaceResponse describeUMemSpace(DescribeUMemSpaceRequest request)
            throws UCloudException;

    /**
     * DescribeUMemUpgradePrice - 获取升级价格
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUMemUpgradePrice
     */
    public DescribeUMemUpgradePriceResponse describeUMemUpgradePrice(
            DescribeUMemUpgradePriceRequest request) throws UCloudException;

    /**
     * DescribeUMemcacheGroup - 显示Memcache
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUMemcacheGroup
     */
    public DescribeUMemcacheGroupResponse describeUMemcacheGroup(
            DescribeUMemcacheGroupRequest request) throws UCloudException;

    /**
     * DescribeUMemcachePrice - 获取umemcache组价格
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUMemcachePrice
     */
    public DescribeUMemcachePriceResponse describeUMemcachePrice(
            DescribeUMemcachePriceRequest request) throws UCloudException;

    /**
     * DescribeUMemcacheUpgradePrice - 获取umemcache升级价格
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeUMemcacheUpgradePrice
     */
    public DescribeUMemcacheUpgradePriceResponse describeUMemcacheUpgradePrice(
            DescribeUMemcacheUpgradePriceRequest request) throws UCloudException;

    /**
     * DescribeURedisBackup - 查询主备redis备份
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeURedisBackup
     */
    public DescribeURedisBackupResponse describeURedisBackup(DescribeURedisBackupRequest request)
            throws UCloudException;

    /**
     * DescribeURedisBackupURL - 获取主备Redis备份下载链接
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeURedisBackupURL
     */
    public DescribeURedisBackupURLResponse describeURedisBackupURL(
            DescribeURedisBackupURLRequest request) throws UCloudException;

    /**
     * DescribeURedisConfig - 查询主备Redis所有配置文件
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeURedisConfig
     */
    public DescribeURedisConfigResponse describeURedisConfig(DescribeURedisConfigRequest request)
            throws UCloudException;

    /**
     * DescribeURedisGroup - 查询主备Redis
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeURedisGroup
     */
    public DescribeURedisGroupResponse describeURedisGroup(DescribeURedisGroupRequest request)
            throws UCloudException;

    /**
     * DescribeURedisPrice - 取uredis价格信息
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeURedisPrice
     */
    public DescribeURedisPriceResponse describeURedisPrice(DescribeURedisPriceRequest request)
            throws UCloudException;

    /**
     * DescribeURedisSlowlog - 查询URedis慢日志
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeURedisSlowlog
     */
    public DescribeURedisSlowlogResponse describeURedisSlowlog(DescribeURedisSlowlogRequest request)
            throws UCloudException;

    /**
     * DescribeURedisUpgradePrice - 获取uredis升级价格信息
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeURedisUpgradePrice
     */
    public DescribeURedisUpgradePriceResponse describeURedisUpgradePrice(
            DescribeURedisUpgradePriceRequest request) throws UCloudException;

    /**
     * DescribeURedisVersion - 获取主Redis可用版本
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/DescribeURedisVersion
     */
    public DescribeURedisVersionResponse describeURedisVersion(DescribeURedisVersionRequest request)
            throws UCloudException;

    /**
     * FlushallURedisGroup - 清除主备redis数据
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/FlushallURedisGroup
     */
    public FlushallURedisGroupResponse flushallURedisGroup(FlushallURedisGroupRequest request)
            throws UCloudException;

    /**
     * GetUMemSpaceState - 获取空间状态
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/GetUMemSpaceState
     */
    public GetUMemSpaceStateResponse getUMemSpaceState(GetUMemSpaceStateRequest request)
            throws UCloudException;

    /**
     * ISolationURedisGroup - 打开/关闭URedis
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/ISolationURedisGroup
     */
    public ISolationURedisGroupResponse iSolationURedisGroup(ISolationURedisGroupRequest request)
            throws UCloudException;

    /**
     * ModifyUMemSpaceName - 修改名称
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/ModifyUMemSpaceName
     */
    public ModifyUMemSpaceNameResponse modifyUMemSpaceName(ModifyUMemSpaceNameRequest request)
            throws UCloudException;

    /**
     * ModifyURedisGroupName - 修改名称
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/ModifyURedisGroupName
     */
    public ModifyURedisGroupNameResponse modifyURedisGroupName(ModifyURedisGroupNameRequest request)
            throws UCloudException;

    /**
     * ModifyURedisGroupPassword - 修改主备密码
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/ModifyURedisGroupPassword
     */
    public ModifyURedisGroupPasswordResponse modifyURedisGroupPassword(
            ModifyURedisGroupPasswordRequest request) throws UCloudException;

    /**
     * RemoveUDRedisData - 清除udredis实例数据
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/RemoveUDRedisData
     */
    public RemoveUDRedisDataResponse removeUDRedisData(RemoveUDRedisDataRequest request)
            throws UCloudException;

    /**
     * ResizeUMemSpace - 调整容量
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/ResizeUMemSpace
     */
    public ResizeUMemSpaceResponse resizeUMemSpace(ResizeUMemSpaceRequest request)
            throws UCloudException;

    /**
     * ResizeURedisGroup - 调整容量
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/ResizeURedisGroup
     */
    public ResizeURedisGroupResponse resizeURedisGroup(ResizeURedisGroupRequest request)
            throws UCloudException;

    /**
     * RestartUMemcacheGroup - 重启单机Memcache
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/RestartUMemcacheGroup
     */
    public RestartUMemcacheGroupResponse restartUMemcacheGroup(RestartUMemcacheGroupRequest request)
            throws UCloudException;

    /**
     * RestartURedisGroup - 重启主备实例
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/RestartURedisGroup
     */
    public RestartURedisGroupResponse restartURedisGroup(RestartURedisGroupRequest request)
            throws UCloudException;

    /**
     * UpdateURedisBackupStrategy - 更改zhubeiredis的备份策略
     *
     * <p>See also: https://docs.ucloud.cn/api/umem-api/UpdateURedisBackupStrategy
     */
    public UpdateURedisBackupStrategyResponse updateURedisBackupStrategy(
            UpdateURedisBackupStrategyRequest request) throws UCloudException;
}
