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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationMedalsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private OffsetDateTime createdAt;

    public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
    @SerializedName(SERIALIZED_NAME_CREATOR_ID)
    private Integer creatorId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_MEDAL_ID = "medal_id";
    @SerializedName(SERIALIZED_NAME_MEDAL_ID)
    private Integer medalId;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public CorporationMedalsResponse createdAt(OffsetDateTime createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * created_at string
     * 
     * @return createdAt
     **/
    @ApiModelProperty(required = true, value = "created_at string")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CorporationMedalsResponse creatorId(Integer creatorId) {

        this.creatorId = creatorId;
        return this;
    }

    /**
     * ID of the character who created this medal
     * 
     * @return creatorId
     **/
    @ApiModelProperty(required = true, value = "ID of the character who created this medal")
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public CorporationMedalsResponse description(String description) {

        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @ApiModelProperty(required = true, value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CorporationMedalsResponse medalId(Integer medalId) {

        this.medalId = medalId;
        return this;
    }

    /**
     * medal_id integer
     * 
     * @return medalId
     **/
    @ApiModelProperty(required = true, value = "medal_id integer")
    public Integer getMedalId() {
        return medalId;
    }

    public void setMedalId(Integer medalId) {
        this.medalId = medalId;
    }

    public CorporationMedalsResponse title(String title) {

        this.title = title;
        return this;
    }

    /**
     * title string
     * 
     * @return title
     **/
    @ApiModelProperty(required = true, value = "title string")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationMedalsResponse corporationMedalsResponse = (CorporationMedalsResponse) o;
        return Objects.equals(this.createdAt, corporationMedalsResponse.createdAt)
                && Objects.equals(this.creatorId, corporationMedalsResponse.creatorId)
                && Objects.equals(this.description, corporationMedalsResponse.description)
                && Objects.equals(this.medalId, corporationMedalsResponse.medalId)
                && Objects.equals(this.title, corporationMedalsResponse.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, creatorId, description, medalId, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationMedalsResponse {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    medalId: ").append(toIndentedString(medalId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
