/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.umongodb.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
        
        
        
import cn.ucloud.umongodb.models.BackupUMongoDBClusterRequest;
import cn.ucloud.umongodb.models.BackupUMongoDBClusterResponse;
        
        
        
import cn.ucloud.umongodb.models.CreateUMongoDBConfigTemplateRequest;
import cn.ucloud.umongodb.models.CreateUMongoDBConfigTemplateResponse;
        
        
        
import cn.ucloud.umongodb.models.DescribeUMongoDBBackupURLRequest;
import cn.ucloud.umongodb.models.DescribeUMongoDBBackupURLResponse;
        
        
        
import cn.ucloud.umongodb.models.GetUMongoDBBackupParamRequest;
import cn.ucloud.umongodb.models.GetUMongoDBBackupParamResponse;
        
        
        
import cn.ucloud.umongodb.models.GetUMongoDBCfgTempItemRequest;
import cn.ucloud.umongodb.models.GetUMongoDBCfgTempItemResponse;
        
        
        
import cn.ucloud.umongodb.models.GetUMongoDBRecoverTimeRangeRequest;
import cn.ucloud.umongodb.models.GetUMongoDBRecoverTimeRangeResponse;
        
        
        
import cn.ucloud.umongodb.models.ListUMongoDBBackupRequest;
import cn.ucloud.umongodb.models.ListUMongoDBBackupResponse;
        
        
        
import cn.ucloud.umongodb.models.ListUMongoDBConfigTemplateRequest;
import cn.ucloud.umongodb.models.ListUMongoDBConfigTemplateResponse;
        
        
        
import cn.ucloud.umongodb.models.ListUMongoDBMachineTypeRequest;
import cn.ucloud.umongodb.models.ListUMongoDBMachineTypeResponse;
        
        
        
import cn.ucloud.umongodb.models.ListUMongoDBVersionRequest;
import cn.ucloud.umongodb.models.ListUMongoDBVersionResponse;
        
        
        
import cn.ucloud.umongodb.models.ModifyUMongoDBAdminPasswordRequest;
import cn.ucloud.umongodb.models.ModifyUMongoDBAdminPasswordResponse;
        
        
        
import cn.ucloud.umongodb.models.ModifyUMongoDBAttributeRequest;
import cn.ucloud.umongodb.models.ModifyUMongoDBAttributeResponse;
        
        
        
import cn.ucloud.umongodb.models.ModifyUMongoDBBackupParamRequest;
import cn.ucloud.umongodb.models.ModifyUMongoDBBackupParamResponse;
        
        
        
import cn.ucloud.umongodb.models.RestartUMongoDBClusterRequest;
import cn.ucloud.umongodb.models.RestartUMongoDBClusterResponse;
        
        
        
import cn.ucloud.umongodb.models.StartUMongoDBClusterRequest;
import cn.ucloud.umongodb.models.StartUMongoDBClusterResponse;
        
        
        
import cn.ucloud.umongodb.models.StopUMongoDBClusterRequest;
import cn.ucloud.umongodb.models.StopUMongoDBClusterResponse;

/**
 * This client is used to call actions of **UMongoDB** service
 */
