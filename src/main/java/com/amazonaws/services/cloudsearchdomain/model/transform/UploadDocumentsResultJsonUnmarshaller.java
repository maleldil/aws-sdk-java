/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudsearchdomain.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Upload Documents Result JSON Unmarshaller
 */
public class UploadDocumentsResultJsonUnmarshaller implements Unmarshaller<UploadDocumentsResult, JsonUnmarshallerContext> {

    public UploadDocumentsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UploadDocumentsResult uploadDocumentsResult = new UploadDocumentsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    uploadDocumentsResult.setStatus(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("adds", targetDepth)) {
                    context.nextToken();
                    uploadDocumentsResult.setAdds(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deletes", targetDepth)) {
                    context.nextToken();
                    uploadDocumentsResult.setDeletes(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("warnings", targetDepth)) {
                    context.nextToken();
                    uploadDocumentsResult.setWarnings(new ListUnmarshaller<DocumentServiceWarning>(DocumentServiceWarningJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return uploadDocumentsResult;
    }

    private static UploadDocumentsResultJsonUnmarshaller instance;
    public static UploadDocumentsResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new UploadDocumentsResultJsonUnmarshaller();
        return instance;
    }
}
    