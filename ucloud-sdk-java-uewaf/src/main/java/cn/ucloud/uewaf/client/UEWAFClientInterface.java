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
package cn.ucloud.uewaf.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uewaf.models.AddAntiCCRuleRequest;
import cn.ucloud.uewaf.models.AddAntiCCRuleResponse;
import cn.ucloud.uewaf.models.AddAssurancePageRequest;
import cn.ucloud.uewaf.models.AddAssurancePageResponse;
import cn.ucloud.uewaf.models.AddAutoWafDomainBlackListRequest;
import cn.ucloud.uewaf.models.AddAutoWafDomainBlackListResponse;
import cn.ucloud.uewaf.models.AddWafDomainBlackListRequest;
import cn.ucloud.uewaf.models.AddWafDomainBlackListResponse;
import cn.ucloud.uewaf.models.AddWafDomainCertificateInfoRequest;
import cn.ucloud.uewaf.models.AddWafDomainCertificateInfoResponse;
import cn.ucloud.uewaf.models.AddWafDomainHostInfoRequest;
import cn.ucloud.uewaf.models.AddWafDomainHostInfoResponse;
import cn.ucloud.uewaf.models.AddWafDomainWhiteListRequest;
import cn.ucloud.uewaf.models.AddWafDomainWhiteListResponse;
import cn.ucloud.uewaf.models.AddWafProtectionRuleInfoRequest;
import cn.ucloud.uewaf.models.AddWafProtectionRuleInfoResponse;
import cn.ucloud.uewaf.models.AddWafRegionBlockRuleRequest;
import cn.ucloud.uewaf.models.AddWafRegionBlockRuleResponse;
import cn.ucloud.uewaf.models.CheckWafMenuSettingOverflowRequest;
import cn.ucloud.uewaf.models.CheckWafMenuSettingOverflowResponse;
import cn.ucloud.uewaf.models.CopyWafDomainRulesRequest;
import cn.ucloud.uewaf.models.CopyWafDomainRulesResponse;
import cn.ucloud.uewaf.models.DeleteAntiCCRuleRequest;
import cn.ucloud.uewaf.models.DeleteAntiCCRuleResponse;
import cn.ucloud.uewaf.models.DeleteAssurancePageRequest;
import cn.ucloud.uewaf.models.DeleteAssurancePageResponse;
import cn.ucloud.uewaf.models.DeleteAutoWafDomainBlackListRequest;
import cn.ucloud.uewaf.models.DeleteAutoWafDomainBlackListResponse;
import cn.ucloud.uewaf.models.DeleteWafDomainBlackListRequest;
import cn.ucloud.uewaf.models.DeleteWafDomainBlackListResponse;
import cn.ucloud.uewaf.models.DeleteWafDomainCertificateInfoRequest;
import cn.ucloud.uewaf.models.DeleteWafDomainCertificateInfoResponse;
import cn.ucloud.uewaf.models.DeleteWafDomainHostInfoRequest;
import cn.ucloud.uewaf.models.DeleteWafDomainHostInfoResponse;
import cn.ucloud.uewaf.models.DeleteWafDomainWhiteListRequest;
import cn.ucloud.uewaf.models.DeleteWafDomainWhiteListResponse;
import cn.ucloud.uewaf.models.DeleteWafProtectionRuleInfoRequest;
import cn.ucloud.uewaf.models.DeleteWafProtectionRuleInfoResponse;
import cn.ucloud.uewaf.models.DeleteWafRegionBlockRuleRequest;
import cn.ucloud.uewaf.models.DeleteWafRegionBlockRuleResponse;
import cn.ucloud.uewaf.models.DeleteWafResponseFilterRequest;
import cn.ucloud.uewaf.models.DeleteWafResponseFilterResponse;
import cn.ucloud.uewaf.models.DescribeAntiCCRulesRequest;
import cn.ucloud.uewaf.models.DescribeAntiCCRulesResponse;
import cn.ucloud.uewaf.models.DescribeAssurancePagesRequest;
import cn.ucloud.uewaf.models.DescribeAssurancePagesResponse;
import cn.ucloud.uewaf.models.DescribeAutoWafDomainBlackListRequest;
import cn.ucloud.uewaf.models.DescribeAutoWafDomainBlackListResponse;
import cn.ucloud.uewaf.models.DescribeWafAttackDetailListInfoRequest;
import cn.ucloud.uewaf.models.DescribeWafAttackDetailListInfoResponse;
import cn.ucloud.uewaf.models.DescribeWafAttackFalseAlarmListInfoRequest;
import cn.ucloud.uewaf.models.DescribeWafAttackFalseAlarmListInfoResponse;
import cn.ucloud.uewaf.models.DescribeWafDomainBlackListRequest;
import cn.ucloud.uewaf.models.DescribeWafDomainBlackListResponse;
import cn.ucloud.uewaf.models.DescribeWafDomainCertificateInfoRequest;
import cn.ucloud.uewaf.models.DescribeWafDomainCertificateInfoResponse;
import cn.ucloud.uewaf.models.DescribeWafDomainHostInfoRequest;
import cn.ucloud.uewaf.models.DescribeWafDomainHostInfoResponse;
import cn.ucloud.uewaf.models.DescribeWafDomainWhiteListRequest;
import cn.ucloud.uewaf.models.DescribeWafDomainWhiteListResponse;
import cn.ucloud.uewaf.models.DescribeWafProtectionSummaryInfoRequest;
import cn.ucloud.uewaf.models.DescribeWafProtectionSummaryInfoResponse;
import cn.ucloud.uewaf.models.DescribeWafResponseFilterRequest;
import cn.ucloud.uewaf.models.DescribeWafResponseFilterResponse;
import cn.ucloud.uewaf.models.DescribeWafSystemRulesRequest;
import cn.ucloud.uewaf.models.DescribeWafSystemRulesResponse;
import cn.ucloud.uewaf.models.DescribeWafUserTransactionInfoRequest;
import cn.ucloud.uewaf.models.DescribeWafUserTransactionInfoResponse;
import cn.ucloud.uewaf.models.DownloadWAFAccessLogRequest;
import cn.ucloud.uewaf.models.DownloadWAFAccessLogResponse;
import cn.ucloud.uewaf.models.GetWafRegionBlockRuleRequest;
import cn.ucloud.uewaf.models.GetWafRegionBlockRuleResponse;
import cn.ucloud.uewaf.models.ModifyAntiCCRuleRequest;
import cn.ucloud.uewaf.models.ModifyAntiCCRuleResponse;
import cn.ucloud.uewaf.models.ModifyAntiCCStateRequest;
import cn.ucloud.uewaf.models.ModifyAntiCCStateResponse;
import cn.ucloud.uewaf.models.ModifyAssurancePageRequest;
import cn.ucloud.uewaf.models.ModifyAssurancePageResponse;
import cn.ucloud.uewaf.models.ModifyAutoWafDomainBlackListRequest;
import cn.ucloud.uewaf.models.ModifyAutoWafDomainBlackListResponse;
import cn.ucloud.uewaf.models.ModifyGlobalAssuranceStateRequest;
import cn.ucloud.uewaf.models.ModifyGlobalAssuranceStateResponse;
import cn.ucloud.uewaf.models.ModifyWafAttackFalseAlarmStatusRequest;
import cn.ucloud.uewaf.models.ModifyWafAttackFalseAlarmStatusResponse;
import cn.ucloud.uewaf.models.ModifyWafDomainBlackListRequest;
import cn.ucloud.uewaf.models.ModifyWafDomainBlackListResponse;
import cn.ucloud.uewaf.models.ModifyWafDomainHostInfoRequest;
import cn.ucloud.uewaf.models.ModifyWafDomainHostInfoResponse;
import cn.ucloud.uewaf.models.ModifyWafDomainWhiteListRequest;
import cn.ucloud.uewaf.models.ModifyWafDomainWhiteListResponse;
import cn.ucloud.uewaf.models.ModifyWafProtectionCustomerInfoRequest;
import cn.ucloud.uewaf.models.ModifyWafProtectionCustomerInfoResponse;
import cn.ucloud.uewaf.models.ModifyWafProtectionModeInfoRequest;
import cn.ucloud.uewaf.models.ModifyWafProtectionModeInfoResponse;
import cn.ucloud.uewaf.models.ModifyWafProtectionPriorityInfoRequest;
import cn.ucloud.uewaf.models.ModifyWafProtectionPriorityInfoResponse;
import cn.ucloud.uewaf.models.ModifyWafProtectionPriorityPoleInfoRequest;
import cn.ucloud.uewaf.models.ModifyWafProtectionPriorityPoleInfoResponse;
import cn.ucloud.uewaf.models.ModifyWafProtectionSystemInfoRequest;
import cn.ucloud.uewaf.models.ModifyWafProtectionSystemInfoResponse;
import cn.ucloud.uewaf.models.ModifyWafRegionBlockRuleRequest;
import cn.ucloud.uewaf.models.ModifyWafRegionBlockRuleResponse;
import cn.ucloud.uewaf.models.ModifyWafResponseFilterRequest;
import cn.ucloud.uewaf.models.ModifyWafResponseFilterResponse;
import cn.ucloud.uewaf.models.UpdateAssurePageCacheRequest;
import cn.ucloud.uewaf.models.UpdateAssurePageCacheResponse;

