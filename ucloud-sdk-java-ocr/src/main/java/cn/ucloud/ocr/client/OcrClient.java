package cn.ucloud.ocr.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.ocr.model.CreateUAIOcrResourceParam;
import cn.ucloud.ocr.model.CreateUAIOcrResourceResult;
import cn.ucloud.ocr.model.DeleteUAIOcrResourceParam;
import cn.ucloud.ocr.model.DeleteUAIOcrResourceResult;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeParam;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeResult;
import cn.ucloud.ocr.model.GetUAIOcrResourceListParam;
import cn.ucloud.ocr.model.GetUAIOcrResourceListResult;
import cn.ucloud.ocr.model.GetUAIOcrResourceRecordInfoParam;
import cn.ucloud.ocr.model.GetUAIOcrResourceRecordInfoResult;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceMemoParam;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceMemoResult;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceNameParam;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceNameResult;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceOssInfoParam;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceOssInfoResult;

/**
 * @Description : ocr 客户端接口
 * @Author : codezhang
 * @Date : 2019-04-19 15:24
 **/
public interface OcrClient extends UcloudClient {

    /**
     * 删除UAI-OCR资源
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    DeleteUAIOcrResourceResult
    deleteUAIOcrResource(DeleteUAIOcrResourceParam param) throws Exception;

    /**
     * 删除UAI-OCR资源 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void deleteUAIOcrResource(DeleteUAIOcrResourceParam param,
                              UcloudHandler<DeleteUAIOcrResourceResult> handler,
                              Boolean... asyncFlag);


    /**
     * 获取UAI-OCR资源请求记录
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUAIOcrResourceRecordInfoResult
    getUAIOcrResourceRecordInfo(GetUAIOcrResourceRecordInfoParam param) throws Exception;

    /**
     * 获取UAI-OCR资源请求记录 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUAIOcrResourceRecordInfo(GetUAIOcrResourceRecordInfoParam param,
                                     UcloudHandler<GetUAIOcrResourceRecordInfoResult> handler,
                                     Boolean... asyncFlag);


    /**
     * 修改UAI-OCR资源对象存储信息
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyUAIOcrResourceOssInfoResult
    modifyUAIOcrResourceOssInfo(ModifyUAIOcrResourceOssInfoParam param) throws Exception;

    /**
     * 修改UAI-OCR资源对象存储信息 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyUAIOcrResourceOssInfo(ModifyUAIOcrResourceOssInfoParam param,
                                     UcloudHandler<ModifyUAIOcrResourceOssInfoResult> handler,
                                     Boolean... asyncFlag);


    /**
     * 修改UAI-OCR资源名称
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyUAIOcrResourceNameResult
    modifyUAIOcrResourceName(ModifyUAIOcrResourceNameParam param) throws Exception;

    /**
     * 修改UAI-OCR资源名称 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyUAIOcrResourceName(ModifyUAIOcrResourceMemoParam param,
                                  UcloudHandler<ModifyUAIOcrResourceNameResult> handler,
                                  Boolean... asyncFlag);


    /**
     * 修改UAI-OCR资源备注
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    ModifyUAIOcrResourceMemoResult
    modifyUAIOcrResourceMemo(ModifyUAIOcrResourceMemoParam param) throws Exception;

    /**
     * 修改UAI-OCR资源备注 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void modifyUAIOcrResourceMemo(ModifyUAIOcrResourceMemoParam param,
                                  UcloudHandler<ModifyUAIOcrResourceMemoResult> handler,
                                  Boolean... asyncFlag);


    /**
     * 获取UAI-OCR资源列表
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUAIOcrResourceListResult
    getUAIOcrResourceList(GetUAIOcrResourceListParam param) throws Exception;

    /**
     * 获取UAI-OCR资源列表 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUAIOcrResourceList(GetUAIOcrResourceListParam param,
                               UcloudHandler<GetUAIOcrResourceListResult> handler,
                               Boolean... asyncFlag);


    /**
     * 创建UAI-OCR资源
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    CreateUAIOcrResourceResult
    createUAIOcrResource(CreateUAIOcrResourceParam param) throws Exception;

    /**
     * 创建UAI-OCR资源 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void createUAIOcrResource(CreateUAIOcrResourceParam param,
                              UcloudHandler<CreateUAIOcrResourceResult> handler,
                              Boolean... asyncFlag);


    /**
     * 获取可用UAI-OCR资源类型
     *
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetUAIOcrAvailResourceTypeResult
    getUAIOcrAvailResourceType(GetUAIOcrAvailResourceTypeParam param) throws Exception;

    /**
     * 获取可用UAI-OCR资源类型 (回调)
     *
     * @param param     参数对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void getUAIOcrAvailResourceType(GetUAIOcrAvailResourceTypeParam param,
                                    UcloudHandler<GetUAIOcrAvailResourceTypeResult> handler,
                                    Boolean... asyncFlag);

}
