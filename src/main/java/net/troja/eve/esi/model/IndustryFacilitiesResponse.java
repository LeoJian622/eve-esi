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
public class IndustryFacilitiesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FACILITY_ID = "facility_id";
    @SerializedName(SERIALIZED_NAME_FACILITY_ID)
    private Long facilityId;

    public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
    @SerializedName(SERIALIZED_NAME_OWNER_ID)
    private Integer ownerId;

    public static final String SERIALIZED_NAME_REGION_ID = "region_id";
    @SerializedName(SERIALIZED_NAME_REGION_ID)
    private Integer regionId;

    public static final String SERIALIZED_NAME_SOLAR_SYSTEM_ID = "solar_system_id";
    @SerializedName(SERIALIZED_NAME_SOLAR_SYSTEM_ID)
    private Integer solarSystemId;

    public static final String SERIALIZED_NAME_TAX = "tax";
    @SerializedName(SERIALIZED_NAME_TAX)
    private Float tax;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public IndustryFacilitiesResponse facilityId(Long facilityId) {

        this.facilityId = facilityId;
        return this;
    }

    /**
     * ID of the facility
     * 
     * @return facilityId
     **/
    @ApiModelProperty(required = true, value = "ID of the facility")
    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public IndustryFacilitiesResponse ownerId(Integer ownerId) {

        this.ownerId = ownerId;
        return this;
    }

    /**
     * Owner of the facility
     * 
     * @return ownerId
     **/
    @ApiModelProperty(required = true, value = "Owner of the facility")
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public IndustryFacilitiesResponse regionId(Integer regionId) {

        this.regionId = regionId;
        return this;
    }

    /**
     * Region ID where the facility is
     * 
     * @return regionId
     **/
    @ApiModelProperty(required = true, value = "Region ID where the facility is")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public IndustryFacilitiesResponse solarSystemId(Integer solarSystemId) {

        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * Solar system ID where the facility is
     * 
     * @return solarSystemId
     **/
    @ApiModelProperty(required = true, value = "Solar system ID where the facility is")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    public IndustryFacilitiesResponse tax(Float tax) {

        this.tax = tax;
        return this;
    }

    /**
     * Tax imposed by the facility
     * 
     * @return tax
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Tax imposed by the facility")
    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public IndustryFacilitiesResponse typeId(Integer typeId) {

        this.typeId = typeId;
        return this;
    }

    /**
     * Type ID of the facility
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "Type ID of the facility")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndustryFacilitiesResponse industryFacilitiesResponse = (IndustryFacilitiesResponse) o;
        return Objects.equals(this.facilityId, industryFacilitiesResponse.facilityId)
                && Objects.equals(this.ownerId, industryFacilitiesResponse.ownerId)
                && Objects.equals(this.regionId, industryFacilitiesResponse.regionId)
                && Objects.equals(this.solarSystemId, industryFacilitiesResponse.solarSystemId)
                && Objects.equals(this.tax, industryFacilitiesResponse.tax)
                && Objects.equals(this.typeId, industryFacilitiesResponse.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facilityId, ownerId, regionId, solarSystemId, tax, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndustryFacilitiesResponse {\n");
        sb.append("    facilityId: ").append(toIndentedString(facilityId)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
        sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
