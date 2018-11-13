package cn.ucloud.common.client;


import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.model.GetProjectListResult;
import cn.ucloud.common.model.GetRegionResult;

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
     *  获取地域信息-GetRegion (回调)
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
    GetProjectListResult getProductList() throws Exception;

    /**
     *  获取项目列表-GetProjectList (回调)
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void getProductList( UcloudHandler<GetProjectListResult> handler, Boolean... asyncFlag);

}
