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
package cn.ucloud.common.middlewares;

import cn.ucloud.common.config.Config;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.common.middleware.BaseMiddleware;
import cn.ucloud.common.middleware.Context;
import cn.ucloud.common.middleware.Middleware;
import cn.ucloud.common.request.Request;

/** ValidationMiddleware is a middleware to inject common configuration */
public class ValidationMiddleware extends BaseMiddleware implements Middleware {

    @Override
    public Request handleRequest(Context context) throws UCloudException {
        Config config = context.getConfig();
        Request request = context.getRequest();
        if (request.loadMaxRetries() == null) {
            request.withMaxRetries(config.getMaxRetries());
        }
        if (request.loadTimeout() == null) {
            request.withTimeout(config.getTimeout() * 1000);
        }
        if (request.getRegion() == null) {
            request.setRegion(config.getRegion());
        }
        if (request.getProjectId() == null) {
            request.setProjectId(config.getProjectId());
        }
        return request;
    }
}
