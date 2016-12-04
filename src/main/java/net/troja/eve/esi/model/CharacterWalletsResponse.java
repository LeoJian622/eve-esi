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
public class CharacterWalletsResponse implements Serializable {
    @JsonProperty("balance")
    private Long balance = null;

    @JsonProperty("wallet_id")
    private Integer walletId = null;

    public CharacterWalletsResponse balance(Long balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Wallet's balance in ISK hundredths.
     * 
     * @return balance
     **/
    @ApiModelProperty(example = "null", value = "Wallet's balance in ISK hundredths.")
    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public CharacterWalletsResponse walletId(Integer walletId) {
        this.walletId = walletId;
        return this;
    }

    /**
     * wallet_id integer
     * 
     * @return walletId
     **/
    @ApiModelProperty(example = "null", value = "wallet_id integer")
    public Integer getWalletId() {
        return walletId;
    }

    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterWalletsResponse characterWalletsResponse = (CharacterWalletsResponse) o;
        return Objects.equals(this.balance, characterWalletsResponse.balance)
                && Objects.equals(this.walletId, characterWalletsResponse.walletId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, walletId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterWalletsResponse {\n");

        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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
