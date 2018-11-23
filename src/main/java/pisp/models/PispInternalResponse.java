/*
 *   Copyright (c) 2018, WSO2 Inc. (http://www.wso2.com). All Rights Reserved.
 *   This software is the property of WSO2 Inc. and its suppliers, if any.
 *   Dissemination of any information or reproduction of any material contained
 *   herein is strictly forbidden, unless permitted by WSO2 in accordance with
 *   the WSO2 Commercial License available at http://wso2.com/licenses. For specific
 *   language governing the permissions and limitations under this license,
 *   please see the license as well as any agreement you’ve entered into with
 *   WSO2 governing the purchase of this software and any associated services.
 */

package pisp.models;

public class PispInternalResponse {
    private String message;
    private Object data;
    private boolean operationSuccessful;

    public PispInternalResponse(String message, boolean operationSuccessful) {
        this.setMessage(message);
        this.operationSuccessful = operationSuccessful;
    }

    public PispInternalResponse(Object data, boolean operationSuccessful) {
        this.setData(data);
        this.operationSuccessful = operationSuccessful;
    }

    public boolean isOperationSuccessful() {
        return operationSuccessful;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Object data) {
        this.data = data;
    }
}