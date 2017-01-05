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
import net.troja.eve.esi.model.EntityIds;
import net.troja.eve.esi.model.StationResponse;
import net.troja.eve.esi.model.StructureResponse;
import net.troja.eve.esi.model.SystemResponse;
import net.troja.eve.esi.model.TypeResponse;
import net.troja.eve.esi.model.UniverseNamesResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UniverseApi
 */
public class UniverseApiTest {

    private final UniverseApi api = new UniverseApi();

    
    /**
     * Get station information
     *
     * Public information on stations  ---  Alternate route: &#x60;/v1/universe/stations/{station_id}/&#x60;  Alternate route: &#x60;/legacy/universe/stations/{station_id}/&#x60;  Alternate route: &#x60;/dev/universe/stations/{station_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseStationsStationIdTest() throws ApiException {
        Integer stationId = null;
        String datasource = null;
        // StationResponse response = api.getUniverseStationsStationId(stationId, datasource);

        // TODO: test validations
    }
    
    /**
     * List all public structures
     *
     * List all public structures  ---  Alternate route: &#x60;/v1/universe/structures/&#x60;  Alternate route: &#x60;/legacy/universe/structures/&#x60;  Alternate route: &#x60;/dev/universe/structures/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseStructuresTest() throws ApiException {
        String datasource = null;
        // List<Long> response = api.getUniverseStructures(datasource);

        // TODO: test validations
    }
    
    /**
     * Get structure information
     *
     * Returns information on requested structure, if you are on the ACL. Otherwise, returns \&quot;Forbidden\&quot; for all inputs.  ---  Alternate route: &#x60;/v1/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/legacy/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/universe/structures/{structure_id}/&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseStructuresStructureIdTest() throws ApiException {
        Long structureId = null;
        String datasource = null;
        // StructureResponse response = api.getUniverseStructuresStructureId(structureId, datasource);

        // TODO: test validations
    }
    
    /**
     * Get solar system information
     *
     * Information on solar systems  ---  Alternate route: &#x60;/v1/universe/systems/{system_id}/&#x60;  Alternate route: &#x60;/legacy/universe/systems/{system_id}/&#x60;  Alternate route: &#x60;/dev/universe/systems/{system_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseSystemsSystemIdTest() throws ApiException {
        Integer systemId = null;
        String datasource = null;
        // SystemResponse response = api.getUniverseSystemsSystemId(systemId, datasource);

        // TODO: test validations
    }
    
    /**
     * Get type information
     *
     * Get information on a type  ---  Alternate route: &#x60;/v1/universe/types/{type_id}/&#x60;  Alternate route: &#x60;/legacy/universe/types/{type_id}/&#x60;  Alternate route: &#x60;/dev/universe/types/{type_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseTypesTypeIdTest() throws ApiException {
        Integer typeId = null;
        String datasource = null;
        // TypeResponse response = api.getUniverseTypesTypeId(typeId, datasource);

        // TODO: test validations
    }
    
    /**
     * Get names and categories for a set of ID&#39;s
     *
     * Resolve a set of IDs to names and categories. Supported ID&#39;s for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types.  ---  Alternate route: &#x60;/v1/universe/names/&#x60;  Alternate route: &#x60;/legacy/universe/names/&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUniverseNamesTest() throws ApiException {
        EntityIds ids = null;
        String datasource = null;
        // List<UniverseNamesResponse> response = api.postUniverseNames(ids, datasource);

        // TODO: test validations
    }
    
}
