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
import net.troja.eve.esi.model.CharacterFwStatsKills;
import net.troja.eve.esi.model.CharacterFwStatsVictoryPoints;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterFwStatsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CURRENT_RANK = "current_rank";
    @SerializedName(SERIALIZED_NAME_CURRENT_RANK)
    private Integer currentRank;

    public static final String SERIALIZED_NAME_ENLISTED_ON = "enlisted_on";
    @SerializedName(SERIALIZED_NAME_ENLISTED_ON)
    private OffsetDateTime enlistedOn;

    public static final String SERIALIZED_NAME_FACTION_ID = "faction_id";
    @SerializedName(SERIALIZED_NAME_FACTION_ID)
    private Integer factionId;

    public static final String SERIALIZED_NAME_HIGHEST_RANK = "highest_rank";
    @SerializedName(SERIALIZED_NAME_HIGHEST_RANK)
    private Integer highestRank;

    public static final String SERIALIZED_NAME_KILLS = "kills";
    @SerializedName(SERIALIZED_NAME_KILLS)
    private CharacterFwStatsKills kills;

    public static final String SERIALIZED_NAME_VICTORY_POINTS = "victory_points";
    @SerializedName(SERIALIZED_NAME_VICTORY_POINTS)
    private CharacterFwStatsVictoryPoints victoryPoints;

    public CharacterFwStatsResponse currentRank(Integer currentRank) {

        this.currentRank = currentRank;
        return this;
    }

    /**
     * The given character&#39;s current faction rank minimum: 0 maximum: 9
     * 
     * @return currentRank
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The given character's current faction rank")
    public Integer getCurrentRank() {
        return currentRank;
    }

    public void setCurrentRank(Integer currentRank) {
        this.currentRank = currentRank;
    }

    public CharacterFwStatsResponse enlistedOn(OffsetDateTime enlistedOn) {

        this.enlistedOn = enlistedOn;
        return this;
    }

    /**
     * The enlistment date of the given character into faction warfare. Will not
     * be included if character is not enlisted in faction warfare
     * 
     * @return enlistedOn
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The enlistment date of the given character into faction warfare. Will not be included if character is not enlisted in faction warfare")
    public OffsetDateTime getEnlistedOn() {
        return enlistedOn;
    }

    public void setEnlistedOn(OffsetDateTime enlistedOn) {
        this.enlistedOn = enlistedOn;
    }

    public CharacterFwStatsResponse factionId(Integer factionId) {

        this.factionId = factionId;
        return this;
    }

    /**
     * The faction the given character is enlisted to fight for. Will not be
     * included if character is not enlisted in faction warfare
     * 
     * @return factionId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The faction the given character is enlisted to fight for. Will not be included if character is not enlisted in faction warfare")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public CharacterFwStatsResponse highestRank(Integer highestRank) {

        this.highestRank = highestRank;
        return this;
    }

    /**
     * The given character&#39;s highest faction rank achieved minimum: 0
     * maximum: 9
     * 
     * @return highestRank
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The given character's highest faction rank achieved")
    public Integer getHighestRank() {
        return highestRank;
    }

    public void setHighestRank(Integer highestRank) {
        this.highestRank = highestRank;
    }

    public CharacterFwStatsResponse kills(CharacterFwStatsKills kills) {

        this.kills = kills;
        return this;
    }

    /**
     * Get kills
     * 
     * @return kills
     **/
    @ApiModelProperty(required = true, value = "")
    public CharacterFwStatsKills getKills() {
        return kills;
    }

    public void setKills(CharacterFwStatsKills kills) {
        this.kills = kills;
    }

    public CharacterFwStatsResponse victoryPoints(CharacterFwStatsVictoryPoints victoryPoints) {

        this.victoryPoints = victoryPoints;
        return this;
    }

    /**
     * Get victoryPoints
     * 
     * @return victoryPoints
     **/
    @ApiModelProperty(required = true, value = "")
    public CharacterFwStatsVictoryPoints getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(CharacterFwStatsVictoryPoints victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterFwStatsResponse characterFwStatsResponse = (CharacterFwStatsResponse) o;
        return Objects.equals(this.currentRank, characterFwStatsResponse.currentRank)
                && Objects.equals(this.enlistedOn, characterFwStatsResponse.enlistedOn)
                && Objects.equals(this.factionId, characterFwStatsResponse.factionId)
                && Objects.equals(this.highestRank, characterFwStatsResponse.highestRank)
                && Objects.equals(this.kills, characterFwStatsResponse.kills)
                && Objects.equals(this.victoryPoints, characterFwStatsResponse.victoryPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentRank, enlistedOn, factionId, highestRank, kills, victoryPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterFwStatsResponse {\n");
        sb.append("    currentRank: ").append(toIndentedString(currentRank)).append("\n");
        sb.append("    enlistedOn: ").append(toIndentedString(enlistedOn)).append("\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
        sb.append("    highestRank: ").append(toIndentedString(highestRank)).append("\n");
        sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
        sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
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
