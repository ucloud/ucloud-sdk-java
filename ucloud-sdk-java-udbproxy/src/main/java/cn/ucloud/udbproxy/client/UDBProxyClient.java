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
package cn.ucloud.udbproxy.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
        
        
        
import cn.ucloud.udbproxy.models.ListUDBProxyClientRequest;
import cn.ucloud.udbproxy.models.ListUDBProxyClientResponse;

/**
 * This client is used to call actions of **UDBProxy** service
 */
public class UDBProxyClient extends DefaultClient implements UDBProxyClientInterface {
    public UDBProxyClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * ListUDBProxyClient - 查询代理客户端连接IP信息(实时）
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public ListUDBProxyClientResponse listUDBProxyClient(ListUDBProxyClientRequest request) throws UCloudException {
            request.setAction("ListUDBProxyClient");
            return (ListUDBProxyClientResponse) this.invoke(request, ListUDBProxyClientResponse.class);
        }
}
