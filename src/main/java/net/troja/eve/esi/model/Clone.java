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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * jump_clone object
 */
@ApiModel(description = "jump_clone object")
public class Clone implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_IMPLANTS = "implants";
    @SerializedName(SERIALIZED_NAME_IMPLANTS)
    private List<Integer> implants = new ArrayList<>();

    public static final String SERIALIZED_NAME_JUMP_CLONE_ID = "jump_clone_id";
    @SerializedName(SERIALIZED_NAME_JUMP_CLONE_ID)
    private Integer jumpCloneId;

    public static final String SERIALIZED_NAME_LOCATION_ID = "location_id";
    @SerializedName(SERIALIZED_NAME_LOCATION_ID)
    private Long locationId;

    /**
     * location_type string
     */
    @JsonAdapter(LocationTypeEnum.Adapter.class)
    public enum LocationTypeEnum {
        STATION("station"),

        STRUCTURE("structure");

        private String value;

        LocationTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static LocationTypeEnum fromValue(String value) {
            for (LocationTypeEnum b : LocationTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<LocationTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final LocationTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LocationTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LocationTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
    @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
    private String locationType;
    private LocationTypeEnum locationTypeEnum;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public Clone implants(List<Integer> implants) {

        this.implants = implants;
        return this;
    }

    public Clone addImplantsItem(Integer implantsItem) {
        this.implants.add(implantsItem);
        return this;
    }

    /**
     * implants array
     * 
     * @return implants
     **/
    @ApiModelProperty(required = true, value = "implants array")
    public List<Integer> getImplants() {
        return implants;
    }

    public void setImplants(List<Integer> implants) {
        this.implants = implants;
    }

    public Clone jumpCloneId(Integer jumpCloneId) {

        this.jumpCloneId = jumpCloneId;
        return this;
    }

    /**
     * jump_clone_id integer
     * 
     * @return jumpCloneId
     **/
    @ApiModelProperty(required = true, value = "jump_clone_id integer")
    public Integer getJumpCloneId() {
        return jumpCloneId;
    }

    public void setJumpCloneId(Integer jumpCloneId) {
        this.jumpCloneId = jumpCloneId;
    }

    public Clone locationId(Long locationId) {

        this.locationId = locationId;
        return this;
    }

    /**
     * location_id integer
     * 
     * @return locationId
     **/
    @ApiModelProperty(required = true, value = "location_id integer")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Clone locationType(LocationTypeEnum locationTypeEnum) {

        this.locationTypeEnum = locationTypeEnum;
        return this;
    }

    public Clone locationTypeString(String locationType) {

        this.locationType = locationType;
        return this;
    }

    /**
     * location_type string
     * 
     * @return locationType
     **/
    @ApiModelProperty(required = true, value = "location_type string")
    public LocationTypeEnum getLocationType() {
        if (locationTypeEnum == null) {
            locationTypeEnum = LocationTypeEnum.fromValue(locationType);
        }
        return locationTypeEnum;
    }

    public String getLocationTypeString() {
        return locationType;
    }

    public void setLocationType(LocationTypeEnum locationTypeEnum) {
        this.locationTypeEnum = locationTypeEnum;
    }

    public void setLocationTypeString(String locationType) {
        this.locationType = locationType;
    }

    public Clone name(String name) {

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Clone clone = (Clone) o;
        return Objects.equals(this.implants, clone.implants) && Objects.equals(this.jumpCloneId, clone.jumpCloneId)
                && Objects.equals(this.locationId, clone.locationId)
                && Objects.equals(this.locationType, clone.locationType) && Objects.equals(this.name, clone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(implants, jumpCloneId, locationId, locationType, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Clone {\n");
        sb.append("    implants: ").append(toIndentedString(implants)).append("\n");
        sb.append("    jumpCloneId: ").append(toIndentedString(jumpCloneId)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
