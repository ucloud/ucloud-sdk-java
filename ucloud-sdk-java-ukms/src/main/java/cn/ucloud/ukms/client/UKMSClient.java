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
package cn.ucloud.ukms.client;

import cn.ucloud.common.client.DefaultClient;
import cn.ucloud.common.config.Config;
import cn.ucloud.common.credential.Credential;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.ukms.models.CancelKeyDeletionRequest;
import cn.ucloud.ukms.models.CancelKeyDeletionResponse;
import cn.ucloud.ukms.models.CreateAliasRequest;
import cn.ucloud.ukms.models.CreateAliasResponse;
import cn.ucloud.ukms.models.CreateKeyRequest;
import cn.ucloud.ukms.models.CreateKeyResponse;
import cn.ucloud.ukms.models.DecryptRequest;
import cn.ucloud.ukms.models.DecryptResponse;
import cn.ucloud.ukms.models.DeleteAliasRequest;
import cn.ucloud.ukms.models.DeleteAliasResponse;
import cn.ucloud.ukms.models.DescribeKeyRequest;
import cn.ucloud.ukms.models.DescribeKeyResponse;
import cn.ucloud.ukms.models.DisableKeyRequest;
import cn.ucloud.ukms.models.DisableKeyResponse;
import cn.ucloud.ukms.models.DisableKeyRotationRequest;
import cn.ucloud.ukms.models.DisableKeyRotationResponse;
import cn.ucloud.ukms.models.EnableKeyRequest;
import cn.ucloud.ukms.models.EnableKeyResponse;
import cn.ucloud.ukms.models.EnableKeyRotationRequest;
import cn.ucloud.ukms.models.EnableKeyRotationResponse;
import cn.ucloud.ukms.models.EncryptRequest;
import cn.ucloud.ukms.models.EncryptResponse;
import cn.ucloud.ukms.models.GenerateDataKeyPairRequest;
import cn.ucloud.ukms.models.GenerateDataKeyPairResponse;
import cn.ucloud.ukms.models.GenerateDataKeyPairWithoutPlaintextRequest;
import cn.ucloud.ukms.models.GenerateDataKeyPairWithoutPlaintextResponse;
import cn.ucloud.ukms.models.GenerateDataKeyRequest;
import cn.ucloud.ukms.models.GenerateDataKeyResponse;
import cn.ucloud.ukms.models.GenerateDataKeyWithoutPlaintextRequest;
import cn.ucloud.ukms.models.GenerateDataKeyWithoutPlaintextResponse;
import cn.ucloud.ukms.models.GenerateMacRequest;
import cn.ucloud.ukms.models.GenerateMacResponse;
import cn.ucloud.ukms.models.GenerateRandomRequest;
import cn.ucloud.ukms.models.GenerateRandomResponse;
import cn.ucloud.ukms.models.GetKeyRotationStatusRequest;
import cn.ucloud.ukms.models.GetKeyRotationStatusResponse;
import cn.ucloud.ukms.models.GetPublicKeyRequest;
import cn.ucloud.ukms.models.GetPublicKeyResponse;
import cn.ucloud.ukms.models.ListAliasesRequest;
import cn.ucloud.ukms.models.ListAliasesResponse;
import cn.ucloud.ukms.models.ListKeysRequest;
import cn.ucloud.ukms.models.ListKeysResponse;
import cn.ucloud.ukms.models.ListScheduleDeletionKeysRequest;
import cn.ucloud.ukms.models.ListScheduleDeletionKeysResponse;
import cn.ucloud.ukms.models.RotateKeyOnDemandRequest;
import cn.ucloud.ukms.models.RotateKeyOnDemandResponse;
import cn.ucloud.ukms.models.ScheduleKeyDeletionRequest;
import cn.ucloud.ukms.models.ScheduleKeyDeletionResponse;
import cn.ucloud.ukms.models.SignRequest;
import cn.ucloud.ukms.models.SignResponse;
import cn.ucloud.ukms.models.UpdateAliasRequest;
import cn.ucloud.ukms.models.UpdateAliasResponse;
import cn.ucloud.ukms.models.UpdateKeyDescriptionRequest;
import cn.ucloud.ukms.models.UpdateKeyDescriptionResponse;
import cn.ucloud.ukms.models.VerifyMacRequest;
import cn.ucloud.ukms.models.VerifyMacResponse;
import cn.ucloud.ukms.models.VerifyRequest;
import cn.ucloud.ukms.models.VerifyResponse;

/** This client is used to call actions of **UKMS** service */
public class UKMSClient extends DefaultClient implements UKMSClientInterface {
    public UKMSClient(Config config, Credential credential) {
        super(config, credential);
    }

