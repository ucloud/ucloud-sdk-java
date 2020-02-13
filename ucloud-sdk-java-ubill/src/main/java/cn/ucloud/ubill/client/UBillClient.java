package cn.ucloud.ubill.client;

import cn.ucloud.common.client.UcloudClient;
import cn.ucloud.common.handler.UcloudHandler;
import cn.ucloud.ubill.model.DescribeOrderDetailInfoParam;
import cn.ucloud.ubill.model.DescribeOrderDetailInfoResult;
import cn.ucloud.ubill.model.GetBillDataFileUrlParam;
import cn.ucloud.ubill.model.GetBillDataFileUrlResult;

/**
 * @author: codezhang
 * @date: 2020/2/13 10:12 上午
 * @describe:
 **/
public interface UBillClient extends UcloudClient {

    /**
     * 获取订单信息
     * @param param 获取订单信息参数对象
     * @return 订单信息
     * @throws Exception
     */
    DescribeOrderDetailInfoResult describeOrderDetailInfo(DescribeOrderDetailInfoParam param) throws Exception;

    /**
     * 获取订单信息（回调）
     * @param param 获取订单信息参数对象
     * @param handler 回调接口
     * @param asyncFlag 是否异步
     */
    void describeOrderDetailInfo(DescribeOrderDetailInfoParam param, UcloudHandler<DescribeOrderDetailInfoResult> handler,
                           Boolean... asyncFlag);

    /**
     * 生成账单数据文件下载的 url
     * @param param 参数对象
     * @return 结果对象
     * @throws Exception
     */
    GetBillDataFileUrlResult getBillDataFileUrl(GetBillDataFileUrlParam param) throws Exception;

    /**
     * 生成账单数据文件下载的 url(回调)
     * @param param 参数对象
     * @param handler 回调接口
     * @param asyncFlag 是否异步
     */
    void getBillDataFileUrl(GetBillDataFileUrlParam param, UcloudHandler<GetBillDataFileUrlResult> handler,
                                 Boolean... asyncFlag);
}
