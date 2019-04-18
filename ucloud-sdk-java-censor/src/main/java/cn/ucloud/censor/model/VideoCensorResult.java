package cn.ucloud.censor.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-18 15:07
 **/
public class VideoCensorResult {

    /**
     * 涉黄审查结果
     */
    @SerializedName("Porn")
    private VideoCensorInfo porn;

    /**
     * 	涉恐审查结果
     */
    @SerializedName("Terror")
    private VideoCensorInfo terror;

    /**
     * 涉政审查结果
     */
    @SerializedName("Politician")
    private VideoCensorInfo politician;

    public VideoCensorInfo getPorn() {
        return porn;
    }

    public void setPorn(VideoCensorInfo porn) {
        this.porn = porn;
    }

    public VideoCensorInfo getTerror() {
        return terror;
    }

    public void setTerror(VideoCensorInfo terror) {
        this.terror = terror;
    }

    public VideoCensorInfo getPolitician() {
        return politician;
    }

    public void setPolitician(VideoCensorInfo politician) {
        this.politician = politician;
    }
}
