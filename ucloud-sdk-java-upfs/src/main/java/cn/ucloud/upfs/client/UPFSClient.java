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
package cn.ucloud.upfs.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.upfs.models.CreateUPFSVolumeRequest;
import cn.ucloud.upfs.models.CreateUPFSVolumeResponse;
import cn.ucloud.upfs.models.DescribeUPFSVolumePriceRequest;
import cn.ucloud.upfs.models.DescribeUPFSVolumePriceResponse;
import cn.ucloud.upfs.models.DescribeUPFSVolumeRequest;
import cn.ucloud.upfs.models.DescribeUPFSVolumeResponse;
import cn.ucloud.upfs.models.DescribeUPFSVolumeUpgradePriceRequest;
import cn.ucloud.upfs.models.DescribeUPFSVolumeUpgradePriceResponse;
import cn.ucloud.upfs.models.ExtendUPFSVolumeRequest;
import cn.ucloud.upfs.models.ExtendUPFSVolumeResponse;
import cn.ucloud.upfs.models.RemoveUPFSVolumeRequest;
import cn.ucloud.upfs.models.RemoveUPFSVolumeResponse;
import cn.ucloud.upfs.models.UpdateUPFSVolumeInfoRequest;
import cn.ucloud.upfs.models.UpdateUPFSVolumeInfoResponse;

/** This client is used to call actions of **UPFS** service */
public class UPFSClient extends DefaultClient implements UPFSClientInterface {
    public UPFSClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CreateUPFSVolume - 创建UPFS文件系统
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateUPFSVolumeResponse createUPFSVolume(CreateUPFSVolumeRequest request)
            throws UCloudException {
        request.setAction("CreateUPFSVolume");
        return (CreateUPFSVolumeResponse) this.invoke(request, CreateUPFSVolumeResponse.class);
    }

    /**
     * DescribeUPFSVolume - 获取UPFS文件系统列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPFSVolumeResponse describeUPFSVolume(DescribeUPFSVolumeRequest request)
            throws UCloudException {
        request.setAction("DescribeUPFSVolume");
        return (DescribeUPFSVolumeResponse) this.invoke(request, DescribeUPFSVolumeResponse.class);
    }

    /**
     * DescribeUPFSVolumePrice - 获取UPFS文件系统价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPFSVolumePriceResponse describeUPFSVolumePrice(
            DescribeUPFSVolumePriceRequest request) throws UCloudException {
        request.setAction("DescribeUPFSVolumePrice");
        return (DescribeUPFSVolumePriceResponse)
                this.invoke(request, DescribeUPFSVolumePriceResponse.class);
    }

    /**
     * DescribeUPFSVolumeUpgradePrice - UPFS文件系统扩容价格
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeUPFSVolumeUpgradePriceResponse describeUPFSVolumeUpgradePrice(
            DescribeUPFSVolumeUpgradePriceRequest request) throws UCloudException {
        request.setAction("DescribeUPFSVolumeUpgradePrice");
        return (DescribeUPFSVolumeUpgradePriceResponse)
                this.invoke(request, DescribeUPFSVolumeUpgradePriceResponse.class);
    }

    /**
     * ExtendUPFSVolume - UPFS文件系统扩容
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ExtendUPFSVolumeResponse extendUPFSVolume(ExtendUPFSVolumeRequest request)
            throws UCloudException {
        request.setAction("ExtendUPFSVolume");
        return (ExtendUPFSVolumeResponse) this.invoke(request, ExtendUPFSVolumeResponse.class);
    }

    /**
     * RemoveUPFSVolume - 删除UPFS文件系统
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RemoveUPFSVolumeResponse removeUPFSVolume(RemoveUPFSVolumeRequest request)
            throws UCloudException {
        request.setAction("RemoveUPFSVolume");
        return (RemoveUPFSVolumeResponse) this.invoke(request, RemoveUPFSVolumeResponse.class);
    }

    /**
     * UpdateUPFSVolumeInfo - 更改UPFS文件系统相关信息（名称／备注）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateUPFSVolumeInfoResponse updateUPFSVolumeInfo(UpdateUPFSVolumeInfoRequest request)
            throws UCloudException {
        request.setAction("UpdateUPFSVolumeInfo");
        return (UpdateUPFSVolumeInfoResponse)
                this.invoke(request, UpdateUPFSVolumeInfoResponse.class);
    }
}
