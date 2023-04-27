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
package cn.ucloud.udi.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class CreateFunctionTemplateRequest extends Request {

    /** 地域。 参见 [地域和可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Region")
    private String region;

    /** 可用区。参见 [可用区列表](https://docs.ucloud.cn/api/summary/regionlist) */
    @NotEmpty
    @UCloudParam("Zone")
    private String zone;

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 项目名称 */
    @NotEmpty
    @UCloudParam("ProjectName")
    private String projectName;

    /** 模板名称 */
    @NotEmpty
    @UCloudParam("TemplateName")
    private String templateName;

    /** 功能名称 */
    @NotEmpty
    @UCloudParam("Function")
    private String function;

    /** 文件输出格式 */
    @NotEmpty
    @UCloudParam("ContainerFormat")
    private String containerFormat;

    /** 编码格式 */
    @NotEmpty
    @UCloudParam("EncodeFormat")
    private String encodeFormat;

    /** 视频比特率 */
    @UCloudParam("VideoBitRate")
    private String videoBitRate;

    /** 自定义视频比特率 */
    @UCloudParam("VideoBitRateCustom")
    private String videoBitRateCustom;

    /** 分辨率 */
    @UCloudParam("Resolution")
    private String resolution;

    /** 分辨率宽 */
    @UCloudParam("ResolutionWidth")
    private String resolutionWidth;

    /** 分辨率高 */
    @UCloudParam("ResolutionHeight")
    private String resolutionHeight;

    /** 音频比特率 */
    @UCloudParam("AudioBitRate")
    private String audioBitRate;

    /** 自定义音频比特率 */
    @UCloudParam("AudioBitRateCustom")
    private String audioBitRateCustom;

    /** 音频采样率 */
    @UCloudParam("AudioSampleRate")
    private String audioSampleRate;

    /** 音频声道 */
    @UCloudParam("AudioChannel")
    private String audioChannel;

    /** CRF压缩率 */
    @UCloudParam("CRF")
    private String crf;

    /** 自定义CRF压缩率 */
    @UCloudParam("CRFCustom")
    private String crfCustom;

    /** 帧率 */
    @UCloudParam("FrameRate")
    private String frameRate;

    /** 自定义帧率 */
    @UCloudParam("FrameRateCustom")
    private String frameRateCustom;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getContainerFormat() {
        return containerFormat;
    }

    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    public String getEncodeFormat() {
        return encodeFormat;
    }

    public void setEncodeFormat(String encodeFormat) {
        this.encodeFormat = encodeFormat;
    }

    public String getVideoBitRate() {
        return videoBitRate;
    }

    public void setVideoBitRate(String videoBitRate) {
        this.videoBitRate = videoBitRate;
    }

    public String getVideoBitRateCustom() {
        return videoBitRateCustom;
    }

    public void setVideoBitRateCustom(String videoBitRateCustom) {
        this.videoBitRateCustom = videoBitRateCustom;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolutionWidth() {
        return resolutionWidth;
    }

    public void setResolutionWidth(String resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    public String getResolutionHeight() {
        return resolutionHeight;
    }

    public void setResolutionHeight(String resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
    }

    public String getAudioBitRate() {
        return audioBitRate;
    }

    public void setAudioBitRate(String audioBitRate) {
        this.audioBitRate = audioBitRate;
    }

    public String getAudioBitRateCustom() {
        return audioBitRateCustom;
    }

    public void setAudioBitRateCustom(String audioBitRateCustom) {
        this.audioBitRateCustom = audioBitRateCustom;
    }

    public String getAudioSampleRate() {
        return audioSampleRate;
    }

    public void setAudioSampleRate(String audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }

    public String getAudioChannel() {
        return audioChannel;
    }

    public void setAudioChannel(String audioChannel) {
        this.audioChannel = audioChannel;
    }

    public String getCRF() {
        return crf;
    }

    public void setCRF(String crf) {
        this.crf = crf;
    }

    public String getCRFCustom() {
        return crfCustom;
    }

    public void setCRFCustom(String crfCustom) {
        this.crfCustom = crfCustom;
    }

    public String getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }

    public String getFrameRateCustom() {
        return frameRateCustom;
    }

    public void setFrameRateCustom(String frameRateCustom) {
        this.frameRateCustom = frameRateCustom;
    }
}
