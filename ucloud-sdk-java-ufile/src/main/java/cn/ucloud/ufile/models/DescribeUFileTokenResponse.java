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
package cn.ucloud.ufile.models;

import cn.ucloud.common.response.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DescribeUFileTokenResponse extends Response {

    /** 令牌描述信息 */
    @SerializedName("DataSet")
    private List<UFileTokenSet> dataSet;

    public List<UFileTokenSet> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<UFileTokenSet> dataSet) {
        this.dataSet = dataSet;
    }

    public static class UFileTokenSet extends Response {

        /** 所属地区 */
        @SerializedName("Region")
        private String region;

        /** 令牌ID */
        @SerializedName("TokenId")
        private String tokenId;

        /** 令牌名称 */
        @SerializedName("TokenName")
        private String tokenName;

        /** 令牌公钥 */
        @SerializedName("PublicKey")
        private String publicKey;

        /** 令牌私钥 */
        @SerializedName("PrivateKey")
        private String privateKey;

        /**
         * 令牌允许执行的操作，[ TOKEN_ALLOW_NONE 没有权限, TOKEN_ALLOW_READ 下载权限, TOKEN_ALLOW_WRITE 上传权限,
         * TOKEN_ALLOW_DELETE 删除权限, TOKEN_ALLOW_LIST 列表权限, TOKEN_ALLOW_IOP 图片处理权限]
         */
        @SerializedName("AllowedOps")
        private List<String> allowedOps;

        /** 令牌允许操作的key前缀 */
        @SerializedName("AllowedPrefixes")
        private List<String> allowedPrefixes;

        /** 令牌允许操作的bucket */
        @SerializedName("AllowedBuckets")
        private List<String> allowedBuckets;

        /** 令牌的超时时间点 */
        @SerializedName("ExpireTime")
        private Integer expireTime;

        /** 创建时间 */
        @SerializedName("CreateTime")
        private Integer createTime;

        /** 修改时间 */
        @SerializedName("ModifyTime")
        private Integer modifyTime;

        /** 令牌黑名单 */
        @SerializedName("BlackIPList")
        private List<String> blackIPList;

        /** 令牌白名单 */
        @SerializedName("WhiteIPList")
        private List<String> whiteIPList;

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getTokenId() {
            return tokenId;
        }

        public void setTokenId(String tokenId) {
            this.tokenId = tokenId;
        }

        public String getTokenName() {
            return tokenName;
        }

        public void setTokenName(String tokenName) {
            this.tokenName = tokenName;
        }

        public String getPublicKey() {
            return publicKey;
        }

        public void setPublicKey(String publicKey) {
            this.publicKey = publicKey;
        }

        public String getPrivateKey() {
            return privateKey;
        }

        public void setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
        }

        public List<String> getAllowedOps() {
            return allowedOps;
        }

        public void setAllowedOps(List<String> allowedOps) {
            this.allowedOps = allowedOps;
        }

        public List<String> getAllowedPrefixes() {
            return allowedPrefixes;
        }

        public void setAllowedPrefixes(List<String> allowedPrefixes) {
            this.allowedPrefixes = allowedPrefixes;
        }

        public List<String> getAllowedBuckets() {
            return allowedBuckets;
        }

        public void setAllowedBuckets(List<String> allowedBuckets) {
            this.allowedBuckets = allowedBuckets;
        }

        public Integer getExpireTime() {
            return expireTime;
        }

        public void setExpireTime(Integer expireTime) {
            this.expireTime = expireTime;
        }

        public Integer getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Integer createTime) {
            this.createTime = createTime;
        }

        public Integer getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(Integer modifyTime) {
            this.modifyTime = modifyTime;
        }

        public List<String> getBlackIPList() {
            return blackIPList;
        }

        public void setBlackIPList(List<String> blackIPList) {
            this.blackIPList = blackIPList;
        }

        public List<String> getWhiteIPList() {
            return whiteIPList;
        }

        public void setWhiteIPList(List<String> whiteIPList) {
            this.whiteIPList = whiteIPList;
        }
    }
}
