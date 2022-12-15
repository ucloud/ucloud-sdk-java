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

import cn.ucloud.common.client.Client;
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
public interface USLKClientInterface extends Client {
        
        
        
        
        
        
    /**
     * BatchCreateUSLKShortLink - 批量创建短链接【免审】
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BatchCreateUSLKShortLinkResponse batchCreateUSLKShortLink(BatchCreateUSLKShortLinkRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUSLKLongLink - 报备长链接
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUSLKLongLinkResponse createUSLKLongLink(CreateUSLKLongLinkRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUSLKScenario - 创建场景
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUSLKScenarioResponse createUSLKScenario(CreateUSLKScenarioRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * CreateUSLKShortLink - 创建短链接
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUSLKShortLinkResponse createUSLKShortLink(CreateUSLKShortLinkRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUSLKRedirectRecords - 查询短链接访问明细列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUSLKRedirectRecordsResponse describeUSLKRedirectRecords(DescribeUSLKRedirectRecordsRequest request) throws UCloudException;
        
        
        
        
        
        
    /**
     * DescribeUSLKShortLinkList - 查询短链接列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUSLKShortLinkListResponse describeUSLKShortLinkList(DescribeUSLKShortLinkListRequest request) throws UCloudException;
}
