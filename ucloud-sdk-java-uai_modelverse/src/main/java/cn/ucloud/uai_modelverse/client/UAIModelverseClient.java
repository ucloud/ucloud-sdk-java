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

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
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
import cn.ucloud.uai_modelverse.models.DownloadUMInferRequestLogRequest;
import cn.ucloud.uai_modelverse.models.DownloadUMInferRequestLogResponse;
import cn.ucloud.uai_modelverse.models.GetFilterOptionsRequest;
import cn.ucloud.uai_modelverse.models.GetFilterOptionsResponse;
import cn.ucloud.uai_modelverse.models.GetOrderAmountRequest;
import cn.ucloud.uai_modelverse.models.GetOrderAmountResponse;
import cn.ucloud.uai_modelverse.models.GetUFSquareModelDetailRequest;
import cn.ucloud.uai_modelverse.models.GetUFSquareModelDetailResponse;
import cn.ucloud.uai_modelverse.models.GetUFSquareModelPricesRequest;
import cn.ucloud.uai_modelverse.models.GetUFSquareModelPricesResponse;
import cn.ucloud.uai_modelverse.models.GetUMInferRequestLogDetailRequest;
import cn.ucloud.uai_modelverse.models.GetUMInferRequestLogDetailResponse;
import cn.ucloud.uai_modelverse.models.ListPaidOrderSummaryRequest;
import cn.ucloud.uai_modelverse.models.ListPaidOrderSummaryResponse;
import cn.ucloud.uai_modelverse.models.ListPaidOrdersRequest;
import cn.ucloud.uai_modelverse.models.ListPaidOrdersResponse;
import cn.ucloud.uai_modelverse.models.ListUFSquareModelFiltersAuthRequest;
import cn.ucloud.uai_modelverse.models.ListUFSquareModelFiltersAuthResponse;
import cn.ucloud.uai_modelverse.models.ListUFSquareModelRequest;
import cn.ucloud.uai_modelverse.models.ListUFSquareModelResponse;
import cn.ucloud.uai_modelverse.models.ListUMInferAPIKeyRequest;
import cn.ucloud.uai_modelverse.models.ListUMInferAPIKeyResponse;
import cn.ucloud.uai_modelverse.models.ListUMInferRequestLogsRequest;
import cn.ucloud.uai_modelverse.models.ListUMInferRequestLogsResponse;
import cn.ucloud.uai_modelverse.models.ListUnpaidOrderSummaryRequest;
import cn.ucloud.uai_modelverse.models.ListUnpaidOrderSummaryResponse;
import cn.ucloud.uai_modelverse.models.ListUnpaidOrdersRequest;
import cn.ucloud.uai_modelverse.models.ListUnpaidOrdersResponse;
import cn.ucloud.uai_modelverse.models.StartPayUnpaidOrdersRequest;
import cn.ucloud.uai_modelverse.models.StartPayUnpaidOrdersResponse;
import cn.ucloud.uai_modelverse.models.UpdateUMInferAPIKeyRequest;
import cn.ucloud.uai_modelverse.models.UpdateUMInferAPIKeyResponse;

/** This client is used to call actions of **UAIModelverse** service */
public class UAIModelverseClient extends DefaultClient implements UAIModelverseClientInterface {
    public UAIModelverseClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateUMInferAPIKey - 创建apikey
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUMInferAPIKeyResponse createUMInferAPIKey(CreateUMInferAPIKeyRequest request)
            throws UCloudException {
        request.setAction("CreateUMInferAPIKey");
        return (CreateUMInferAPIKeyResponse)
                this.invoke(request, CreateUMInferAPIKeyResponse.class);
    }

