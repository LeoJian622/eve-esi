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
import net.troja.eve.esi.model.ContactLabelsResponse;
import net.troja.eve.esi.model.ContactsResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    
    /**
     * Delete contacts
     *
     * Bulk delete contacts  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;   SSO Scope: esi-characters.write_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        List<Integer> contactIds = null;
        String datasource = null;
        // api.deleteCharactersCharacterIdContacts(characterId, contactIds, datasource);

        // TODO: test validations
    }
    
    /**
     * Get contacts
     *
     * Return contacts of a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;   ---  This route is cached for up to 300 seconds  SSO Scope: esi-characters.read_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        Integer page = null;
        String datasource = null;
        // List<ContactsResponse> response = api.getCharactersCharacterIdContacts(characterId, page, datasource);

        // TODO: test validations
    }
    
    /**
     * Get contact labels
     *
     * Return custom labels for contacts the character defined  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/labels/&#x60;   ---  This route is cached for up to 300 seconds  SSO Scope: esi-characters.read_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContactsLabelsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        // List<ContactLabelsResponse> response = api.getCharactersCharacterIdContactsLabels(characterId, datasource);

        // TODO: test validations
    }
    
    /**
     * Add contacts
     *
     * Bulk add contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;   SSO Scope: esi-characters.write_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        Float standing = null;
        List<Integer> contactIds = null;
        Boolean watched = null;
        Long labelId = null;
        String datasource = null;
        // List<Integer> response = api.postCharactersCharacterIdContacts(characterId, standing, contactIds, watched, labelId, datasource);

        // TODO: test validations
    }
    
    /**
     * Edit contacts
     *
     * Bulk edit contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;   SSO Scope: esi-characters.write_contacts.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCharactersCharacterIdContactsTest() throws ApiException {
        Integer characterId = null;
        Float standing = null;
        List<Integer> contactIds = null;
        Boolean watched = null;
        Long labelId = null;
        String datasource = null;
        // api.putCharactersCharacterIdContacts(characterId, standing, contactIds, watched, labelId, datasource);

        // TODO: test validations
    }
    
}
