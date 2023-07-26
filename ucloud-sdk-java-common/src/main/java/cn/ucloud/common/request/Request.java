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
package cn.ucloud.common.request;

import cn.ucloud.common.annotation.NotEmpty;
import cn.ucloud.common.annotation.UCloudParam;
import cn.ucloud.common.exception.UCloudException;
import cn.ucloud.common.exception.ValidatorException;

import java.lang.reflect.Field;
import java.util.*;

/** Request is the base-class of all request object */
public class Request extends RequestOptions {
    @UCloudParam("Signature")
    private String signature;

    @UCloudParam("Action")
    private String action;

    @UCloudParam("PublicKey")
    private String publicKey;

    @UCloudParam("Region")
    private String region;

    @UCloudParam("ProjectId")
    private String projectId;

    public Request() {}

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * Encode will encode the request object to a map
     *
     * @return map representation of request
     */
    public Map<String, Object> encode() throws UCloudException {
        try {
            return encodeObject(this);
        } catch (ClassNotFoundException | IllegalAccessException e) {
            throw new UCloudException("cannot encode: " + e.getMessage(), e);
        }
    }

    private static Map<String, Object> encodeObject(Object obj)
            throws ClassNotFoundException, IllegalAccessException, UCloudException {
        Map<String, Object> params = new HashMap<>();

        for (Field field : getAllFields(obj.getClass())) {
            // only collect field with param paramAnnotation
            UCloudParam paramAnnotation = field.getAnnotation(UCloudParam.class);
            if (paramAnnotation == null) {
                continue;
            }
            String key = paramAnnotation.value();
            NotEmpty requiredAnnotation = field.getAnnotation(NotEmpty.class);

            // get field value
            field.setAccessible(true);
            Object value = field.get(obj);
            if (requiredAnnotation != null && value == null) {
                throw new ValidatorException(
                        String.format("%s can not be null", paramAnnotation.value()));
            }
            if (value == null) {
                continue;
            }

            // visit field recursive
            if (isPrimitive(value)) {
                params.put(key, value);
            } else if (isArray(value)) {
                List<Object> listValue = (List) value;
                for (int i = 0; i < listValue.size(); i++) {
                    Object item = listValue.get(i);
                    if (isObject(item)) {
                        for (Map.Entry<String, Object> entry : encodeObject(item).entrySet()) {
                            params.put(
                                    String.format("%s.%d.%s", key, i, entry.getKey()),
                                    entry.getValue());
                        }
                    } else {
                        params.put(String.format("%s.%d", key, i), item);
                    }
                }
            } else if (isObject(value)) {
                for (Map.Entry<String, Object> entry : encodeObject(value).entrySet()) {
                    params.put(String.format("%s.%s", key, entry.getKey()), entry.getValue());
                }
            } else {
                throw new ClassNotFoundException(
                        "invalid class ".concat(value.getClass().getName()));
            }
        }
        return params;
    }

    private static Boolean isArray(Object value) {
        return (value instanceof List);
    }

    private static Boolean isObject(Object value) {
        return value instanceof Request;
    }

    private static Boolean isPrimitive(Object value) {
        return (value instanceof Number || value instanceof String || value instanceof Boolean);
    }

    private static List<Field> getAllFields(Class<?> type) {
        List<Field> fields = new ArrayList<>(Arrays.asList(type.getDeclaredFields()));

        if (type.getSuperclass() != null) {
            fields.addAll(getAllFields(type.getSuperclass()));
        }
        return fields;
    }
}
