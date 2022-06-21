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
package cn.ucloud.uphone.models;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

import java.util.List;

public class RenewUPhoneRequest extends Request {

    /**
     * 项目ID。不填写为默认项目，子帐号必须填写。
     * 请参考[GetProjectList接口](https://docs.ucloud.cn/api/summary/get_project_list)
     */
    @UCloudParam("ProjectId")
    private String projectId;

    /** 城市Id，通过[获取城市列表](#DescribeUPhoneCities)获取 */
    @NotEmpty
    @UCloudParam("CityId")
    private String cityId;

    /**
     * 【数组】云手机实例的资源 ID，调用方式举例：UPhoneIds.0=希望重启的云手机实例 1 的 UPhoneId，UPhoneIds.1=云手机实例 2 的 UPhoneId。
     */
    @NotEmpty
    @UCloudParam("UPhoneIds")
    private List<String> uPhoneIds;

    /** 枚举值。当前操作的产品类型，1、uphone：云手机场景；2、uphone-server：云手机服务器场景。默认云手机服务器场景。 */
    @UCloudParam("ProductType")
    private String productType;

    /** 自定义设备参数设置的开关，true时会读取用户设置的下列设备参数信息；false时随机读取ucloud内置设备参数。默认false */
    @UCloudParam("Customize")
    private Boolean customize;

    /** 品牌 */
    @UCloudParam("Brand")
    private String brand;

    /** 设备型号 */
    @UCloudParam("Model")
    private String model;

    /** 厂商 */
    @UCloudParam("Manufacture")
    private String manufacture;

    /** 序列号 */
    @UCloudParam("SerialNumber")
    private String serialNumber;

    /** 基带版本 */
    @UCloudParam("BaseBand")
    private String baseBand;

    /** 主板名 */
    @UCloudParam("Board")
    private String board;

    /** 显示的版本号 */
    @UCloudParam("DisplayID")
    private String displayID;

    /** 设备名 */
    @UCloudParam("Device")
    private String device;

    /** 系统指纹 */
    @UCloudParam("FingerPrint")
    private String fingerPrint;

    /** 产品名称 */
    @UCloudParam("ProductName")
    private String productName;

    /** build的版本号 */
    @UCloudParam("BuildID")
    private String buildID;

    /** 固件编译主机 */
    @UCloudParam("BuildHost")
    private String buildHost;

    /** bootloader版本号 */
    @UCloudParam("BootLoader")
    private String bootLoader;

    /** 系统标记 */
    @UCloudParam("BuildTags")
    private String buildTags;

    /** 版本增加说明 */
    @UCloudParam("BuildVersionInc")
    private String buildVersionInc;

    /** 串号 */
    @UCloudParam("IMEI")
    private String imei;

    /** 手机号码 */
    @UCloudParam("PhoneNumber")
    private String phoneNumber;

    /** SIM卡唯一标识 */
    @UCloudParam("ICCID")
    private String iccid;

    /** 移动识别码 */
    @UCloudParam("IMSI")
    private String imsi;

    /** 移动设备标识码软件 */
    @UCloudParam("IMEISV")
    private String imeisv;

    /** 移动网络mac地址 */
    @UCloudParam("RadioMac")
    private String radioMac;

    /** 当前连接Wi-Fi名称 */
    @UCloudParam("WiFiName")
    private String wiFiName;

    /** Wi-Fi 物理地址 */
    @UCloudParam("BSSID")
    private String bssid;

    /** AOSP唯一标识 */
    @UCloudParam("AndroidID")
    private String androidID;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public List<String> getUPhoneIds() {
        return uPhoneIds;
    }

    public void setUPhoneIds(List<String> uPhoneIds) {
        this.uPhoneIds = uPhoneIds;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Boolean getCustomize() {
        return customize;
    }

    public void setCustomize(Boolean customize) {
        this.customize = customize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBaseBand() {
        return baseBand;
    }

    public void setBaseBand(String baseBand) {
        this.baseBand = baseBand;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getDisplayID() {
        return displayID;
    }

    public void setDisplayID(String displayID) {
        this.displayID = displayID;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBuildID() {
        return buildID;
    }

    public void setBuildID(String buildID) {
        this.buildID = buildID;
    }

    public String getBuildHost() {
        return buildHost;
    }

    public void setBuildHost(String buildHost) {
        this.buildHost = buildHost;
    }

    public String getBootLoader() {
        return bootLoader;
    }

    public void setBootLoader(String bootLoader) {
        this.bootLoader = bootLoader;
    }

    public String getBuildTags() {
        return buildTags;
    }

    public void setBuildTags(String buildTags) {
        this.buildTags = buildTags;
    }

    public String getBuildVersionInc() {
        return buildVersionInc;
    }

    public void setBuildVersionInc(String buildVersionInc) {
        this.buildVersionInc = buildVersionInc;
    }

    public String getIMEI() {
        return imei;
    }

    public void setIMEI(String imei) {
        this.imei = imei;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getICCID() {
        return iccid;
    }

    public void setICCID(String iccid) {
        this.iccid = iccid;
    }

    public String getIMSI() {
        return imsi;
    }

    public void setIMSI(String imsi) {
        this.imsi = imsi;
    }

    public String getIMEISV() {
        return imeisv;
    }

    public void setIMEISV(String imeisv) {
        this.imeisv = imeisv;
    }

    public String getRadioMac() {
        return radioMac;
    }

    public void setRadioMac(String radioMac) {
        this.radioMac = radioMac;
    }

    public String getWiFiName() {
        return wiFiName;
    }

    public void setWiFiName(String wiFiName) {
        this.wiFiName = wiFiName;
    }

    public String getBSSID() {
        return bssid;
    }

    public void setBSSID(String bssid) {
        this.bssid = bssid;
    }

    public String getAndroidID() {
        return androidID;
    }

    public void setAndroidID(String androidID) {
        this.androidID = androidID;
    }
}
