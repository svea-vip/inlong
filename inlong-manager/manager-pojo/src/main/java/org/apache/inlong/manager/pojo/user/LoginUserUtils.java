/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.manager.pojo.user;

import lombok.extern.slf4j.Slf4j;

/**
 * User info for login
 */
@Slf4j
public class LoginUserUtils {

    /**
     * ThreadLocal for user info
     */
    private static final ThreadLocal<UserInfo> LOGIN_USER_DETAIL_TL = new ThreadLocal<>();

    public static UserInfo getLoginUser() {
        return LOGIN_USER_DETAIL_TL.get();
    }

    public static void setUserLoginInfo(UserInfo userInfo) {
        LOGIN_USER_DETAIL_TL.set(userInfo);
        log.debug("user login: {}", userInfo.getName());
    }

    public static void removeUserLoginInfo() {
        LOGIN_USER_DETAIL_TL.remove();
    }

}