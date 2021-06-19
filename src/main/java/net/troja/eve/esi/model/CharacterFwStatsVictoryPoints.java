/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.8.2
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
import java.io.Serializable;

/**
 * Summary of victory points gained by the given character for the enlisted
 * faction
 */
@ApiModel(description = "Summary of victory points gained by the given character for the enlisted faction")
public class CharacterFwStatsVictoryPoints implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LAST_WEEK = "last_week";
    @SerializedName(SERIALIZED_NAME_LAST_WEEK)
    private Integer lastWeek;

    public static final String SERIALIZED_NAME_TOTAL = "total";
    @SerializedName(SERIALIZED_NAME_TOTAL)
    private Integer total;

    public static final String SERIALIZED_NAME_YESTERDAY = "yesterday";
    @SerializedName(SERIALIZED_NAME_YESTERDAY)
    private Integer yesterday;

    public CharacterFwStatsVictoryPoints lastWeek(Integer lastWeek) {

        this.lastWeek = lastWeek;
        return this;
    }

    /**
     * Last week&#39;s victory points gained by the given character
     * 
     * @return lastWeek
     **/
    @ApiModelProperty(required = true, value = "Last week's victory points gained by the given character")
    public Integer getLastWeek() {
        return lastWeek;
    }

    public void setLastWeek(Integer lastWeek) {
        this.lastWeek = lastWeek;
    }

    public CharacterFwStatsVictoryPoints total(Integer total) {

        this.total = total;
        return this;
    }

    /**
     * Total victory points gained since the given character enlisted
     * 
     * @return total
     **/
    @ApiModelProperty(required = true, value = "Total victory points gained since the given character enlisted")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public CharacterFwStatsVictoryPoints yesterday(Integer yesterday) {

        this.yesterday = yesterday;
        return this;
    }

    /**
     * Yesterday&#39;s victory points gained by the given character
     * 
     * @return yesterday
     **/
    @ApiModelProperty(required = true, value = "Yesterday's victory points gained by the given character")
    public Integer getYesterday() {
        return yesterday;
    }

    public void setYesterday(Integer yesterday) {
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
        CharacterFwStatsVictoryPoints characterFwStatsVictoryPoints = (CharacterFwStatsVictoryPoints) o;
        return Objects.equals(this.lastWeek, characterFwStatsVictoryPoints.lastWeek)
                && Objects.equals(this.total, characterFwStatsVictoryPoints.total)
                && Objects.equals(this.yesterday, characterFwStatsVictoryPoints.yesterday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastWeek, total, yesterday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterFwStatsVictoryPoints {\n");
        sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
