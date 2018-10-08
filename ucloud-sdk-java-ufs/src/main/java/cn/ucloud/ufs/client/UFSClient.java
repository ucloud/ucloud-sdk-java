package cn.ucloud.ufs.client;

import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.common.pojo.BaseRequestParam;
import cn.ucloud.common.pojo.BaseResponseResult;
import cn.ucloud.ufs.model.*;

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
    ExtendUFSVolumeResult extendUFSVolume(ExtendUFSVolumeParam param) throws Exception;

    /**
     * 文件系统扩容
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void extendUFSVolume(ExtendUFSVolumeParam param, UcloudHandler<ExtendUFSVolumeResult> handler, Boolean... asyncFlag);


    /**
     * 初始化文件系统白名单
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    InitUFSVolumeWhiteListResult initUFSVolumeWhiteList(InitUFSVolumeWhiteListParam param) throws Exception;

    /**
     * 初始化文件系统白名单
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void initUFSVolumeWhiteList(InitUFSVolumeWhiteListParam param, UcloudHandler<InitUFSVolumeWhiteListResult> handler, Boolean... asyncFlag);


    /**
     * 删除文件系统
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    RemoveUFSVolumeResult removeUFSVolume(RemoveUFSVolumeParam param) throws Exception;

    /**
     * 删除文件系统
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void removeUFSVolume(RemoveUFSVolumeParam param, UcloudHandler<RemoveUFSVolumeResult> handler, Boolean... asyncFlag);


    /**
     * 更改文件系统相关信息（名称／备注）
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    UpdateUFSVolumeInfoResult updateUFSVolumeInfo(UpdateUFSVolumeInfoParam param) throws Exception;

    /**
     * 更改文件系统相关信息（名称／备注）
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateUFSVolumeInfo(UpdateUFSVolumeInfoParam param, UcloudHandler<UpdateUFSVolumeInfoResult> handler, Boolean... asyncFlag);



    /**
     * 更新文件系统白名单
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception 出错则抛出异常
     */
    UpdateUFSVolumeWhiteListResult updateUFSVolumeWhiteList(UpdateUFSVolumeWhiteListParam param) throws Exception;

    /**
     * 更新文件系统白名单
     * @param param     参数对象
     * @param handler   回调处理器
     * @param asyncFlag 异步标记，默认异步true
     */
    void updateUFSVolumeWhiteList(UpdateUFSVolumeWhiteListParam param, UcloudHandler<UpdateUFSVolumeWhiteListResult> handler, Boolean... asyncFlag);

}
