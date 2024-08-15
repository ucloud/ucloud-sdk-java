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

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
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
public class UDNSClient extends DefaultClient implements UDNSClientInterface {
    public UDNSClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * AssociateUDNSZoneVPC - 绑定域名与VPC
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public AssociateUDNSZoneVPCResponse associateUDNSZoneVPC(AssociateUDNSZoneVPCRequest request)
            throws UCloudException {
        request.setAction("AssociateUDNSZoneVPC");
        return (AssociateUDNSZoneVPCResponse)
                this.invoke(request, AssociateUDNSZoneVPCResponse.class);
    }

    /**
     * CreateUDNSRecord - 创建域名记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUDNSRecordResponse createUDNSRecord(CreateUDNSRecordRequest request)
            throws UCloudException {
        request.setAction("CreateUDNSRecord");
        return (CreateUDNSRecordResponse) this.invoke(request, CreateUDNSRecordResponse.class);
    }

    /**
     * CreateUDNSZone - 创建域名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUDNSZoneResponse createUDNSZone(CreateUDNSZoneRequest request)
            throws UCloudException {
        request.setAction("CreateUDNSZone");
        return (CreateUDNSZoneResponse) this.invoke(request, CreateUDNSZoneResponse.class);
    }

    /**
     * DeleteUDNSRecord - 删除域名记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteUDNSRecordResponse deleteUDNSRecord(DeleteUDNSRecordRequest request)
            throws UCloudException {
        request.setAction("DeleteUDNSRecord");
        return (DeleteUDNSRecordResponse) this.invoke(request, DeleteUDNSRecordResponse.class);
    }

    /**
     * DescribeUDNSDomain - zone下所有域名的rr记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUDNSDomainResponse describeUDNSDomain(DescribeUDNSDomainRequest request)
            throws UCloudException {
        request.setAction("DescribeUDNSDomain");
        return (DescribeUDNSDomainResponse) this.invoke(request, DescribeUDNSDomainResponse.class);
    }

    /**
     * DescribeUDNSRecord - 获取域名记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUDNSRecordResponse describeUDNSRecord(DescribeUDNSRecordRequest request)
            throws UCloudException {
        request.setAction("DescribeUDNSRecord");
        return (DescribeUDNSRecordResponse) this.invoke(request, DescribeUDNSRecordResponse.class);
    }

    /**
     * DescribeUDNSZone - 获取域名信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUDNSZoneResponse describeUDNSZone(DescribeUDNSZoneRequest request)
            throws UCloudException {
        request.setAction("DescribeUDNSZone");
        return (DescribeUDNSZoneResponse) this.invoke(request, DescribeUDNSZoneResponse.class);
    }

    /**
     * DisassociateUDNSZoneVPC - 解绑域名和VPC
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DisassociateUDNSZoneVPCResponse disassociateUDNSZoneVPC(
            DisassociateUDNSZoneVPCRequest request) throws UCloudException {
        request.setAction("DisassociateUDNSZoneVPC");
        return (DisassociateUDNSZoneVPCResponse)
                this.invoke(request, DisassociateUDNSZoneVPCResponse.class);
    }

    /**
     * ModifyUDNSRecord - 修改域名记录
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUDNSRecordResponse modifyUDNSRecord(ModifyUDNSRecordRequest request)
            throws UCloudException {
        request.setAction("ModifyUDNSRecord");
        return (ModifyUDNSRecordResponse) this.invoke(request, ModifyUDNSRecordResponse.class);
    }

    /**
     * ModifyUDNSZone - 修改域名属性
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ModifyUDNSZoneResponse modifyUDNSZone(ModifyUDNSZoneRequest request)
            throws UCloudException {
        request.setAction("ModifyUDNSZone");
        return (ModifyUDNSZoneResponse) this.invoke(request, ModifyUDNSZoneResponse.class);
    }
}
