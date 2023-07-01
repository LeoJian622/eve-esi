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

package net.troja.eve.esi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class FleetMembersResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CHARACTER_ID = "character_id";
    @SerializedName(SERIALIZED_NAME_CHARACTER_ID)
    private Integer characterId;

    public static final String SERIALIZED_NAME_JOIN_TIME = "join_time";
    @SerializedName(SERIALIZED_NAME_JOIN_TIME)
    private OffsetDateTime joinTime;

    /**
     * Member’s role in fleet
     */
    @JsonAdapter(RoleEnum.Adapter.class)
    public enum RoleEnum {
        FLEET_COMMANDER("fleet_commander"),

        WING_COMMANDER("wing_commander"),

        SQUAD_COMMANDER("squad_commander"),

        SQUAD_MEMBER("squad_member");

        private String value;

        RoleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RoleEnum fromValue(String value) {
            for (RoleEnum b : RoleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<RoleEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RoleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RoleEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ROLE = "role";
    @SerializedName(SERIALIZED_NAME_ROLE)
    private String role;
    private RoleEnum roleEnum;

    public static final String SERIALIZED_NAME_ROLE_NAME = "role_name";
    @SerializedName(SERIALIZED_NAME_ROLE_NAME)
    private String roleName;

    public static final String SERIALIZED_NAME_SHIP_TYPE_ID = "ship_type_id";
    @SerializedName(SERIALIZED_NAME_SHIP_TYPE_ID)
    private Integer shipTypeId;

    public static final String SERIALIZED_NAME_SOLAR_SYSTEM_ID = "solar_system_id";
    @SerializedName(SERIALIZED_NAME_SOLAR_SYSTEM_ID)
    private Integer solarSystemId;

    public static final String SERIALIZED_NAME_SQUAD_ID = "squad_id";
    @SerializedName(SERIALIZED_NAME_SQUAD_ID)
    private Long squadId;

    public static final String SERIALIZED_NAME_STATION_ID = "station_id";
    @SerializedName(SERIALIZED_NAME_STATION_ID)
    private Long stationId;

    public static final String SERIALIZED_NAME_TAKES_FLEET_WARP = "takes_fleet_warp";
    @SerializedName(SERIALIZED_NAME_TAKES_FLEET_WARP)
    private Boolean takesFleetWarp;

    public static final String SERIALIZED_NAME_WING_ID = "wing_id";
    @SerializedName(SERIALIZED_NAME_WING_ID)
    private Long wingId;

    public FleetMembersResponse characterId(Integer characterId) {

        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @ApiModelProperty(required = true, value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public FleetMembersResponse joinTime(OffsetDateTime joinTime) {

        this.joinTime = joinTime;
        return this;
    }

    /**
     * join_time string
     * 
     * @return joinTime
     **/
    @ApiModelProperty(required = true, value = "join_time string")
    public OffsetDateTime getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(OffsetDateTime joinTime) {
        this.joinTime = joinTime;
    }

    public FleetMembersResponse role(RoleEnum roleEnum) {

        this.roleEnum = roleEnum;
        return this;
    }

    public FleetMembersResponse roleString(String role) {

        this.role = role;
        return this;
    }

    /**
     * Member’s role in fleet
     * 
     * @return role
     **/
    @ApiModelProperty(required = true, value = "Member’s role in fleet")
    public RoleEnum getRole() {
        if (roleEnum == null) {
            roleEnum = RoleEnum.fromValue(role);
        }
        return roleEnum;
    }

    public String getRoleString() {
        return role;
    }

    public void setRole(RoleEnum roleEnum) {
        this.roleEnum = roleEnum;
    }

    public void setRoleString(String role) {
        this.role = role;
    }

    public FleetMembersResponse roleName(String roleName) {

        this.roleName = roleName;
        return this;
    }

    /**
     * Localized role names
     * 
     * @return roleName
     **/
    @ApiModelProperty(required = true, value = "Localized role names")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public FleetMembersResponse shipTypeId(Integer shipTypeId) {

        this.shipTypeId = shipTypeId;
        return this;
    }

    /**
     * ship_type_id integer
     * 
     * @return shipTypeId
     **/
    @ApiModelProperty(required = true, value = "ship_type_id integer")
    public Integer getShipTypeId() {
        return shipTypeId;
    }

    public void setShipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
    }

    public FleetMembersResponse solarSystemId(Integer solarSystemId) {

        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * Solar system the member is located in
     * 
     * @return solarSystemId
     **/
    @ApiModelProperty(required = true, value = "Solar system the member is located in")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    public FleetMembersResponse squadId(Long squadId) {

        this.squadId = squadId;
        return this;
    }

    /**
     * ID of the squad the member is in. If not applicable, will be set to -1
     * 
     * @return squadId
     **/
    @ApiModelProperty(required = true, value = "ID of the squad the member is in. If not applicable, will be set to -1")
    public Long getSquadId() {
        return squadId;
    }

    public void setSquadId(Long squadId) {
        this.squadId = squadId;
    }

    public FleetMembersResponse stationId(Long stationId) {

        this.stationId = stationId;
        return this;
    }

    /**
     * Station in which the member is docked in, if applicable
     * 
     * @return stationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Station in which the member is docked in, if applicable")
    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public FleetMembersResponse takesFleetWarp(Boolean takesFleetWarp) {

        this.takesFleetWarp = takesFleetWarp;
        return this;
    }

    /**
     * Whether the member take fleet warps
     * 
     * @return takesFleetWarp
     **/
    @ApiModelProperty(required = true, value = "Whether the member take fleet warps")
    public Boolean getTakesFleetWarp() {
        return takesFleetWarp;
    }

    public void setTakesFleetWarp(Boolean takesFleetWarp) {
        this.takesFleetWarp = takesFleetWarp;
    }

    public FleetMembersResponse wingId(Long wingId) {

        this.wingId = wingId;
        return this;
    }

    /**
     * ID of the wing the member is in. If not applicable, will be set to -1
     * 
     * @return wingId
     **/
    @ApiModelProperty(required = true, value = "ID of the wing the member is in. If not applicable, will be set to -1")
    public Long getWingId() {
        return wingId;
    }

    public void setWingId(Long wingId) {
        this.wingId = wingId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FleetMembersResponse fleetMembersResponse = (FleetMembersResponse) o;
        return Objects.equals(this.characterId, fleetMembersResponse.characterId)
                && Objects.equals(this.joinTime, fleetMembersResponse.joinTime)
                && Objects.equals(this.role, fleetMembersResponse.role)
                && Objects.equals(this.roleName, fleetMembersResponse.roleName)
                && Objects.equals(this.shipTypeId, fleetMembersResponse.shipTypeId)
                && Objects.equals(this.solarSystemId, fleetMembersResponse.solarSystemId)
                && Objects.equals(this.squadId, fleetMembersResponse.squadId)
                && Objects.equals(this.stationId, fleetMembersResponse.stationId)
                && Objects.equals(this.takesFleetWarp, fleetMembersResponse.takesFleetWarp)
                && Objects.equals(this.wingId, fleetMembersResponse.wingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, joinTime, role, roleName, shipTypeId, solarSystemId, squadId, stationId,
                takesFleetWarp, wingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FleetMembersResponse {\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
        sb.append("    squadId: ").append(toIndentedString(squadId)).append("\n");
        sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
        sb.append("    takesFleetWarp: ").append(toIndentedString(takesFleetWarp)).append("\n");
        sb.append("    wingId: ").append(toIndentedString(wingId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
