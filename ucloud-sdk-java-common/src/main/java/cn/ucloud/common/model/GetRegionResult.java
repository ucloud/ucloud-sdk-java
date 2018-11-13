package cn.ucloud.common.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import static cn.ucloud.common.util.StringEqual.regionZoneStringEqual;

/**
 * @description: 获取地域Region信息  结果类
 * @author: codezhang
 * @date: 2018-11-13 13:56
 **/

public class GetRegionResult extends BaseResponseResult {


    private class RealRegion {
        /**
         * region名称，code，地域
         */
        @SerializedName("Region")
        private String region;

        /**
         * zone名称，code，可用区
         */
        @SerializedName("Zone")
        private String zone;

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

        @Override
        public String toString() {
            return "RealRegion{" +
                    "region='" + region + '\'' +
                    ", zone='" + zone + '\'' +
                    '}';
        }
    }


    private class Region {

        /**
         * region名称，code,地域
         */
        private String region;


        /**
         * zone名称，code，可用区
         */
        private List<String> zones;


        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }


        public List<String> getZones() {
            return zones;
        }

        public void setZones(List<String> zones) {
            this.zones = zones;
        }

        @Override
        public String toString() {
            return "Region{" +
                    "region='" + region + '\'' +
                    ", zones=" + zones +
                    '}';
        }
    }

    /**
     * region地域信息
     */
    @SerializedName("Regions")
    private List<RealRegion> realRegions;

    /**
     * region地域信息
     */
    private List<Region> regions;

    public List<Region> getRegions() {
        if (regions == null && realRegions != null) {
            regions = new ArrayList<>();
            // 数据转换
            for (RealRegion realRegion : realRegions) {
                // region存在标记
                boolean regionFlag = false;
                for (Region region : regions) {
                    if (regionZoneStringEqual(region.region, realRegion.region)) {
                        // 两个region code相同
                        regionFlag = true;
                        // region已经存在，则判断zone是否存在，不存在则添加
                        if (region.zones == null) {
                            region.zones = new ArrayList<>();
                        }
                        boolean zoneFlag = false;
                        for (String zone : region.zones) {
                            if (regionZoneStringEqual(zone, realRegion.zone)) {
                                // 两个zone code相同
                                zoneFlag = true;
                                break;
                            }
                        }
                        if (!zoneFlag && realRegion.zone != null && realRegion.zone.length() > 0) {
                            // zone不存在，增加zone到region中
                            region.zones.add(realRegion.zone);
                        }
                        break;
                    }
                }
                if (!regionFlag && realRegion.region != null && realRegion.region.length() > 0) {
                    Region region = new Region();
                    region.region = realRegion.region;
                    region.zones = new ArrayList<>();
                    if (realRegion.zone != null && realRegion.zone.length() > 0){
                        region.zones.add(realRegion.zone);
                    }
                    regions.add(region);
                }
            }
        }
        return regions;
    }


    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }


    private List<RealRegion> getRealRegions() {
        return realRegions;
    }

    private void setRealRegions(List<RealRegion> realRegions) {
        this.realRegions = realRegions;
    }

    @Override
    public String toString() {
        return "GetRegionResult{" +
                "regions=" + getRegions() +
                ", retCode=" + retCode +
                ", action='" + action + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
