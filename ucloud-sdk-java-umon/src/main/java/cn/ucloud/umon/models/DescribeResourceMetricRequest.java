/**
 * Copyright 2021 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ucloud.umon.models;


import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.request.Request;

public class DescribeResourceMetricRequest extends Request {

    /**
     * 资源类型 支持如下类型： dbaudit：数据库审计； docker:容器服务； docker_node:容器服务节点； eip：弹性IP； fortress:堡垒机；
     * hybridcloud_lan:混合云局域网； hybridcloud_port:混合云交换机端口； hybridcloud_port_sum:混合云外网总出口； mq：消息队列；
     * natgw：NAT网关； phost：物理云主机； sharebandwidth：共享带宽； uaiservice：AI在线服务； ucdn：云分发； udb：云数据库；
     * uddb：分布式数据库； uddbac：UDDB分析节点； uddbmd：分布式数据库中间件； uddbnode：分布式数据库节点； udisk：云硬盘；
     * udisk_rssd：RSSD云硬盘； udisk_ssd：SSD云硬盘（数据盘）； udisk_sys：普通云硬盘（系统盘）； udpn：高速通道； udset:私有专区资源池；
     * udset_uhost:资源池主机； udw：云数据仓库； udw_node:云数据仓库节点； ues：ES服务； ues_node：elasticsearch服务节点；
     * ufile：对象存储； ufs：文件存储； ugaa：全球动态加速； ugc：通用计算； uhadoop：托管Hadoop集群； uhadoop_host：托管Hadoop集群；
     * uhost：云主机； ukafka：Kafka消息队列； ukafka_host：分布式消息节点； ukv：容量型KV存储； ulb：负载均衡； ulb-server：真实服务节点；
     * ulb-vserver：虚拟服务节点； umem：云内存存储； umemcache：单机版memcache； upath：加速线路； uredis：云内存存储； utsdb：时序数据库；
     * vpntunnel：vpn隧道； vserver：虚拟服务节点；
     *
     * <p>各产品支持监控项，请查看：https://docs.ucloud.cn/api/umon-api/get_metric
     */
    @NotEmpty
    @UCloudParam("ResourceType")
    private String resourceType;

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
