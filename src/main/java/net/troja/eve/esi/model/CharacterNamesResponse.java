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
public class CharacterNamesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("character_id")
    private Long characterId = null;

    @JsonProperty("character_name")
    private String characterName = null;

    public CharacterNamesResponse characterId(Long characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @ApiModelProperty(example = "null", required = true, value = "character_id integer")
    public Long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public CharacterNamesResponse characterName(String characterName) {
        this.characterName = characterName;
        return this;
    }

    /**
     * character_name string
     * 
     * @return characterName
     **/
    @ApiModelProperty(example = "null", required = true, value = "character_name string")
    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterNamesResponse characterNamesResponse = (CharacterNamesResponse) o;
        return Objects.equals(this.characterId, characterNamesResponse.characterId)
                && Objects.equals(this.characterName, characterNamesResponse.characterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, characterName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterNamesResponse {\n");

        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    characterName: ").append(toIndentedString(characterName)).append("\n");
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
