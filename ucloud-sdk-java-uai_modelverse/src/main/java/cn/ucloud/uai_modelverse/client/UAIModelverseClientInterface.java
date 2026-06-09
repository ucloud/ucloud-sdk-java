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
package cn.ucloud.uai_modelverse.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uai_modelverse.models.CreateUMInferAPIKeyRequest;
import cn.ucloud.uai_modelverse.models.CreateUMInferAPIKeyResponse;
import cn.ucloud.uai_modelverse.models.DeleteUMInferAPIKeyRequest;
import cn.ucloud.uai_modelverse.models.DeleteUMInferAPIKeyResponse;
import cn.ucloud.uai_modelverse.models.DownloadListPaidOrdersRequest;
import cn.ucloud.uai_modelverse.models.DownloadListPaidOrdersResponse;
import cn.ucloud.uai_modelverse.models.DownloadListUnpaidOrdersRequest;
import cn.ucloud.uai_modelverse.models.DownloadListUnpaidOrdersResponse;
import cn.ucloud.uai_modelverse.models.DownloadOrderSummaryRequest;
import cn.ucloud.uai_modelverse.models.DownloadOrderSummaryResponse;
import cn.ucloud.uai_modelverse.models.GetFilterOptionsRequest;
import cn.ucloud.uai_modelverse.models.GetFilterOptionsResponse;
import cn.ucloud.uai_modelverse.models.GetOrderAmountRequest;
import cn.ucloud.uai_modelverse.models.GetOrderAmountResponse;
import cn.ucloud.uai_modelverse.models.GetUMInferAPIModelRequest;
import cn.ucloud.uai_modelverse.models.GetUMInferAPIModelResponse;
import cn.ucloud.uai_modelverse.models.GetUMInferTokenUsageRequest;
import cn.ucloud.uai_modelverse.models.GetUMInferTokenUsageResponse;
import cn.ucloud.uai_modelverse.models.ListPaidOrderSummaryRequest;
import cn.ucloud.uai_modelverse.models.ListPaidOrderSummaryResponse;
import cn.ucloud.uai_modelverse.models.ListPaidOrdersRequest;
import cn.ucloud.uai_modelverse.models.ListPaidOrdersResponse;
import cn.ucloud.uai_modelverse.models.ListUFSquareModelRequest;
import cn.ucloud.uai_modelverse.models.ListUFSquareModelResponse;
import cn.ucloud.uai_modelverse.models.ListUMInferAPIKeyRequest;
import cn.ucloud.uai_modelverse.models.ListUMInferAPIKeyResponse;
import cn.ucloud.uai_modelverse.models.ListUnpaidOrderSummaryRequest;
import cn.ucloud.uai_modelverse.models.ListUnpaidOrderSummaryResponse;
import cn.ucloud.uai_modelverse.models.ListUnpaidOrdersRequest;
import cn.ucloud.uai_modelverse.models.ListUnpaidOrdersResponse;
import cn.ucloud.uai_modelverse.models.UpdateUMInferAPIKeyRequest;
import cn.ucloud.uai_modelverse.models.UpdateUMInferAPIKeyResponse;

/** This client is used to call actions of **UAIModelverse** service */
public interface UAIModelverseClientInterface extends Client {

    /**
     * CreateUMInferAPIKey - 创建apikey
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUMInferAPIKeyResponse createUMInferAPIKey(CreateUMInferAPIKeyRequest request)
            throws UCloudException;

    /**
     * DeleteUMInferAPIKey - 删除apikey
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUMInferAPIKeyResponse deleteUMInferAPIKey(DeleteUMInferAPIKeyRequest request)
            throws UCloudException;

    /**
     * DownloadListPaidOrders - 下载已完成订单明细
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DownloadListPaidOrdersResponse downloadListPaidOrders(
            DownloadListPaidOrdersRequest request) throws UCloudException;

    /**
     * DownloadListUnpaidOrders - 下载欠费订单明细
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DownloadListUnpaidOrdersResponse downloadListUnpaidOrders(
            DownloadListUnpaidOrdersRequest request) throws UCloudException;

    /**
     * DownloadOrderSummary - 下载订单汇总
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DownloadOrderSummaryResponse downloadOrderSummary(DownloadOrderSummaryRequest request)
            throws UCloudException;

    /**
     * GetFilterOptions - 查询筛选选项
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetFilterOptionsResponse getFilterOptions(GetFilterOptionsRequest request)
            throws UCloudException;

    /**
     * GetOrderAmount - 查询订单汇总统计
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetOrderAmountResponse getOrderAmount(GetOrderAmountRequest request)
            throws UCloudException;

    /**
     * GetUMInferAPIModel - 获取api模型列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUMInferAPIModelResponse getUMInferAPIModel(GetUMInferAPIModelRequest request)
            throws UCloudException;

    /**
     * GetUMInferTokenUsage - 获取token使用量
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUMInferTokenUsageResponse getUMInferTokenUsage(GetUMInferTokenUsageRequest request)
            throws UCloudException;

    /**
     * ListPaidOrderSummary - 查询已完成订单汇总
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListPaidOrderSummaryResponse listPaidOrderSummary(ListPaidOrderSummaryRequest request)
            throws UCloudException;

    /**
     * ListPaidOrders - 查询已完成订单明细
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListPaidOrdersResponse listPaidOrders(ListPaidOrdersRequest request)
            throws UCloudException;

    /**
     * ListUFSquareModel - 查询模型广场数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUFSquareModelResponse listUFSquareModel(ListUFSquareModelRequest request)
            throws UCloudException;

    /**
     * ListUMInferAPIKey - 列表查询APIKey
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUMInferAPIKeyResponse listUMInferAPIKey(ListUMInferAPIKeyRequest request)
            throws UCloudException;

    /**
     * ListUnpaidOrderSummary - 查询欠费订单汇总
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUnpaidOrderSummaryResponse listUnpaidOrderSummary(
            ListUnpaidOrderSummaryRequest request) throws UCloudException;

    /**
     * ListUnpaidOrders - 查询欠费订单明细
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUnpaidOrdersResponse listUnpaidOrders(ListUnpaidOrdersRequest request)
            throws UCloudException;

    /**
     * UpdateUMInferAPIKey - 更新apikey
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUMInferAPIKeyResponse updateUMInferAPIKey(UpdateUMInferAPIKeyRequest request)
            throws UCloudException;
}
