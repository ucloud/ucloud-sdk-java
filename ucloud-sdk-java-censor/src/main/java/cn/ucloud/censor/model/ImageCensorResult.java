package cn.ucloud.censor.model;

import com.google.gson.annotations.SerializedName;

/**
 * @Description :
 * @Author : codezhang
 * @Date : 2019-04-18 10:08
 **/
public class ImageCensorResult {

    /**
     * Porn结果
     */
    @SerializedName("Porn")
    private ImageResultInfo porn;

    /**
     * Politician结果
     */
    @SerializedName("Politician")
    private ImageResultInfo politician;

    /**
     * Terror结果
     */
    @SerializedName("Terror")
    private ImageResultInfo terror;


    public ImageResultInfo getPorn() {
        return porn;
    }

    public void setPorn(ImageResultInfo porn) {
        this.porn = porn;
    }

    public ImageResultInfo getPolitician() {
        return politician;
    }

    public void setPolitician(ImageResultInfo politician) {
        this.politician = politician;
    }

    public ImageResultInfo getTerror() {
        return terror;
    }

    public void setTerror(ImageResultInfo terror) {
        this.terror = terror;
    }
}
