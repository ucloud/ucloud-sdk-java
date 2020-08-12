package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/12 11:29
 */
public class ReferConf {
    /**
     * 0白名单，1黑名单
     */
    @SerializedName("ReferType")
    private Integer referType;

    /**
     * ReferType为白名单时，(删除)NullRefer为0代表不允许NULL refer访问，为1代表允许Null refer访问
     */
    @SerializedName("NullRefer")
    private Integer nullRefer;

    /**
     * Refer列表，支持正则表达式
     */
    @SerializedName("ReferList")
    private List<String> referList;

    public Integer getReferType() {
        return referType;
    }

    public void setReferType(Integer referType) {
        this.referType = referType;
    }

    public Integer getNullRefer() {
        return nullRefer;
    }

    public void setNullRefer(Integer nullRefer) {
        this.nullRefer = nullRefer;
    }

    public List<String> getReferList() {
        return referList;
    }

    public void setReferList(List<String> referList) {
        this.referList = referList;
    }
}
