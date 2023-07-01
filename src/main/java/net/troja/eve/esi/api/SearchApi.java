/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.17
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

import net.troja.eve.esi.model.CharacterSearchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient localVarApiClient;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCharactersCharacterIdSearch
     * 
     * @param categories
     *            Type of entities to search for (required)
     * @param characterId
     *            An EVE character ID (required)
     * @param search
     *            The string to search on (required)
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en)
     * @param strict
     *            Whether the search should be a strict match (optional, default
     *            to false)
     * @param token
     *            Access token to use if unable to set a header (optional)
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
     *                        <td>A list of search results</td>
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
    public okhttp3.Call getCharactersCharacterIdSearchCall(List<String> categories, Integer characterId, String search,
            String acceptLanguage, String datasource, String ifNoneMatch, String language, Boolean strict,
            String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/characters/{character_id}/search/".replaceAll("\\{" + "character_id" + "\\}",
                localVarApiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (categories != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "categories", categories));
        }

        if (datasource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("datasource", datasource));
        }

        if (language != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("language", language));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        if (strict != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("strict", strict));
        }

        if (token != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("token", token));
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

        String[] localVarAuthNames = new String[] { "evesso" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCharactersCharacterIdSearchValidateBeforeCall(List<String> categories, Integer characterId,
            String search, String acceptLanguage, String datasource, String ifNoneMatch, String language,
            Boolean strict, String token, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'categories' is set
        if (categories == null) {
            throw new ApiException(
                    "Missing the required parameter 'categories' when calling getCharactersCharacterIdSearch(Async)");
        }

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdSearch(Async)");
        }

        // verify the required parameter 'search' is set
        if (search == null) {
            throw new ApiException(
                    "Missing the required parameter 'search' when calling getCharactersCharacterIdSearch(Async)");
        }

        okhttp3.Call localVarCall = getCharactersCharacterIdSearchCall(categories, characterId, search, acceptLanguage,
                datasource, ifNoneMatch, language, strict, token, _callback);
        return localVarCall;

    }

    /**
     * Search on a string Search for entities that match a given sub-string. ---
     * This route is cached for up to 3600 seconds SSO Scope:
     * esi-search.search_structures.v1
     * 
     * @param categories
     *            Type of entities to search for (required)
     * @param characterId
     *            An EVE character ID (required)
     * @param search
     *            The string to search on (required)
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en)
     * @param strict
     *            Whether the search should be a strict match (optional, default
     *            to false)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return CharacterSearchResponse
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
     *                        <td>A list of search results</td>
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
    public CharacterSearchResponse getCharactersCharacterIdSearch(List<String> categories, Integer characterId,
            String search, String acceptLanguage, String datasource, String ifNoneMatch, String language,
            Boolean strict, String token) throws ApiException {
        ApiResponse<CharacterSearchResponse> localVarResp = getCharactersCharacterIdSearchWithHttpInfo(categories,
                characterId, search, acceptLanguage, datasource, ifNoneMatch, language, strict, token);
        return localVarResp.getData();
    }

    /**
     * Search on a string Search for entities that match a given sub-string. ---
     * This route is cached for up to 3600 seconds SSO Scope:
     * esi-search.search_structures.v1
     * 
     * @param categories
     *            Type of entities to search for (required)
     * @param characterId
     *            An EVE character ID (required)
     * @param search
     *            The string to search on (required)
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en)
     * @param strict
     *            Whether the search should be a strict match (optional, default
     *            to false)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;CharacterSearchResponse&gt;
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
     *                        <td>A list of search results</td>
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
    public ApiResponse<CharacterSearchResponse> getCharactersCharacterIdSearchWithHttpInfo(List<String> categories,
            Integer characterId, String search, String acceptLanguage, String datasource, String ifNoneMatch,
            String language, Boolean strict, String token) throws ApiException {
        okhttp3.Call localVarCall = getCharactersCharacterIdSearchValidateBeforeCall(categories, characterId, search,
                acceptLanguage, datasource, ifNoneMatch, language, strict, token, null);
        Type localVarReturnType = new TypeToken<CharacterSearchResponse>() {
        }.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search on a string (asynchronously) Search for entities that match a
     * given sub-string. --- This route is cached for up to 3600 seconds SSO
     * Scope: esi-search.search_structures.v1
     * 
     * @param categories
     *            Type of entities to search for (required)
     * @param characterId
     *            An EVE character ID (required)
     * @param search
     *            The string to search on (required)
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en)
     * @param strict
     *            Whether the search should be a strict match (optional, default
     *            to false)
     * @param token
     *            Access token to use if unable to set a header (optional)
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
     *                        <td>A list of search results</td>
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
    public okhttp3.Call getCharactersCharacterIdSearchAsync(List<String> categories, Integer characterId,
            String search, String acceptLanguage, String datasource, String ifNoneMatch, String language,
            Boolean strict, String token, final ApiCallback<CharacterSearchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCharactersCharacterIdSearchValidateBeforeCall(categories, characterId, search,
                acceptLanguage, datasource, ifNoneMatch, language, strict, token, _callback);
        Type localVarReturnType = new TypeToken<CharacterSearchResponse>() {
        }.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
