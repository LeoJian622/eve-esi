/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.7.2
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
import net.troja.eve.esi.model.FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCharactersLastWeekVictoryPoints;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCharactersYesterdayVictoryPoints;
import java.io.Serializable;

/**
 * Top 100 rankings of pilots by victory points from yesterday, last week and in
 * total
 */
@ApiModel(description = "Top 100 rankings of pilots by victory points from yesterday, last week and in total")
public class FactionWarfareLeaderboardCharacterVictoryPoints implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ACTIVE_TOTAL = "active_total";
    @SerializedName(SERIALIZED_NAME_ACTIVE_TOTAL)
    private List<FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints> activeTotal = new ArrayList<>();

    public static final String SERIALIZED_NAME_LAST_WEEK = "last_week";
    @SerializedName(SERIALIZED_NAME_LAST_WEEK)
    private List<FactionWarfareLeaderboardCharactersLastWeekVictoryPoints> lastWeek = new ArrayList<>();

    public static final String SERIALIZED_NAME_YESTERDAY = "yesterday";
    @SerializedName(SERIALIZED_NAME_YESTERDAY)
    private List<FactionWarfareLeaderboardCharactersYesterdayVictoryPoints> yesterday = new ArrayList<>();

    public FactionWarfareLeaderboardCharacterVictoryPoints activeTotal(
            List<FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints> activeTotal) {

        this.activeTotal = activeTotal;
        return this;
    }

    public FactionWarfareLeaderboardCharacterVictoryPoints addActiveTotalItem(
            FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints activeTotalItem) {
        this.activeTotal.add(activeTotalItem);
        return this;
    }

    /**
     * Top 100 ranking of pilots active in faction warfare by total victory
     * points. A pilot is considered \&quot;active\&quot; if they have
     * participated in faction warfare in the past 14 days
     * 
     * @return activeTotal
     **/
    @ApiModelProperty(required = true, value = "Top 100 ranking of pilots active in faction warfare by total victory points. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days")
    public List<FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints> getActiveTotal() {
        return activeTotal;
    }

    public void setActiveTotal(List<FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints> activeTotal) {
        this.activeTotal = activeTotal;
    }

    public FactionWarfareLeaderboardCharacterVictoryPoints lastWeek(
            List<FactionWarfareLeaderboardCharactersLastWeekVictoryPoints> lastWeek) {

        this.lastWeek = lastWeek;
        return this;
    }

    public FactionWarfareLeaderboardCharacterVictoryPoints addLastWeekItem(
            FactionWarfareLeaderboardCharactersLastWeekVictoryPoints lastWeekItem) {
        this.lastWeek.add(lastWeekItem);
        return this;
    }

    /**
     * Top 100 ranking of pilots by victory points in the past week
     * 
     * @return lastWeek
     **/
    @ApiModelProperty(required = true, value = "Top 100 ranking of pilots by victory points in the past week")
    public List<FactionWarfareLeaderboardCharactersLastWeekVictoryPoints> getLastWeek() {
        return lastWeek;
    }

    public void setLastWeek(List<FactionWarfareLeaderboardCharactersLastWeekVictoryPoints> lastWeek) {
        this.lastWeek = lastWeek;
    }

    public FactionWarfareLeaderboardCharacterVictoryPoints yesterday(
            List<FactionWarfareLeaderboardCharactersYesterdayVictoryPoints> yesterday) {

        this.yesterday = yesterday;
        return this;
    }

    public FactionWarfareLeaderboardCharacterVictoryPoints addYesterdayItem(
            FactionWarfareLeaderboardCharactersYesterdayVictoryPoints yesterdayItem) {
        this.yesterday.add(yesterdayItem);
        return this;
    }

    /**
     * Top 100 ranking of pilots by victory points in the past day
     * 
     * @return yesterday
     **/
    @ApiModelProperty(required = true, value = "Top 100 ranking of pilots by victory points in the past day")
    public List<FactionWarfareLeaderboardCharactersYesterdayVictoryPoints> getYesterday() {
        return yesterday;
    }

    public void setYesterday(List<FactionWarfareLeaderboardCharactersYesterdayVictoryPoints> yesterday) {
        this.yesterday = yesterday;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardCharacterVictoryPoints factionWarfareLeaderboardCharacterVictoryPoints = (FactionWarfareLeaderboardCharacterVictoryPoints) o;
        return Objects.equals(this.activeTotal, factionWarfareLeaderboardCharacterVictoryPoints.activeTotal)
                && Objects.equals(this.lastWeek, factionWarfareLeaderboardCharacterVictoryPoints.lastWeek)
                && Objects.equals(this.yesterday, factionWarfareLeaderboardCharacterVictoryPoints.yesterday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeTotal, lastWeek, yesterday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCharacterVictoryPoints {\n");
        sb.append("    activeTotal: ").append(toIndentedString(activeTotal)).append("\n");
        sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
        sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
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
