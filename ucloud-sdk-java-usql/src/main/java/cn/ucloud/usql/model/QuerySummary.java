package cn.ucloud.usql.model;

import com.google.gson.annotations.SerializedName;


/**
 * @Description : SQL查询任务信息 模型类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class QuerySummary {

    /**
     * 查询ID
     */
    @SerializedName("QueryId")
    private String queryId;

    /**
     * 查询ID
     */
    @SerializedName("NamedQueryId")
    private String namedQueryId;
    /**
     * 查询类型
     */
    @SerializedName("QueryType")
    private String queryType;
    /**
     * 查询语句
     */
    @SerializedName("QueryString")
    private String queryString;
    /**
     * 查询状态
     */
    @SerializedName("State")
    private String state;
    /**
     * 扫描字节数量
     */
    @SerializedName("ScannedBytes")
    private Long scannedBytes;
    /**
     * 错误信息
     */
    @SerializedName("ErrorMessage")
    private String errorMessage;
    /**
     * 查询耗时， 单位:：毫秒
     */
    @SerializedName("ElapsedTimeMillis")
    private Integer elapsedTimeMillis;
    /**
     * 查询启动时间
     */
    @SerializedName("StartTime")
    private Integer startTime;
    /**
     * 查询结束时间
     */
    @SerializedName("EndTime")
    private Integer endTime;

    @SerializedName("OutputRecordCount")
    private Integer outputRecordCount;

    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public Integer getOutputRecordCount() {
        return outputRecordCount;
    }

    public void setOutputRecordCount(Integer outputRecordCount) {
        this.outputRecordCount = outputRecordCount;
    }

    public String getNamedQueryId() {
        return this.namedQueryId;
    }

    public void setNamedQueryId(String namedQueryId) {
        this.namedQueryId = namedQueryId;
    }

    public String getQueryType() {
        return this.queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getScannedBytes() {
        return scannedBytes;
    }

    public void setScannedBytes(Long scannedBytes) {
        this.scannedBytes = scannedBytes;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Integer getElapsedTimeMillis() {
        return this.elapsedTimeMillis;
    }

    public void setElapsedTimeMillis(Integer elapsedTimeMillis) {
        this.elapsedTimeMillis = elapsedTimeMillis;
    }

    public Integer getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }


}