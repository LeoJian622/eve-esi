/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.17
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
 * destination object
 */
@ApiModel(description = "destination object")
public class StargateDestination implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_STARGATE_ID = "stargate_id";
    @SerializedName(SERIALIZED_NAME_STARGATE_ID)
    private Integer stargateId;

    public static final String SERIALIZED_NAME_SYSTEM_ID = "system_id";
    @SerializedName(SERIALIZED_NAME_SYSTEM_ID)
    private Integer systemId;

    public StargateDestination stargateId(Integer stargateId) {

        this.stargateId = stargateId;
        return this;
    }

    /**
     * The stargate this stargate connects to
     * 
     * @return stargateId
     **/
    @ApiModelProperty(required = true, value = "The stargate this stargate connects to")
    public Integer getStargateId() {
        return stargateId;
    }

    public void setStargateId(Integer stargateId) {
        this.stargateId = stargateId;
    }

    public StargateDestination systemId(Integer systemId) {

        this.systemId = systemId;
        return this;
    }

    /**
     * The solar system this stargate connects to
     * 
     * @return systemId
     **/
    @ApiModelProperty(required = true, value = "The solar system this stargate connects to")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StargateDestination stargateDestination = (StargateDestination) o;
        return Objects.equals(this.stargateId, stargateDestination.stargateId)
                && Objects.equals(this.systemId, stargateDestination.systemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stargateId, systemId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StargateDestination {\n");
        sb.append("    stargateId: ").append(toIndentedString(stargateId)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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
