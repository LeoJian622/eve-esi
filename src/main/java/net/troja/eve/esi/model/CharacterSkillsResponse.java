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
import net.troja.eve.esi.model.Skill;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterSkillsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_SKILLS = "skills";
    @SerializedName(SERIALIZED_NAME_SKILLS)
    private List<Skill> skills = new ArrayList<>();

    public static final String SERIALIZED_NAME_TOTAL_SP = "total_sp";
    @SerializedName(SERIALIZED_NAME_TOTAL_SP)
    private Long totalSp;

    public static final String SERIALIZED_NAME_UNALLOCATED_SP = "unallocated_sp";
    @SerializedName(SERIALIZED_NAME_UNALLOCATED_SP)
    private Integer unallocatedSp;

    public CharacterSkillsResponse skills(List<Skill> skills) {

        this.skills = skills;
        return this;
    }

    public CharacterSkillsResponse addSkillsItem(Skill skillsItem) {
        this.skills.add(skillsItem);
        return this;
    }

    /**
     * skills array
     * 
     * @return skills
     **/
    @ApiModelProperty(required = true, value = "skills array")
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public CharacterSkillsResponse totalSp(Long totalSp) {

        this.totalSp = totalSp;
        return this;
    }

    /**
     * total_sp integer
     * 
     * @return totalSp
     **/
    @ApiModelProperty(required = true, value = "total_sp integer")
    public Long getTotalSp() {
        return totalSp;
    }

    public void setTotalSp(Long totalSp) {
        this.totalSp = totalSp;
    }

    public CharacterSkillsResponse unallocatedSp(Integer unallocatedSp) {

        this.unallocatedSp = unallocatedSp;
        return this;
    }

    /**
     * Skill points available to be assigned
     * 
     * @return unallocatedSp
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Skill points available to be assigned")
    public Integer getUnallocatedSp() {
        return unallocatedSp;
    }

    public void setUnallocatedSp(Integer unallocatedSp) {
        this.unallocatedSp = unallocatedSp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterSkillsResponse characterSkillsResponse = (CharacterSkillsResponse) o;
        return Objects.equals(this.skills, characterSkillsResponse.skills)
                && Objects.equals(this.totalSp, characterSkillsResponse.totalSp)
                && Objects.equals(this.unallocatedSp, characterSkillsResponse.unallocatedSp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skills, totalSp, unallocatedSp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterSkillsResponse {\n");
        sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
        sb.append("    totalSp: ").append(toIndentedString(totalSp)).append("\n");
        sb.append("    unallocatedSp: ").append(toIndentedString(unallocatedSp)).append("\n");
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
