package cn.ucloud.ufs.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description: 文件存储接口
 * @author: codezhang
 * @date: 2018-10-08 14:31
 **/
public interface UFSClient  {

    /**
     * 创建文件系统
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult createUFSVolume(BaseRequestParam param) throws Exception;

    /**
     * 创建文件系统
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void createUFSVolume(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag);


    /**
     * 获取文件系统列表
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult describeUFSVolume(BaseRequestParam param) throws Exception;

    /**
     * 获取文件系统列表
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeUFSVolume(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag);


    /**
     * 获取文件系统价格
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult describeUFSVolumePrice(BaseRequestParam param) throws Exception;

    /**
     * 获取文件系统价格
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeUFSVolumePrice(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag);



    /**
     * 文件系统扩容价格
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult describeUFSVolumeUpgradePrice(BaseRequestParam param) throws Exception;

    /**
     * 文件系统扩容价格
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeUFSVolumeUpgradePrice(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag);


    /**
     * 获取文件系统白名单
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult describeUFSVolumeWhiteList(BaseRequestParam param) throws Exception;

    /**
     * 获取文件系统白名单
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void describeUFSVolumeWhiteList(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag);


    /**
     * 文件系统扩容
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult extendUFSVolume(BaseRequestParam param) throws Exception;

    /**
     * 文件系统扩容
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void extendUFSVolume(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag);


    /**
     * 初始化文件系统白名单
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult initUFSVolumeWhiteList(BaseRequestParam param) throws Exception;

    /**
     * 初始化文件系统白名单
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void initUFSVolumeWhiteList(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag);


    /**
     * 删除文件系统
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult removeUFSVolume(BaseRequestParam param) throws Exception;

    /**
     * 删除文件系统
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void removeUFSVolume(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag);


    /**
     * 更改文件系统相关信息（名称／备注）
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult updateUFSVolumeInfo(BaseRequestParam param) throws Exception;

    /**
     * 更改文件系统相关信息（名称／备注）
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateUFSVolumeInfo(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag);



    /**
     * 更新文件系统白名单
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    BaseResponseResult updateUFSVolumeWhiteList(BaseRequestParam param) throws Exception;

    /**
     * 更新文件系统白名单
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateUFSVolumeWhiteList(BaseRequestParam param, UcloudHandler<BaseResponseResult> handler, Boolean... asyncFlag);

}
