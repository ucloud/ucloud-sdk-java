package cn.ucloud.udb.model;

import cn.ucloud.common.pojo.BaseResponseResult;

/**
 * @Description : 修改UDB实例的配置
 * 修改（升级和降级）UDB实例的配置，包括内存和磁盘的配置，对于内存升级无需关闭实例，
 * 其他场景需要事先关闭实例。
 * 两套参数可以配置升降机：
 * 1.配置UseSSD和SSDType
 * 2.配置InstanceType，不需要配置InstanceMode。
 * 这两套第二套参数的优先级更高
 * @Author : codezhang
 * @Date : 2019-03-04 19:07
 **/
public class ResizeUDBInstanceResult extends BaseResponseResult {

}
