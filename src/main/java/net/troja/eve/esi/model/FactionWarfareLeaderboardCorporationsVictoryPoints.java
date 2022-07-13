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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationLastWeekVictoryPoints;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationYesterdayVictoryPoints;
import java.io.Serializable;

/**
 * Top 10 rankings of corporations by victory points from yesterday, last week
 * and in total
 */
@ApiModel(description = "Top 10 rankings of corporations by victory points from yesterday, last week and in total")
public class FactionWarfareLeaderboardCorporationsVictoryPoints implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ACTIVE_TOTAL = "active_total";
    @SerializedName(SERIALIZED_NAME_ACTIVE_TOTAL)
    private List<FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints> activeTotal = new ArrayList<>();

    public static final String SERIALIZED_NAME_LAST_WEEK = "last_week";
    @SerializedName(SERIALIZED_NAME_LAST_WEEK)
    private List<FactionWarfareLeaderboardCorporationLastWeekVictoryPoints> lastWeek = new ArrayList<>();

    public static final String SERIALIZED_NAME_YESTERDAY = "yesterday";
    @SerializedName(SERIALIZED_NAME_YESTERDAY)
    private List<FactionWarfareLeaderboardCorporationYesterdayVictoryPoints> yesterday = new ArrayList<>();

    public FactionWarfareLeaderboardCorporationsVictoryPoints activeTotal(
            List<FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints> activeTotal) {

        this.activeTotal = activeTotal;
        return this;
    }

    public FactionWarfareLeaderboardCorporationsVictoryPoints addActiveTotalItem(
            FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints activeTotalItem) {
        this.activeTotal.add(activeTotalItem);
        return this;
    }

    /**
     * Top 10 ranking of corporations active in faction warfare by total victory
     * points. A corporation is considered \&quot;active\&quot; if they have
     * participated in faction warfare in the past 14 days
     * 
     * @return activeTotal
     **/
    @ApiModelProperty(required = true, value = "Top 10 ranking of corporations active in faction warfare by total victory points. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days")
    public List<FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints> getActiveTotal() {
        return activeTotal;
    }

    public void setActiveTotal(List<FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints> activeTotal) {
        this.activeTotal = activeTotal;
    }

    public FactionWarfareLeaderboardCorporationsVictoryPoints lastWeek(
            List<FactionWarfareLeaderboardCorporationLastWeekVictoryPoints> lastWeek) {

        this.lastWeek = lastWeek;
        return this;
    }

    public FactionWarfareLeaderboardCorporationsVictoryPoints addLastWeekItem(
            FactionWarfareLeaderboardCorporationLastWeekVictoryPoints lastWeekItem) {
        this.lastWeek.add(lastWeekItem);
        return this;
    }

    /**
     * Top 10 ranking of corporations by victory points in the past week
     * 
     * @return lastWeek
     **/
    @ApiModelProperty(required = true, value = "Top 10 ranking of corporations by victory points in the past week")
    public List<FactionWarfareLeaderboardCorporationLastWeekVictoryPoints> getLastWeek() {
        return lastWeek;
    }

    public void setLastWeek(List<FactionWarfareLeaderboardCorporationLastWeekVictoryPoints> lastWeek) {
        this.lastWeek = lastWeek;
    }

    public FactionWarfareLeaderboardCorporationsVictoryPoints yesterday(
            List<FactionWarfareLeaderboardCorporationYesterdayVictoryPoints> yesterday) {

        this.yesterday = yesterday;
        return this;
    }

    public FactionWarfareLeaderboardCorporationsVictoryPoints addYesterdayItem(
            FactionWarfareLeaderboardCorporationYesterdayVictoryPoints yesterdayItem) {
        this.yesterday.add(yesterdayItem);
        return this;
    }

    /**
     * Top 10 ranking of corporations by victory points in the past day
     * 
     * @return yesterday
     **/
    @ApiModelProperty(required = true, value = "Top 10 ranking of corporations by victory points in the past day")
    public List<FactionWarfareLeaderboardCorporationYesterdayVictoryPoints> getYesterday() {
        return yesterday;
    }

    public void setYesterday(List<FactionWarfareLeaderboardCorporationYesterdayVictoryPoints> yesterday) {
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
        FactionWarfareLeaderboardCorporationsVictoryPoints factionWarfareLeaderboardCorporationsVictoryPoints = (FactionWarfareLeaderboardCorporationsVictoryPoints) o;
        return Objects.equals(this.activeTotal, factionWarfareLeaderboardCorporationsVictoryPoints.activeTotal)
                && Objects.equals(this.lastWeek, factionWarfareLeaderboardCorporationsVictoryPoints.lastWeek)
                && Objects.equals(this.yesterday, factionWarfareLeaderboardCorporationsVictoryPoints.yesterday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeTotal, lastWeek, yesterday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCorporationsVictoryPoints {\n");
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
