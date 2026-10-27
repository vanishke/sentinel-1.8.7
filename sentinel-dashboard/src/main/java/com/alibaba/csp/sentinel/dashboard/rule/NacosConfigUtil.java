/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel.dashboard.rule;

/**
 * @author Eric Zhao
 * @since 1.4.0
 */
public final class NacosConfigUtil {

    /**
     * Nacos Group。默认 {@code DEFAULT_GROUP_YML}，启动时由 {@code nacos.groupId} 覆盖，
     * 环境变量 {@code NACOS_GROUP_ID} 优先。
     * 不能声明为 {@code final}，否则编译器会把字面量内联进各个 Publisher / Provider。
     */
    public static String GROUP_ID = "DEFAULT_GROUP_YML";

    /**
     * 用配置值覆盖 Group。空白值忽略，继续使用当前值。
     */
    public static void applyGroupId(String groupId) {
        if (groupId == null) {
            return;
        }
        String trimmed = groupId.trim();
        if (trimmed.isEmpty()) {
            return;
        }
        GROUP_ID = trimmed;
    }
    /** 流控规则 */
    public static final String FLOW_DATA_ID_POSTFIX = "-flow-rules.json";
    public static final String PARAM_FLOW_DATA_ID_POSTFIX = "-param-rules.json";
    public static final String CLUSTER_MAP_DATA_ID_POSTFIX = "-cluster-map.json";

    /** 熔断规则 */
    public static final String DEGRADE_DATA_ID_POSTFIX = "-degrade-rules.json";
    /** 系统保护规则 */
    public static final String SYSTEM_DATA_ID_POSTFIX = "-system-rules.json";
    /** 访问控制规则 */
    public static final String AUTHORITY_DATA_ID_POSTFIX = "-authority-rules.json";
    /** 网关流控规则 */
    public static final String GATEWAY_FLOW_DATA_ID_POSTFIX = "-gw-flow-rules.json";
    /** 网关API分组管理规则 */
    public static final String GATEWAY_API_DATA_ID_POSTFIX = "-gw-api-group-rules.json";

    /**
     * cc for `cluster-client`
     */
    public static final String CLIENT_CONFIG_DATA_ID_POSTFIX = "-cc-config";
    /**
     * cs for `cluster-server`
     */
    public static final String SERVER_TRANSPORT_CONFIG_DATA_ID_POSTFIX = "-cs-transport-config";
    public static final String SERVER_FLOW_CONFIG_DATA_ID_POSTFIX = "-cs-flow-config";
    public static final String SERVER_NAMESPACE_SET_DATA_ID_POSTFIX = "-cs-namespace-set";

    private NacosConfigUtil() {}
}
