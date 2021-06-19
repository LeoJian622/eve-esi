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
 * last_week object
 */
@ApiModel(description = "last_week object")
public class FactionWarfareLeaderboardCorporationLastWeekKills implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private Integer amount;

    public static final String SERIALIZED_NAME_CORPORATION_ID = "corporation_id";
    @SerializedName(SERIALIZED_NAME_CORPORATION_ID)
    private Integer corporationId;

    public FactionWarfareLeaderboardCorporationLastWeekKills amount(Integer amount) {

        this.amount = amount;
        return this;
    }

    /**
     * Amount of kills
     * 
     * @return amount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Amount of kills")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public FactionWarfareLeaderboardCorporationLastWeekKills corporationId(Integer corporationId) {

        this.corporationId = corporationId;
        return this;
    }

    /**
     * corporation_id integer
     * 
     * @return corporationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "corporation_id integer")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardCorporationLastWeekKills factionWarfareLeaderboardCorporationLastWeekKills = (FactionWarfareLeaderboardCorporationLastWeekKills) o;
        return Objects.equals(this.amount, factionWarfareLeaderboardCorporationLastWeekKills.amount)
                && Objects.equals(this.corporationId, factionWarfareLeaderboardCorporationLastWeekKills.corporationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, corporationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCorporationLastWeekKills {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
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
