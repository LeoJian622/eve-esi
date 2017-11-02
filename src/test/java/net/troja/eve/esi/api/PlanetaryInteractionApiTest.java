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

import java.util.List;
import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterPlanetResponse;
import net.troja.eve.esi.model.CharacterPlanetsResponse;
import net.troja.eve.esi.model.CorporationCustomsOfficesResponse;
import net.troja.eve.esi.model.PlanetFactorySchematicResponse;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for PlanetaryInteractionApi
 */
public class PlanetaryInteractionApiTest extends GeneralApiTest {

    private final PlanetaryInteractionApi api = new PlanetaryInteractionApi();

    @Before
    public void setUp() {
        api.setApiClient(apiClient);
    }

    /**
     * Get colonies
     *
     * Returns a list of all planetary colonies owned by a character. ---
     * Alternate route: &#x60;/v1/characters/{character_id}/planets/&#x60;
     * Alternate route: &#x60;/legacy/characters/{character_id}/planets/&#x60;
     * Alternate route: &#x60;/dev/characters/{character_id}/planets/&#x60; ---
     * This route is cached for up to 600 seconds SSO Scope:
     * esi-planets.manage_planets.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdPlanetsTest() throws ApiException {
        final String token = null;
        final String userAgent = null;
        final String xUserAgent = null;
        final List<CharacterPlanetsResponse> response = api.getCharactersCharacterIdPlanets(characterId, DATASOURCE,
                token, userAgent, xUserAgent);

        assertThat(response.size(), greaterThan(0));
        final CharacterPlanetsResponse planetsResponse = response.get(0);
        assertThat(planetsResponse.getSolarSystemId(), greaterThan(0));
    }

    /**
     * Get colony layout
     *
     * Returns full details on the layout of a single planetary colony,
     * including links, pins and routes. Note: Planetary information is only
     * recalculated when the colony is viewed through the client. Information on
     * this endpoint will not update until this criteria is met. --- Alternate
     * route: &#x60;/v1/characters/{character_id}/planets/{planet_id}/&#x60;
     * Alternate route:
     * &#x60;/legacy/characters/{character_id}/planets/{planet_id}/&#x60; ---
     * This route is cached for up to 600 seconds SSO Scope:
     * esi-planets.manage_planets.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdPlanetsPlanetIdTest() throws ApiException {
        final String token = null;
        final String userAgent = null;
        final String xUserAgent = null;
        final List<CharacterPlanetsResponse> planets = api.getCharactersCharacterIdPlanets(characterId, DATASOURCE,
                token, userAgent, xUserAgent);

        final CharacterPlanetResponse response = api.getCharactersCharacterIdPlanetsPlanetId(characterId,
                planets.get(0).getPlanetId(), DATASOURCE, token, userAgent, xUserAgent);

        assertThat(response, notNullValue());
        assertThat(response.getPins().size(), greaterThan(0));
    }

     /**
     * List corporation customs offices
     *
     * List customs offices owned by a corporation  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-planets.read_customs_offices.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdCustomsOfficesTest() throws ApiException {
        Integer corporationId = null;
        Integer page = null;
        List<CorporationCustomsOfficesResponse> response = api.getCorporationsCorporationIdCustomsOffices(corporationId, DATASOURCE, page, null, null, null);

        // TODO: test validations
    }

    /**
     * Get schematic information
     *
     * Get information on a planetary factory schematic --- Alternate route:
     * &#x60;/v1/universe/schematics/{schematic_id}/&#x60; Alternate route:
     * &#x60;/legacy/universe/schematics/{schematic_id}/&#x60; Alternate route:
     * &#x60;/dev/universe/schematics/{schematic_id}/&#x60; --- This route is
     * cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getUniverseSchematicsSchematicIdTest() throws ApiException {
        final Integer schematicId = 131;
        final String userAgent = null;
        final String xUserAgent = null;
        final PlanetFactorySchematicResponse response = api.getUniverseSchematicsSchematicId(schematicId, DATASOURCE,
                userAgent, xUserAgent);

        assertThat(response.getCycleTime(), equalTo(1800));
        assertThat(response.getSchematicName(), equalTo("Bacteria"));
    }

}
