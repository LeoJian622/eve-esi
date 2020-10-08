/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.7.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.troja.eve.esi.api;

import net.troja.eve.esi.ApiCallback;
import net.troja.eve.esi.ApiClient;
import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.ApiResponse;
import net.troja.eve.esi.Configuration;
import net.troja.eve.esi.Pair;
import net.troja.eve.esi.ProgressRequestBody;
import net.troja.eve.esi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import net.troja.eve.esi.model.InsurancePricesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsuranceApi {
    private ApiClient localVarApiClient;

    public InsuranceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InsuranceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getInsurancePrices
     * 
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en-us)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en-us)
     * @param _callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     * @http.response.details <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>A list of insurance levels for all ship types</td>
     *                        <td>Cache-Control - The caching mechanism used <br>
     *                        ETag - RFC7232 compliant entity tag <br>
     *                        Expires - RFC7231 formatted datetime string <br>
     *                        Last-Modified - RFC7231 formatted datetime string
     *                        <br>
     *                        Content-Language - The language used in the
     *                        response <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>304</td>
     *                        <td>Not modified</td>
     *                        <td>Cache-Control - The caching mechanism used <br>
     *                        ETag - RFC7232 compliant entity tag <br>
     *                        Expires - RFC7231 formatted datetime string <br>
     *                        Last-Modified - RFC7231 formatted datetime string
     *                        <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>401</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>403</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>420</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>422</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>500</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>502</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>503</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>504</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>520</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call getInsurancePricesCall(String acceptLanguage, String datasource, String ifNoneMatch,
            String language, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/insurance/prices/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (language != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("language", language));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (acceptLanguage != null) {
            localVarHeaderParams.put("Accept-Language", localVarApiClient.parameterToString(acceptLanguage));
        }

        if (ifNoneMatch != null) {
            localVarHeaderParams.put("If-None-Match", localVarApiClient.parameterToString(ifNoneMatch));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInsurancePricesValidateBeforeCall(String acceptLanguage, String datasource,
            String ifNoneMatch, String language, final ApiCallback _callback) throws ApiException {

        okhttp3.Call localVarCall = getInsurancePricesCall(acceptLanguage, datasource, ifNoneMatch, language, _callback);
        return localVarCall;

    }

    /**
     * List insurance levels Return available insurance levels for all ship
     * types --- This route is cached for up to 3600 seconds
     * 
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en-us)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en-us)
     * @return List&lt;InsurancePricesResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>A list of insurance levels for all ship types</td>
     *                        <td>Cache-Control - The caching mechanism used <br>
     *                        ETag - RFC7232 compliant entity tag <br>
     *                        Expires - RFC7231 formatted datetime string <br>
     *                        Last-Modified - RFC7231 formatted datetime string
     *                        <br>
     *                        Content-Language - The language used in the
     *                        response <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>304</td>
     *                        <td>Not modified</td>
     *                        <td>Cache-Control - The caching mechanism used <br>
     *                        ETag - RFC7232 compliant entity tag <br>
     *                        Expires - RFC7231 formatted datetime string <br>
     *                        Last-Modified - RFC7231 formatted datetime string
     *                        <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>401</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>403</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>420</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>422</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>500</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>502</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>503</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>504</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>520</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public List<InsurancePricesResponse> getInsurancePrices(String acceptLanguage, String datasource,
            String ifNoneMatch, String language) throws ApiException {
        ApiResponse<List<InsurancePricesResponse>> localVarResp = getInsurancePricesWithHttpInfo(acceptLanguage,
                datasource, ifNoneMatch, language);
        return localVarResp.getData();
    }

    /**
     * List insurance levels Return available insurance levels for all ship
     * types --- This route is cached for up to 3600 seconds
     * 
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en-us)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en-us)
     * @return ApiResponse&lt;List&lt;InsurancePricesResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     * @http.response.details <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>A list of insurance levels for all ship types</td>
     *                        <td>Cache-Control - The caching mechanism used <br>
     *                        ETag - RFC7232 compliant entity tag <br>
     *                        Expires - RFC7231 formatted datetime string <br>
     *                        Last-Modified - RFC7231 formatted datetime string
     *                        <br>
     *                        Content-Language - The language used in the
     *                        response <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>304</td>
     *                        <td>Not modified</td>
     *                        <td>Cache-Control - The caching mechanism used <br>
     *                        ETag - RFC7232 compliant entity tag <br>
     *                        Expires - RFC7231 formatted datetime string <br>
     *                        Last-Modified - RFC7231 formatted datetime string
     *                        <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>401</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>403</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>420</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>422</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>500</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>502</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>503</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>504</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>520</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public ApiResponse<List<InsurancePricesResponse>> getInsurancePricesWithHttpInfo(String acceptLanguage,
            String datasource, String ifNoneMatch, String language) throws ApiException {
        okhttp3.Call localVarCall = getInsurancePricesValidateBeforeCall(acceptLanguage, datasource, ifNoneMatch,
                language, null);
        Type localVarReturnType = new TypeToken<List<InsurancePricesResponse>>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List insurance levels (asynchronously) Return available insurance levels
     * for all ship types --- This route is cached for up to 3600 seconds
     * 
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en-us)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en-us)
     * @param _callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     * @http.response.details <table summary="Response Details" border="1">
     *                        <tr>
     *                        <td>Status Code</td>
     *                        <td>Description</td>
     *                        <td>Response Headers</td>
     *                        </tr>
     *                        <tr>
     *                        <td>200</td>
     *                        <td>A list of insurance levels for all ship types</td>
     *                        <td>Cache-Control - The caching mechanism used <br>
     *                        ETag - RFC7232 compliant entity tag <br>
     *                        Expires - RFC7231 formatted datetime string <br>
     *                        Last-Modified - RFC7231 formatted datetime string
     *                        <br>
     *                        Content-Language - The language used in the
     *                        response <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>304</td>
     *                        <td>Not modified</td>
     *                        <td>Cache-Control - The caching mechanism used <br>
     *                        ETag - RFC7232 compliant entity tag <br>
     *                        Expires - RFC7231 formatted datetime string <br>
     *                        Last-Modified - RFC7231 formatted datetime string
     *                        <br>
     *                        </td>
     *                        </tr>
     *                        <tr>
     *                        <td>400</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>401</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>403</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>404</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>420</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>422</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>500</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>502</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>503</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>504</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        <tr>
     *                        <td>520</td>
     *                        <td></td>
     *                        <td>-</td>
     *                        </tr>
     *                        </table>
     */
    public okhttp3.Call getInsurancePricesAsync(String acceptLanguage, String datasource, String ifNoneMatch,
            String language, final ApiCallback<List<InsurancePricesResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInsurancePricesValidateBeforeCall(acceptLanguage, datasource, ifNoneMatch,
                language, _callback);
        Type localVarReturnType = new TypeToken<List<InsurancePricesResponse>>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