    /**
     * DeleteUMInferAPIKey - 删除apikey
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUMInferAPIKeyResponse deleteUMInferAPIKey(DeleteUMInferAPIKeyRequest request)
            throws UCloudException {
        request.setAction("DeleteUMInferAPIKey");
        return (DeleteUMInferAPIKeyResponse)
                this.invoke(request, DeleteUMInferAPIKeyResponse.class);
    }

    /**
     * DownloadListPaidOrders - 下载已完成订单明细
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DownloadListPaidOrdersResponse downloadListPaidOrders(
            DownloadListPaidOrdersRequest request) throws UCloudException {
        request.setAction("DownloadListPaidOrders");
        return (DownloadListPaidOrdersResponse)
                this.invoke(request, DownloadListPaidOrdersResponse.class);
    }

    /**
     * DownloadListUnpaidOrders - 下载欠费订单明细
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DownloadListUnpaidOrdersResponse downloadListUnpaidOrders(
            DownloadListUnpaidOrdersRequest request) throws UCloudException {
        request.setAction("DownloadListUnpaidOrders");
        return (DownloadListUnpaidOrdersResponse)
                this.invoke(request, DownloadListUnpaidOrdersResponse.class);
    }

    /**
     * DownloadOrderSummary - 下载订单汇总
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DownloadOrderSummaryResponse downloadOrderSummary(DownloadOrderSummaryRequest request)
            throws UCloudException {
        request.setAction("DownloadOrderSummary");
        return (DownloadOrderSummaryResponse)
                this.invoke(request, DownloadOrderSummaryResponse.class);
    }

    /**
     * DownloadUMInferRequestLog - 导出推理请求日志
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DownloadUMInferRequestLogResponse downloadUMInferRequestLog(
            DownloadUMInferRequestLogRequest request) throws UCloudException {
        request.setAction("DownloadUMInferRequestLog");
        return (DownloadUMInferRequestLogResponse)
                this.invoke(request, DownloadUMInferRequestLogResponse.class);
    }

    /**
     * GetFilterOptions - 查询订单筛选选项
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetFilterOptionsResponse getFilterOptions(GetFilterOptionsRequest request)
            throws UCloudException {
        request.setAction("GetFilterOptions");
        return (GetFilterOptionsResponse) this.invoke(request, GetFilterOptionsResponse.class);
    }

    /**
     * GetOrderAmount - 查询订单汇总统计
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetOrderAmountResponse getOrderAmount(GetOrderAmountRequest request)
            throws UCloudException {
        request.setAction("GetOrderAmount");
        return (GetOrderAmountResponse) this.invoke(request, GetOrderAmountResponse.class);
    }

    /**
     * GetUFSquareModelDetail - 获取广场模型详情
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFSquareModelDetailResponse getUFSquareModelDetail(
            GetUFSquareModelDetailRequest request) throws UCloudException {
        request.setAction("GetUFSquareModelDetail");
        return (GetUFSquareModelDetailResponse)
                this.invoke(request, GetUFSquareModelDetailResponse.class);
    }

    /**
     * GetUFSquareModelPrices - 批量查询模型价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUFSquareModelPricesResponse getUFSquareModelPrices(
            GetUFSquareModelPricesRequest request) throws UCloudException {
        request.setAction("GetUFSquareModelPrices");
        return (GetUFSquareModelPricesResponse)
                this.invoke(request, GetUFSquareModelPricesResponse.class);
    }

    /**
     * GetUMInferRequestLogDetail - 原始日志详情
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUMInferRequestLogDetailResponse getUMInferRequestLogDetail(
            GetUMInferRequestLogDetailRequest request) throws UCloudException {
        request.setAction("GetUMInferRequestLogDetail");
        return (GetUMInferRequestLogDetailResponse)
                this.invoke(request, GetUMInferRequestLogDetailResponse.class);
    }

    /**
     * ListPaidOrderSummary - 查询已完成订单汇总
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListPaidOrderSummaryResponse listPaidOrderSummary(ListPaidOrderSummaryRequest request)
            throws UCloudException {
        request.setAction("ListPaidOrderSummary");
        return (ListPaidOrderSummaryResponse)
                this.invoke(request, ListPaidOrderSummaryResponse.class);
    }

    /**
     * ListPaidOrders - 查询已完成订单明细
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListPaidOrdersResponse listPaidOrders(ListPaidOrdersRequest request)
            throws UCloudException {
        request.setAction("ListPaidOrders");
        return (ListPaidOrdersResponse) this.invoke(request, ListPaidOrdersResponse.class);
    }

    /**
     * ListUFSquareModel - 查询模型广场数据
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUFSquareModelResponse listUFSquareModel(ListUFSquareModelRequest request)
            throws UCloudException {
        request.setAction("ListUFSquareModel");
        return (ListUFSquareModelResponse) this.invoke(request, ListUFSquareModelResponse.class);
    }

    /**
     * ListUFSquareModelFiltersAuth - 查询模型广场过滤条件
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUFSquareModelFiltersAuthResponse listUFSquareModelFiltersAuth(
            ListUFSquareModelFiltersAuthRequest request) throws UCloudException {
        request.setAction("ListUFSquareModelFiltersAuth");
        return (ListUFSquareModelFiltersAuthResponse)
                this.invoke(request, ListUFSquareModelFiltersAuthResponse.class);
    }

    /**
     * ListUMInferAPIKey - 列表查询APIKey
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUMInferAPIKeyResponse listUMInferAPIKey(ListUMInferAPIKeyRequest request)
            throws UCloudException {
        request.setAction("ListUMInferAPIKey");
        return (ListUMInferAPIKeyResponse) this.invoke(request, ListUMInferAPIKeyResponse.class);
    }

    /**
     * ListUMInferRequestLogs - 日志明细列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUMInferRequestLogsResponse listUMInferRequestLogs(
            ListUMInferRequestLogsRequest request) throws UCloudException {
        request.setAction("ListUMInferRequestLogs");
        return (ListUMInferRequestLogsResponse)
                this.invoke(request, ListUMInferRequestLogsResponse.class);
    }

    /**
     * ListUnpaidOrderSummary - 查询欠费订单汇总
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUnpaidOrderSummaryResponse listUnpaidOrderSummary(
            ListUnpaidOrderSummaryRequest request) throws UCloudException {
        request.setAction("ListUnpaidOrderSummary");
        return (ListUnpaidOrderSummaryResponse)
                this.invoke(request, ListUnpaidOrderSummaryResponse.class);
    }

    /**
     * ListUnpaidOrders - 查询欠费订单明细
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUnpaidOrdersResponse listUnpaidOrders(ListUnpaidOrdersRequest request)
            throws UCloudException {
        request.setAction("ListUnpaidOrders");
        return (ListUnpaidOrdersResponse) this.invoke(request, ListUnpaidOrdersResponse.class);
    }

    /**
     * StartPayUnpaidOrders - 批量支付欠费订单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public StartPayUnpaidOrdersResponse startPayUnpaidOrders(StartPayUnpaidOrdersRequest request)
            throws UCloudException {
        request.setAction("StartPayUnpaidOrders");
        return (StartPayUnpaidOrdersResponse)
                this.invoke(request, StartPayUnpaidOrdersResponse.class);
    }

    /**
     * UpdateUMInferAPIKey - 更新apikey
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUMInferAPIKeyResponse updateUMInferAPIKey(UpdateUMInferAPIKeyRequest request)
            throws UCloudException {
        request.setAction("UpdateUMInferAPIKey");
        return (UpdateUMInferAPIKeyResponse)
                this.invoke(request, UpdateUMInferAPIKeyResponse.class);
    }
}
