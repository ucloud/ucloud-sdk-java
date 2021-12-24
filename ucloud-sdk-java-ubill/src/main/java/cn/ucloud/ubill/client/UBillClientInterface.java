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

/** This client is used to call actions of **UBill** service */
public interface UBillClientInterface extends Client {

    /**
     * GetBalance - 获取账户余额
     *
     * <p>See also: https://docs.ucloud.cn/api/ubill-api/GetBalance
     */
    public GetBalanceResponse getBalance(GetBalanceRequest request) throws UCloudException;

    /**
     * GetBillDataFileUrl - 生成账单数据文件下载的 url
     *
     * <p>See also: https://docs.ucloud.cn/api/ubill-api/GetBillDataFileUrl
     */
    public GetBillDataFileUrlResponse getBillDataFileUrl(GetBillDataFileUrlRequest request)
            throws UCloudException;
}
