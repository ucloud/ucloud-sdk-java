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
package cn.ucloud.udns.client;

import cn.ucloud.common.client.Client;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.udns.models.AssociateUDNSZoneVPCRequest;
import cn.ucloud.udns.models.AssociateUDNSZoneVPCResponse;
import cn.ucloud.udns.models.CreateUDNSRecordRequest;
import cn.ucloud.udns.models.CreateUDNSRecordResponse;
import cn.ucloud.udns.models.CreateUDNSZoneRequest;
import cn.ucloud.udns.models.CreateUDNSZoneResponse;
import cn.ucloud.udns.models.DeleteUDNSRecordRequest;
import cn.ucloud.udns.models.DeleteUDNSRecordResponse;
import cn.ucloud.udns.models.DescribeUDNSDomainRequest;
import cn.ucloud.udns.models.DescribeUDNSDomainResponse;
import cn.ucloud.udns.models.DescribeUDNSRecordRequest;
import cn.ucloud.udns.models.DescribeUDNSRecordResponse;
import cn.ucloud.udns.models.DescribeUDNSZoneRequest;
import cn.ucloud.udns.models.DescribeUDNSZoneResponse;
import cn.ucloud.udns.models.DisassociateUDNSZoneVPCRequest;
import cn.ucloud.udns.models.DisassociateUDNSZoneVPCResponse;
import cn.ucloud.udns.models.ModifyUDNSRecordRequest;
import cn.ucloud.udns.models.ModifyUDNSRecordResponse;
import cn.ucloud.udns.models.ModifyUDNSZoneRequest;
import cn.ucloud.udns.models.ModifyUDNSZoneResponse;

/** This client is used to call actions of **UDNS** service */
public interface UDNSClientInterface extends Client {

    /**
     * AssociateUDNSZoneVPC - 绑定域名与VPC
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AssociateUDNSZoneVPCResponse associateUDNSZoneVPC(AssociateUDNSZoneVPCRequest request)
            throws UCloudException;

    /**
     * CreateUDNSRecord - 创建域名记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUDNSRecordResponse createUDNSRecord(CreateUDNSRecordRequest request)
            throws UCloudException;

    /**
     * CreateUDNSZone - 创建域名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUDNSZoneResponse createUDNSZone(CreateUDNSZoneRequest request)
            throws UCloudException;

    /**
     * DeleteUDNSRecord - 删除域名记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUDNSRecordResponse deleteUDNSRecord(DeleteUDNSRecordRequest request)
            throws UCloudException;

    /**
     * DescribeUDNSDomain - zone下所有域名的rr记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUDNSDomainResponse describeUDNSDomain(DescribeUDNSDomainRequest request)
            throws UCloudException;

    /**
     * DescribeUDNSRecord - 获取域名记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUDNSRecordResponse describeUDNSRecord(DescribeUDNSRecordRequest request)
            throws UCloudException;

    /**
     * DescribeUDNSZone - 获取域名信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUDNSZoneResponse describeUDNSZone(DescribeUDNSZoneRequest request)
            throws UCloudException;

    /**
     * DisassociateUDNSZoneVPC - 解绑域名和VPC
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DisassociateUDNSZoneVPCResponse disassociateUDNSZoneVPC(
            DisassociateUDNSZoneVPCRequest request) throws UCloudException;

    /**
     * ModifyUDNSRecord - 修改域名记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUDNSRecordResponse modifyUDNSRecord(ModifyUDNSRecordRequest request)
            throws UCloudException;

    /**
     * ModifyUDNSZone - 修改域名属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUDNSZoneResponse modifyUDNSZone(ModifyUDNSZoneRequest request)
            throws UCloudException;
}
