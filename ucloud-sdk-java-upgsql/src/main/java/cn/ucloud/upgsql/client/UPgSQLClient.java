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
package cn.ucloud.upgsql.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.upgsql.models.CreateUPgSQLInstanceRequest;
import cn.ucloud.upgsql.models.CreateUPgSQLInstanceResponse;
import cn.ucloud.upgsql.models.CreateUPgSQLParamTemplateRequest;
import cn.ucloud.upgsql.models.CreateUPgSQLParamTemplateResponse;
import cn.ucloud.upgsql.models.CreateUPgSQLReadonlyRequest;
import cn.ucloud.upgsql.models.CreateUPgSQLReadonlyResponse;
import cn.ucloud.upgsql.models.DeleteUPgSQLInstanceRequest;
import cn.ucloud.upgsql.models.DeleteUPgSQLInstanceResponse;
import cn.ucloud.upgsql.models.DeleteUPgSQLParamTemplateRequest;
import cn.ucloud.upgsql.models.DeleteUPgSQLParamTemplateResponse;
import cn.ucloud.upgsql.models.DownloadUPgSQLParamTemplateRequest;
import cn.ucloud.upgsql.models.DownloadUPgSQLParamTemplateResponse;
import cn.ucloud.upgsql.models.GetUPgSQLBackupStrategyRequest;
import cn.ucloud.upgsql.models.GetUPgSQLBackupStrategyResponse;
import cn.ucloud.upgsql.models.GetUPgSQLBackupURLRequest;
import cn.ucloud.upgsql.models.GetUPgSQLBackupURLResponse;
import cn.ucloud.upgsql.models.GetUPgSQLInstancePriceRequest;
import cn.ucloud.upgsql.models.GetUPgSQLInstancePriceResponse;
import cn.ucloud.upgsql.models.GetUPgSQLInstanceRequest;
import cn.ucloud.upgsql.models.GetUPgSQLInstanceResponse;
import cn.ucloud.upgsql.models.GetUPgSQLParamTemplateRequest;
import cn.ucloud.upgsql.models.GetUPgSQLParamTemplateResponse;
import cn.ucloud.upgsql.models.GetUPgSQLUpgradePriceRequest;
import cn.ucloud.upgsql.models.GetUPgSQLUpgradePriceResponse;
import cn.ucloud.upgsql.models.ListUPgSQLBackupRequest;
import cn.ucloud.upgsql.models.ListUPgSQLBackupResponse;
import cn.ucloud.upgsql.models.ListUPgSQLInstanceRequest;
import cn.ucloud.upgsql.models.ListUPgSQLInstanceResponse;
import cn.ucloud.upgsql.models.ListUPgSQLMachineTypeRequest;
import cn.ucloud.upgsql.models.ListUPgSQLMachineTypeResponse;
import cn.ucloud.upgsql.models.ListUPgSQLVersionRequest;
import cn.ucloud.upgsql.models.ListUPgSQLVersionResponse;
import cn.ucloud.upgsql.models.RestartUPgSQLInstanceRequest;
import cn.ucloud.upgsql.models.RestartUPgSQLInstanceResponse;
import cn.ucloud.upgsql.models.StartUPgSQLInstanceRequest;
import cn.ucloud.upgsql.models.StartUPgSQLInstanceResponse;
import cn.ucloud.upgsql.models.StopUPgSQLCreatingReadonlyRequest;
import cn.ucloud.upgsql.models.StopUPgSQLCreatingReadonlyResponse;
import cn.ucloud.upgsql.models.StopUPgSQLInstanceRequest;
import cn.ucloud.upgsql.models.StopUPgSQLInstanceResponse;
import cn.ucloud.upgsql.models.UpdateUPgSQLAttributeRequest;
import cn.ucloud.upgsql.models.UpdateUPgSQLAttributeResponse;
import cn.ucloud.upgsql.models.UpdateUPgSQLBackupStrategyRequest;
import cn.ucloud.upgsql.models.UpdateUPgSQLBackupStrategyResponse;
import cn.ucloud.upgsql.models.UpdateUPgSQLPasswordRequest;
import cn.ucloud.upgsql.models.UpdateUPgSQLPasswordResponse;
import cn.ucloud.upgsql.models.UpgradeUPgSQLInstanceRequest;
import cn.ucloud.upgsql.models.UpgradeUPgSQLInstanceResponse;
import cn.ucloud.upgsql.models.UploadUPgSQLParamTemplateRequest;
import cn.ucloud.upgsql.models.UploadUPgSQLParamTemplateResponse;

/** This client is used to call actions of **UPgSQL** service */
public class UPgSQLClient extends DefaultClient implements UPgSQLClientInterface {
    public UPgSQLClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateUPgSQLInstance - 创建PG云数据库
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUPgSQLInstanceResponse createUPgSQLInstance(CreateUPgSQLInstanceRequest request)
            throws UCloudException {
        request.setAction("CreateUPgSQLInstance");
        return (CreateUPgSQLInstanceResponse)
                this.invoke(request, CreateUPgSQLInstanceResponse.class);
    }

