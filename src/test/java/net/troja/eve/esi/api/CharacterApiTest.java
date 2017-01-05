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
import net.troja.eve.esi.model.CharacterCorporationHistoryResponse;
import net.troja.eve.esi.model.CharacterNamesResponse;
import net.troja.eve.esi.model.CharacterPortraitResponse;
import net.troja.eve.esi.model.CharacterResponse;
import net.troja.eve.esi.model.CspaCharacters;
import net.troja.eve.esi.model.CspaCostResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CharacterApi
 */
public class CharacterApiTest {

    private final CharacterApi api = new CharacterApi();

    
    /**
     * Get character&#39;s public information
     *
     * Public information about a character  ---  Alternate route: &#x60;/v3/characters/{character_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        // CharacterResponse response = api.getCharactersCharacterId(characterId, datasource);

        // TODO: test validations
    }
    
    /**
     * Get corporation history
     *
     * Get a list of all the corporations a character has been a member of  ---  Alternate route: &#x60;/v1/characters/{character_id}/corporationhistory/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/corporationhistory/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/corporationhistory/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdCorporationhistoryTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        // List<CharacterCorporationHistoryResponse> response = api.getCharactersCharacterIdCorporationhistory(characterId, datasource);

        // TODO: test validations
    }
    
    /**
     * Get character portraits
     *
     * Get portrait urls for a character  ---  Alternate route: &#x60;/v2/characters/{character_id}/portrait/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/portrait/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdPortraitTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        // CharacterPortraitResponse response = api.getCharactersCharacterIdPortrait(characterId, datasource);

        // TODO: test validations
    }
    
    /**
     * Get character names
     *
     * Resolve a set of character IDs to character names  ---  Alternate route: &#x60;/v1/characters/names/&#x60;  Alternate route: &#x60;/legacy/characters/names/&#x60;  Alternate route: &#x60;/dev/characters/names/&#x60;   ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersNamesTest() throws ApiException {
        List<Long> characterIds = null;
        String datasource = null;
        // List<CharacterNamesResponse> response = api.getCharactersNames(characterIds, datasource);

        // TODO: test validations
    }
    
    /**
     * Calculate a CSPA charge cost
     *
     * Takes a source character ID in the url and a set of target character ID&#39;s in the body, returns a CSPA charge cost  ---  Alternate route: &#x60;/v3/characters/{character_id}/cspa/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/cspa/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/cspa/&#x60;   SSO Scope: esi-characters.read_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdCspaTest() throws ApiException {
        Integer characterId = null;
        CspaCharacters characters = null;
        String datasource = null;
        // CspaCostResponse response = api.postCharactersCharacterIdCspa(characterId, characters, datasource);

        // TODO: test validations
    }
    
}
