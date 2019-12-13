package cn.ucloud.usms.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.usms.model.*;

/**
 * @Description : USMS 客户端接口
 * @Author : codezhang
 * @Date : 2019年06月04日
 **/
public interface USMSClient extends UcloudClient {


    /**
     * 发送短信息
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception 请求出错则抛出异常
     */
    SendUSMSMessageResult sendUSMSMessage(SendUSMSMessageParam param) throws Exception;

    /**
     * 发送短信息
     *
     * @param param     请求参数对象
     * @param handler   异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void sendUSMSMessage(SendUSMSMessageParam param, UcloudHandler<SendUSMSMessageResult> handler,
                         Boolean... asyncFlag);


    /**
     * 获取短信发送回执信息
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception 请求出错则抛出异常
     */
    GetUSMSSendReceiptResult getUSMSSendReceipt(GetUSMSSendReceiptParam param) throws Exception;

    /**
     * 获取短信发送回执信息
     *
     * @param param     请求参数对象
     * @param handler   异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void getUSMSSendReceipt(GetUSMSSendReceiptParam param, UcloudHandler<GetUSMSSendReceiptResult> handler,
                            Boolean... asyncFlag);


    /**
     * 申请短信签名
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception 请求出错则抛出异常
     */
    CreateUSMSSignatureResult createUSMSSignature(CreateUSMSSignatureParam param) throws Exception;

    /**
     * 申请短信签名
     *
     * @param param     请求参数对象
     * @param handler   异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void createUSMSSignature(CreateUSMSSignatureParam param, UcloudHandler<CreateUSMSSignatureResult> handler,
                             Boolean... asyncFlag);


    /**
     * 查询短信签名申请状态
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception 请求出错则抛出异常
     */
    QueryUSMSSignatureResult queryUSMSSignature(QueryUSMSSignatureParam param) throws Exception;

    /**
     * 查询短信签名申请状态
     *
     * @param param     请求参数对象
     * @param handler   异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void queryUSMSSignature(QueryUSMSSignatureParam param, UcloudHandler<QueryUSMSSignatureResult> handler,
                            Boolean... asyncFlag);


    /**
     * 删除短信签名
     *
     * @param param 请求参数对象
     * @return 结果对象
     * @throws Exception 请求出错则抛出异常
     */
    DeleteUSMSSignatureResult deleteUSMSSignature(DeleteUSMSSignatureParam param) throws Exception;

    /**
     * 删除短信签名
     *
     * @param param     请求参数对象
     * @param handler   异步处理器
     * @param asyncFlag 异步标记位，默认true异步
     */
    void deleteUSMSSignature(DeleteUSMSSignatureParam param, UcloudHandler<DeleteUSMSSignatureResult> handler,
                             Boolean... asyncFlag);


}