package cn.ucloud.client;

import cn.ucloud.handler.UcloudHandler;
import cn.ucloud.model.DescribeUDiskPriceParam;
import cn.ucloud.model.DescribeUDiskPriceResult;

/**
 * @description:
 * @author: joshua
 * @E-mail: joshua.yin@ucloud.cn
 * @date: 2018/9/17 19:07
 */
public interface UdiskClient {

    /**
     * 获取云硬盘价格-DescribeUDiskPrice
     *
     * @param param 参数对象
     * @return DescribeUDiskPriceResult 结果对象
     * @throws Exception 出错抛出异常
     */
    DescribeUDiskPriceResult getDescribeUDiskPrice(DescribeUDiskPriceParam param) throws Exception;

    /**
     * 获取云硬盘价格-DescribeUDiskPrice (回调)
     * @param param 参数对象
     * @param handler 回调callback
     * @param asyncFlag 是否异步
     */
    void getDescribeUDiskPriceCallback(DescribeUDiskPriceParam param, UcloudHandler handler, Boolean... asyncFlag);
}