public class UMongoDBClient extends DefaultClient implements UMongoDBClientInterface {
    public UMongoDBClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * BackupUMongoDBCluster - 备份集群数据库
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public BackupUMongoDBClusterResponse backupUMongoDBCluster(BackupUMongoDBClusterRequest request) throws UCloudException {
            request.setAction("BackupUMongoDBCluster");
            return (BackupUMongoDBClusterResponse) this.invoke(request, BackupUMongoDBClusterResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateUMongoDBConfigTemplate - 创建配置模板
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateUMongoDBConfigTemplateResponse createUMongoDBConfigTemplate(CreateUMongoDBConfigTemplateRequest request) throws UCloudException {
            request.setAction("CreateUMongoDBConfigTemplate");
            return (CreateUMongoDBConfigTemplateResponse) this.invoke(request, CreateUMongoDBConfigTemplateResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeUMongoDBBackupURL - 获取实例备份下载链接
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeUMongoDBBackupURLResponse describeUMongoDBBackupURL(DescribeUMongoDBBackupURLRequest request) throws UCloudException {
            request.setAction("DescribeUMongoDBBackupURL");
            return (DescribeUMongoDBBackupURLResponse) this.invoke(request, DescribeUMongoDBBackupURLResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetUMongoDBBackupParam - 获取实例备份策略
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUMongoDBBackupParamResponse getUMongoDBBackupParam(GetUMongoDBBackupParamRequest request) throws UCloudException {
            request.setAction("GetUMongoDBBackupParam");
            return (GetUMongoDBBackupParamResponse) this.invoke(request, GetUMongoDBBackupParamResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetUMongoDBCfgTempItem - 获取配置模板内容
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUMongoDBCfgTempItemResponse getUMongoDBCfgTempItem(GetUMongoDBCfgTempItemRequest request) throws UCloudException {
            request.setAction("GetUMongoDBCfgTempItem");
            return (GetUMongoDBCfgTempItemResponse) this.invoke(request, GetUMongoDBCfgTempItemResponse.class);
        }
        
        
        
        
        
        
        /**
         * GetUMongoDBRecoverTimeRange - 获取UMongoDB可回档时间范围
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public GetUMongoDBRecoverTimeRangeResponse getUMongoDBRecoverTimeRange(GetUMongoDBRecoverTimeRangeRequest request) throws UCloudException {
            request.setAction("GetUMongoDBRecoverTimeRange");
            return (GetUMongoDBRecoverTimeRangeResponse) this.invoke(request, GetUMongoDBRecoverTimeRangeResponse.class);
        }
        
        
        
        
        
        
        /**
         * ListUMongoDBBackup - 实例备份列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ListUMongoDBBackupResponse listUMongoDBBackup(ListUMongoDBBackupRequest request) throws UCloudException {
            request.setAction("ListUMongoDBBackup");
            return (ListUMongoDBBackupResponse) this.invoke(request, ListUMongoDBBackupResponse.class);
        }
        
        
        
        
        
        
        /**
         * ListUMongoDBConfigTemplate - 拉取配置模板
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ListUMongoDBConfigTemplateResponse listUMongoDBConfigTemplate(ListUMongoDBConfigTemplateRequest request) throws UCloudException {
            request.setAction("ListUMongoDBConfigTemplate");
            return (ListUMongoDBConfigTemplateResponse) this.invoke(request, ListUMongoDBConfigTemplateResponse.class);
        }
        
        
        
        
        
        
        /**
         * ListUMongoDBMachineType - 获取UmongDB支持机器类型列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ListUMongoDBMachineTypeResponse listUMongoDBMachineType(ListUMongoDBMachineTypeRequest request) throws UCloudException {
            request.setAction("ListUMongoDBMachineType");
            return (ListUMongoDBMachineTypeResponse) this.invoke(request, ListUMongoDBMachineTypeResponse.class);
        }
        
        
        
        
        
        
        /**
         * ListUMongoDBVersion - 获取UMongoDB支持版本列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ListUMongoDBVersionResponse listUMongoDBVersion(ListUMongoDBVersionRequest request) throws UCloudException {
            request.setAction("ListUMongoDBVersion");
            return (ListUMongoDBVersionResponse) this.invoke(request, ListUMongoDBVersionResponse.class);
        }
        
        
        
        
        
        
        /**
         * ModifyUMongoDBAdminPassword - 修改MongoDB集群root密码
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ModifyUMongoDBAdminPasswordResponse modifyUMongoDBAdminPassword(ModifyUMongoDBAdminPasswordRequest request) throws UCloudException {
            request.setAction("ModifyUMongoDBAdminPassword");
            return (ModifyUMongoDBAdminPasswordResponse) this.invoke(request, ModifyUMongoDBAdminPasswordResponse.class);
        }
        
        
        
        
        
        
        /**
         * ModifyUMongoDBAttribute - 修改umongodb集群名称
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ModifyUMongoDBAttributeResponse modifyUMongoDBAttribute(ModifyUMongoDBAttributeRequest request) throws UCloudException {
            request.setAction("ModifyUMongoDBAttribute");
            return (ModifyUMongoDBAttributeResponse) this.invoke(request, ModifyUMongoDBAttributeResponse.class);
        }
        
        
        
        
        
        
        /**
         * ModifyUMongoDBBackupParam - 修改实例备份策略
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ModifyUMongoDBBackupParamResponse modifyUMongoDBBackupParam(ModifyUMongoDBBackupParamRequest request) throws UCloudException {
            request.setAction("ModifyUMongoDBBackupParam");
            return (ModifyUMongoDBBackupParamResponse) this.invoke(request, ModifyUMongoDBBackupParamResponse.class);
        }
        
        
        
        
        
        
        /**
         * RestartUMongoDBCluster - 重启集群
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public RestartUMongoDBClusterResponse restartUMongoDBCluster(RestartUMongoDBClusterRequest request) throws UCloudException {
            request.setAction("RestartUMongoDBCluster");
            return (RestartUMongoDBClusterResponse) this.invoke(request, RestartUMongoDBClusterResponse.class);
        }
        
        
        
        
        
        
        /**
         * StartUMongoDBCluster - 启动集群
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public StartUMongoDBClusterResponse startUMongoDBCluster(StartUMongoDBClusterRequest request) throws UCloudException {
            request.setAction("StartUMongoDBCluster");
            return (StartUMongoDBClusterResponse) this.invoke(request, StartUMongoDBClusterResponse.class);
        }
        
        
        
        
        
        
        /**
         * StopUMongoDBCluster - 停止集群
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public StopUMongoDBClusterResponse stopUMongoDBCluster(StopUMongoDBClusterRequest request) throws UCloudException {
            request.setAction("StopUMongoDBCluster");
            return (StopUMongoDBClusterResponse) this.invoke(request, StopUMongoDBClusterResponse.class);
        }
}
