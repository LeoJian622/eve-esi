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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationContractsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ACCEPTOR_ID = "acceptor_id";
    @SerializedName(SERIALIZED_NAME_ACCEPTOR_ID)
    private Integer acceptorId;

    public static final String SERIALIZED_NAME_ASSIGNEE_ID = "assignee_id";
    @SerializedName(SERIALIZED_NAME_ASSIGNEE_ID)
    private Integer assigneeId;

    /**
     * To whom the contract is available
     */
    @JsonAdapter(AvailabilityEnum.Adapter.class)
    public enum AvailabilityEnum {
        PUBLIC("public"),

        PERSONAL("personal"),

        CORPORATION("corporation"),

        ALLIANCE("alliance");

        private String value;

        AvailabilityEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AvailabilityEnum fromValue(String value) {
            for (AvailabilityEnum b : AvailabilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<AvailabilityEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AvailabilityEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AvailabilityEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AvailabilityEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_AVAILABILITY = "availability";
    @SerializedName(SERIALIZED_NAME_AVAILABILITY)
    private String availability;
    private AvailabilityEnum availabilityEnum;

    public static final String SERIALIZED_NAME_BUYOUT = "buyout";
    @SerializedName(SERIALIZED_NAME_BUYOUT)
    private Double buyout;

    public static final String SERIALIZED_NAME_COLLATERAL = "collateral";
    @SerializedName(SERIALIZED_NAME_COLLATERAL)
    private Double collateral;

    public static final String SERIALIZED_NAME_CONTRACT_ID = "contract_id";
    @SerializedName(SERIALIZED_NAME_CONTRACT_ID)
    private Integer contractId;

    public static final String SERIALIZED_NAME_DATE_ACCEPTED = "date_accepted";
    @SerializedName(SERIALIZED_NAME_DATE_ACCEPTED)
    private OffsetDateTime dateAccepted;

    public static final String SERIALIZED_NAME_DATE_COMPLETED = "date_completed";
    @SerializedName(SERIALIZED_NAME_DATE_COMPLETED)
    private OffsetDateTime dateCompleted;

    public static final String SERIALIZED_NAME_DATE_EXPIRED = "date_expired";
    @SerializedName(SERIALIZED_NAME_DATE_EXPIRED)
    private OffsetDateTime dateExpired;

    public static final String SERIALIZED_NAME_DATE_ISSUED = "date_issued";
    @SerializedName(SERIALIZED_NAME_DATE_ISSUED)
    private OffsetDateTime dateIssued;

    public static final String SERIALIZED_NAME_DAYS_TO_COMPLETE = "days_to_complete";
    @SerializedName(SERIALIZED_NAME_DAYS_TO_COMPLETE)
    private Integer daysToComplete;

    public static final String SERIALIZED_NAME_END_LOCATION_ID = "end_location_id";
    @SerializedName(SERIALIZED_NAME_END_LOCATION_ID)
    private Long endLocationId;

    public static final String SERIALIZED_NAME_FOR_CORPORATION = "for_corporation";
    @SerializedName(SERIALIZED_NAME_FOR_CORPORATION)
    private Boolean forCorporation;

    public static final String SERIALIZED_NAME_ISSUER_CORPORATION_ID = "issuer_corporation_id";
    @SerializedName(SERIALIZED_NAME_ISSUER_CORPORATION_ID)
    private Integer issuerCorporationId;

    public static final String SERIALIZED_NAME_ISSUER_ID = "issuer_id";
    @SerializedName(SERIALIZED_NAME_ISSUER_ID)
    private Integer issuerId;

    public static final String SERIALIZED_NAME_PRICE = "price";
    @SerializedName(SERIALIZED_NAME_PRICE)
    private Double price;

    public static final String SERIALIZED_NAME_REWARD = "reward";
    @SerializedName(SERIALIZED_NAME_REWARD)
    private Double reward;

    public static final String SERIALIZED_NAME_START_LOCATION_ID = "start_location_id";
    @SerializedName(SERIALIZED_NAME_START_LOCATION_ID)
    private Long startLocationId;

    /**
     * Status of the the contract
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        OUTSTANDING("outstanding"),

        IN_PROGRESS("in_progress"),

        FINISHED_ISSUER("finished_issuer"),

        FINISHED_CONTRACTOR("finished_contractor"),

        FINISHED("finished"),

        CANCELLED("cancelled"),

        REJECTED("rejected"),

        FAILED("failed"),

        DELETED("deleted"),

        REVERSED("reversed");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private String status;
    private StatusEnum statusEnum;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    /**
     * Type of the contract
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        UNKNOWN("unknown"),

        ITEM_EXCHANGE("item_exchange"),

        AUCTION("auction"),

        COURIER("courier"),

        LOAN("loan");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;
    private TypeEnum typeEnum;

    public static final String SERIALIZED_NAME_VOLUME = "volume";
    @SerializedName(SERIALIZED_NAME_VOLUME)
    private Double volume;

    public CorporationContractsResponse acceptorId(Integer acceptorId) {

        this.acceptorId = acceptorId;
        return this;
    }

    /**
     * Who will accept the contract
     * 
     * @return acceptorId
     **/
    @ApiModelProperty(required = true, value = "Who will accept the contract")
    public Integer getAcceptorId() {
        return acceptorId;
    }

    public void setAcceptorId(Integer acceptorId) {
        this.acceptorId = acceptorId;
    }

    public CorporationContractsResponse assigneeId(Integer assigneeId) {

        this.assigneeId = assigneeId;
        return this;
    }

    /**
     * ID to whom the contract is assigned, can be corporation or character ID
     * 
     * @return assigneeId
     **/
    @ApiModelProperty(required = true, value = "ID to whom the contract is assigned, can be corporation or character ID")
    public Integer getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
    }

    public CorporationContractsResponse availability(AvailabilityEnum availabilityEnum) {

        this.availabilityEnum = availabilityEnum;
        return this;
    }

    public CorporationContractsResponse availabilityString(String availability) {

        this.availability = availability;
        return this;
    }

    /**
     * To whom the contract is available
     * 
     * @return availability
     **/
    @ApiModelProperty(required = true, value = "To whom the contract is available")
    public AvailabilityEnum getAvailability() {
        if (availabilityEnum == null) {
            availabilityEnum = AvailabilityEnum.fromValue(availability);
        }
        return availabilityEnum;
    }

    public String getAvailabilityString() {
        return availability;
    }

    public void setAvailability(AvailabilityEnum availabilityEnum) {
        this.availabilityEnum = availabilityEnum;
    }

    public void setAvailabilityString(String availability) {
        this.availability = availability;
    }

    public CorporationContractsResponse buyout(Double buyout) {

        this.buyout = buyout;
        return this;
    }

    /**
     * Buyout price (for Auctions only)
     * 
     * @return buyout
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Buyout price (for Auctions only)")
    public Double getBuyout() {
        return buyout;
    }

    public void setBuyout(Double buyout) {
        this.buyout = buyout;
    }

    public CorporationContractsResponse collateral(Double collateral) {

        this.collateral = collateral;
        return this;
    }

    /**
     * Collateral price (for Couriers only)
     * 
     * @return collateral
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Collateral price (for Couriers only)")
    public Double getCollateral() {
        return collateral;
    }

    public void setCollateral(Double collateral) {
        this.collateral = collateral;
    }

    public CorporationContractsResponse contractId(Integer contractId) {

        this.contractId = contractId;
        return this;
    }

    /**
     * contract_id integer
     * 
     * @return contractId
     **/
    @ApiModelProperty(required = true, value = "contract_id integer")
    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public CorporationContractsResponse dateAccepted(OffsetDateTime dateAccepted) {

        this.dateAccepted = dateAccepted;
        return this;
    }

    /**
     * Date of confirmation of contract
     * 
     * @return dateAccepted
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Date of confirmation of contract")
    public OffsetDateTime getDateAccepted() {
        return dateAccepted;
    }

    public void setDateAccepted(OffsetDateTime dateAccepted) {
        this.dateAccepted = dateAccepted;
    }

    public CorporationContractsResponse dateCompleted(OffsetDateTime dateCompleted) {

        this.dateCompleted = dateCompleted;
        return this;
    }

    /**
     * Date of completed of contract
     * 
     * @return dateCompleted
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Date of completed of contract")
    public OffsetDateTime getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(OffsetDateTime dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public CorporationContractsResponse dateExpired(OffsetDateTime dateExpired) {

        this.dateExpired = dateExpired;
        return this;
    }

    /**
     * Expiration date of the contract
     * 
     * @return dateExpired
     **/
    @ApiModelProperty(required = true, value = "Expiration date of the contract")
    public OffsetDateTime getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(OffsetDateTime dateExpired) {
        this.dateExpired = dateExpired;
    }

    public CorporationContractsResponse dateIssued(OffsetDateTime dateIssued) {

        this.dateIssued = dateIssued;
        return this;
    }

    /**
     * Сreation date of the contract
     * 
     * @return dateIssued
     **/
    @ApiModelProperty(required = true, value = "Сreation date of the contract")
    public OffsetDateTime getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(OffsetDateTime dateIssued) {
        this.dateIssued = dateIssued;
    }

    public CorporationContractsResponse daysToComplete(Integer daysToComplete) {

        this.daysToComplete = daysToComplete;
        return this;
    }

    /**
     * Number of days to perform the contract
     * 
     * @return daysToComplete
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Number of days to perform the contract")
    public Integer getDaysToComplete() {
        return daysToComplete;
    }

    public void setDaysToComplete(Integer daysToComplete) {
        this.daysToComplete = daysToComplete;
    }

    public CorporationContractsResponse endLocationId(Long endLocationId) {

        this.endLocationId = endLocationId;
        return this;
    }

    /**
     * End location ID (for Couriers contract)
     * 
     * @return endLocationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "End location ID (for Couriers contract)")
    public Long getEndLocationId() {
        return endLocationId;
    }

    public void setEndLocationId(Long endLocationId) {
        this.endLocationId = endLocationId;
    }

    public CorporationContractsResponse forCorporation(Boolean forCorporation) {

        this.forCorporation = forCorporation;
        return this;
    }

    /**
     * true if the contract was issued on behalf of the issuer&#39;s corporation
     * 
     * @return forCorporation
     **/
    @ApiModelProperty(required = true, value = "true if the contract was issued on behalf of the issuer's corporation")
    public Boolean getForCorporation() {
        return forCorporation;
    }

    public void setForCorporation(Boolean forCorporation) {
        this.forCorporation = forCorporation;
    }

    public CorporationContractsResponse issuerCorporationId(Integer issuerCorporationId) {

        this.issuerCorporationId = issuerCorporationId;
        return this;
    }

    /**
     * Character&#39;s corporation ID for the issuer
     * 
     * @return issuerCorporationId
     **/
    @ApiModelProperty(required = true, value = "Character's corporation ID for the issuer")
    public Integer getIssuerCorporationId() {
        return issuerCorporationId;
    }

    public void setIssuerCorporationId(Integer issuerCorporationId) {
        this.issuerCorporationId = issuerCorporationId;
    }

    public CorporationContractsResponse issuerId(Integer issuerId) {

        this.issuerId = issuerId;
        return this;
    }

    /**
     * Character ID for the issuer
     * 
     * @return issuerId
     **/
    @ApiModelProperty(required = true, value = "Character ID for the issuer")
    public Integer getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Integer issuerId) {
        this.issuerId = issuerId;
    }

    public CorporationContractsResponse price(Double price) {

        this.price = price;
        return this;
    }

    /**
     * Price of contract (for ItemsExchange and Auctions)
     * 
     * @return price
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Price of contract (for ItemsExchange and Auctions)")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CorporationContractsResponse reward(Double reward) {

        this.reward = reward;
        return this;
    }

    /**
     * Remuneration for contract (for Couriers only)
     * 
     * @return reward
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Remuneration for contract (for Couriers only)")
    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    public CorporationContractsResponse startLocationId(Long startLocationId) {

        this.startLocationId = startLocationId;
        return this;
    }

    /**
     * Start location ID (for Couriers contract)
     * 
     * @return startLocationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Start location ID (for Couriers contract)")
    public Long getStartLocationId() {
        return startLocationId;
    }

    public void setStartLocationId(Long startLocationId) {
        this.startLocationId = startLocationId;
    }

    public CorporationContractsResponse status(StatusEnum statusEnum) {

        this.statusEnum = statusEnum;
        return this;
    }

    public CorporationContractsResponse statusString(String status) {

        this.status = status;
        return this;
    }

    /**
     * Status of the the contract
     * 
     * @return status
     **/
    @ApiModelProperty(required = true, value = "Status of the the contract")
    public StatusEnum getStatus() {
        if (statusEnum == null) {
            statusEnum = StatusEnum.fromValue(status);
        }
        return statusEnum;
    }

    public String getStatusString() {
        return status;
    }

    public void setStatus(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }

    public void setStatusString(String status) {
        this.status = status;
    }

    public CorporationContractsResponse title(String title) {

        this.title = title;
        return this;
    }

    /**
     * Title of the contract
     * 
     * @return title
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Title of the contract")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CorporationContractsResponse type(TypeEnum typeEnum) {

        this.typeEnum = typeEnum;
        return this;
    }

    public CorporationContractsResponse typeString(String type) {

        this.type = type;
        return this;
    }

    /**
     * Type of the contract
     * 
     * @return type
     **/
    @ApiModelProperty(required = true, value = "Type of the contract")
    public TypeEnum getType() {
        if (typeEnum == null) {
            typeEnum = TypeEnum.fromValue(type);
        }
        return typeEnum;
    }

    public String getTypeString() {
        return type;
    }

    public void setType(TypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public void setTypeString(String type) {
        this.type = type;
    }

    public CorporationContractsResponse volume(Double volume) {

        this.volume = volume;
        return this;
    }

    /**
     * Volume of items in the contract
     * 
     * @return volume
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Volume of items in the contract")
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationContractsResponse corporationContractsResponse = (CorporationContractsResponse) o;
        return Objects.equals(this.acceptorId, corporationContractsResponse.acceptorId)
                && Objects.equals(this.assigneeId, corporationContractsResponse.assigneeId)
                && Objects.equals(this.availability, corporationContractsResponse.availability)
                && Objects.equals(this.buyout, corporationContractsResponse.buyout)
                && Objects.equals(this.collateral, corporationContractsResponse.collateral)
                && Objects.equals(this.contractId, corporationContractsResponse.contractId)
                && Objects.equals(this.dateAccepted, corporationContractsResponse.dateAccepted)
                && Objects.equals(this.dateCompleted, corporationContractsResponse.dateCompleted)
                && Objects.equals(this.dateExpired, corporationContractsResponse.dateExpired)
                && Objects.equals(this.dateIssued, corporationContractsResponse.dateIssued)
                && Objects.equals(this.daysToComplete, corporationContractsResponse.daysToComplete)
                && Objects.equals(this.endLocationId, corporationContractsResponse.endLocationId)
                && Objects.equals(this.forCorporation, corporationContractsResponse.forCorporation)
                && Objects.equals(this.issuerCorporationId, corporationContractsResponse.issuerCorporationId)
                && Objects.equals(this.issuerId, corporationContractsResponse.issuerId)
                && Objects.equals(this.price, corporationContractsResponse.price)
                && Objects.equals(this.reward, corporationContractsResponse.reward)
                && Objects.equals(this.startLocationId, corporationContractsResponse.startLocationId)
                && Objects.equals(this.status, corporationContractsResponse.status)
                && Objects.equals(this.title, corporationContractsResponse.title)
                && Objects.equals(this.type, corporationContractsResponse.type)
                && Objects.equals(this.volume, corporationContractsResponse.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceptorId, assigneeId, availability, buyout, collateral, contractId, dateAccepted,
                dateCompleted, dateExpired, dateIssued, daysToComplete, endLocationId, forCorporation,
                issuerCorporationId, issuerId, price, reward, startLocationId, status, title, type, volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationContractsResponse {\n");
        sb.append("    acceptorId: ").append(toIndentedString(acceptorId)).append("\n");
        sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
        sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
        sb.append("    buyout: ").append(toIndentedString(buyout)).append("\n");
        sb.append("    collateral: ").append(toIndentedString(collateral)).append("\n");
        sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
        sb.append("    dateAccepted: ").append(toIndentedString(dateAccepted)).append("\n");
        sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
        sb.append("    dateExpired: ").append(toIndentedString(dateExpired)).append("\n");
        sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
        sb.append("    daysToComplete: ").append(toIndentedString(daysToComplete)).append("\n");
        sb.append("    endLocationId: ").append(toIndentedString(endLocationId)).append("\n");
        sb.append("    forCorporation: ").append(toIndentedString(forCorporation)).append("\n");
        sb.append("    issuerCorporationId: ").append(toIndentedString(issuerCorporationId)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
        sb.append("    startLocationId: ").append(toIndentedString(startLocationId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
