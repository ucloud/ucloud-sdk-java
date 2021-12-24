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
package cn.ucloud.uaccount.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class InviteSubaccountRequest extends Request {

    /** 受邀成员邮箱地址，不得重复 */
    @NotEmpty
    @UCloudParam("UserEmail")
    private String userEmail;

    /** 受邀成员手机号码 */
    @NotEmpty
    @UCloudParam("UserPhone")
    private String userPhone;

    /** 受邀成员姓名 */
    @NotEmpty
    @UCloudParam("UserName")
    private String userName;

    /** 是否有财务权限(true:是,false:否,默认为否) */
    @NotEmpty
    @UCloudParam("IsFinance")
    private String isFinance;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIsFinance() {
        return isFinance;
    }

    public void setIsFinance(String isFinance) {
        this.isFinance = isFinance;
    }
}
