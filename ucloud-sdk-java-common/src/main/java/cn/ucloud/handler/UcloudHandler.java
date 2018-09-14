package cn.ucloud.handler;

import cn.ucloud.pojo.BaseResponseResult;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-14 10:12
 **/
public interface UcloudHandler {
    /**
     * 成功请求 处理函数
     * @param result  请求结果
     * @return 任意返回数据
     */
    Object success(BaseResponseResult result);

    /**
     * 失败请求 处理函数
     * @param result 请求结果
     * @return 任意返回数据
     */
    Object failed(BaseResponseResult result);

    /**
     * 请求发生错误 处理函数
     * @param e 异常
     * @return 任意返回数据
     */
    Object error(Exception e);
}
