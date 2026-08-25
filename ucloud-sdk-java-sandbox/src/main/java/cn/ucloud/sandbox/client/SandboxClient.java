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
package cn.ucloud.sandbox.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.sandbox.models.CheckSandboxCustomDomainRequest;
import cn.ucloud.sandbox.models.CheckSandboxCustomDomainResponse;
import cn.ucloud.sandbox.models.CreateSandboxSiteRequest;
import cn.ucloud.sandbox.models.CreateSandboxSiteResponse;
import cn.ucloud.sandbox.models.DeleteSandboxSiteRequest;
import cn.ucloud.sandbox.models.DeleteSandboxSiteResponse;
import cn.ucloud.sandbox.models.GetSandboxSiteRequest;
import cn.ucloud.sandbox.models.GetSandboxSiteResponse;
import cn.ucloud.sandbox.models.ListSandboxSitesRequest;
import cn.ucloud.sandbox.models.ListSandboxSitesResponse;
import cn.ucloud.sandbox.models.UpdateSandboxSiteCustomDomainRequest;
import cn.ucloud.sandbox.models.UpdateSandboxSiteCustomDomainResponse;
import cn.ucloud.sandbox.models.UpdateSandboxSiteRequest;
import cn.ucloud.sandbox.models.UpdateSandboxSiteResponse;

/** This client is used to call actions of **Sandbox** service */
public class SandboxClient extends DefaultClient implements SandboxClientInterface {
    public SandboxClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CheckSandboxCustomDomain - 检查自定义域名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CheckSandboxCustomDomainResponse checkSandboxCustomDomain(
            CheckSandboxCustomDomainRequest request) throws UCloudException {
        request.setAction("CheckSandboxCustomDomain");
        return (CheckSandboxCustomDomainResponse)
                this.invoke(request, CheckSandboxCustomDomainResponse.class);
    }

    /**
     * CreateSandboxSite - 创建站点空间
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateSandboxSiteResponse createSandboxSite(CreateSandboxSiteRequest request)
            throws UCloudException {
        request.setAction("CreateSandboxSite");
        return (CreateSandboxSiteResponse) this.invoke(request, CreateSandboxSiteResponse.class);
    }

    /**
     * DeleteSandboxSite - 删除站点空间
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteSandboxSiteResponse deleteSandboxSite(DeleteSandboxSiteRequest request)
            throws UCloudException {
        request.setAction("DeleteSandboxSite");
        return (DeleteSandboxSiteResponse) this.invoke(request, DeleteSandboxSiteResponse.class);
    }

    /**
     * GetSandboxSite - 获取沙箱站点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetSandboxSiteResponse getSandboxSite(GetSandboxSiteRequest request)
            throws UCloudException {
        request.setAction("GetSandboxSite");
        return (GetSandboxSiteResponse) this.invoke(request, GetSandboxSiteResponse.class);
    }

    /**
     * ListSandboxSites - 列出站点空间
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListSandboxSitesResponse listSandboxSites(ListSandboxSitesRequest request)
            throws UCloudException {
        request.setAction("ListSandboxSites");
        return (ListSandboxSitesResponse) this.invoke(request, ListSandboxSitesResponse.class);
    }

    /**
     * UpdateSandboxSite - 更新站点空间
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateSandboxSiteResponse updateSandboxSite(UpdateSandboxSiteRequest request)
            throws UCloudException {
        request.setAction("UpdateSandboxSite");
        return (UpdateSandboxSiteResponse) this.invoke(request, UpdateSandboxSiteResponse.class);
    }

    /**
     * UpdateSandboxSiteCustomDomain - 更新沙箱站点自定义域名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateSandboxSiteCustomDomainResponse updateSandboxSiteCustomDomain(
            UpdateSandboxSiteCustomDomainRequest request) throws UCloudException {
        request.setAction("UpdateSandboxSiteCustomDomain");
        return (UpdateSandboxSiteCustomDomainResponse)
                this.invoke(request, UpdateSandboxSiteCustomDomainResponse.class);
    }
}
