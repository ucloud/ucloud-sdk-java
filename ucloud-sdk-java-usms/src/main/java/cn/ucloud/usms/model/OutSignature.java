package cn.ucloud.usms.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author: codezhang
 * @date: 2019/12/13 5:05 下午
 * @describe:
 **/
public class OutSignature {

    /**
     * 短信签名ID
     */
    @SerializedName("SigId")
    private String sigId;

    /**
     * 签名名称（签名内容）
     */
    @SerializedName("SigContent")
    private String sigContent;

    /**
     * 签名状态，
     * 0-待审核
     * 1-审核中
     * 2-审核通过
     * 3-审核未通过
     * 4-被禁用
     */
    @SerializedName("Status")
    private Integer status;

    /**
     * 短信签名未通过审核原因
     */
    @SerializedName("ErrDesc")
    private String errDesc;


    public String getSigId() {
        return sigId;
    }

    public void setSigId(String sigId) {
        this.sigId = sigId;
    }

    public String getSigContent() {
        return sigContent;
    }

    public void setSigContent(String sigContent) {
        this.sigContent = sigContent;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getErrDesc() {
        return errDesc;
    }

    public void setErrDesc(String errDesc) {
        this.errDesc = errDesc;
    }
}
