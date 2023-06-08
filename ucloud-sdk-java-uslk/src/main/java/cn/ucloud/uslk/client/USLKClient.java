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
package cn.ucloud.uslk.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
        
        
        
import cn.ucloud.uslk.models.BatchCreateUSLKShortLinkRequest;
import cn.ucloud.uslk.models.BatchCreateUSLKShortLinkResponse;
        
        
        
import cn.ucloud.uslk.models.CreateUSLKLongLinkRequest;
import cn.ucloud.uslk.models.CreateUSLKLongLinkResponse;
        
        
        
import cn.ucloud.uslk.models.CreateUSLKScenarioRequest;
import cn.ucloud.uslk.models.CreateUSLKScenarioResponse;
        
        
        
import cn.ucloud.uslk.models.CreateUSLKShortLinkRequest;
import cn.ucloud.uslk.models.CreateUSLKShortLinkResponse;
        
        
        
import cn.ucloud.uslk.models.DescribeUSLKRedirectRecordsRequest;
import cn.ucloud.uslk.models.DescribeUSLKRedirectRecordsResponse;
        
        
        
import cn.ucloud.uslk.models.DescribeUSLKShortLinkListRequest;
import cn.ucloud.uslk.models.DescribeUSLKShortLinkListResponse;

/**
 * This client is used to call actions of **USLK** service
 */
public class USLKClient extends DefaultClient implements USLKClientInterface {
    public USLKClient(Config config, Credential credential) {
        super(config, credential);
    }
        
        
        
        
        
        
        /**
         * BatchCreateUSLKShortLink - 批量创建短链接【免审】
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public BatchCreateUSLKShortLinkResponse batchCreateUSLKShortLink(BatchCreateUSLKShortLinkRequest request) throws UCloudException {
            request.setAction("BatchCreateUSLKShortLink");
            return (BatchCreateUSLKShortLinkResponse) this.invoke(request, BatchCreateUSLKShortLinkResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateUSLKLongLink - 报备长链接
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateUSLKLongLinkResponse createUSLKLongLink(CreateUSLKLongLinkRequest request) throws UCloudException {
            request.setAction("CreateUSLKLongLink");
            return (CreateUSLKLongLinkResponse) this.invoke(request, CreateUSLKLongLinkResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateUSLKScenario - 创建场景
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateUSLKScenarioResponse createUSLKScenario(CreateUSLKScenarioRequest request) throws UCloudException {
            request.setAction("CreateUSLKScenario");
            return (CreateUSLKScenarioResponse) this.invoke(request, CreateUSLKScenarioResponse.class);
        }
        
        
        
        
        
        
        /**
         * CreateUSLKShortLink - 创建短链接
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public CreateUSLKShortLinkResponse createUSLKShortLink(CreateUSLKShortLinkRequest request) throws UCloudException {
            request.setAction("CreateUSLKShortLink");
            return (CreateUSLKShortLinkResponse) this.invoke(request, CreateUSLKShortLinkResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeUSLKRedirectRecords - 查询短链接访问明细列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeUSLKRedirectRecordsResponse describeUSLKRedirectRecords(DescribeUSLKRedirectRecordsRequest request) throws UCloudException {
            request.setAction("DescribeUSLKRedirectRecords");
            return (DescribeUSLKRedirectRecordsResponse) this.invoke(request, DescribeUSLKRedirectRecordsResponse.class);
        }
        
        
        
        
        
        
        /**
         * DescribeUSLKShortLinkList - 查询短链接列表
         *
         * @param request Request object
         * @throws UCloudException Exception
         */
        public DescribeUSLKShortLinkListResponse describeUSLKShortLinkList(DescribeUSLKShortLinkListRequest request) throws UCloudException {
            request.setAction("DescribeUSLKShortLinkList");
            return (DescribeUSLKShortLinkListResponse) this.invoke(request, DescribeUSLKShortLinkListResponse.class);
        }
}
