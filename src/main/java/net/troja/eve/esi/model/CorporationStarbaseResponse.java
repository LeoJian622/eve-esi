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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.CorporationStarbaseFuel;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationStarbaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ALLOW_ALLIANCE_MEMBERS = "allow_alliance_members";
    @SerializedName(SERIALIZED_NAME_ALLOW_ALLIANCE_MEMBERS)
    private Boolean allowAllianceMembers;

    public static final String SERIALIZED_NAME_ALLOW_CORPORATION_MEMBERS = "allow_corporation_members";
    @SerializedName(SERIALIZED_NAME_ALLOW_CORPORATION_MEMBERS)
    private Boolean allowCorporationMembers;

    /**
     * Who can anchor starbase (POS) and its structures
     */
    @JsonAdapter(AnchorEnum.Adapter.class)
    public enum AnchorEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        AnchorEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AnchorEnum fromValue(String value) {
            for (AnchorEnum b : AnchorEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<AnchorEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AnchorEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AnchorEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AnchorEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ANCHOR = "anchor";
    @SerializedName(SERIALIZED_NAME_ANCHOR)
    private String anchor;
    private AnchorEnum anchorEnum;

    public static final String SERIALIZED_NAME_ATTACK_IF_AT_WAR = "attack_if_at_war";
    @SerializedName(SERIALIZED_NAME_ATTACK_IF_AT_WAR)
    private Boolean attackIfAtWar;

    public static final String SERIALIZED_NAME_ATTACK_IF_OTHER_SECURITY_STATUS_DROPPING = "attack_if_other_security_status_dropping";
    @SerializedName(SERIALIZED_NAME_ATTACK_IF_OTHER_SECURITY_STATUS_DROPPING)
    private Boolean attackIfOtherSecurityStatusDropping;

    public static final String SERIALIZED_NAME_ATTACK_SECURITY_STATUS_THRESHOLD = "attack_security_status_threshold";
    @SerializedName(SERIALIZED_NAME_ATTACK_SECURITY_STATUS_THRESHOLD)
    private Float attackSecurityStatusThreshold;

    public static final String SERIALIZED_NAME_ATTACK_STANDING_THRESHOLD = "attack_standing_threshold";
    @SerializedName(SERIALIZED_NAME_ATTACK_STANDING_THRESHOLD)
    private Float attackStandingThreshold;

    /**
     * Who can take fuel blocks out of the starbase (POS)&#39;s fuel bay
     */
    @JsonAdapter(FuelBayTakeEnum.Adapter.class)
    public enum FuelBayTakeEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        FuelBayTakeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FuelBayTakeEnum fromValue(String value) {
            for (FuelBayTakeEnum b : FuelBayTakeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<FuelBayTakeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FuelBayTakeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FuelBayTakeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FuelBayTakeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_FUEL_BAY_TAKE = "fuel_bay_take";
    @SerializedName(SERIALIZED_NAME_FUEL_BAY_TAKE)
    private String fuelBayTake;
    private FuelBayTakeEnum fuelBayTakeEnum;

    /**
     * Who can view the starbase (POS)&#39;s fule bay. Characters either need to
     * have required role or belong to the starbase (POS) owner&#39;s
     * corporation or alliance, as described by the enum, all other access
     * settings follows the same scheme
     */
    @JsonAdapter(FuelBayViewEnum.Adapter.class)
    public enum FuelBayViewEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        FuelBayViewEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FuelBayViewEnum fromValue(String value) {
            for (FuelBayViewEnum b : FuelBayViewEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<FuelBayViewEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FuelBayViewEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FuelBayViewEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FuelBayViewEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_FUEL_BAY_VIEW = "fuel_bay_view";
    @SerializedName(SERIALIZED_NAME_FUEL_BAY_VIEW)
    private String fuelBayView;
    private FuelBayViewEnum fuelBayViewEnum;

    public static final String SERIALIZED_NAME_FUELS = "fuels";
    @SerializedName(SERIALIZED_NAME_FUELS)
    private List<CorporationStarbaseFuel> fuels = null;

    /**
     * Who can offline starbase (POS) and its structures
     */
    @JsonAdapter(OfflineEnum.Adapter.class)
    public enum OfflineEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        OfflineEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OfflineEnum fromValue(String value) {
            for (OfflineEnum b : OfflineEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OfflineEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OfflineEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OfflineEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OfflineEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_OFFLINE = "offline";
    @SerializedName(SERIALIZED_NAME_OFFLINE)
    private String offline;
    private OfflineEnum offlineEnum;

    /**
     * Who can online starbase (POS) and its structures
     */
    @JsonAdapter(OnlineEnum.Adapter.class)
    public enum OnlineEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        OnlineEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OnlineEnum fromValue(String value) {
            for (OnlineEnum b : OnlineEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OnlineEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OnlineEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OnlineEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OnlineEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ONLINE = "online";
    @SerializedName(SERIALIZED_NAME_ONLINE)
    private String online;
    private OnlineEnum onlineEnum;

    /**
     * Who can unanchor starbase (POS) and its structures
     */
    @JsonAdapter(UnanchorEnum.Adapter.class)
    public enum UnanchorEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        UnanchorEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static UnanchorEnum fromValue(String value) {
            for (UnanchorEnum b : UnanchorEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<UnanchorEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final UnanchorEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public UnanchorEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return UnanchorEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_UNANCHOR = "unanchor";
    @SerializedName(SERIALIZED_NAME_UNANCHOR)
    private String unanchor;
    private UnanchorEnum unanchorEnum;

    public static final String SERIALIZED_NAME_USE_ALLIANCE_STANDINGS = "use_alliance_standings";
    @SerializedName(SERIALIZED_NAME_USE_ALLIANCE_STANDINGS)
    private Boolean useAllianceStandings;

    public CorporationStarbaseResponse allowAllianceMembers(Boolean allowAllianceMembers) {

        this.allowAllianceMembers = allowAllianceMembers;
        return this;
    }

    /**
     * allow_alliance_members boolean
     * 
     * @return allowAllianceMembers
     **/
    @ApiModelProperty(required = true, value = "allow_alliance_members boolean")
    public Boolean getAllowAllianceMembers() {
        return allowAllianceMembers;
    }

    public void setAllowAllianceMembers(Boolean allowAllianceMembers) {
        this.allowAllianceMembers = allowAllianceMembers;
    }

    public CorporationStarbaseResponse allowCorporationMembers(Boolean allowCorporationMembers) {

        this.allowCorporationMembers = allowCorporationMembers;
        return this;
    }

    /**
     * allow_corporation_members boolean
     * 
     * @return allowCorporationMembers
     **/
    @ApiModelProperty(required = true, value = "allow_corporation_members boolean")
    public Boolean getAllowCorporationMembers() {
        return allowCorporationMembers;
    }

    public void setAllowCorporationMembers(Boolean allowCorporationMembers) {
        this.allowCorporationMembers = allowCorporationMembers;
    }

    public CorporationStarbaseResponse anchor(AnchorEnum anchorEnum) {

        this.anchorEnum = anchorEnum;
        return this;
    }

    public CorporationStarbaseResponse anchorString(String anchor) {

        this.anchor = anchor;
        return this;
    }

    /**
     * Who can anchor starbase (POS) and its structures
     * 
     * @return anchor
     **/
    @ApiModelProperty(required = true, value = "Who can anchor starbase (POS) and its structures")
    public AnchorEnum getAnchor() {
        if (anchorEnum == null) {
            anchorEnum = AnchorEnum.fromValue(anchor);
        }
        return anchorEnum;
    }

    public String getAnchorString() {
        return anchor;
    }

    public void setAnchor(AnchorEnum anchorEnum) {
        this.anchorEnum = anchorEnum;
    }

    public void setAnchorString(String anchor) {
        this.anchor = anchor;
    }

    public CorporationStarbaseResponse attackIfAtWar(Boolean attackIfAtWar) {

        this.attackIfAtWar = attackIfAtWar;
        return this;
    }

    /**
     * attack_if_at_war boolean
     * 
     * @return attackIfAtWar
     **/
    @ApiModelProperty(required = true, value = "attack_if_at_war boolean")
    public Boolean getAttackIfAtWar() {
        return attackIfAtWar;
    }

    public void setAttackIfAtWar(Boolean attackIfAtWar) {
        this.attackIfAtWar = attackIfAtWar;
    }

    public CorporationStarbaseResponse attackIfOtherSecurityStatusDropping(Boolean attackIfOtherSecurityStatusDropping) {

        this.attackIfOtherSecurityStatusDropping = attackIfOtherSecurityStatusDropping;
        return this;
    }

    /**
     * attack_if_other_security_status_dropping boolean
     * 
     * @return attackIfOtherSecurityStatusDropping
     **/
    @ApiModelProperty(required = true, value = "attack_if_other_security_status_dropping boolean")
    public Boolean getAttackIfOtherSecurityStatusDropping() {
        return attackIfOtherSecurityStatusDropping;
    }

    public void setAttackIfOtherSecurityStatusDropping(Boolean attackIfOtherSecurityStatusDropping) {
        this.attackIfOtherSecurityStatusDropping = attackIfOtherSecurityStatusDropping;
    }

    public CorporationStarbaseResponse attackSecurityStatusThreshold(Float attackSecurityStatusThreshold) {

        this.attackSecurityStatusThreshold = attackSecurityStatusThreshold;
        return this;
    }

    /**
     * Starbase (POS) will attack if target&#39;s security standing is lower
     * than this value
     * 
     * @return attackSecurityStatusThreshold
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Starbase (POS) will attack if target's security standing is lower than this value")
    public Float getAttackSecurityStatusThreshold() {
        return attackSecurityStatusThreshold;
    }

    public void setAttackSecurityStatusThreshold(Float attackSecurityStatusThreshold) {
        this.attackSecurityStatusThreshold = attackSecurityStatusThreshold;
    }

    public CorporationStarbaseResponse attackStandingThreshold(Float attackStandingThreshold) {

        this.attackStandingThreshold = attackStandingThreshold;
        return this;
    }

    /**
     * Starbase (POS) will attack if target&#39;s standing is lower than this
     * value
     * 
     * @return attackStandingThreshold
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Starbase (POS) will attack if target's standing is lower than this value")
    public Float getAttackStandingThreshold() {
        return attackStandingThreshold;
    }

    public void setAttackStandingThreshold(Float attackStandingThreshold) {
        this.attackStandingThreshold = attackStandingThreshold;
    }

    public CorporationStarbaseResponse fuelBayTake(FuelBayTakeEnum fuelBayTakeEnum) {

        this.fuelBayTakeEnum = fuelBayTakeEnum;
        return this;
    }

    public CorporationStarbaseResponse fuelBayTakeString(String fuelBayTake) {

        this.fuelBayTake = fuelBayTake;
        return this;
    }

    /**
     * Who can take fuel blocks out of the starbase (POS)&#39;s fuel bay
     * 
     * @return fuelBayTake
     **/
    @ApiModelProperty(required = true, value = "Who can take fuel blocks out of the starbase (POS)'s fuel bay")
    public FuelBayTakeEnum getFuelBayTake() {
        if (fuelBayTakeEnum == null) {
            fuelBayTakeEnum = FuelBayTakeEnum.fromValue(fuelBayTake);
        }
        return fuelBayTakeEnum;
    }

    public String getFuelBayTakeString() {
        return fuelBayTake;
    }

    public void setFuelBayTake(FuelBayTakeEnum fuelBayTakeEnum) {
        this.fuelBayTakeEnum = fuelBayTakeEnum;
    }

    public void setFuelBayTakeString(String fuelBayTake) {
        this.fuelBayTake = fuelBayTake;
    }

    public CorporationStarbaseResponse fuelBayView(FuelBayViewEnum fuelBayViewEnum) {

        this.fuelBayViewEnum = fuelBayViewEnum;
        return this;
    }

    public CorporationStarbaseResponse fuelBayViewString(String fuelBayView) {

        this.fuelBayView = fuelBayView;
        return this;
    }

    /**
     * Who can view the starbase (POS)&#39;s fule bay. Characters either need to
     * have required role or belong to the starbase (POS) owner&#39;s
     * corporation or alliance, as described by the enum, all other access
     * settings follows the same scheme
     * 
     * @return fuelBayView
     **/
    @ApiModelProperty(required = true, value = "Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme")
    public FuelBayViewEnum getFuelBayView() {
        if (fuelBayViewEnum == null) {
            fuelBayViewEnum = FuelBayViewEnum.fromValue(fuelBayView);
        }
        return fuelBayViewEnum;
    }

    public String getFuelBayViewString() {
        return fuelBayView;
    }

    public void setFuelBayView(FuelBayViewEnum fuelBayViewEnum) {
        this.fuelBayViewEnum = fuelBayViewEnum;
    }

    public void setFuelBayViewString(String fuelBayView) {
        this.fuelBayView = fuelBayView;
    }

    public CorporationStarbaseResponse fuels(List<CorporationStarbaseFuel> fuels) {

        this.fuels = fuels;
        return this;
    }

    public CorporationStarbaseResponse addFuelsItem(CorporationStarbaseFuel fuelsItem) {
        if (this.fuels == null) {
            this.fuels = new ArrayList<>();
        }
        this.fuels.add(fuelsItem);
        return this;
    }

    /**
     * Fuel blocks and other things that will be consumed when operating a
     * starbase (POS)
     * 
     * @return fuels
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Fuel blocks and other things that will be consumed when operating a starbase (POS)")
    public List<CorporationStarbaseFuel> getFuels() {
        return fuels;
    }

    public void setFuels(List<CorporationStarbaseFuel> fuels) {
        this.fuels = fuels;
    }

    public CorporationStarbaseResponse offline(OfflineEnum offlineEnum) {

        this.offlineEnum = offlineEnum;
        return this;
    }

    public CorporationStarbaseResponse offlineString(String offline) {

        this.offline = offline;
        return this;
    }

    /**
     * Who can offline starbase (POS) and its structures
     * 
     * @return offline
     **/
    @ApiModelProperty(required = true, value = "Who can offline starbase (POS) and its structures")
    public OfflineEnum getOffline() {
        if (offlineEnum == null) {
            offlineEnum = OfflineEnum.fromValue(offline);
        }
        return offlineEnum;
    }

    public String getOfflineString() {
        return offline;
    }

    public void setOffline(OfflineEnum offlineEnum) {
        this.offlineEnum = offlineEnum;
    }

    public void setOfflineString(String offline) {
        this.offline = offline;
    }

    public CorporationStarbaseResponse online(OnlineEnum onlineEnum) {

        this.onlineEnum = onlineEnum;
        return this;
    }

    public CorporationStarbaseResponse onlineString(String online) {

        this.online = online;
        return this;
    }

    /**
     * Who can online starbase (POS) and its structures
     * 
     * @return online
     **/
    @ApiModelProperty(required = true, value = "Who can online starbase (POS) and its structures")
    public OnlineEnum getOnline() {
        if (onlineEnum == null) {
            onlineEnum = OnlineEnum.fromValue(online);
        }
        return onlineEnum;
    }

    public String getOnlineString() {
        return online;
    }

    public void setOnline(OnlineEnum onlineEnum) {
        this.onlineEnum = onlineEnum;
    }

    public void setOnlineString(String online) {
        this.online = online;
    }

    public CorporationStarbaseResponse unanchor(UnanchorEnum unanchorEnum) {

        this.unanchorEnum = unanchorEnum;
        return this;
    }

    public CorporationStarbaseResponse unanchorString(String unanchor) {

        this.unanchor = unanchor;
        return this;
    }

    /**
     * Who can unanchor starbase (POS) and its structures
     * 
     * @return unanchor
     **/
    @ApiModelProperty(required = true, value = "Who can unanchor starbase (POS) and its structures")
    public UnanchorEnum getUnanchor() {
        if (unanchorEnum == null) {
            unanchorEnum = UnanchorEnum.fromValue(unanchor);
        }
        return unanchorEnum;
    }

    public String getUnanchorString() {
        return unanchor;
    }

    public void setUnanchor(UnanchorEnum unanchorEnum) {
        this.unanchorEnum = unanchorEnum;
    }

    public void setUnanchorString(String unanchor) {
        this.unanchor = unanchor;
    }

    public CorporationStarbaseResponse useAllianceStandings(Boolean useAllianceStandings) {

        this.useAllianceStandings = useAllianceStandings;
        return this;
    }

    /**
     * True if the starbase (POS) is using alliance standings, otherwise using
     * corporation&#39;s
     * 
     * @return useAllianceStandings
     **/
    @ApiModelProperty(required = true, value = "True if the starbase (POS) is using alliance standings, otherwise using corporation's")
    public Boolean getUseAllianceStandings() {
        return useAllianceStandings;
    }

    public void setUseAllianceStandings(Boolean useAllianceStandings) {
        this.useAllianceStandings = useAllianceStandings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationStarbaseResponse corporationStarbaseResponse = (CorporationStarbaseResponse) o;
        return Objects.equals(this.allowAllianceMembers, corporationStarbaseResponse.allowAllianceMembers)
                && Objects.equals(this.allowCorporationMembers, corporationStarbaseResponse.allowCorporationMembers)
                && Objects.equals(this.anchor, corporationStarbaseResponse.anchor)
                && Objects.equals(this.attackIfAtWar, corporationStarbaseResponse.attackIfAtWar)
                && Objects.equals(this.attackIfOtherSecurityStatusDropping,
                        corporationStarbaseResponse.attackIfOtherSecurityStatusDropping)
                && Objects.equals(this.attackSecurityStatusThreshold,
                        corporationStarbaseResponse.attackSecurityStatusThreshold)
                && Objects.equals(this.attackStandingThreshold, corporationStarbaseResponse.attackStandingThreshold)
                && Objects.equals(this.fuelBayTake, corporationStarbaseResponse.fuelBayTake)
                && Objects.equals(this.fuelBayView, corporationStarbaseResponse.fuelBayView)
                && Objects.equals(this.fuels, corporationStarbaseResponse.fuels)
                && Objects.equals(this.offline, corporationStarbaseResponse.offline)
                && Objects.equals(this.online, corporationStarbaseResponse.online)
                && Objects.equals(this.unanchor, corporationStarbaseResponse.unanchor)
                && Objects.equals(this.useAllianceStandings, corporationStarbaseResponse.useAllianceStandings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowAllianceMembers, allowCorporationMembers, anchor, attackIfAtWar,
                attackIfOtherSecurityStatusDropping, attackSecurityStatusThreshold, attackStandingThreshold,
                fuelBayTake, fuelBayView, fuels, offline, online, unanchor, useAllianceStandings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationStarbaseResponse {\n");
        sb.append("    allowAllianceMembers: ").append(toIndentedString(allowAllianceMembers)).append("\n");
        sb.append("    allowCorporationMembers: ").append(toIndentedString(allowCorporationMembers)).append("\n");
        sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
        sb.append("    attackIfAtWar: ").append(toIndentedString(attackIfAtWar)).append("\n");
        sb.append("    attackIfOtherSecurityStatusDropping: ")
                .append(toIndentedString(attackIfOtherSecurityStatusDropping)).append("\n");
        sb.append("    attackSecurityStatusThreshold: ").append(toIndentedString(attackSecurityStatusThreshold))
                .append("\n");
        sb.append("    attackStandingThreshold: ").append(toIndentedString(attackStandingThreshold)).append("\n");
        sb.append("    fuelBayTake: ").append(toIndentedString(fuelBayTake)).append("\n");
        sb.append("    fuelBayView: ").append(toIndentedString(fuelBayView)).append("\n");
        sb.append("    fuels: ").append(toIndentedString(fuels)).append("\n");
        sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
        sb.append("    online: ").append(toIndentedString(online)).append("\n");
        sb.append("    unanchor: ").append(toIndentedString(unanchor)).append("\n");
        sb.append("    useAllianceStandings: ").append(toIndentedString(useAllianceStandings)).append("\n");
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
