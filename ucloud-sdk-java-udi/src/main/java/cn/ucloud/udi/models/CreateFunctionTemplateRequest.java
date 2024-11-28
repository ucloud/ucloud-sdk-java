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

    /** 功能名称： - VideoTranscode ，视频转码； - VideoCapture，视频截帧 */
    @NotEmpty
    @UCloudParam("Function")
    private String function;

    /** VideoTranscode，文件输出格式： - mp4 - flv - mpegts - webm - avi */
    @NotEmpty
    @UCloudParam("ContainerFormat")
    private String containerFormat;

    /** VideoTranscode，编码格式： - H.264 - H.265 - VPX - VPX-VP9 */
    @NotEmpty
    @UCloudParam("EncodeFormat")
    private String encodeFormat;

    /** VideoTranscode，视频比特率(Kbps)： - custom - adpative */
    @UCloudParam("VideoBitRate")
    private String videoBitRate;

    /** VideoTranscode，自定义视频比特率： 最小值：10 最大值：50000 */
    @UCloudParam("VideoBitRateCustom")
    private String videoBitRateCustom;

    /** VideoTranscode，分辨率(px)： - custom - origin */
    @UCloudParam("Resolution")
    private String resolution;

    /** VideoTranscode，分辨率宽： 最小值：160 最大值：1920 */
    @UCloudParam("ResolutionWidth")
    private String resolutionWidth;

    /** VideoTranscode，分辨率高： 最小值：160 最大值：1920 */
    @UCloudParam("ResolutionHeight")
    private String resolutionHeight;

    /** VideoTranscode，音频比特率： - custom - 48 - 64 - 128 - 160 */
    @UCloudParam("AudioBitRate")
    private String audioBitRate;

    /** VideoTranscode，自定义音频比特率 最小值：8 最大值：1000 */
    @UCloudParam("AudioBitRateCustom")
    private String audioBitRateCustom;

    /** VideoTranscode，音频采样率（Hz）： - 22050 - 32000 - 44100 - 48000 */
    @UCloudParam("AudioSampleRate")
    private String audioSampleRate;

    /** VideoTranscode，音频声道： - one - two */
    @UCloudParam("AudioChannel")
    private String audioChannel;

    /** VideoTranscode，CRF压缩率： - custom - 15 - 22 - 30 */
    @UCloudParam("CRF")
    private String crf;

    /** VideoTranscode，自定义CRF压缩率： 最小值：0 最大值：51 */
    @UCloudParam("CRFCustom")
    private String crfCustom;

    /** VideoTranscode，帧率(fps)： - custom - 25 */
    @UCloudParam("FrameRate")
    private String frameRate;

    /** VideoTranscode，自定义帧率： 最小值：0 最大值：60 */
    @UCloudParam("FrameRateCustom")
    private String frameRateCustom;

    /** VideoCapture，截帧图片格式： - jpg - png - gif */
    @UCloudParam("ImageFormat")
    private String imageFormat;

    /** VideoCapture，截帧时间点（s）： - custom - 0 - 1 - 2 */
    @UCloudParam("SnapTime")
    private String snapTime;

    /** VideoCapture，自定义截帧时间点： 最小值：0 最大值：10000 */
    @UCloudParam("SnapTimeCustom")
    private Integer snapTimeCustom;

    /** VideoCapture，截帧图片宽度: - custom - 640 */
    @UCloudParam("ImageWidth")
    private String imageWidth;

    /** VideoCapture，自定义截帧图片宽度： 最小值：0 最大值：10000 */
    @UCloudParam("ImageWidthCustom")
    private Integer imageWidthCustom;

    /** VideoCapture，截帧图片高度： - custom - 480 */
    @UCloudParam("ImageHeight")
    private String imageHeight;

    /** VideoCapture，自定义截帧图片高度： 最小值：16 最大值：2160 */
    @UCloudParam("ImageHeightCustom")
    private Integer imageHeightCustom;

    /** VideoCapture，截帧gif图片帧率，仅支持gif格式（fps） - custom - 480 */
    @UCloudParam("GifFrameRate")
    private String gifFrameRate;

    /** VideoCapture，自定义截帧gif图片帧率(fps)： 最小值：16 最大值：2160 */
    @UCloudParam("GifFrameRateCustom")
    private Integer gifFrameRateCustom;

    /** VideoCapture，gif图片持续时间，仅支持gif格式（s）： - custom - 1 - 5 - 10 */
    @UCloudParam("GifTime")
    private String gifTime;

    /** VideoCapture，自定义gif图片持续时间： 最小值：1 最大值：60 */
    @UCloudParam("GifTimeCustom")
    private Integer gifTimeCustom;

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

    public String getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    public String getSnapTime() {
        return snapTime;
    }

    public void setSnapTime(String snapTime) {
        this.snapTime = snapTime;
    }

    public Integer getSnapTimeCustom() {
        return snapTimeCustom;
    }

    public void setSnapTimeCustom(Integer snapTimeCustom) {
        this.snapTimeCustom = snapTimeCustom;
    }

    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    public Integer getImageWidthCustom() {
        return imageWidthCustom;
    }

    public void setImageWidthCustom(Integer imageWidthCustom) {
        this.imageWidthCustom = imageWidthCustom;
    }

    public String getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
    }

    public Integer getImageHeightCustom() {
        return imageHeightCustom;
    }

    public void setImageHeightCustom(Integer imageHeightCustom) {
        this.imageHeightCustom = imageHeightCustom;
    }

    public String getGifFrameRate() {
        return gifFrameRate;
    }

    public void setGifFrameRate(String gifFrameRate) {
        this.gifFrameRate = gifFrameRate;
    }

    public Integer getGifFrameRateCustom() {
        return gifFrameRateCustom;
    }

    public void setGifFrameRateCustom(Integer gifFrameRateCustom) {
        this.gifFrameRateCustom = gifFrameRateCustom;
    }

    public String getGifTime() {
        return gifTime;
    }

    public void setGifTime(String gifTime) {
        this.gifTime = gifTime;
    }

    public Integer getGifTimeCustom() {
        return gifTimeCustom;
    }

    public void setGifTimeCustom(Integer gifTimeCustom) {
        this.gifTimeCustom = gifTimeCustom;
    }
}
