package cn.ucloud.common.handler;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @description:
 * @author: codezhang
 * @date: 2018-09-14 10:12
 **/
public interface UcloudHandler<R extends BaseResponseResult> {
    /**
     * 成功请求 处理函数
     *
     * @param result 请求结果
     * @return 任意返回数据
     */
    Object success(R result);

    /**
     * 失败请求 处理函数
     *
     * @param result 请求结果
     * @return 任意返回数据
     */
    Object failed(R result);

    /**
     * 请求发生错误 处理函数
     *
     * @param e 异常
     * @return 任意返回数据
     */
    Object error(Exception e);
}
