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

/** RequestOptions is the options to control the request behavior */
class RequestOptions {

    private Integer $maxRetries = 3;

    private Integer $timeout;

    public Integer loadMaxRetries() {
        return $maxRetries;
    }

    public void withMaxRetries(Integer maxRetries) {
        this.$maxRetries = maxRetries;
    }

    public Integer loadTimeout() {
        return $timeout;
    }

    public void withTimeout(Integer timeout) {
        this.$timeout = timeout;
    }
}
