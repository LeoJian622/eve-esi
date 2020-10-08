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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * contents object
 */
@ApiModel(description = "contents object")
public class MailMetaData implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LABELS = "labels";
    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<Integer> labels = null;

    public static final String SERIALIZED_NAME_READ = "read";
    @SerializedName(SERIALIZED_NAME_READ)
    private Boolean read;

    public MailMetaData labels(List<Integer> labels) {

        this.labels = labels;
        return this;
    }

    public MailMetaData addLabelsItem(Integer labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Labels to assign to the mail. Pre-existing labels are unassigned.
     * 
     * @return labels
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Labels to assign to the mail. Pre-existing labels are unassigned.")
    public List<Integer> getLabels() {
        return labels;
    }

    public void setLabels(List<Integer> labels) {
        this.labels = labels;
    }

    public MailMetaData read(Boolean read) {

        this.read = read;
        return this;
    }

    /**
     * Whether the mail is flagged as read
     * 
     * @return read
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Whether the mail is flagged as read")
    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MailMetaData mailMetaData = (MailMetaData) o;
        return Objects.equals(this.labels, mailMetaData.labels) && Objects.equals(this.read, mailMetaData.read);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels, read);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailMetaData {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    read: ").append(toIndentedString(read)).append("\n");
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
