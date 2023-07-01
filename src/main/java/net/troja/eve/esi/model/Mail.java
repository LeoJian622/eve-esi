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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.Recipient;
import java.io.Serializable;

/**
 * mail object
 */
@ApiModel(description = "mail object")
public class Mail implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_APPROVED_COST = "approved_cost";
    @SerializedName(SERIALIZED_NAME_APPROVED_COST)
    private Long approvedCost = 0l;

    public static final String SERIALIZED_NAME_BODY = "body";
    @SerializedName(SERIALIZED_NAME_BODY)
    private String body;

    public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
    @SerializedName(SERIALIZED_NAME_RECIPIENTS)
    private List<Recipient> recipients = new ArrayList<>();

    public static final String SERIALIZED_NAME_SUBJECT = "subject";
    @SerializedName(SERIALIZED_NAME_SUBJECT)
    private String subject;

    public Mail approvedCost(Long approvedCost) {

        this.approvedCost = approvedCost;
        return this;
    }

    /**
     * approved_cost integer
     * 
     * @return approvedCost
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "approved_cost integer")
    public Long getApprovedCost() {
        return approvedCost;
    }

    public void setApprovedCost(Long approvedCost) {
        this.approvedCost = approvedCost;
    }

    public Mail body(String body) {

        this.body = body;
        return this;
    }

    /**
     * body string
     * 
     * @return body
     **/
    @ApiModelProperty(required = true, value = "body string")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Mail recipients(List<Recipient> recipients) {

        this.recipients = recipients;
        return this;
    }

    public Mail addRecipientsItem(Recipient recipientsItem) {
        this.recipients.add(recipientsItem);
        return this;
    }

    /**
     * recipients array
     * 
     * @return recipients
     **/
    @ApiModelProperty(required = true, value = "recipients array")
    public List<Recipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<Recipient> recipients) {
        this.recipients = recipients;
    }

    public Mail subject(String subject) {

        this.subject = subject;
        return this;
    }

    /**
     * subject string
     * 
     * @return subject
     **/
    @ApiModelProperty(required = true, value = "subject string")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mail mail = (Mail) o;
        return Objects.equals(this.approvedCost, mail.approvedCost) && Objects.equals(this.body, mail.body)
                && Objects.equals(this.recipients, mail.recipients) && Objects.equals(this.subject, mail.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvedCost, body, recipients, subject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Mail {\n");
        sb.append("    approvedCost: ").append(toIndentedString(approvedCost)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
