/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.troja.eve.esi.api;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.WarKillmailsResponse;
import net.troja.eve.esi.model.WarResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WarsApi
 */
public class WarsApiTest {

    private final WarsApi api = new WarsApi();

    
    /**
     * List wars
     *
     * Return a list of wars  ---  Alternate route: &#x60;/v1/wars/&#x60;  Alternate route: &#x60;/legacy/wars/&#x60;  Alternate route: &#x60;/dev/wars/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWarsTest() throws ApiException {
        Integer page = null;
        String datasource = null;
        // List<Integer> response = api.getWars(page, datasource);

        // TODO: test validations
    }
    
    /**
     * Get war information
     *
     * Return details about a war  ---  Alternate route: &#x60;/v1/wars/{war_id}/&#x60;  Alternate route: &#x60;/legacy/wars/{war_id}/&#x60;  Alternate route: &#x60;/dev/wars/{war_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWarsWarIdTest() throws ApiException {
        Integer warId = null;
        String datasource = null;
        // WarResponse response = api.getWarsWarId(warId, datasource);

        // TODO: test validations
    }
    
    /**
     * List kills for a war
     *
     * Return a list of kills related to a war  ---  Alternate route: &#x60;/v1/wars/{war_id}/killmails/&#x60;  Alternate route: &#x60;/legacy/wars/{war_id}/killmails/&#x60;  Alternate route: &#x60;/dev/wars/{war_id}/killmails/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWarsWarIdKillmailsTest() throws ApiException {
        Integer warId = null;
        Integer page = null;
        String datasource = null;
        // List<WarKillmailsResponse> response = api.getWarsWarIdKillmails(warId, page, datasource);

        // TODO: test validations
    }
    
}