    /**
     * CreateUPgSQLParamTemplate - 创建PG参数模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUPgSQLParamTemplateResponse createUPgSQLParamTemplate(
            CreateUPgSQLParamTemplateRequest request) throws UCloudException {
        request.setAction("CreateUPgSQLParamTemplate");
        return (CreateUPgSQLParamTemplateResponse)
                this.invoke(request, CreateUPgSQLParamTemplateResponse.class);
    }

    /**
     * CreateUPgSQLReadonly - 创建PG从库
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUPgSQLReadonlyResponse createUPgSQLReadonly(CreateUPgSQLReadonlyRequest request)
            throws UCloudException {
        request.setAction("CreateUPgSQLReadonly");
        return (CreateUPgSQLReadonlyResponse)
                this.invoke(request, CreateUPgSQLReadonlyResponse.class);
    }

    /**
     * DeleteUPgSQLInstance - 删除PG实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUPgSQLInstanceResponse deleteUPgSQLInstance(DeleteUPgSQLInstanceRequest request)
            throws UCloudException {
        request.setAction("DeleteUPgSQLInstance");
        return (DeleteUPgSQLInstanceResponse)
                this.invoke(request, DeleteUPgSQLInstanceResponse.class);
    }

    /**
     * DeleteUPgSQLParamTemplate - 删除参数模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUPgSQLParamTemplateResponse deleteUPgSQLParamTemplate(
            DeleteUPgSQLParamTemplateRequest request) throws UCloudException {
        request.setAction("DeleteUPgSQLParamTemplate");
        return (DeleteUPgSQLParamTemplateResponse)
                this.invoke(request, DeleteUPgSQLParamTemplateResponse.class);
    }

    /**
     * DownloadUPgSQLParamTemplate - 下载参数模板信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DownloadUPgSQLParamTemplateResponse downloadUPgSQLParamTemplate(
            DownloadUPgSQLParamTemplateRequest request) throws UCloudException {
        request.setAction("DownloadUPgSQLParamTemplate");
        return (DownloadUPgSQLParamTemplateResponse)
                this.invoke(request, DownloadUPgSQLParamTemplateResponse.class);
    }

    /**
     * GetUPgSQLBackupStrategy - 获取备份策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPgSQLBackupStrategyResponse getUPgSQLBackupStrategy(
            GetUPgSQLBackupStrategyRequest request) throws UCloudException {
        request.setAction("GetUPgSQLBackupStrategy");
        return (GetUPgSQLBackupStrategyResponse)
                this.invoke(request, GetUPgSQLBackupStrategyResponse.class);
    }

    /**
     * GetUPgSQLBackupURL - 获取备份下载地址
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPgSQLBackupURLResponse getUPgSQLBackupURL(GetUPgSQLBackupURLRequest request)
            throws UCloudException {
        request.setAction("GetUPgSQLBackupURL");
        return (GetUPgSQLBackupURLResponse) this.invoke(request, GetUPgSQLBackupURLResponse.class);
    }

    /**
     * GetUPgSQLInstance - 获取云数据库实例描述
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPgSQLInstanceResponse getUPgSQLInstance(GetUPgSQLInstanceRequest request)
            throws UCloudException {
        request.setAction("GetUPgSQLInstance");
        return (GetUPgSQLInstanceResponse) this.invoke(request, GetUPgSQLInstanceResponse.class);
    }

    /**
     * GetUPgSQLInstancePrice - 获取创建PG云数据库价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPgSQLInstancePriceResponse getUPgSQLInstancePrice(
            GetUPgSQLInstancePriceRequest request) throws UCloudException {
        request.setAction("GetUPgSQLInstancePrice");
        return (GetUPgSQLInstancePriceResponse)
                this.invoke(request, GetUPgSQLInstancePriceResponse.class);
    }

    /**
     * GetUPgSQLParamTemplate - 获取模板信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPgSQLParamTemplateResponse getUPgSQLParamTemplate(
            GetUPgSQLParamTemplateRequest request) throws UCloudException {
        request.setAction("GetUPgSQLParamTemplate");
        return (GetUPgSQLParamTemplateResponse)
                this.invoke(request, GetUPgSQLParamTemplateResponse.class);
    }

    /**
     * GetUPgSQLUpgradePrice - 获取 PG 云数据库升降级价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUPgSQLUpgradePriceResponse getUPgSQLUpgradePrice(GetUPgSQLUpgradePriceRequest request)
            throws UCloudException {
        request.setAction("GetUPgSQLUpgradePrice");
        return (GetUPgSQLUpgradePriceResponse)
                this.invoke(request, GetUPgSQLUpgradePriceResponse.class);
    }

    /**
     * ListUPgSQLBackup - 获取备份列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUPgSQLBackupResponse listUPgSQLBackup(ListUPgSQLBackupRequest request)
            throws UCloudException {
        request.setAction("ListUPgSQLBackup");
        return (ListUPgSQLBackupResponse) this.invoke(request, ListUPgSQLBackupResponse.class);
    }

    /**
     * ListUPgSQLInstance - 获取云数据库列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUPgSQLInstanceResponse listUPgSQLInstance(ListUPgSQLInstanceRequest request)
            throws UCloudException {
        request.setAction("ListUPgSQLInstance");
        return (ListUPgSQLInstanceResponse) this.invoke(request, ListUPgSQLInstanceResponse.class);
    }

    /**
     * ListUPgSQLMachineType - 获取UPgSQL支持机器类型列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUPgSQLMachineTypeResponse listUPgSQLMachineType(ListUPgSQLMachineTypeRequest request)
            throws UCloudException {
        request.setAction("ListUPgSQLMachineType");
        return (ListUPgSQLMachineTypeResponse)
                this.invoke(request, ListUPgSQLMachineTypeResponse.class);
    }

    /**
     * ListUPgSQLVersion - 获取UPgSQL支持版本列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUPgSQLVersionResponse listUPgSQLVersion(ListUPgSQLVersionRequest request)
            throws UCloudException {
        request.setAction("ListUPgSQLVersion");
        return (ListUPgSQLVersionResponse) this.invoke(request, ListUPgSQLVersionResponse.class);
    }

    /**
     * RestartUPgSQLInstance - 重启PG实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RestartUPgSQLInstanceResponse restartUPgSQLInstance(RestartUPgSQLInstanceRequest request)
            throws UCloudException {
        request.setAction("RestartUPgSQLInstance");
        return (RestartUPgSQLInstanceResponse)
                this.invoke(request, RestartUPgSQLInstanceResponse.class);
    }

    /**
     * StartUPgSQLInstance - 启动PG实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartUPgSQLInstanceResponse startUPgSQLInstance(StartUPgSQLInstanceRequest request)
            throws UCloudException {
        request.setAction("StartUPgSQLInstance");
        return (StartUPgSQLInstanceResponse)
                this.invoke(request, StartUPgSQLInstanceResponse.class);
    }

    /**
     * StopUPgSQLCreatingReadonly - 停止正在创建的从库
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StopUPgSQLCreatingReadonlyResponse stopUPgSQLCreatingReadonly(
            StopUPgSQLCreatingReadonlyRequest request) throws UCloudException {
        request.setAction("StopUPgSQLCreatingReadonly");
        return (StopUPgSQLCreatingReadonlyResponse)
                this.invoke(request, StopUPgSQLCreatingReadonlyResponse.class);
    }

    /**
     * StopUPgSQLInstance - 关闭PG实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StopUPgSQLInstanceResponse stopUPgSQLInstance(StopUPgSQLInstanceRequest request)
            throws UCloudException {
        request.setAction("StopUPgSQLInstance");
        return (StopUPgSQLInstanceResponse) this.invoke(request, StopUPgSQLInstanceResponse.class);
    }

    /**
     * UpdateUPgSQLAttribute - 更新数据库属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUPgSQLAttributeResponse updateUPgSQLAttribute(UpdateUPgSQLAttributeRequest request)
            throws UCloudException {
        request.setAction("UpdateUPgSQLAttribute");
        return (UpdateUPgSQLAttributeResponse)
                this.invoke(request, UpdateUPgSQLAttributeResponse.class);
    }

    /**
     * UpdateUPgSQLBackupStrategy - 修改备份策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUPgSQLBackupStrategyResponse updateUPgSQLBackupStrategy(
            UpdateUPgSQLBackupStrategyRequest request) throws UCloudException {
        request.setAction("UpdateUPgSQLBackupStrategy");
        return (UpdateUPgSQLBackupStrategyResponse)
                this.invoke(request, UpdateUPgSQLBackupStrategyResponse.class);
    }

    /**
     * UpdateUPgSQLPassword - 更新数据库密码
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUPgSQLPasswordResponse updateUPgSQLPassword(UpdateUPgSQLPasswordRequest request)
            throws UCloudException {
        request.setAction("UpdateUPgSQLPassword");
        return (UpdateUPgSQLPasswordResponse)
                this.invoke(request, UpdateUPgSQLPasswordResponse.class);
    }

    /**
     * UpgradeUPgSQLInstance - 硬件规格升降级
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpgradeUPgSQLInstanceResponse upgradeUPgSQLInstance(UpgradeUPgSQLInstanceRequest request)
            throws UCloudException {
        request.setAction("UpgradeUPgSQLInstance");
        return (UpgradeUPgSQLInstanceResponse)
                this.invoke(request, UpgradeUPgSQLInstanceResponse.class);
    }

    /**
     * UploadUPgSQLParamTemplate - 上传参数模板
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UploadUPgSQLParamTemplateResponse uploadUPgSQLParamTemplate(
            UploadUPgSQLParamTemplateRequest request) throws UCloudException {
        request.setAction("UploadUPgSQLParamTemplate");
        return (UploadUPgSQLParamTemplateResponse)
                this.invoke(request, UploadUPgSQLParamTemplateResponse.class);
    }
}
