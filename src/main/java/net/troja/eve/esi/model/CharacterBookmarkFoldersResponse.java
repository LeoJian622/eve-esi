/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterBookmarkFoldersResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("folder_id")
    private Integer folderId = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("owner_id")
    private Integer ownerId = null;

    public CharacterBookmarkFoldersResponse folderId(Integer folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * folder_id integer
     * 
     * @return folderId
     **/
    @ApiModelProperty(example = "null", value = "folder_id integer")
    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public CharacterBookmarkFoldersResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(example = "null", value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterBookmarkFoldersResponse ownerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * owner_id integer
     * 
     * @return ownerId
     **/
    @ApiModelProperty(example = "null", value = "owner_id integer")
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterBookmarkFoldersResponse characterBookmarkFoldersResponse = (CharacterBookmarkFoldersResponse) o;
        return Objects.equals(this.folderId, characterBookmarkFoldersResponse.folderId)
                && Objects.equals(this.name, characterBookmarkFoldersResponse.name)
                && Objects.equals(this.ownerId, characterBookmarkFoldersResponse.ownerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId, name, ownerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterBookmarkFoldersResponse {\n");

        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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
