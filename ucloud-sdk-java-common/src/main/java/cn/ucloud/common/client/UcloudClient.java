package cn.ucloud.common.client;


import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.model.GetProjectListParam;
import cn.ucloud.common.model.GetProjectListResult;
import cn.ucloud.common.model.GetRegionParam;
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
     * @param param {@link GetRegionParam}参数对象
     * @return {@link GetRegionResult} 结果对象
     * @throws Exception 出错抛出异常
     */
    GetRegionResult getRegion(GetRegionParam param) throws Exception;

    /**
     *  获取地域信息-GetRegion (回调)
     *
     * @param param     {@link GetRegionParam}  参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void getRegion(GetRegionParam param, UcloudHandler<GetRegionResult> handler, Boolean... asyncFlag);


    /**
     * 获取项目列表-GetProjectList
     *
     * @param param {@link GetProjectListParam}参数对象
     * @return {@link GetProjectListResult} 结果对象
     * @throws Exception 出错抛出异常
     */
    GetProjectListResult getProductList(GetProjectListParam param) throws Exception;

    /**
     *  获取项目列表-GetProjectList (回调)
     *
     * @param param     {@link GetProjectListParam}  参数对象
     * @param handler   {@link UcloudHandler}回调callback
     * @param asyncFlag 是否异步
     */
    void getProductList(GetProjectListParam param, UcloudHandler<GetProjectListResult> handler, Boolean... asyncFlag);

}