/** This client is used to call actions of **UEWAF** service */
public interface UEWAFClientInterface extends Client {

    /**
     * AddAntiCCRule - 添加CC防御规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddAntiCCRuleResponse addAntiCCRule(AddAntiCCRuleRequest request) throws UCloudException;

    /**
     * AddAssurancePage - 添加防篡改页面
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddAssurancePageResponse addAssurancePage(AddAssurancePageRequest request)
            throws UCloudException;

    /**
     * AddAutoWafDomainBlackList - 创建自动拦截策略接口
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddAutoWafDomainBlackListResponse addAutoWafDomainBlackList(
            AddAutoWafDomainBlackListRequest request) throws UCloudException;

    /**
     * AddWafDomainBlackList - 添加域名黑名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddWafDomainBlackListResponse addWafDomainBlackList(AddWafDomainBlackListRequest request)
            throws UCloudException;

    /**
     * AddWafDomainCertificateInfo - 添加SSL证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddWafDomainCertificateInfoResponse addWafDomainCertificateInfo(
            AddWafDomainCertificateInfoRequest request) throws UCloudException;

    /**
     * AddWafDomainHostInfo - 新增防护域名配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddWafDomainHostInfoResponse addWafDomainHostInfo(AddWafDomainHostInfoRequest request)
            throws UCloudException;

    /**
     * AddWafDomainWhiteList - 添加域名白名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddWafDomainWhiteListResponse addWafDomainWhiteList(AddWafDomainWhiteListRequest request)
            throws UCloudException;

    /**
     * AddWafProtectionRuleInfo - 添加WAF防护规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddWafProtectionRuleInfoResponse addWafProtectionRuleInfo(
            AddWafProtectionRuleInfoRequest request) throws UCloudException;

    /**
     * AddWafRegionBlockRule - 添加WAF区域IP封堵规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddWafRegionBlockRuleResponse addWafRegionBlockRule(AddWafRegionBlockRuleRequest request)
            throws UCloudException;

    /**
     * CheckWafMenuSettingOverflow - 校验域名和规则数是否超出指定套餐的限制
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CheckWafMenuSettingOverflowResponse checkWafMenuSettingOverflow(
            CheckWafMenuSettingOverflowRequest request) throws UCloudException;

    /**
     * CopyWafDomainRules - 批量复制WAF规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CopyWafDomainRulesResponse copyWafDomainRules(CopyWafDomainRulesRequest request)
            throws UCloudException;

    /**
     * DeleteAntiCCRule - 删除CC防御规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteAntiCCRuleResponse deleteAntiCCRule(DeleteAntiCCRuleRequest request)
            throws UCloudException;

    /**
     * DeleteAssurancePage - 删除防篡改页面
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteAssurancePageResponse deleteAssurancePage(DeleteAssurancePageRequest request)
            throws UCloudException;

    /**
     * DeleteAutoWafDomainBlackList - 删除自动添加黑名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteAutoWafDomainBlackListResponse deleteAutoWafDomainBlackList(
            DeleteAutoWafDomainBlackListRequest request) throws UCloudException;

    /**
     * DeleteWafDomainBlackList - 删除域名黑名单记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteWafDomainBlackListResponse deleteWafDomainBlackList(
            DeleteWafDomainBlackListRequest request) throws UCloudException;

    /**
     * DeleteWafDomainCertificateInfo - 删除指定域名的ssl证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteWafDomainCertificateInfoResponse deleteWafDomainCertificateInfo(
            DeleteWafDomainCertificateInfoRequest request) throws UCloudException;

    /**
     * DeleteWafDomainHostInfo - 删除WAF防御域名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteWafDomainHostInfoResponse deleteWafDomainHostInfo(
            DeleteWafDomainHostInfoRequest request) throws UCloudException;

    /**
     * DeleteWafDomainWhiteList - 删除域名白名单记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteWafDomainWhiteListResponse deleteWafDomainWhiteList(
            DeleteWafDomainWhiteListRequest request) throws UCloudException;

    /**
     * DeleteWafProtectionRuleInfo - 删除WAF防护规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteWafProtectionRuleInfoResponse deleteWafProtectionRuleInfo(
            DeleteWafProtectionRuleInfoRequest request) throws UCloudException;

    /**
     * DeleteWafRegionBlockRule - 删除地域IP封堵规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteWafRegionBlockRuleResponse deleteWafRegionBlockRule(
            DeleteWafRegionBlockRuleRequest request) throws UCloudException;

    /**
     * DeleteWafResponseFilter - 删除信息安全过滤规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteWafResponseFilterResponse deleteWafResponseFilter(
            DeleteWafResponseFilterRequest request) throws UCloudException;

    /**
     * DescribeAntiCCRules - CC防御规则列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeAntiCCRulesResponse describeAntiCCRules(DescribeAntiCCRulesRequest request)
            throws UCloudException;

    /**
     * DescribeAssurancePages - 获取防篡改页面列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeAssurancePagesResponse describeAssurancePages(
            DescribeAssurancePagesRequest request) throws UCloudException;

    /**
     * DescribeAutoWafDomainBlackList - 查询自动添加黑名单策略
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeAutoWafDomainBlackListResponse describeAutoWafDomainBlackList(
            DescribeAutoWafDomainBlackListRequest request) throws UCloudException;

    /**
     * DescribeWafAttackDetailListInfo - 查询WAF攻击详情
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeWafAttackDetailListInfoResponse describeWafAttackDetailListInfo(
            DescribeWafAttackDetailListInfoRequest request) throws UCloudException;

    /**
     * DescribeWafAttackFalseAlarmListInfo - 获取误报记录列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeWafAttackFalseAlarmListInfoResponse describeWafAttackFalseAlarmListInfo(
            DescribeWafAttackFalseAlarmListInfoRequest request) throws UCloudException;

    /**
     * DescribeWafDomainBlackList - 获取域名黑名单列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeWafDomainBlackListResponse describeWafDomainBlackList(
            DescribeWafDomainBlackListRequest request) throws UCloudException;

    /**
     * DescribeWafDomainCertificateInfo - 显示域名对应的证书
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeWafDomainCertificateInfoResponse describeWafDomainCertificateInfo(
            DescribeWafDomainCertificateInfoRequest request) throws UCloudException;

    /**
     * DescribeWafDomainHostInfo - 获取WAF防护域名列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeWafDomainHostInfoResponse describeWafDomainHostInfo(
            DescribeWafDomainHostInfoRequest request) throws UCloudException;

    /**
     * DescribeWafDomainWhiteList - 获取域名白名单列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeWafDomainWhiteListResponse describeWafDomainWhiteList(
            DescribeWafDomainWhiteListRequest request) throws UCloudException;

    /**
     * DescribeWafProtectionSummaryInfo - 获取防护规则列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeWafProtectionSummaryInfoResponse describeWafProtectionSummaryInfo(
            DescribeWafProtectionSummaryInfoRequest request) throws UCloudException;

    /**
     * DescribeWafResponseFilter - 查询信息安全过滤规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeWafResponseFilterResponse describeWafResponseFilter(
            DescribeWafResponseFilterRequest request) throws UCloudException;

    /**
     * DescribeWafSystemRules - 查询指定域名的系统默认规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeWafSystemRulesResponse describeWafSystemRules(
            DescribeWafSystemRulesRequest request) throws UCloudException;

    /**
     * DescribeWafUserTransactionInfo - 获取用户购买详细信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeWafUserTransactionInfoResponse describeWafUserTransactionInfo(
            DescribeWafUserTransactionInfoRequest request) throws UCloudException;

    /**
     * DownloadWAFAccessLog - 下载访问日志
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DownloadWAFAccessLogResponse downloadWAFAccessLog(DownloadWAFAccessLogRequest request)
            throws UCloudException;

    /**
     * GetWafRegionBlockRule - 查询区域IP封堵规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetWafRegionBlockRuleResponse getWafRegionBlockRule(GetWafRegionBlockRuleRequest request)
            throws UCloudException;

    /**
     * ModifyAntiCCRule - 修改CC防御规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyAntiCCRuleResponse modifyAntiCCRule(ModifyAntiCCRuleRequest request)
            throws UCloudException;

    /**
     * ModifyAntiCCState - 更改域名CC防御状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyAntiCCStateResponse modifyAntiCCState(ModifyAntiCCStateRequest request)
            throws UCloudException;

    /**
     * ModifyAssurancePage - 编辑防篡改页面
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyAssurancePageResponse modifyAssurancePage(ModifyAssurancePageRequest request)
            throws UCloudException;

    /**
     * ModifyAutoWafDomainBlackList - 修改自动拦截规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyAutoWafDomainBlackListResponse modifyAutoWafDomainBlackList(
            ModifyAutoWafDomainBlackListRequest request) throws UCloudException;

    /**
     * ModifyGlobalAssuranceState - 网页防篡改全局开关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyGlobalAssuranceStateResponse modifyGlobalAssuranceState(
            ModifyGlobalAssuranceStateRequest request) throws UCloudException;

    /**
     * ModifyWafAttackFalseAlarmStatus - 新的误报接口
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyWafAttackFalseAlarmStatusResponse modifyWafAttackFalseAlarmStatus(
            ModifyWafAttackFalseAlarmStatusRequest request) throws UCloudException;

    /**
     * ModifyWafDomainBlackList - 编辑域名黑名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyWafDomainBlackListResponse modifyWafDomainBlackList(
            ModifyWafDomainBlackListRequest request) throws UCloudException;

    /**
     * ModifyWafDomainHostInfo - 编辑防护域名信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyWafDomainHostInfoResponse modifyWafDomainHostInfo(
            ModifyWafDomainHostInfoRequest request) throws UCloudException;

    /**
     * ModifyWafDomainWhiteList - 编辑域名白名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyWafDomainWhiteListResponse modifyWafDomainWhiteList(
            ModifyWafDomainWhiteListRequest request) throws UCloudException;

    /**
     * ModifyWafProtectionCustomerInfo - 编辑自定义防护规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyWafProtectionCustomerInfoResponse modifyWafProtectionCustomerInfo(
            ModifyWafProtectionCustomerInfoRequest request) throws UCloudException;

    /**
     * ModifyWafProtectionModeInfo - 更改WAF工作模式
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyWafProtectionModeInfoResponse modifyWafProtectionModeInfo(
            ModifyWafProtectionModeInfoRequest request) throws UCloudException;

    /**
     * ModifyWafProtectionPriorityInfo - 修改防护规则优先级
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyWafProtectionPriorityInfoResponse modifyWafProtectionPriorityInfo(
            ModifyWafProtectionPriorityInfoRequest request) throws UCloudException;

    /**
     * ModifyWafProtectionPriorityPoleInfo - 调整防护规则优先级至最高或者最低
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyWafProtectionPriorityPoleInfoResponse modifyWafProtectionPriorityPoleInfo(
            ModifyWafProtectionPriorityPoleInfoRequest request) throws UCloudException;

    /**
     * ModifyWafProtectionSystemInfo - 修改用户系统规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyWafProtectionSystemInfoResponse modifyWafProtectionSystemInfo(
            ModifyWafProtectionSystemInfoRequest request) throws UCloudException;

    /**
     * ModifyWafRegionBlockRule - 修改地域IP封堵规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyWafRegionBlockRuleResponse modifyWafRegionBlockRule(
            ModifyWafRegionBlockRuleRequest request) throws UCloudException;

    /**
     * ModifyWafResponseFilter - 修改信息安全过滤规则
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyWafResponseFilterResponse modifyWafResponseFilter(
            ModifyWafResponseFilterRequest request) throws UCloudException;

    /**
     * UpdateAssurePageCache - 网页防篡改更新指定url的缓存
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateAssurePageCacheResponse updateAssurePageCache(UpdateAssurePageCacheRequest request)
            throws UCloudException;
}
