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
 * recipient object
 */
@ApiModel(description = "recipient object")
public class Recipient implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
    @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
    private Integer recipientId;

    /**
     * recipient_type string
     */
    @JsonAdapter(RecipientTypeEnum.Adapter.class)
    public enum RecipientTypeEnum {
        ALLIANCE("alliance"),

        CHARACTER("character"),

        CORPORATION("corporation"),

        MAILING_LIST("mailing_list");

        private String value;

        RecipientTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RecipientTypeEnum fromValue(String value) {
            for (RecipientTypeEnum b : RecipientTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<RecipientTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RecipientTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RecipientTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RecipientTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_RECIPIENT_TYPE = "recipient_type";
    @SerializedName(SERIALIZED_NAME_RECIPIENT_TYPE)
    private String recipientType;
    private RecipientTypeEnum recipientTypeEnum;

    public Recipient recipientId(Integer recipientId) {

        this.recipientId = recipientId;
        return this;
    }

    /**
     * recipient_id integer
     * 
     * @return recipientId
     **/
    @ApiModelProperty(required = true, value = "recipient_id integer")
    public Integer getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Integer recipientId) {
        this.recipientId = recipientId;
    }

    public Recipient recipientType(RecipientTypeEnum recipientTypeEnum) {

        this.recipientTypeEnum = recipientTypeEnum;
        return this;
    }

    public Recipient recipientTypeString(String recipientType) {

        this.recipientType = recipientType;
        return this;
    }

    /**
     * recipient_type string
     * 
     * @return recipientType
     **/
    @ApiModelProperty(required = true, value = "recipient_type string")
    public RecipientTypeEnum getRecipientType() {
        if (recipientTypeEnum == null) {
            recipientTypeEnum = RecipientTypeEnum.fromValue(recipientType);
        }
        return recipientTypeEnum;
    }

    public String getRecipientTypeString() {
        return recipientType;
    }

    public void setRecipientType(RecipientTypeEnum recipientTypeEnum) {
        this.recipientTypeEnum = recipientTypeEnum;
    }

    public void setRecipientTypeString(String recipientType) {
        this.recipientType = recipientType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Recipient recipient = (Recipient) o;
        return Objects.equals(this.recipientId, recipient.recipientId)
                && Objects.equals(this.recipientType, recipient.recipientType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipientId, recipientType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Recipient {\n");
        sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
        sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
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
