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
package cn.ucloud.uwsc.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uwsc.models.AddExportLineRulesRequest;
import cn.ucloud.uwsc.models.AddExportLineRulesResponse;
import cn.ucloud.uwsc.models.BindCPERequest;
import cn.ucloud.uwsc.models.BindCPEResponse;
import cn.ucloud.uwsc.models.CreateCPERequest;
import cn.ucloud.uwsc.models.CreateCPEResponse;
import cn.ucloud.uwsc.models.CreateExportLineRequest;
import cn.ucloud.uwsc.models.CreateExportLineResponse;
import cn.ucloud.uwsc.models.DeleteExportLineRequest;
import cn.ucloud.uwsc.models.DeleteExportLineResponse;
import cn.ucloud.uwsc.models.DeleteExportLineRulesRequest;
import cn.ucloud.uwsc.models.DeleteExportLineRulesResponse;
import cn.ucloud.uwsc.models.DescribeCPERequest;
import cn.ucloud.uwsc.models.DescribeCPEResponse;
import cn.ucloud.uwsc.models.DescribeExportLineRequest;
import cn.ucloud.uwsc.models.DescribeExportLineResponse;
import cn.ucloud.uwsc.models.DescribeExportLineRulesRequest;
import cn.ucloud.uwsc.models.DescribeExportLineRulesResponse;
import cn.ucloud.uwsc.models.UpdateExportLineRequest;
import cn.ucloud.uwsc.models.UpdateExportLineResponse;
import cn.ucloud.uwsc.models.UpgradeExportLineRequest;
import cn.ucloud.uwsc.models.UpgradeExportLineResponse;

/** This client is used to call actions of **UWSC** service */
public class UWSCClient extends DefaultClient implements UWSCClientInterface {
    public UWSCClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * AddExportLineRules - 添加加速规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddExportLineRulesResponse addExportLineRules(AddExportLineRulesRequest request)
            throws UCloudException {
        request.setAction("AddExportLineRules");
        return (AddExportLineRulesResponse) this.invoke(request, AddExportLineRulesResponse.class);
    }

    /**
     * BindCPE - 绑定 CPE
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindCPEResponse bindCPE(BindCPERequest request) throws UCloudException {
        request.setAction("BindCPE");
        return (BindCPEResponse) this.invoke(request, BindCPEResponse.class);
    }

    /**
     * CreateCPE - 创建 CPE
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCPEResponse createCPE(CreateCPERequest request) throws UCloudException {
        request.setAction("CreateCPE");
        return (CreateCPEResponse) this.invoke(request, CreateCPEResponse.class);
    }

    /**
     * CreateExportLine - 创建加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateExportLineResponse createExportLine(CreateExportLineRequest request)
            throws UCloudException {
        request.setAction("CreateExportLine");
        return (CreateExportLineResponse) this.invoke(request, CreateExportLineResponse.class);
    }

    /**
     * DeleteExportLine - 删除加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteExportLineResponse deleteExportLine(DeleteExportLineRequest request)
            throws UCloudException {
        request.setAction("DeleteExportLine");
        return (DeleteExportLineResponse) this.invoke(request, DeleteExportLineResponse.class);
    }

    /**
     * DeleteExportLineRules - 删除加速规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteExportLineRulesResponse deleteExportLineRules(DeleteExportLineRulesRequest request)
            throws UCloudException {
        request.setAction("DeleteExportLineRules");
        return (DeleteExportLineRulesResponse)
                this.invoke(request, DeleteExportLineRulesResponse.class);
    }

    /**
     * DescribeCPE - 查询 CPE 信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCPEResponse describeCPE(DescribeCPERequest request) throws UCloudException {
        request.setAction("DescribeCPE");
        return (DescribeCPEResponse) this.invoke(request, DescribeCPEResponse.class);
    }

    /**
     * DescribeExportLine - 查询CPE绑定的加速线路信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeExportLineResponse describeExportLine(DescribeExportLineRequest request)
            throws UCloudException {
        request.setAction("DescribeExportLine");
        return (DescribeExportLineResponse) this.invoke(request, DescribeExportLineResponse.class);
    }

    /**
     * DescribeExportLineRules - 查询白名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeExportLineRulesResponse describeExportLineRules(
            DescribeExportLineRulesRequest request) throws UCloudException {
        request.setAction("DescribeExportLineRules");
        return (DescribeExportLineRulesResponse)
                this.invoke(request, DescribeExportLineRulesResponse.class);
    }

    /**
     * UpdateExportLine - 修改加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateExportLineResponse updateExportLine(UpdateExportLineRequest request)
            throws UCloudException {
        request.setAction("UpdateExportLine");
        return (UpdateExportLineResponse) this.invoke(request, UpdateExportLineResponse.class);
    }

    /**
     * UpgradeExportLine - 升级加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpgradeExportLineResponse upgradeExportLine(UpgradeExportLineRequest request)
            throws UCloudException {
        request.setAction("UpgradeExportLine");
        return (UpgradeExportLineResponse) this.invoke(request, UpgradeExportLineResponse.class);
    }
}
