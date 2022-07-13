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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationIconsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_PX128X128 = "px128x128";
    @SerializedName(SERIALIZED_NAME_PX128X128)
    private String px128x128;

    public static final String SERIALIZED_NAME_PX256X256 = "px256x256";
    @SerializedName(SERIALIZED_NAME_PX256X256)
    private String px256x256;

    public static final String SERIALIZED_NAME_PX64X64 = "px64x64";
    @SerializedName(SERIALIZED_NAME_PX64X64)
    private String px64x64;

    public CorporationIconsResponse px128x128(String px128x128) {

        this.px128x128 = px128x128;
        return this;
    }

    /**
     * px128x128 string
     * 
     * @return px128x128
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "px128x128 string")
    public String getPx128x128() {
        return px128x128;
    }

    public void setPx128x128(String px128x128) {
        this.px128x128 = px128x128;
    }

    public CorporationIconsResponse px256x256(String px256x256) {

        this.px256x256 = px256x256;
        return this;
    }

    /**
     * px256x256 string
     * 
     * @return px256x256
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "px256x256 string")
    public String getPx256x256() {
        return px256x256;
    }

    public void setPx256x256(String px256x256) {
        this.px256x256 = px256x256;
    }

    public CorporationIconsResponse px64x64(String px64x64) {

        this.px64x64 = px64x64;
        return this;
    }

    /**
     * px64x64 string
     * 
     * @return px64x64
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "px64x64 string")
    public String getPx64x64() {
        return px64x64;
    }

    public void setPx64x64(String px64x64) {
        this.px64x64 = px64x64;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationIconsResponse corporationIconsResponse = (CorporationIconsResponse) o;
        return Objects.equals(this.px128x128, corporationIconsResponse.px128x128)
                && Objects.equals(this.px256x256, corporationIconsResponse.px256x256)
                && Objects.equals(this.px64x64, corporationIconsResponse.px64x64);
    }

    @Override
    public int hashCode() {
        return Objects.hash(px128x128, px256x256, px64x64);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationIconsResponse {\n");
        sb.append("    px128x128: ").append(toIndentedString(px128x128)).append("\n");
        sb.append("    px256x256: ").append(toIndentedString(px256x256)).append("\n");
        sb.append("    px64x64: ").append(toIndentedString(px64x64)).append("\n");
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
