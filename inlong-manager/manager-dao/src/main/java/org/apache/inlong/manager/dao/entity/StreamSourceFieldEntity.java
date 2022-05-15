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

package org.apache.inlong.manager.dao.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Stream source field entity, including field name, field value, etc.
 */
@Data
public class StreamSourceFieldEntity implements Serializable {
    private Integer id;

    private String inlongGroupId;

    private String inlongStreamId;

    private Integer sourceId;

    private String sourceType;

    private String fieldName;

    private String fieldValue;

    private String preExpression;

    private String fieldType;

    private String fieldComment;

    private Integer isMetaField;

    private String fieldFormat;

    private Integer rankNum;

    private Integer isDeleted;
}