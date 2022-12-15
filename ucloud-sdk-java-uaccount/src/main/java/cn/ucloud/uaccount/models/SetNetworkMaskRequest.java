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

package cn.ucloud.uaccount.models;

import java.util.List;


import cn.ucloud.common.request.Request;
import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;

public class SetNetworkMaskRequest extends Request {

    
        
    /**
     * 短信验证码
     */
    @NotEmpty
    @UCloudParam("Code")
    private String code;
        
    
        
    /**
     * API调用网络掩码，多个IP以英文逗号分隔。默认空字符串，不限制登录IP。
     */
    @UCloudParam("APINetworkMask")
    private String apiNetworkMask;
        
    
        
    /**
     * 登录网络掩码，多个IP以英文逗号分隔。默认空字符串，不限制登录IP。
     */
    @UCloudParam("LoginNetworkMask")
    private String loginNetworkMask;
        
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public String getAPINetworkMask() {
        return apiNetworkMask;
    }

    public void setAPINetworkMask(String apiNetworkMask) {
        this.apiNetworkMask = apiNetworkMask;
    }
    
    public String getLoginNetworkMask() {
        return loginNetworkMask;
    }

    public void setLoginNetworkMask(String loginNetworkMask) {
        this.loginNetworkMask = loginNetworkMask;
    }
    
}









