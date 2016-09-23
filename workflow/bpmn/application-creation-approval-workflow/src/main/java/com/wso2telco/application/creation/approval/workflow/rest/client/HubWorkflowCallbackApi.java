/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.wso2telco.application.creation.approval.workflow.rest.client;

import com.wso2telco.application.creation.approval.workflow.exception.HubWorkflowCallbackApiException;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface HubWorkflowCallbackApi {

    @RequestLine("POST site/blocks/workflow/workflow-listener/ajax/workflow-listener.jag?workflowReference={workflowRefId}&status={status}")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    void invokeCallback (@Param("workflowRefId") String workflowRefId, @Param("status") String status) throws HubWorkflowCallbackApiException;
}
