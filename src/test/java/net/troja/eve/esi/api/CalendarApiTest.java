/**
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.2.7.dev1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.troja.eve.esi.api;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterCalendarResponse;
import net.troja.eve.esi.model.CharacterCalendarEventResponse;
import net.troja.eve.esi.model.EventResponseStatus;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CalendarApi
 */
public class CalendarApiTest {

    private final CalendarApi api = new CalendarApi();

    
    /**
     * List calendar event summaries
     *
     * Get 50 event summaries from the calendar. If no event ID is given, the resource will return the next 50 chronological event summaries from now. If an event ID is specified, it will return the next 50 chronological event summaries from after that event.   ---  Alternate route: &#x60;/v1/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/calendar/&#x60;   ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdCalendarTest() throws ApiException {
        Long characterId = null;
        Integer fromEvent = null;
        String datasource = null;
        // List<CharacterCalendarResponse> response = api.getCharactersCharacterIdCalendar(characterId, fromEvent, datasource);

        // TODO: test validations
    }
    
    /**
     * Get an event
     *
     * Get all the information for a specific event  ---  Alternate route: &#x60;/v3/characters/{character_id}/calendar/{event_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/calendar/{event_id}/&#x60;   ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdCalendarEventIdTest() throws ApiException {
        Long characterId = null;
        Integer eventId = null;
        String datasource = null;
        // CharacterCalendarEventResponse response = api.getCharactersCharacterIdCalendarEventId(characterId, eventId, datasource);

        // TODO: test validations
    }
    
    /**
     * Respond to an event
     *
     * Set your response status to an event  ---  Alternate route: &#x60;/v3/characters/{character_id}/calendar/{event_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/calendar/{event_id}/&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCharactersCharacterIdCalendarEventIdTest() throws ApiException {
        Integer characterId = null;
        Integer eventId = null;
        EventResponseStatus response = null;
        String datasource = null;
        // api.putCharactersCharacterIdCalendarEventId(characterId, eventId, response, datasource);

        // TODO: test validations
    }
    
}
