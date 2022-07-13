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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.MailLabel;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class MailLabelsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LABELS = "labels";
    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<MailLabel> labels = null;

    public static final String SERIALIZED_NAME_TOTAL_UNREAD_COUNT = "total_unread_count";
    @SerializedName(SERIALIZED_NAME_TOTAL_UNREAD_COUNT)
    private Integer totalUnreadCount;

    public MailLabelsResponse labels(List<MailLabel> labels) {

        this.labels = labels;
        return this;
    }

    public MailLabelsResponse addLabelsItem(MailLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * labels array
     * 
     * @return labels
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "labels array")
    public List<MailLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<MailLabel> labels) {
        this.labels = labels;
    }

    public MailLabelsResponse totalUnreadCount(Integer totalUnreadCount) {

        this.totalUnreadCount = totalUnreadCount;
        return this;
    }

    /**
     * total_unread_count integer minimum: 0
     * 
     * @return totalUnreadCount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "total_unread_count integer")
    public Integer getTotalUnreadCount() {
        return totalUnreadCount;
    }

    public void setTotalUnreadCount(Integer totalUnreadCount) {
        this.totalUnreadCount = totalUnreadCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MailLabelsResponse mailLabelsResponse = (MailLabelsResponse) o;
        return Objects.equals(this.labels, mailLabelsResponse.labels)
                && Objects.equals(this.totalUnreadCount, mailLabelsResponse.totalUnreadCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels, totalUnreadCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailLabelsResponse {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    totalUnreadCount: ").append(toIndentedString(totalUnreadCount)).append("\n");
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
