package cn.ucloud.usql.model;

import cn.ucloud.common.pojo.BaseResponseResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * @Description : 获取SQL查询详细信息 结果类
 * @Author : ucloud-sdk-generator
 * @Date : 2019-03-13 07:56
 **/
public class GetSQLQueryResult extends BaseResponseResult {
    /**
     * API请求ID
     */
    @SerializedName("Request")
    private String request;
    /**
     * SQL查询ID
     */
    @SerializedName("QueryId")
    private String queryId;
    /**
     * 查询任务当前状态。
     * RUNNING： 正在运行，
     * CANCELLED：用户取消任务，
     * SUCCEED：任务运行成功，
     * FAILED： 任务运行失败
     */
    @SerializedName("State")
    private String state;
    /**
     * 查询已运行时间
     */
    @SerializedName("ElapsedTime")
    private Integer elapsedTime;
    /**
     * 查询扫描数据字节数
     */
    @SerializedName("ScannedBytes")
    private Integer scannedBytes;
    /**
     * 查询任务错误码
     */
    @SerializedName("QueryErrorCode")
    private Integer queryErrorCode;
    /**
     * 查询任务错误信息
     */
    @SerializedName("QueryErrorMessage")
    private String queryErrorMessage;
    /**
     * 查询任务启动时间
     */
    @SerializedName("StartTime")
    private Integer startTime;
    /**
     * 查询任务结束时间
     */
    @SerializedName("EndTime")
    private Integer endTime;
    /**
     * 查询结果字段名列表
     */
    @SerializedName("Headers")
    private List<String> headers;
    /**
     * SQL查询类型， 有SELECT，CREATE_DATABASE, DROP_DATABASE, CREATE_TABLE, DROP_TABLE, SHOW_CREATE_TABLE
     */
    @SerializedName("QueryType")
    private String queryType;
    /**
     * 查询结果的记录总数
     */
    @SerializedName("OutputRecordCount")
    private Integer outputRecordCount;


    public String getRequest() {
        return this.request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getQueryId() {
        return this.queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getElapsedTime() {
        return this.elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getScannedBytes() {
        return this.scannedBytes;
    }

    public void setScannedBytes(Integer scannedBytes) {
        this.scannedBytes = scannedBytes;
    }

    public Integer getQueryErrorCode() {
        return this.queryErrorCode;
    }

    public void setQueryErrorCode(Integer queryErrorCode) {
        this.queryErrorCode = queryErrorCode;
    }

    public String getQueryErrorMessage() {
        return this.queryErrorMessage;
    }

    public void setQueryErrorMessage(String queryErrorMessage) {
        this.queryErrorMessage = queryErrorMessage;
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

    public List<String> getHeaders() {
        return this.headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public String getQueryType() {
        return this.queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public Integer getOutputRecordCount() {
        return this.outputRecordCount;
    }

    public void setOutputRecordCount(Integer outputRecordCount) {
        this.outputRecordCount = outputRecordCount;
    }


}