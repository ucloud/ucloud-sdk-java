package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Description : 核查UDB资源余量 结果类
 * @Author : codezhang
 * @Date : 2019-03-01 13:55
 **/
public class CheckUDBInstanceAllowanceResult extends BaseResponseResult {

    public static class CheckResult {

        /**
         * 可用区ID
         */
        @SerializedName("zoneId")
        private Integer zoneId;

        /**
         * 成功数目
         */
        @SerializedName("successCount")
        private Integer successCount;


        public Integer getZoneId() {
            return zoneId;
        }

        public void setZoneId(Integer zoneId) {
            this.zoneId = zoneId;
        }

        public Integer getSuccessCount() {
            return successCount;
        }

        public void setSuccessCount(Integer successCount) {
            this.successCount = successCount;
        }
    }

    /**
     * 资源核查部分成功情况下，成功个数
     */
    @SerializedName("Count")
    private Integer count;

    /**
     * 检查结果
     */
    @SerializedName("CheckResultList")
    private List<CheckResult> checkResults;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<CheckResult> getCheckResults() {
        return checkResults;
    }

    public void setCheckResults(List<CheckResult> checkResults) {
        this.checkResults = checkResults;
    }
}
