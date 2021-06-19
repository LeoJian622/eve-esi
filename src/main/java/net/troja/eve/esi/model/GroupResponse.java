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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class GroupResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
    @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
    private Integer categoryId;

    public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
    @SerializedName(SERIALIZED_NAME_GROUP_ID)
    private Integer groupId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PUBLISHED = "published";
    @SerializedName(SERIALIZED_NAME_PUBLISHED)
    private Boolean published;

    public static final String SERIALIZED_NAME_TYPES = "types";
    @SerializedName(SERIALIZED_NAME_TYPES)
    private List<Integer> types = new ArrayList<>();

    public GroupResponse categoryId(Integer categoryId) {

        this.categoryId = categoryId;
        return this;
    }

    /**
     * category_id integer
     * 
     * @return categoryId
     **/
    @ApiModelProperty(required = true, value = "category_id integer")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public GroupResponse groupId(Integer groupId) {

        this.groupId = groupId;
        return this;
    }

    /**
     * group_id integer
     * 
     * @return groupId
     **/
    @ApiModelProperty(required = true, value = "group_id integer")
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public GroupResponse name(String name) {

        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupResponse published(Boolean published) {

        this.published = published;
        return this;
    }

    /**
     * published boolean
     * 
     * @return published
     **/
    @ApiModelProperty(required = true, value = "published boolean")
    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public GroupResponse types(List<Integer> types) {

        this.types = types;
        return this;
    }

    public GroupResponse addTypesItem(Integer typesItem) {
        this.types.add(typesItem);
        return this;
    }

    /**
     * types array
     * 
     * @return types
     **/
    @ApiModelProperty(required = true, value = "types array")
    public List<Integer> getTypes() {
        return types;
    }

    public void setTypes(List<Integer> types) {
        this.types = types;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GroupResponse groupResponse = (GroupResponse) o;
        return Objects.equals(this.categoryId, groupResponse.categoryId)
                && Objects.equals(this.groupId, groupResponse.groupId) && Objects.equals(this.name, groupResponse.name)
                && Objects.equals(this.published, groupResponse.published)
                && Objects.equals(this.types, groupResponse.types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, groupId, name, published, types);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupResponse {\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    published: ").append(toIndentedString(published)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
