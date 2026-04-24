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
package cn.ucloud.uhids.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QueryBillPointDeductionFlowByCycleResponse extends Response {

    /** 返回的数据 */
    @SerializedName("Result")
    private List<CycleBillPointStat> result;

    public List<CycleBillPointStat> getResult() {
        return result;
    }

    public void setResult(List<CycleBillPointStat> result) {
        this.result = result;
    }

    public static class CycleBillPointStat extends Response {

        /** 统计时间 */
        @SerializedName("Time")
        private String time;

        /** 增加的点数 */
        @SerializedName("SubPointNum")
        private Integer subPointNum;

        /** 减少的减少 */
        @SerializedName("AddPointNum")
        private Integer addPointNum;

        /** 余留的点数 */
        @SerializedName("RemainPointNum")
        private Integer remainPointNum;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Integer getSubPointNum() {
            return subPointNum;
        }

        public void setSubPointNum(Integer subPointNum) {
            this.subPointNum = subPointNum;
        }

        public Integer getAddPointNum() {
            return addPointNum;
        }

        public void setAddPointNum(Integer addPointNum) {
            this.addPointNum = addPointNum;
        }

        public Integer getRemainPointNum() {
            return remainPointNum;
        }

        public void setRemainPointNum(Integer remainPointNum) {
            this.remainPointNum = remainPointNum;
        }
    }
}
