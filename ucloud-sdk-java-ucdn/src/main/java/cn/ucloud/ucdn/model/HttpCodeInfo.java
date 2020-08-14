package cn.ucloud.ucdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2020/8/6 16:54
 */
public class HttpCodeInfo {
    /**
     * 带宽获取的时间点。格式：时间戳
     */
    @SerializedName("Time")
    private Long time;

    /**
     * 1xx数量
     */
    @SerializedName("HttpOneXX")
    private Integer httpOneXX;

    /**
     * 2xx数量
     */
    @SerializedName("HttpTwoXX")
    private Integer httpTwoXX;

    /**
     * 3xx数量
     */
    @SerializedName("HttpThreeXX")
    private Integer httpThreeXX;

    /**
     * 4xx数量
     */
    @SerializedName("HttpFourXX")
    private Integer httpFourXX;

    /**
     * 5xx数量
     */
    @SerializedName("HttpFiveXX")
    private Integer httpFiveXX;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getHttpOneXX() {
        return httpOneXX;
    }

    public void setHttpOneXX(Integer httpOneXX) {
        this.httpOneXX = httpOneXX;
    }

    public Integer getHttpTwoXX() {
        return httpTwoXX;
    }

    public void setHttpTwoXX(Integer httpTwoXX) {
        this.httpTwoXX = httpTwoXX;
    }

    public Integer getHttpThreeXX() {
        return httpThreeXX;
    }

    public void setHttpThreeXX(Integer httpThreeXX) {
        this.httpThreeXX = httpThreeXX;
    }

    public Integer getHttpFourXX() {
        return httpFourXX;
    }

    public void setHttpFourXX(Integer httpFourXX) {
        this.httpFourXX = httpFourXX;
    }

    public Integer getHttpFiveXX() {
        return httpFiveXX;
    }

    public void setHttpFiveXX(Integer httpFiveXX) {
        this.httpFiveXX = httpFiveXX;
    }
}
