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
package cn.ucloud.common.middleware;

import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.common.request.Request;
import cn.ucloud.common.response.Response;

public interface Middleware {
    /**
     * Handle the context includes request object
     *
     * @param context Context of invoking lifecycle
     * @return request object that modified
     * @throws UCloudException the exception during invoking
     */
    Request handleRequest(Context context) throws UCloudException;

    /**
     * Handle the context includes response object
     *
     * @param context Context of invoking lifecycle
     * @return response object that modified
     * @throws UCloudException the exception during invoking
     */
    Response handleResponse(Context context) throws UCloudException;

    /**
     * Handle the context includes exception object
     *
     * @param context Context of invoking lifecycle
     * @throws UCloudException the exception during invoking
     */
    void handleException(Context context) throws UCloudException;
}
