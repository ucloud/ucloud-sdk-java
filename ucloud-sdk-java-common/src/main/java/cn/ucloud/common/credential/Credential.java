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
package cn.ucloud.common.credential;

import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.common.request.Request;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import org.apache.commons.codec.digest.DigestUtils;

/** Credential is an object to represent the credential information */
public class Credential {

    private String privateKey;

    private String publicKey;

    /**
     * Credential constructor
     *
     * @param publicKey Public Key
     * @param privateKey
     */
    public Credential(String publicKey, String privateKey) {
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }

    public String verifyAc(Request request) throws UCloudException {
        Map<String, Object> params = request.encode();
        params.put("PublicKey", this.publicKey);
        String[] keys = params.keySet().toArray(new String[0]);
        Arrays.sort(keys);

        String s = "";
        for (String key : keys) {
            s = s.concat(key);
            s = s.concat(params.get(key).toString());
        }
        s = s.concat(this.privateKey);

        try {
            return sha1(s);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new UCloudException("sha1 error", e);
        }
    }

    public Request sign(Request request) throws UCloudException {
        request.setPublicKey(this.publicKey);
        request.setSignature(verifyAc(request));
        return request;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    private String sha1(String s) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        return formatBytes2HexString(DigestUtils.sha1(s));
    }

    public String formatBytes2HexString(byte[] data) {
        if (data == null || data.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : data) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
