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
 * position object
 */
@ApiModel(description = "position object")
public class CharacterAssetsLocationsPosition implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_X = "x";
    @SerializedName(SERIALIZED_NAME_X)
    private Double x;

    public static final String SERIALIZED_NAME_Y = "y";
    @SerializedName(SERIALIZED_NAME_Y)
    private Double y;

    public static final String SERIALIZED_NAME_Z = "z";
    @SerializedName(SERIALIZED_NAME_Z)
    private Double z;

    public CharacterAssetsLocationsPosition x(Double x) {

        this.x = x;
        return this;
    }

    /**
     * x number
     * 
     * @return x
     **/
    @ApiModelProperty(required = true, value = "x number")
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public CharacterAssetsLocationsPosition y(Double y) {

        this.y = y;
        return this;
    }

    /**
     * y number
     * 
     * @return y
     **/
    @ApiModelProperty(required = true, value = "y number")
    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public CharacterAssetsLocationsPosition z(Double z) {

        this.z = z;
        return this;
    }

    /**
     * z number
     * 
     * @return z
     **/
    @ApiModelProperty(required = true, value = "z number")
    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterAssetsLocationsPosition characterAssetsLocationsPosition = (CharacterAssetsLocationsPosition) o;
        return Objects.equals(this.x, characterAssetsLocationsPosition.x)
                && Objects.equals(this.y, characterAssetsLocationsPosition.y)
                && Objects.equals(this.z, characterAssetsLocationsPosition.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterAssetsLocationsPosition {\n");
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    z: ").append(toIndentedString(z)).append("\n");
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
