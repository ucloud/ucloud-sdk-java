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
package cn.ucloud.uhids.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.uhids.models.AddUHostSecBaseCheckWhiteRuleRequest;
import cn.ucloud.uhids.models.AddUHostSecBaseCheckWhiteRuleResponse;
import cn.ucloud.uhids.models.AddUHostSecWebRiskWhiteRuleRequest;
import cn.ucloud.uhids.models.AddUHostSecWebRiskWhiteRuleResponse;
import cn.ucloud.uhids.models.AddUhostsecCommonLoginIpRequest;
import cn.ucloud.uhids.models.AddUhostsecCommonLoginIpResponse;
import cn.ucloud.uhids.models.AddUhostsecCommonLoginLocationRequest;
import cn.ucloud.uhids.models.AddUhostsecCommonLoginLocationResponse;
import cn.ucloud.uhids.models.AgentOSStatisticRequest;
import cn.ucloud.uhids.models.AgentOSStatisticResponse;
import cn.ucloud.uhids.models.AgentWarnningStatisticRequest;
import cn.ucloud.uhids.models.AgentWarnningStatisticResponse;
import cn.ucloud.uhids.models.BuyBillPointRequest;
import cn.ucloud.uhids.models.BuyBillPointResponse;
import cn.ucloud.uhids.models.DelUHostSecBaseCheckWhiteRuleRequest;
import cn.ucloud.uhids.models.DelUHostSecBaseCheckWhiteRuleResponse;
import cn.ucloud.uhids.models.DelUHostSecCommonLoginRequest;
import cn.ucloud.uhids.models.DelUHostSecCommonLoginResponse;
import cn.ucloud.uhids.models.DelUHostSecWarningsRequest;
import cn.ucloud.uhids.models.DelUHostSecWarningsResponse;
import cn.ucloud.uhids.models.GetUHostsecAgentDeploymentStatisticsRequest;
import cn.ucloud.uhids.models.GetUHostsecAgentDeploymentStatisticsResponse;
import cn.ucloud.uhids.models.GetUHostsecAgentInstallScriptRequest;
import cn.ucloud.uhids.models.GetUHostsecAgentInstallScriptResponse;
import cn.ucloud.uhids.models.GetUHostsecBaseCheckRuleDescriptionRequest;
import cn.ucloud.uhids.models.GetUHostsecBaseCheckRuleDescriptionResponse;
import cn.ucloud.uhids.models.GetUhostsecAgentDeploymentSituationWithVerInfoRequest;
import cn.ucloud.uhids.models.GetUhostsecAgentDeploymentSituationWithVerInfoResponse;
import cn.ucloud.uhids.models.GetUhostsecTrojanDescriptionRequest;
import cn.ucloud.uhids.models.GetUhostsecTrojanDescriptionResponse;
import cn.ucloud.uhids.models.ListUHostsecWarnDaysStatisticsV2Request;
import cn.ucloud.uhids.models.ListUHostsecWarnDaysStatisticsV2Response;
import cn.ucloud.uhids.models.ListUHostsecWarnStatisticsV2Request;
import cn.ucloud.uhids.models.ListUHostsecWarnStatisticsV2Response;
import cn.ucloud.uhids.models.ListUhostsecCommonLoginIpRequest;
import cn.ucloud.uhids.models.ListUhostsecCommonLoginIpResponse;
import cn.ucloud.uhids.models.ListUhostsecCommonLoginLocationRequest;
import cn.ucloud.uhids.models.ListUhostsecCommonLoginLocationResponse;
import cn.ucloud.uhids.models.OptBusinessVerAutoRequest;
import cn.ucloud.uhids.models.OptBusinessVerAutoResponse;
import cn.ucloud.uhids.models.OptPayAutoRenewRequest;
import cn.ucloud.uhids.models.OptPayAutoRenewResponse;
import cn.ucloud.uhids.models.QueryBillPointDeductionFlowByCycleRequest;
import cn.ucloud.uhids.models.QueryBillPointDeductionFlowByCycleResponse;
import cn.ucloud.uhids.models.QueryNewestUpdateTimeRequest;
import cn.ucloud.uhids.models.QueryNewestUpdateTimeResponse;
import cn.ucloud.uhids.models.QueryPayInfoRequest;
import cn.ucloud.uhids.models.QueryPayInfoResponse;
import cn.ucloud.uhids.models.QueryUHostSecWarningBaseChecksRequest;
import cn.ucloud.uhids.models.QueryUHostSecWarningBaseChecksResponse;
import cn.ucloud.uhids.models.QueryWeekReportListRequest;
import cn.ucloud.uhids.models.QueryWeekReportListResponse;
import cn.ucloud.uhids.models.SwitchAgentFunctionVersionRequest;
import cn.ucloud.uhids.models.SwitchAgentFunctionVersionResponse;
import cn.ucloud.uhids.models.VulStatisticTopNRequest;
import cn.ucloud.uhids.models.VulStatisticTopNResponse;

