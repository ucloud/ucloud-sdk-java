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
package cn.ucloud.ukafka.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ukafka.models.AddUKafkaInstanceNodeRequest;
import cn.ucloud.ukafka.models.AddUKafkaInstanceNodeResponse;
import cn.ucloud.ukafka.models.CreateUKafkaInstanceRequest;
import cn.ucloud.ukafka.models.CreateUKafkaInstanceResponse;
import cn.ucloud.ukafka.models.DeleteUKafkaInstanceRequest;
import cn.ucloud.ukafka.models.DeleteUKafkaInstanceResponse;
import cn.ucloud.ukafka.models.DescribeUKafkaConsumerRequest;
import cn.ucloud.ukafka.models.DescribeUKafkaConsumerResponse;
import cn.ucloud.ukafka.models.DescribeUKafkaInstanceRequest;
import cn.ucloud.ukafka.models.DescribeUKafkaInstanceResponse;
import cn.ucloud.ukafka.models.GetUKafkaNodeTypeRequest;
import cn.ucloud.ukafka.models.GetUKafkaNodeTypeResponse;
import cn.ucloud.ukafka.models.IsUKafkaTopicNameExistRequest;
import cn.ucloud.ukafka.models.IsUKafkaTopicNameExistResponse;
import cn.ucloud.ukafka.models.ListUKafkaConsumersRequest;
import cn.ucloud.ukafka.models.ListUKafkaConsumersResponse;
import cn.ucloud.ukafka.models.ListUKafkaFrameworkVersionRequest;
import cn.ucloud.ukafka.models.ListUKafkaFrameworkVersionResponse;
import cn.ucloud.ukafka.models.ListUKafkaInstanceRequest;
import cn.ucloud.ukafka.models.ListUKafkaInstanceResponse;
import cn.ucloud.ukafka.models.ListUKafkaTopicsRequest;
import cn.ucloud.ukafka.models.ListUKafkaTopicsResponse;
import cn.ucloud.ukafka.models.ModifyUKafkaInstanceTypeRequest;
import cn.ucloud.ukafka.models.ModifyUKafkaInstanceTypeResponse;
import cn.ucloud.ukafka.models.ResizeUKafkaDiskRequest;
import cn.ucloud.ukafka.models.ResizeUKafkaDiskResponse;

/** This client is used to call actions of **UKafka** service */
public interface UKafkaClientInterface extends Client {

    /**
     * AddUKafkaInstanceNode - 给实例添加节点
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AddUKafkaInstanceNodeResponse addUKafkaInstanceNode(AddUKafkaInstanceNodeRequest request)
            throws UCloudException;

    /**
     * CreateUKafkaInstance - 创建一个实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUKafkaInstanceResponse createUKafkaInstance(CreateUKafkaInstanceRequest request)
            throws UCloudException;

    /**
     * DeleteUKafkaInstance - 删除实例
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUKafkaInstanceResponse deleteUKafkaInstance(DeleteUKafkaInstanceRequest request)
            throws UCloudException;

    /**
     * DescribeUKafkaConsumer - 获取 Kafka 消费组信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUKafkaConsumerResponse describeUKafkaConsumer(
            DescribeUKafkaConsumerRequest request) throws UCloudException;

    /**
     * DescribeUKafkaInstance - 获取整个集群的信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUKafkaInstanceResponse describeUKafkaInstance(
            DescribeUKafkaInstanceRequest request) throws UCloudException;

    /**
     * GetUKafkaNodeType - 获取节点机型配置
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetUKafkaNodeTypeResponse getUKafkaNodeType(GetUKafkaNodeTypeRequest request)
            throws UCloudException;

    /**
     * IsUKafkaTopicNameExist - 检查topic名称是否已存在
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public IsUKafkaTopicNameExistResponse isUKafkaTopicNameExist(
            IsUKafkaTopicNameExistRequest request) throws UCloudException;

    /**
     * ListUKafkaConsumers - 列出 Kafka 消费组
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUKafkaConsumersResponse listUKafkaConsumers(ListUKafkaConsumersRequest request)
            throws UCloudException;

    /**
     * ListUKafkaFrameworkVersion - 列举ukafka框架版本
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUKafkaFrameworkVersionResponse listUKafkaFrameworkVersion(
            ListUKafkaFrameworkVersionRequest request) throws UCloudException;

    /**
     * ListUKafkaInstance - 列举集群信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUKafkaInstanceResponse listUKafkaInstance(ListUKafkaInstanceRequest request)
            throws UCloudException;

    /**
     * ListUKafkaTopics - 列出 kafka 集群 topic
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListUKafkaTopicsResponse listUKafkaTopics(ListUKafkaTopicsRequest request)
            throws UCloudException;

    /**
     * ModifyUKafkaInstanceType - 规格升降级
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUKafkaInstanceTypeResponse modifyUKafkaInstanceType(
            ModifyUKafkaInstanceTypeRequest request) throws UCloudException;

    /**
     * ResizeUKafkaDisk - 磁盘扩容
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ResizeUKafkaDiskResponse resizeUKafkaDisk(ResizeUKafkaDiskRequest request)
            throws UCloudException;
}
