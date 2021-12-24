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

import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.common.middleware.BaseMiddleware;
import cn.ucloud.common.middleware.Context;
import cn.ucloud.common.middleware.Middleware;
import cn.ucloud.common.request.Request;

/** CredentialMiddleware is the middleware to calculate signature and inject into request */
public class CredentialMiddleware extends BaseMiddleware implements Middleware {

    @Override
    public Request handleRequest(Context context) throws UCloudException {
        Credential cred = context.getCredential();
        Request request = context.getRequest();
        return cred.sign(request);
    }
}
