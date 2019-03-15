package cn.ucloud.umem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-03-15 13:33
 **/
public class RegionResource {

    @SerializedName("Region")
    private String region;

    @SerializedName("Zone")
    private String zone;

    @SerializedName("Resources")
    private List<Resource> resources;

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

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }
}
