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
package cn.ucloud.pathx.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class UnBindPathXSSLRequest extends Request {

    /** 项目ID。 请参考[GetProjectList接口](../summary/get_project_list.html) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** UGA实例ID。 */
    @NotEmpty
    @UCloudParam("UGAId")
    private String ugaId;

    /** SSL证书ID。 */
    @NotEmpty
    @UCloudParam("SSLId")
    private String sslId;

    /** 解绑SSL证书的HTTPS端口。Port.0 Port.1格式 端口错误则解绑失败。 */
    @NotEmpty
    @UCloudParam("Port")
    private List<Integer> port;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUGAId() {
        return ugaId;
    }

    public void setUGAId(String ugaId) {
        this.ugaId = ugaId;
    }

    public String getSSLId() {
        return sslId;
    }

    public void setSSLId(String sslId) {
        this.sslId = sslId;
    }

    public List<Integer> getPort() {
        return port;
    }

    public void setPort(List<Integer> port) {
        this.port = port;
    }
}
