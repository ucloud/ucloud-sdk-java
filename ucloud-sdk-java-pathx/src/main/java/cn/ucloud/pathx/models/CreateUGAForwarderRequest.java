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

public class CreateUGAForwarderRequest extends Request {

    /** 项目ID。 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list) */
    @NotEmpty
    @UCloudParam("ProjectId")
    private String projectId;

    /** 加速配置实例ID */
    @NotEmpty
    @UCloudParam("UGAId")
    private String ugaId;

    /** HTTP接入HTTP回源转发，接入端口。禁用65123端口 */
    @UCloudParam("HTTPHTTP")
    private List<Integer> httphttp;

    /** HTTP接入HTTP回源转发，源站监听端口 */
    @UCloudParam("HTTPHTTPRS")
    private List<Integer> httphttprs;

    /** HTTPS接入HTTP回源转发，接入端口。禁用65123端口 */
    @UCloudParam("HTTPSHTTP")
    private List<Integer> httpshttp;

    /** HTTPS接入HTTP回源转发，回源端口 */
    @UCloudParam("HTTPSHTTPRS")
    private List<Integer> httpshttprs;

    /** HTTPS接入HTTPS回源转发，接入端口。禁用65123端口 */
    @UCloudParam("HTTPSHTTPS")
    private List<Integer> httpshttps;

    /** HTTPS接入HTTPS回源转发，源站监听端口 */
    @UCloudParam("HTTPSHTTPSRS")
    private List<Integer> httpshttpsrs;

    /** TCP接入端口，禁用65123端口 */
    @UCloudParam("TCP")
    private List<Integer> tcp;

    /** TCP回源端口 */
    @UCloudParam("TCPRS")
    private List<Integer> tcprs;

    /** UDP接入端口，禁用65123端口 */
    @UCloudParam("UDP")
    private List<Integer> udp;

    /** UDP回源端口 */
    @UCloudParam("UDPRS")
    private List<Integer> udprs;

    /** WebSocket接入WebSocket回源转发，接入端口。禁用65123。 */
    @UCloudParam("WSWS")
    private List<Integer> wsws;

    /** WebSocket接入WebSocket回源转发，源站监听端口 */
    @UCloudParam("WSWSRS")
    private List<Integer> wswsrs;

    /** WebSocketS接入WebSocketS回源转发，接入端口。禁用65123。 */
    @UCloudParam("WSSWSS")
    private List<Integer> wsswss;

    /** WebSocketS接入WebSocketS回源转发，源站监听端口。 */
    @UCloudParam("WSSWSSRS")
    private List<Integer> wsswssrs;

    /** WebSocketS接入WebSocket回源转发，接入端口。禁用65123。 */
    @UCloudParam("WSSWS")
    private List<Integer> wssws;

    /** WebSocketS接入WebSocket回源转发，源站监听端口。 */
    @UCloudParam("WSSWSRS")
    private List<Integer> wsswsrs;

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

    public List<Integer> getHTTPHTTP() {
        return httphttp;
    }

    public void setHTTPHTTP(List<Integer> httphttp) {
        this.httphttp = httphttp;
    }

    public List<Integer> getHTTPHTTPRS() {
        return httphttprs;
    }

    public void setHTTPHTTPRS(List<Integer> httphttprs) {
        this.httphttprs = httphttprs;
    }

    public List<Integer> getHTTPSHTTP() {
        return httpshttp;
    }

    public void setHTTPSHTTP(List<Integer> httpshttp) {
        this.httpshttp = httpshttp;
    }

    public List<Integer> getHTTPSHTTPRS() {
        return httpshttprs;
    }

    public void setHTTPSHTTPRS(List<Integer> httpshttprs) {
        this.httpshttprs = httpshttprs;
    }

    public List<Integer> getHTTPSHTTPS() {
        return httpshttps;
    }

    public void setHTTPSHTTPS(List<Integer> httpshttps) {
        this.httpshttps = httpshttps;
    }

    public List<Integer> getHTTPSHTTPSRS() {
        return httpshttpsrs;
    }

    public void setHTTPSHTTPSRS(List<Integer> httpshttpsrs) {
        this.httpshttpsrs = httpshttpsrs;
    }

    public List<Integer> getTCP() {
        return tcp;
    }

    public void setTCP(List<Integer> tcp) {
        this.tcp = tcp;
    }

    public List<Integer> getTCPRS() {
        return tcprs;
    }

    public void setTCPRS(List<Integer> tcprs) {
        this.tcprs = tcprs;
    }

    public List<Integer> getUDP() {
        return udp;
    }

    public void setUDP(List<Integer> udp) {
        this.udp = udp;
    }

    public List<Integer> getUDPRS() {
        return udprs;
    }

    public void setUDPRS(List<Integer> udprs) {
        this.udprs = udprs;
    }

    public List<Integer> getWSWS() {
        return wsws;
    }

    public void setWSWS(List<Integer> wsws) {
        this.wsws = wsws;
    }

    public List<Integer> getWSWSRS() {
        return wswsrs;
    }

    public void setWSWSRS(List<Integer> wswsrs) {
        this.wswsrs = wswsrs;
    }

    public List<Integer> getWSSWSS() {
        return wsswss;
    }

    public void setWSSWSS(List<Integer> wsswss) {
        this.wsswss = wsswss;
    }

    public List<Integer> getWSSWSSRS() {
        return wsswssrs;
    }

    public void setWSSWSSRS(List<Integer> wsswssrs) {
        this.wsswssrs = wsswssrs;
    }

    public List<Integer> getWSSWS() {
        return wssws;
    }

    public void setWSSWS(List<Integer> wssws) {
        this.wssws = wssws;
    }

    public List<Integer> getWSSWSRS() {
        return wsswsrs;
    }

    public void setWSSWSRS(List<Integer> wsswsrs) {
        this.wsswsrs = wsswsrs;
    }
}
