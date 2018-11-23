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

package pisp.utilities.constants;
//package com.wso2.openbanking.account.aggregator.utilities.constants;

/**
 * All the Error messages used in the application is here.
 */
public final class ErrorMessages {
    public static final String USERNAME_EXISTS = "Username already in the database";
    public static final String USERNAME_DOESNT_EXIST = "Username not found in the database";
    public static final String CLIENT_ID_EXISTS = "Client-Id found in database";
    public static final String CLIENT_ID_DOESNT_EXIST = "Client-Id not found in database";
    public static final String SESSION_DOESNT_EXIST = "Session not found / expired";
    public static final String NO_PAYMENT_INITIATION_FOUND = "No paymentInitReqId found at PISP";
    public static final String SQL_QUERY_PREPARATION_ERROR = "Unexpected error while preparing SQL Query";
    public static final String ERROR_OCCURRED = "Unexpected error occurred";
    public static final String DB_CLOSE_ERROR = "Unexpected error occurred while closing the database connection";
    public static final String DB_PARSE_ERROR = "Unexpected error occurred while parsing DB object";
    public static final String PARAMETERS_MISSING = "Missing required parameters in request";
    public static final String INCORRECT_PASSWORD = "Incorrect password";
    public static final String DB_SAVING_ERROR = "Error while saving to DB";
    public static final String BANK_NOT_FOUND = "Bank not found in database";
    public static final String BANK_API_NOT_RECOGNISED = "Bank API specification not recognized";
    public static final String INCORRECT_PAYLOAD = "Incorrect payload. Check validity of payload";
    public static final String MALFORMED_BODY = "Mal-formed Body in the payload";
    public static final String PROPERTIES_FILE_ERROR = "Error reading properties file";
    public static final String KEY_SIGNING_ERROR = "Error occurred at Key Signing";
    public static final String PRIVATE_KEY_ERROR = "Error while getting private key";
    public static final String THUMBPRINT_ERROR = "Error while generating ThumbPrint";
    public static final String GET_CALL_FAILED = "Error executing HTTP GET";
    public static final String POST_CALL_FAILED = "Error executing HTTP POST";
    public static final String CONTENT_PARSING_ERROR = "Error while parsing content";
    public static final String PARAMETERS_NULL = "Null parameters in request";
    public static final String EXPIRED_TOKEN = "Access Token Expired. Re-authenticate";
    public static final String APPLICATION_TOKEN_EXPIRED = "Application Token Expired. Contact System Administrator";
    public static final String PAYMENT_INITIATION_FAILED = "Payment Initiation Failed";
    public static final String PAYMENT_SUBMISSION_FAILED = "Payment submission Failed";
    public static final String PAYMENT_GET_REQUEST_FAILED = "Payment get request Failed";
    public static final String ERROR_WHILE_INITIATING_PAYMENT = "Error while initiating the payment at debtor bank";
    public static final String ERROR_WHILE_GETTING_AUTH_URL = "Error while generating authorization URL";

    public static final String ERROR_PAYMENT_REQUEST_NOT_PROCESSED = "The payment initiation request has not processed";
    public static final String ERROR_PAYMENT_SUBMISSION_NOT_PROCESSED = "Unexpected error occurred while submitting the payment.Payment could not be completed";

    public static final String ERROR_WHILE_SETTING_DEBTOR_BANK = "Internal error while setting the debtor bank for the payment";
    public static final String ERROR_WHILE_RETRIEVING_PAYMENT_INITIATION = "The relevant payment initiation request is not retrieved from DB";
    public static final String ERROR_GETTING_ACTIVE_BANKS = "Error while retrieving supported bank list";


    public static final String ERROR_INSTRUCTED_AMOUNT_NOT_SPECIFIED = "Instructed Amount is not specified";
    public static final String ERROR_MERCHANT_BANK_NOT_SPECIFIED = "The Merchant Bank is not specified";
    public static final String ERROR_MERCHANT_BANK_ACCOUNT_NOT_SPECIFIED  = "The Merchant Bank Account is not Specified";
    public static final String ERROR_INVALID_INSTRUCTED_AMOUNT = "Instructed Amount can not be a string";
    public static final String PAYMENT_DATA_VALIDATED = "Successfully validated the payment initiation data";
    public static final String FAILED_TO_ADD_BANK = "Addition of new bank to the db has failed";
    public static final String FAILED_TO_REMOVE_BANK = "Removal of bank from the db has failed";

    public static final String  SESSION_TOKEN_EXPIRED = "Session Expired";
    public static final String  NO_SESSION_FOUND = "No Session Found";
    public static final String  REGISTRATION_FAILED= "The E-Shop registration has failed";

    public static final String  SESSION_TOKEN_MISMATCH= "The session token is invalid";


    //public static final String NO_SESSION_FOUND = "The cookie is empty. No session id is available to continue";
}
