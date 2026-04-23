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
package cn.ucloud.uai_modelverse.models;


import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class GetUMInferServiceRequest extends Request {

    /** 推理服务id */
    @UCloudParam("UminferID")
    private String uminferID;

    /** offset */
    @UCloudParam("Offset")
    private String offset;

    /** limit */
    @UCloudParam("Limit")
    private String limit;

    /** 默认preDeploy,可获取DeepSeek Key */
    @UCloudParam("UminferType")
    private String uminferType;

    public String getUminferID() {
        return uminferID;
    }

    public void setUminferID(String uminferID) {
        this.uminferID = uminferID;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getUminferType() {
        return uminferType;
    }

    public void setUminferType(String uminferType) {
        this.uminferType = uminferType;
    }
}
