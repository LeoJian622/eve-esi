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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class DogmaAttributeResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ATTRIBUTE_ID = "attribute_id";
    @SerializedName(SERIALIZED_NAME_ATTRIBUTE_ID)
    private Integer attributeId;

    public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
    @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
    private Float defaultValue;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    private String displayName;

    public static final String SERIALIZED_NAME_HIGH_IS_GOOD = "high_is_good";
    @SerializedName(SERIALIZED_NAME_HIGH_IS_GOOD)
    private Boolean highIsGood;

    public static final String SERIALIZED_NAME_ICON_ID = "icon_id";
    @SerializedName(SERIALIZED_NAME_ICON_ID)
    private Integer iconId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PUBLISHED = "published";
    @SerializedName(SERIALIZED_NAME_PUBLISHED)
    private Boolean published;

    public static final String SERIALIZED_NAME_STACKABLE = "stackable";
    @SerializedName(SERIALIZED_NAME_STACKABLE)
    private Boolean stackable;

    public static final String SERIALIZED_NAME_UNIT_ID = "unit_id";
    @SerializedName(SERIALIZED_NAME_UNIT_ID)
    private Integer unitId;

    public DogmaAttributeResponse attributeId(Integer attributeId) {

        this.attributeId = attributeId;
        return this;
    }

    /**
     * attribute_id integer
     * 
     * @return attributeId
     **/
    @ApiModelProperty(required = true, value = "attribute_id integer")
    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public DogmaAttributeResponse defaultValue(Float defaultValue) {

        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * default_value number
     * 
     * @return defaultValue
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "default_value number")
    public Float getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Float defaultValue) {
        this.defaultValue = defaultValue;
    }

    public DogmaAttributeResponse description(String description) {

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

    public DogmaAttributeResponse displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }

    /**
     * display_name string
     * 
     * @return displayName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "display_name string")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public DogmaAttributeResponse highIsGood(Boolean highIsGood) {

        this.highIsGood = highIsGood;
        return this;
    }

    /**
     * high_is_good boolean
     * 
     * @return highIsGood
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "high_is_good boolean")
    public Boolean getHighIsGood() {
        return highIsGood;
    }

    public void setHighIsGood(Boolean highIsGood) {
        this.highIsGood = highIsGood;
    }

    public DogmaAttributeResponse iconId(Integer iconId) {

        this.iconId = iconId;
        return this;
    }

    /**
     * icon_id integer
     * 
     * @return iconId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "icon_id integer")
    public Integer getIconId() {
        return iconId;
    }

    public void setIconId(Integer iconId) {
        this.iconId = iconId;
    }

    public DogmaAttributeResponse name(String name) {

        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DogmaAttributeResponse published(Boolean published) {

        this.published = published;
        return this;
    }

    /**
     * published boolean
     * 
     * @return published
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "published boolean")
    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public DogmaAttributeResponse stackable(Boolean stackable) {

        this.stackable = stackable;
        return this;
    }

    /**
     * stackable boolean
     * 
     * @return stackable
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "stackable boolean")
    public Boolean getStackable() {
        return stackable;
    }

    public void setStackable(Boolean stackable) {
        this.stackable = stackable;
    }

    public DogmaAttributeResponse unitId(Integer unitId) {

        this.unitId = unitId;
        return this;
    }

    /**
     * unit_id integer
     * 
     * @return unitId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "unit_id integer")
    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DogmaAttributeResponse dogmaAttributeResponse = (DogmaAttributeResponse) o;
        return Objects.equals(this.attributeId, dogmaAttributeResponse.attributeId)
                && Objects.equals(this.defaultValue, dogmaAttributeResponse.defaultValue)
                && Objects.equals(this.description, dogmaAttributeResponse.description)
                && Objects.equals(this.displayName, dogmaAttributeResponse.displayName)
                && Objects.equals(this.highIsGood, dogmaAttributeResponse.highIsGood)
                && Objects.equals(this.iconId, dogmaAttributeResponse.iconId)
                && Objects.equals(this.name, dogmaAttributeResponse.name)
                && Objects.equals(this.published, dogmaAttributeResponse.published)
                && Objects.equals(this.stackable, dogmaAttributeResponse.stackable)
                && Objects.equals(this.unitId, dogmaAttributeResponse.unitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributeId, defaultValue, description, displayName, highIsGood, iconId, name, published,
                stackable, unitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DogmaAttributeResponse {\n");
        sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    highIsGood: ").append(toIndentedString(highIsGood)).append("\n");
        sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    published: ").append(toIndentedString(published)).append("\n");
        sb.append("    stackable: ").append(toIndentedString(stackable)).append("\n");
        sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
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
