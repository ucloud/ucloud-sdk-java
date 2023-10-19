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

package cn.ucloud.uai_modelverse.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class QueryMVLLMListRequest extends Request {

    
        
    /**
     * 语言模型ID (缺省则返回所有模型列表)
     */
    @UCloudParam("LLMID")
    private String llmid;
        
    
    public String getLLMID() {
        return llmid;
    }

    public void setLLMID(String llmid) {
        this.llmid = llmid;
    }
    
}









