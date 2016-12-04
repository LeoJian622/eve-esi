/**
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.2.7.dev1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
public class CharacterLocationResponse implements Serializable {
    @JsonProperty("solar_system_id")
    private Integer solarSystemId = null;

    @JsonProperty("station_id")
    private Integer stationId = null;

    @JsonProperty("structure_id")
    private Long structureId = null;

    public CharacterLocationResponse solarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * solar_system_id integer
     * 
     * @return solarSystemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "solar_system_id integer")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    public CharacterLocationResponse stationId(Integer stationId) {
        this.stationId = stationId;
        return this;
    }

    /**
     * station_id integer
     * 
     * @return stationId
     **/
    @ApiModelProperty(example = "null", value = "station_id integer")
    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public CharacterLocationResponse structureId(Long structureId) {
        this.structureId = structureId;
        return this;
    }

    /**
     * structure_id integer
     * 
     * @return structureId
     **/
    @ApiModelProperty(example = "null", value = "structure_id integer")
    public Long getStructureId() {
        return structureId;
    }

    public void setStructureId(Long structureId) {
        this.structureId = structureId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterLocationResponse characterLocationResponse = (CharacterLocationResponse) o;
        return Objects.equals(this.solarSystemId, characterLocationResponse.solarSystemId)
                && Objects.equals(this.stationId, characterLocationResponse.stationId)
                && Objects.equals(this.structureId, characterLocationResponse.structureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(solarSystemId, stationId, structureId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterLocationResponse {\n");

        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
        sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
        sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
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
