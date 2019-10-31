package cn.ucloud.common.client;


import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.model.GetProjectListResult;
import cn.ucloud.common.model.GetRegionResult;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: ucloud基础服务client
 * @author: codezhang
 * @date: 2018-09-13 11:01
 **/

public interface UcloudClient {

    /**
     * 获取地域信息-GetRegion
     *
     * @return {@link GetRegionResult} 结果对象
     * @throws Exception 出错抛出异常
     */
    GetRegionResult getRegion() throws Exception;

    /**
     * 获取地域信息-GetRegion (回调)
     *
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void getRegion(UcloudHandler<GetRegionResult> handler, Boolean... asyncFlag);


    /**
     * 获取项目列表-GetProjectList
     *
     * @return {@link GetProjectListResult} 结果对象
     * @throws Exception 出错抛出异常
     */
    GetProjectListResult getProjectList() throws Exception;


    /**
     * 获取项目列表-GetProjectList (回调)
     *
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void getProjectList(UcloudHandler<GetProjectListResult> handler, Boolean... asyncFlag);


    /**
     * 适用于调用所有接口
     *
     * @param param 请求参数
     * @param clazz 结果对象类
     * @return 结果对象
     * @throws Exception
     */
    BaseResponseResult doAction(BaseRequestParam param, Class<? extends BaseResponseResult> clazz) throws Exception;


    /**
     * 适用于调用所有接口,回调方式
     *
     * @param param     请求参数
     * @param clazz     结果类对象
     * @param handler   回调接口
     * @param asyncFlag 是否异步
     */
    void doAction(BaseRequestParam param,
                  Class<? extends BaseResponseResult> clazz,
                  UcloudHandler<? extends BaseResponseResult> handler,
                  Boolean... asyncFlag);

}
