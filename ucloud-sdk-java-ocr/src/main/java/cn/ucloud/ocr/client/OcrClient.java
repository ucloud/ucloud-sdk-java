package cn.ucloud.ocr.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.ocr.model.CreateUAIOcrResourceParam;
import cn.ucloud.ocr.model.CreateUAIOcrResourceResult;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeParam;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeResult;
import cn.ucloud.ocr.model.GetUAIOcrResourceListParam;
import cn.ucloud.ocr.model.GetUAIOcrResourceListResult;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceMemoParam;
import cn.ucloud.ocr.model.ModifyUAIOcrResourceMemoResult;

/**
 * @Description : ocr 客户端接口
 * @Author : codezhang
 * @Date : 2019-04-19 15:24
 **/
public interface OcrClient extends UcloudClient {

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
