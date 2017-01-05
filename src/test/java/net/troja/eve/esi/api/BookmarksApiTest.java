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
import net.troja.eve.esi.model.CharacterBookmarkFoldersResponse;
import net.troja.eve.esi.model.CharacterBookmarksResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookmarksApi
 */
public class BookmarksApiTest {

    private final BookmarksApi api = new BookmarksApi();

    
    /**
     * List bookmarks
     *
     * List your character&#39;s personal bookmarks  ---  Alternate route: &#x60;/v1/characters/{character_id}/bookmarks/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/bookmarks/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/bookmarks/&#x60;   ---  This route is cached for up to 3600 seconds  SSO Scope: esi-bookmarks.read_character_bookmarks.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdBookmarksTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        // List<CharacterBookmarksResponse> response = api.getCharactersCharacterIdBookmarks(characterId, datasource);

        // TODO: test validations
    }
    
    /**
     * List bookmark folders
     *
     * List your character&#39;s personal bookmark folders  ---  Alternate route: &#x60;/v1/characters/{character_id}/bookmarks/folders/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/bookmarks/folders/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/bookmarks/folders/&#x60;   ---  This route is cached for up to 3600 seconds  SSO Scope: esi-bookmarks.read_character_bookmarks.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdBookmarksFoldersTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        // List<CharacterBookmarkFoldersResponse> response = api.getCharactersCharacterIdBookmarksFolders(characterId, datasource);

        // TODO: test validations
    }
    
}
