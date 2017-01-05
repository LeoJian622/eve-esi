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
import net.troja.eve.esi.model.FleetInvitation;
import net.troja.eve.esi.model.FleetMemberMovement;
import net.troja.eve.esi.model.FleetMembersResponse;
import net.troja.eve.esi.model.FleetNewSettings;
import net.troja.eve.esi.model.FleetResponse;
import net.troja.eve.esi.model.FleetSquadCreatedResponse;
import net.troja.eve.esi.model.FleetSquadNaming;
import net.troja.eve.esi.model.FleetWingCreatedResponse;
import net.troja.eve.esi.model.FleetWingNaming;
import net.troja.eve.esi.model.FleetWingsResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FleetsApi
 */
public class FleetsApiTest {

    private final FleetsApi api = new FleetsApi();

    
    /**
     * Kick fleet member
     *
     * Kick a fleet member  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60;   SSO Scope: esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFleetsFleetIdMembersMemberIdTest() throws ApiException {
        Long fleetId = null;
        Integer memberId = null;
        String datasource = null;
        // api.deleteFleetsFleetIdMembersMemberId(fleetId, memberId, datasource);

        // TODO: test validations
    }
    
    /**
     * Delete fleet squad
     *
     * Delete a fleet squad, only empty squads can be deleted  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60;   SSO Scope: esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFleetsFleetIdSquadsSquadIdTest() throws ApiException {
        Long fleetId = null;
        Long squadId = null;
        String datasource = null;
        // api.deleteFleetsFleetIdSquadsSquadId(fleetId, squadId, datasource);

        // TODO: test validations
    }
    
    /**
     * Delete fleet wing
     *
     * Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60;   SSO Scope: esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFleetsFleetIdWingsWingIdTest() throws ApiException {
        Long fleetId = null;
        Long wingId = null;
        String datasource = null;
        // api.deleteFleetsFleetIdWingsWingId(fleetId, wingId, datasource);

        // TODO: test validations
    }
    
    /**
     * Get fleet information
     *
     * Return details about a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60;   ---  This route is cached for up to 5 seconds  SSO Scope: esi-fleets.read_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetsFleetIdTest() throws ApiException {
        Long fleetId = null;
        String datasource = null;
        // FleetResponse response = api.getFleetsFleetId(fleetId, datasource);

        // TODO: test validations
    }
    
    /**
     * Get fleet members
     *
     * Return information about fleet members  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60;   ---  This route is cached for up to 5 seconds  SSO Scope: esi-fleets.read_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetsFleetIdMembersTest() throws ApiException {
        Long fleetId = null;
        String acceptLanguage = null;
        String datasource = null;
        // List<FleetMembersResponse> response = api.getFleetsFleetIdMembers(fleetId, acceptLanguage, datasource);

        // TODO: test validations
    }
    
    /**
     * Get fleet wings
     *
     * Return information about wings in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60;   ---  This route is cached for up to 5 seconds  SSO Scope: esi-fleets.read_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetsFleetIdWingsTest() throws ApiException {
        Long fleetId = null;
        String acceptLanguage = null;
        String datasource = null;
        // List<FleetWingsResponse> response = api.getFleetsFleetIdWings(fleetId, acceptLanguage, datasource);

        // TODO: test validations
    }
    
    /**
     * Create fleet invitation
     *
     * Invite a character into the fleet, if a character has a CSPA charge set, it is not possible to invite them to the fleet using ESI  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/&#x60;   SSO Scope: esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFleetsFleetIdMembersTest() throws ApiException {
        Long fleetId = null;
        FleetInvitation invitation = null;
        String datasource = null;
        // api.postFleetsFleetIdMembers(fleetId, invitation, datasource);

        // TODO: test validations
    }
    
    /**
     * Create fleet wing
     *
     * Create a new wing in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/&#x60;   SSO Scope: esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFleetsFleetIdWingsTest() throws ApiException {
        Long fleetId = null;
        String datasource = null;
        // FleetWingCreatedResponse response = api.postFleetsFleetIdWings(fleetId, datasource);

        // TODO: test validations
    }
    
    /**
     * Create fleet squad
     *
     * Create a new squad in a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/squads/&#x60;   SSO Scope: esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFleetsFleetIdWingsWingIdSquadsTest() throws ApiException {
        Long fleetId = null;
        Long wingId = null;
        String datasource = null;
        // FleetSquadCreatedResponse response = api.postFleetsFleetIdWingsWingIdSquads(fleetId, wingId, datasource);

        // TODO: test validations
    }
    
    /**
     * Update fleet
     *
     * Update settings about a fleet  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/&#x60;   SSO Scope: esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdTest() throws ApiException {
        Long fleetId = null;
        FleetNewSettings newSettings = null;
        String datasource = null;
        // api.putFleetsFleetId(fleetId, newSettings, datasource);

        // TODO: test validations
    }
    
    /**
     * Move fleet member
     *
     * Move a fleet member around  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/members/{member_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/members/{member_id}/&#x60;   SSO Scope: esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdMembersMemberIdTest() throws ApiException {
        Long fleetId = null;
        Integer memberId = null;
        FleetMemberMovement movement = null;
        String datasource = null;
        // api.putFleetsFleetIdMembersMemberId(fleetId, memberId, movement, datasource);

        // TODO: test validations
    }
    
    /**
     * Rename fleet squad
     *
     * Rename a fleet squad  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/squads/{squad_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/squads/{squad_id}/&#x60;   SSO Scope: esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdSquadsSquadIdTest() throws ApiException {
        Long fleetId = null;
        Long squadId = null;
        FleetSquadNaming naming = null;
        String datasource = null;
        // api.putFleetsFleetIdSquadsSquadId(fleetId, squadId, naming, datasource);

        // TODO: test validations
    }
    
    /**
     * Rename fleet wing
     *
     * Rename a fleet wing  ---  Alternate route: &#x60;/v1/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/legacy/fleets/{fleet_id}/wings/{wing_id}/&#x60;  Alternate route: &#x60;/dev/fleets/{fleet_id}/wings/{wing_id}/&#x60;   SSO Scope: esi-fleets.write_fleet.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdWingsWingIdTest() throws ApiException {
        Long fleetId = null;
        Long wingId = null;
        FleetWingNaming naming = null;
        String datasource = null;
        // api.putFleetsFleetIdWingsWingId(fleetId, wingId, naming, datasource);

        // TODO: test validations
    }
    
}
