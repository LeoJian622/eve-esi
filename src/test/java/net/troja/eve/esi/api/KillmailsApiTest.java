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
import net.troja.eve.esi.model.CharacterKillmailsResponse;
import net.troja.eve.esi.model.KillmailResponse;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.Matchers.notNullValue;

/**
 * API tests for KillmailsApi
 */
public class KillmailsApiTest extends GeneralApiTest {

    private final KillmailsApi api = new KillmailsApi();

    @Before
    public void setUp() {
        api.setApiClient(apiClient);
    }

    /**
     * List kills and losses
     *
     * Return a list of character&#39;s recent kills and losses --- Alternate
     * route: &#x60;/v1/characters/{character_id}/killmails/recent/&#x60;
     * Alternate route:
     * &#x60;/legacy/characters/{character_id}/killmails/recent/&#x60; Alternate
     * route: &#x60;/dev/characters/{character_id}/killmails/recent/&#x60; ---
     * This route is cached for up to 120 seconds SSO Scope:
     * esi-killmails.read_killmails.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdKillmailsRecentTest() throws ApiException {
        final Integer page = null;
        final List<CharacterKillmailsResponse> response = api.getCharactersCharacterIdKillmailsRecent(characterId, DATASOURCE, null, page, null);

        assertThat(response, notNullValue());
    }

    /**
     * Get corporation kills and losses
     *
     * Get a list of corporation&#39;s recent kills and losses  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-killmails.read_corporation_killmails.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdKillmailsRecentTest() throws ApiException {
    }

    /**
     * Get a single killmail
     *
     * Return a single killmail from its ID and hash --- Alternate route:
     * &#x60;/v1/killmails/{killmail_id}/{killmail_hash}/&#x60; Alternate route:
     * &#x60;/legacy/killmails/{killmail_id}/{killmail_hash}/&#x60; Alternate
     * route: &#x60;/dev/killmails/{killmail_id}/{killmail_hash}/&#x60; --- This
     * route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
	@Ignore("Needs killmails to test")
    public void getKillmailsKillmailIdKillmailHashTest() throws ApiException {
		final Integer page = null;
        final CharacterKillmailsResponse killmail = api
                .getCharactersCharacterIdKillmailsRecent(characterId, DATASOURCE, null, page, null).get(0);
        final Integer killmailId = killmail.getKillmailId();
        final String killmailHash = killmail.getKillmailHash();

        final KillmailResponse response = api.getKillmailsKillmailIdKillmailHash(killmailHash, killmailId, DATASOURCE, null);

        assertThat(response.getAttackers().size(), greaterThan(0));
        assertThat(response.getVictim().getCharacterId(), greaterThan(0));
    }
}
