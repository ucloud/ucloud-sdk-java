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

import cn.ucloud.common.client.Client;
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
public interface UWSCClientInterface extends Client {

    /**
     * AddExportLineRules - 添加加速规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddExportLineRulesResponse addExportLineRules(AddExportLineRulesRequest request)
            throws UCloudException;

    /**
     * BindCPE - 绑定 CPE
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BindCPEResponse bindCPE(BindCPERequest request) throws UCloudException;

    /**
     * CreateCPE - 创建 CPE
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateCPEResponse createCPE(CreateCPERequest request) throws UCloudException;

    /**
     * CreateExportLine - 创建加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateExportLineResponse createExportLine(CreateExportLineRequest request)
            throws UCloudException;

    /**
     * DeleteExportLine - 删除加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteExportLineResponse deleteExportLine(DeleteExportLineRequest request)
            throws UCloudException;

    /**
     * DeleteExportLineRules - 删除加速规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteExportLineRulesResponse deleteExportLineRules(DeleteExportLineRulesRequest request)
            throws UCloudException;

    /**
     * DescribeCPE - 查询 CPE 信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeCPEResponse describeCPE(DescribeCPERequest request) throws UCloudException;

    /**
     * DescribeExportLine - 查询CPE绑定的加速线路信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeExportLineResponse describeExportLine(DescribeExportLineRequest request)
            throws UCloudException;

    /**
     * DescribeExportLineRules - 查询白名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeExportLineRulesResponse describeExportLineRules(
            DescribeExportLineRulesRequest request) throws UCloudException;

    /**
     * UpdateExportLine - 修改加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateExportLineResponse updateExportLine(UpdateExportLineRequest request)
            throws UCloudException;

    /**
     * UpgradeExportLine - 升级加速线路
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpgradeExportLineResponse upgradeExportLine(UpgradeExportLineRequest request)
            throws UCloudException;
}
