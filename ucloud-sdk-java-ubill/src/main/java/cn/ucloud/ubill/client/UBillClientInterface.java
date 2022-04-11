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
package cn.ucloud.ubill.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ubill.models.GetBalanceRequest;
import cn.ucloud.ubill.models.GetBalanceResponse;
import cn.ucloud.ubill.models.GetBillDataFileUrlRequest;
import cn.ucloud.ubill.models.GetBillDataFileUrlResponse;
import cn.ucloud.ubill.models.ListUBillDetailRequest;
import cn.ucloud.ubill.models.ListUBillDetailResponse;
import cn.ucloud.ubill.models.ListUBillOverviewRequest;
import cn.ucloud.ubill.models.ListUBillOverviewResponse;

/** This client is used to call actions of **UBill** service */
public interface UBillClientInterface extends Client {

    /**
     * GetBalance - 获取账户余额
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetBalanceResponse getBalance(GetBalanceRequest request) throws UCloudException;

    /**
     * GetBillDataFileUrl - 生成账单数据文件下载的 url
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetBillDataFileUrlResponse getBillDataFileUrl(GetBillDataFileUrlRequest request)
            throws UCloudException;

    /**
     * ListUBillDetail - 获取账单明细
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUBillDetailResponse listUBillDetail(ListUBillDetailRequest request)
            throws UCloudException;

    /**
     * ListUBillOverview - 获取账单总览
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUBillOverviewResponse listUBillOverview(ListUBillOverviewRequest request)
            throws UCloudException;
}