    /**
     * CancelKeyDeletion - 取消密钥计划删除
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request)
            throws UCloudException {
        request.setAction("CancelKeyDeletion");
        return (CancelKeyDeletionResponse) this.invoke(request, CancelKeyDeletionResponse.class);
    }

    /**
     * CreateAlias - 创建别名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateAliasResponse createAlias(CreateAliasRequest request) throws UCloudException {
        request.setAction("CreateAlias");
        return (CreateAliasResponse) this.invoke(request, CreateAliasResponse.class);
    }

    /**
     * CreateKey - 创建密钥
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public CreateKeyResponse createKey(CreateKeyRequest request) throws UCloudException {
        request.setAction("CreateKey");
        return (CreateKeyResponse) this.invoke(request, CreateKeyResponse.class);
    }

    /**
     * Decrypt - 解密
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DecryptResponse decrypt(DecryptRequest request) throws UCloudException {
        request.setAction("Decrypt");
        return (DecryptResponse) this.invoke(request, DecryptResponse.class);
    }

    /**
     * DeleteAlias - 删除别名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DeleteAliasResponse deleteAlias(DeleteAliasRequest request) throws UCloudException {
        request.setAction("DeleteAlias");
        return (DeleteAliasResponse) this.invoke(request, DeleteAliasResponse.class);
    }

    /**
     * DescribeKey - 查看主密钥
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DescribeKeyResponse describeKey(DescribeKeyRequest request) throws UCloudException {
        request.setAction("DescribeKey");
        return (DescribeKeyResponse) this.invoke(request, DescribeKeyResponse.class);
    }

    /**
     * DisableKey - 禁用密钥
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DisableKeyResponse disableKey(DisableKeyRequest request) throws UCloudException {
        request.setAction("DisableKey");
        return (DisableKeyResponse) this.invoke(request, DisableKeyResponse.class);
    }

    /**
     * DisableKeyRotation - 关闭密钥轮转
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public DisableKeyRotationResponse disableKeyRotation(DisableKeyRotationRequest request)
            throws UCloudException {
        request.setAction("DisableKeyRotation");
        return (DisableKeyRotationResponse) this.invoke(request, DisableKeyRotationResponse.class);
    }

    /**
     * EnableKey - 启用密钥
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public EnableKeyResponse enableKey(EnableKeyRequest request) throws UCloudException {
        request.setAction("EnableKey");
        return (EnableKeyResponse) this.invoke(request, EnableKeyResponse.class);
    }

    /**
     * EnableKeyRotation - 开启密钥轮转
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public EnableKeyRotationResponse enableKeyRotation(EnableKeyRotationRequest request)
            throws UCloudException {
        request.setAction("EnableKeyRotation");
        return (EnableKeyRotationResponse) this.invoke(request, EnableKeyRotationResponse.class);
    }

    /**
     * Encrypt - 加密
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public EncryptResponse encrypt(EncryptRequest request) throws UCloudException {
        request.setAction("Encrypt");
        return (EncryptResponse) this.invoke(request, EncryptResponse.class);
    }

    /**
     * GenerateDataKey - 创建数据密钥
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GenerateDataKeyResponse generateDataKey(GenerateDataKeyRequest request)
            throws UCloudException {
        request.setAction("GenerateDataKey");
        return (GenerateDataKeyResponse) this.invoke(request, GenerateDataKeyResponse.class);
    }

    /**
     * GenerateDataKeyPair - 创建数据密钥对
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GenerateDataKeyPairResponse generateDataKeyPair(GenerateDataKeyPairRequest request)
            throws UCloudException {
        request.setAction("GenerateDataKeyPair");
        return (GenerateDataKeyPairResponse)
                this.invoke(request, GenerateDataKeyPairResponse.class);
    }

    /**
     * GenerateDataKeyPairWithoutPlaintext - 创建数据密钥对（无明文返回）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GenerateDataKeyPairWithoutPlaintextResponse generateDataKeyPairWithoutPlaintext(
            GenerateDataKeyPairWithoutPlaintextRequest request) throws UCloudException {
        request.setAction("GenerateDataKeyPairWithoutPlaintext");
        return (GenerateDataKeyPairWithoutPlaintextResponse)
                this.invoke(request, GenerateDataKeyPairWithoutPlaintextResponse.class);
    }

    /**
     * GenerateDataKeyWithoutPlaintext - 创建数据密钥（无明文）
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GenerateDataKeyWithoutPlaintextResponse generateDataKeyWithoutPlaintext(
            GenerateDataKeyWithoutPlaintextRequest request) throws UCloudException {
        request.setAction("GenerateDataKeyWithoutPlaintext");
        return (GenerateDataKeyWithoutPlaintextResponse)
                this.invoke(request, GenerateDataKeyWithoutPlaintextResponse.class);
    }

    /**
     * GenerateMac - 生成MAC
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GenerateMacResponse generateMac(GenerateMacRequest request) throws UCloudException {
        request.setAction("GenerateMac");
        return (GenerateMacResponse) this.invoke(request, GenerateMacResponse.class);
    }

    /**
     * GenerateRandom - 生成随机数
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GenerateRandomResponse generateRandom(GenerateRandomRequest request)
            throws UCloudException {
        request.setAction("GenerateRandom");
        return (GenerateRandomResponse) this.invoke(request, GenerateRandomResponse.class);
    }

    /**
     * GetKeyRotationStatus - 获取密钥轮转状态
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetKeyRotationStatusResponse getKeyRotationStatus(GetKeyRotationStatusRequest request)
            throws UCloudException {
        request.setAction("GetKeyRotationStatus");
        return (GetKeyRotationStatusResponse)
                this.invoke(request, GetKeyRotationStatusResponse.class);
    }

    /**
     * GetPublicKey - 获取公钥
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public GetPublicKeyResponse getPublicKey(GetPublicKeyRequest request) throws UCloudException {
        request.setAction("GetPublicKey");
        return (GetPublicKeyResponse) this.invoke(request, GetPublicKeyResponse.class);
    }

    /**
     * ListAliases - 获取别名列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListAliasesResponse listAliases(ListAliasesRequest request) throws UCloudException {
        request.setAction("ListAliases");
        return (ListAliasesResponse) this.invoke(request, ListAliasesResponse.class);
    }

    /**
     * ListKeys - 获取主密钥列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListKeysResponse listKeys(ListKeysRequest request) throws UCloudException {
        request.setAction("ListKeys");
        return (ListKeysResponse) this.invoke(request, ListKeysResponse.class);
    }

    /**
     * ListScheduleDeletionKeys - 获取计划删除密钥列表
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ListScheduleDeletionKeysResponse listScheduleDeletionKeys(
            ListScheduleDeletionKeysRequest request) throws UCloudException {
        request.setAction("ListScheduleDeletionKeys");
        return (ListScheduleDeletionKeysResponse)
                this.invoke(request, ListScheduleDeletionKeysResponse.class);
    }

    /**
     * RotateKeyOnDemand - 按需轮转密钥
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public RotateKeyOnDemandResponse rotateKeyOnDemand(RotateKeyOnDemandRequest request)
            throws UCloudException {
        request.setAction("RotateKeyOnDemand");
        return (RotateKeyOnDemandResponse) this.invoke(request, RotateKeyOnDemandResponse.class);
    }

    /**
     * ScheduleKeyDeletion - 计划删除密钥
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public ScheduleKeyDeletionResponse scheduleKeyDeletion(ScheduleKeyDeletionRequest request)
            throws UCloudException {
        request.setAction("ScheduleKeyDeletion");
        return (ScheduleKeyDeletionResponse)
                this.invoke(request, ScheduleKeyDeletionResponse.class);
    }

    /**
     * Sign - 签名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public SignResponse sign(SignRequest request) throws UCloudException {
        request.setAction("Sign");
        return (SignResponse) this.invoke(request, SignResponse.class);
    }

    /**
     * UpdateAlias - 更新别名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateAliasResponse updateAlias(UpdateAliasRequest request) throws UCloudException {
        request.setAction("UpdateAlias");
        return (UpdateAliasResponse) this.invoke(request, UpdateAliasResponse.class);
    }

    /**
     * UpdateKeyDescription - 更新主密钥描述信息
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public UpdateKeyDescriptionResponse updateKeyDescription(UpdateKeyDescriptionRequest request)
            throws UCloudException {
        request.setAction("UpdateKeyDescription");
        return (UpdateKeyDescriptionResponse)
                this.invoke(request, UpdateKeyDescriptionResponse.class);
    }

    /**
     * Verify - 验签
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public VerifyResponse verify(VerifyRequest request) throws UCloudException {
        request.setAction("Verify");
        return (VerifyResponse) this.invoke(request, VerifyResponse.class);
    }

    /**
     * VerifyMac - 验证Mac签名
     *
     * @param request Request object
     * @throws UCloudException Exception
     */
    public VerifyMacResponse verifyMac(VerifyMacRequest request) throws UCloudException {
        request.setAction("VerifyMac");
        return (VerifyMacResponse) this.invoke(request, VerifyMacResponse.class);
    }
}
