package cn.ucloud.ubill.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

/**
 * @author: codezhang
 * @date: 2020/2/13 1:13 下午
 * @describe:
 **/
public class GetBillDataFileUrlResult extends BaseResponseResult {

    /**
     * 交易账单数据下载URL
     */
    @SerializedName("FileUrl")
    private String fileUrl;

    /**
     * 生成的 URL是否有效，即有对应数据文件
     */
    @SerializedName("IsValid")
    private String isValid;

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
}
