/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.12
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
public class CorporationResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ALLIANCE_ID = "alliance_id";
    @SerializedName(SERIALIZED_NAME_ALLIANCE_ID)
    private Integer allianceId;

    public static final String SERIALIZED_NAME_CEO_ID = "ceo_id";
    @SerializedName(SERIALIZED_NAME_CEO_ID)
    private Integer ceoId;

    public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
    @SerializedName(SERIALIZED_NAME_CREATOR_ID)
    private Integer creatorId;

    public static final String SERIALIZED_NAME_DATE_FOUNDED = "date_founded";
    @SerializedName(SERIALIZED_NAME_DATE_FOUNDED)
    private OffsetDateTime dateFounded;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_FACTION_ID = "faction_id";
    @SerializedName(SERIALIZED_NAME_FACTION_ID)
    private Integer factionId;

    public static final String SERIALIZED_NAME_HOME_STATION_ID = "home_station_id";
    @SerializedName(SERIALIZED_NAME_HOME_STATION_ID)
    private Integer homeStationId;

    public static final String SERIALIZED_NAME_MEMBER_COUNT = "member_count";
    @SerializedName(SERIALIZED_NAME_MEMBER_COUNT)
    private Integer memberCount;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SHARES = "shares";
    @SerializedName(SERIALIZED_NAME_SHARES)
    private Long shares;

    public static final String SERIALIZED_NAME_TAX_RATE = "tax_rate";
    @SerializedName(SERIALIZED_NAME_TAX_RATE)
    private Float taxRate;

    public static final String SERIALIZED_NAME_TICKER = "ticker";
    @SerializedName(SERIALIZED_NAME_TICKER)
    private String ticker;

    public static final String SERIALIZED_NAME_URL = "url";
    @SerializedName(SERIALIZED_NAME_URL)
    private String url;

    public static final String SERIALIZED_NAME_WAR_ELIGIBLE = "war_eligible";
    @SerializedName(SERIALIZED_NAME_WAR_ELIGIBLE)
    private Boolean warEligible;

    public CorporationResponse allianceId(Integer allianceId) {

        this.allianceId = allianceId;
        return this;
    }

    /**
     * ID of the alliance that corporation is a member of, if any
     * 
     * @return allianceId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID of the alliance that corporation is a member of, if any")
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public CorporationResponse ceoId(Integer ceoId) {

        this.ceoId = ceoId;
        return this;
    }

    /**
     * ceo_id integer
     * 
     * @return ceoId
     **/
    @ApiModelProperty(required = true, value = "ceo_id integer")
    public Integer getCeoId() {
        return ceoId;
    }

    public void setCeoId(Integer ceoId) {
        this.ceoId = ceoId;
    }

    public CorporationResponse creatorId(Integer creatorId) {

        this.creatorId = creatorId;
        return this;
    }

    /**
     * creator_id integer
     * 
     * @return creatorId
     **/
    @ApiModelProperty(required = true, value = "creator_id integer")
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public CorporationResponse dateFounded(OffsetDateTime dateFounded) {

        this.dateFounded = dateFounded;
        return this;
    }

    /**
     * date_founded string
     * 
     * @return dateFounded
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "date_founded string")
    public OffsetDateTime getDateFounded() {
        return dateFounded;
    }

    public void setDateFounded(OffsetDateTime dateFounded) {
        this.dateFounded = dateFounded;
    }

    public CorporationResponse description(String description) {

        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CorporationResponse factionId(Integer factionId) {

        this.factionId = factionId;
        return this;
    }

    /**
     * faction_id integer
     * 
     * @return factionId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "faction_id integer")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public CorporationResponse homeStationId(Integer homeStationId) {

        this.homeStationId = homeStationId;
        return this;
    }

    /**
     * home_station_id integer
     * 
     * @return homeStationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "home_station_id integer")
    public Integer getHomeStationId() {
        return homeStationId;
    }

    public void setHomeStationId(Integer homeStationId) {
        this.homeStationId = homeStationId;
    }

    public CorporationResponse memberCount(Integer memberCount) {

        this.memberCount = memberCount;
        return this;
    }

    /**
     * member_count integer
     * 
     * @return memberCount
     **/
    @ApiModelProperty(required = true, value = "member_count integer")
    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public CorporationResponse name(String name) {

        this.name = name;
        return this;
    }

    /**
     * the full name of the corporation
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "the full name of the corporation")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CorporationResponse shares(Long shares) {

        this.shares = shares;
        return this;
    }

    /**
     * shares integer
     * 
     * @return shares
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "shares integer")
    public Long getShares() {
        return shares;
    }

    public void setShares(Long shares) {
        this.shares = shares;
    }

    public CorporationResponse taxRate(Float taxRate) {

        this.taxRate = taxRate;
        return this;
    }

    /**
     * tax_rate number minimum: 0 maximum: 1
     * 
     * @return taxRate
     **/
    @ApiModelProperty(required = true, value = "tax_rate number")
    public Float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Float taxRate) {
        this.taxRate = taxRate;
    }

    public CorporationResponse ticker(String ticker) {

        this.ticker = ticker;
        return this;
    }

    /**
     * the short name of the corporation
     * 
     * @return ticker
     **/
    @ApiModelProperty(required = true, value = "the short name of the corporation")
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public CorporationResponse url(String url) {

        this.url = url;
        return this;
    }

    /**
     * url string
     * 
     * @return url
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "url string")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CorporationResponse warEligible(Boolean warEligible) {

        this.warEligible = warEligible;
        return this;
    }

    /**
     * war_eligible boolean
     * 
     * @return warEligible
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "war_eligible boolean")
    public Boolean getWarEligible() {
        return warEligible;
    }

    public void setWarEligible(Boolean warEligible) {
        this.warEligible = warEligible;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationResponse corporationResponse = (CorporationResponse) o;
        return Objects.equals(this.allianceId, corporationResponse.allianceId)
                && Objects.equals(this.ceoId, corporationResponse.ceoId)
                && Objects.equals(this.creatorId, corporationResponse.creatorId)
                && Objects.equals(this.dateFounded, corporationResponse.dateFounded)
                && Objects.equals(this.description, corporationResponse.description)
                && Objects.equals(this.factionId, corporationResponse.factionId)
                && Objects.equals(this.homeStationId, corporationResponse.homeStationId)
                && Objects.equals(this.memberCount, corporationResponse.memberCount)
                && Objects.equals(this.name, corporationResponse.name)
                && Objects.equals(this.shares, corporationResponse.shares)
                && Objects.equals(this.taxRate, corporationResponse.taxRate)
                && Objects.equals(this.ticker, corporationResponse.ticker)
                && Objects.equals(this.url, corporationResponse.url)
                && Objects.equals(this.warEligible, corporationResponse.warEligible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allianceId, ceoId, creatorId, dateFounded, description, factionId, homeStationId,
                memberCount, name, shares, taxRate, ticker, url, warEligible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationResponse {\n");
        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    ceoId: ").append(toIndentedString(ceoId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    dateFounded: ").append(toIndentedString(dateFounded)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
        sb.append("    homeStationId: ").append(toIndentedString(homeStationId)).append("\n");
        sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
        sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
        sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    warEligible: ").append(toIndentedString(warEligible)).append("\n");
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