/** This client is used to call actions of **UHIDS** service */
public interface UHIDSClientInterface extends Client {

    /**
     * AddUHostSecBaseCheckWhiteRule - 添加安全基线白名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUHostSecBaseCheckWhiteRuleResponse addUHostSecBaseCheckWhiteRule(
            AddUHostSecBaseCheckWhiteRuleRequest request) throws UCloudException;

    /**
     * AddUHostSecWebRiskWhiteRule - 添加webrisk白名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUHostSecWebRiskWhiteRuleResponse addUHostSecWebRiskWhiteRule(
            AddUHostSecWebRiskWhiteRuleRequest request) throws UCloudException;

    /**
     * AddUhostsecCommonLoginIp - 添加常用登录Ip
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUhostsecCommonLoginIpResponse addUhostsecCommonLoginIp(
            AddUhostsecCommonLoginIpRequest request) throws UCloudException;

    /**
     * AddUhostsecCommonLoginLocation - 添加常用登录地
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUhostsecCommonLoginLocationResponse addUhostsecCommonLoginLocation(
            AddUhostsecCommonLoginLocationRequest request) throws UCloudException;

    /**
     * AgentOSStatistic - 主机操作系统分布
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AgentOSStatisticResponse agentOSStatistic(AgentOSStatisticRequest request)
            throws UCloudException;

    /**
     * AgentWarnningStatistic - 服务器状态统计
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AgentWarnningStatisticResponse agentWarnningStatistic(
            AgentWarnningStatisticRequest request) throws UCloudException;

    /**
     * BuyBillPoint - 购买付费点数
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public BuyBillPointResponse buyBillPoint(BuyBillPointRequest request) throws UCloudException;

    /**
     * DelUHostSecBaseCheckWhiteRule - 删除安全基线白名单
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DelUHostSecBaseCheckWhiteRuleResponse delUHostSecBaseCheckWhiteRule(
            DelUHostSecBaseCheckWhiteRuleRequest request) throws UCloudException;

    /**
     * DelUHostSecCommonLogin - 删除常用登陆IP或常用登陆地
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DelUHostSecCommonLoginResponse delUHostSecCommonLogin(
            DelUHostSecCommonLoginRequest request) throws UCloudException;

    /**
     * DelUHostSecWarnings - 删除告警
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DelUHostSecWarningsResponse delUHostSecWarnings(DelUHostSecWarningsRequest request)
            throws UCloudException;

    /**
     * GetUHostsecAgentDeploymentStatistics - 获取当前项目制定工程的Agent部署统计值
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUHostsecAgentDeploymentStatisticsResponse getUHostsecAgentDeploymentStatistics(
            GetUHostsecAgentDeploymentStatisticsRequest request) throws UCloudException;

    /**
     * GetUHostsecAgentInstallScript - 获取主机安全Agent安全脚本
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUHostsecAgentInstallScriptResponse getUHostsecAgentInstallScript(
            GetUHostsecAgentInstallScriptRequest request) throws UCloudException;

    /**
     * GetUHostsecBaseCheckRuleDescription - 获取基线检测指定规则详细描述
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUHostsecBaseCheckRuleDescriptionResponse getUHostsecBaseCheckRuleDescription(
            GetUHostsecBaseCheckRuleDescriptionRequest request) throws UCloudException;

    /**
     * GetUhostsecAgentDeploymentSituationWithVerInfo - 列出当前项目的主机安装信息(包括付费版本信息)
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUhostsecAgentDeploymentSituationWithVerInfoResponse
            getUhostsecAgentDeploymentSituationWithVerInfo(
                    GetUhostsecAgentDeploymentSituationWithVerInfoRequest request)
                    throws UCloudException;

    /**
     * GetUhostsecTrojanDescription - 获取某一类木马告警的详细描述信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUhostsecTrojanDescriptionResponse getUhostsecTrojanDescription(
            GetUhostsecTrojanDescriptionRequest request) throws UCloudException;

    /**
     * ListUHostsecWarnDaysStatisticsV2 - 获取按天列出各类告警统计值
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUHostsecWarnDaysStatisticsV2Response listUHostsecWarnDaysStatisticsV2(
            ListUHostsecWarnDaysStatisticsV2Request request) throws UCloudException;

    /**
     * ListUHostsecWarnStatisticsV2 - 获取当前账号与项目下的各类主机安全告警统计值
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUHostsecWarnStatisticsV2Response listUHostsecWarnStatisticsV2(
            ListUHostsecWarnStatisticsV2Request request) throws UCloudException;

    /**
     * ListUhostsecCommonLoginIp - 列出公共登录ip列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUhostsecCommonLoginIpResponse listUhostsecCommonLoginIp(
            ListUhostsecCommonLoginIpRequest request) throws UCloudException;

    /**
     * ListUhostsecCommonLoginLocation - 获取公共登录地列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUhostsecCommonLoginLocationResponse listUhostsecCommonLoginLocation(
            ListUhostsecCommonLoginLocationRequest request) throws UCloudException;

    /**
     * OptBusinessVerAuto - 操作自动设置企业版开关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public OptBusinessVerAutoResponse optBusinessVerAuto(OptBusinessVerAutoRequest request)
            throws UCloudException;

    /**
     * OptPayAutoRenew - 操作自动续费开关
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public OptPayAutoRenewResponse optPayAutoRenew(OptPayAutoRenewRequest request)
            throws UCloudException;

    /**
     * QueryBillPointDeductionFlowByCycle - 按照周期统计用户计费点数变化情况
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryBillPointDeductionFlowByCycleResponse queryBillPointDeductionFlowByCycle(
            QueryBillPointDeductionFlowByCycleRequest request) throws UCloudException;

    /**
     * QueryNewestUpdateTime - 查询下载数据最新更新时间
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryNewestUpdateTimeResponse queryNewestUpdateTime(QueryNewestUpdateTimeRequest request)
            throws UCloudException;

    /**
     * QueryPayInfo - 查询用户付费信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryPayInfoResponse queryPayInfo(QueryPayInfoRequest request) throws UCloudException;

    /**
     * QueryUHostSecWarningBaseChecks - 查询正在告警的安全基线类型列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryUHostSecWarningBaseChecksResponse queryUHostSecWarningBaseChecks(
            QueryUHostSecWarningBaseChecksRequest request) throws UCloudException;

    /**
     * QueryWeekReportList - 查询主机安全周报
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public QueryWeekReportListResponse queryWeekReportList(QueryWeekReportListRequest request)
            throws UCloudException;

    /**
     * SwitchAgentFunctionVersion - 切换agent的功能版本
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SwitchAgentFunctionVersionResponse switchAgentFunctionVersion(
            SwitchAgentFunctionVersionRequest request) throws UCloudException;

    /**
     * VulStatisticTopN - 高危漏洞TOP N
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public VulStatisticTopNResponse vulStatisticTopN(VulStatisticTopNRequest request)
            throws UCloudException;
}
