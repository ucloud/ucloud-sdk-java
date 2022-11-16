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
package cn.ucloud.uvms.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
        
        
        
import cn.ucloud.uvms.models.SendUVMSMessageRequest;
import cn.ucloud.uvms.models.SendUVMSMessageResponse;

/**
 * This client is used to call actions of **UVMS** service
 */
public class UVMSClient extends DefaultClient implements UVMSClientInterface {
    public UVMSClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * SendUVMSMessage - 发送语音消息
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public SendUVMSMessageResponse sendUVMSMessage(SendUVMSMessageRequest request) throws UCloudException {
            request.setAction("SendUVMSMessage");
            return (SendUVMSMessageResponse) this.invoke(request, SendUVMSMessageResponse.class);
        }
}
