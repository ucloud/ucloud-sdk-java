package cn.ucloud.ocr.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeParam;
import cn.ucloud.ocr.model.GetUAIOcrAvailResourceTypeResult;

/**
 * @Description : ocr 客户端接口
 * @Author : codezhang
 * @Date : 2019-04-19 15:24
 **/
public interface OcrClient extends UcloudClient {

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
