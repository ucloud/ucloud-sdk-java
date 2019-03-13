package cn.ucloud.uhost.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description: 获取主机业务组列表 结果类
 * @author: codezhang
 * @date: 2018-09-17 14:32
 **/

public class DescribeUHostTagsResult extends BaseResponseResult {

    public static  class UhostTag {
        /**
         * 业务组名称
         */
        @SerializedName("Tag")
        private String tag;

        /**
         * 改业务组中包含的主机个数
         */
        @SerializedName("TotalCount")
        private Integer totalCount;

        /**
         * 可用区
         */
        @SerializedName("Zone")
        private String zone;

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }
    }


    /**
     * 已有主机的业务组总个数
     */
    @SerializedName("TotalCount")
    private Integer totalCount;

    @SerializedName("TagSet")
    private List<UhostTag> tagSet;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UhostTag> getTagSet() {
        return tagSet;
    }

    public void setTagSet(List<UhostTag> tagSet) {
        this.tagSet = tagSet;
    }

}
