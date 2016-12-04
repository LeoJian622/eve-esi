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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.CharacterscharacterIdmailRecipients;

import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class MailHeadersResponse implements Serializable {
    @JsonProperty("from")
    private Integer from = null;

    @JsonProperty("is_read")
    private Boolean isRead = null;

    @JsonProperty("labels")
    private List<Long> labels = new ArrayList<Long>();

    @JsonProperty("mail_id")
    private Long mailId = null;

    @JsonProperty("recipients")
    private List<CharacterscharacterIdmailRecipients> recipients = new ArrayList<CharacterscharacterIdmailRecipients>();

    @JsonProperty("subject")
    private String subject = null;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp = null;

    public MailHeadersResponse from(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * From whom the mail was sent
     * 
     * @return from
     **/
    @ApiModelProperty(example = "null", value = "From whom the mail was sent")
    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public MailHeadersResponse isRead(Boolean isRead) {
        this.isRead = isRead;
        return this;
    }

    /**
     * is_read boolean
     * 
     * @return isRead
     **/
    @ApiModelProperty(example = "null", value = "is_read boolean")
    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public MailHeadersResponse labels(List<Long> labels) {
        this.labels = labels;
        return this;
    }

    public MailHeadersResponse addLabelsItem(Long labelsItem) {
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * labels array
     * 
     * @return labels
     **/
    @ApiModelProperty(example = "null", value = "labels array")
    public List<Long> getLabels() {
        return labels;
    }

    public void setLabels(List<Long> labels) {
        this.labels = labels;
    }

    public MailHeadersResponse mailId(Long mailId) {
        this.mailId = mailId;
        return this;
    }

    /**
     * mail_id integer
     * 
     * @return mailId
     **/
    @ApiModelProperty(example = "null", value = "mail_id integer")
    public Long getMailId() {
        return mailId;
    }

    public void setMailId(Long mailId) {
        this.mailId = mailId;
    }

    public MailHeadersResponse recipients(List<CharacterscharacterIdmailRecipients> recipients) {
        this.recipients = recipients;
        return this;
    }

    public MailHeadersResponse addRecipientsItem(CharacterscharacterIdmailRecipients recipientsItem) {
        this.recipients.add(recipientsItem);
        return this;
    }

    /**
     * Recipients of the mail
     * 
     * @return recipients
     **/
    @ApiModelProperty(example = "null", value = "Recipients of the mail")
    public List<CharacterscharacterIdmailRecipients> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<CharacterscharacterIdmailRecipients> recipients) {
        this.recipients = recipients;
    }

    public MailHeadersResponse subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Mail subject
     * 
     * @return subject
     **/
    @ApiModelProperty(example = "null", value = "Mail subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public MailHeadersResponse timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * When the mail was sent
     * 
     * @return timestamp
     **/
    @ApiModelProperty(example = "null", value = "When the mail was sent")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MailHeadersResponse mailHeadersResponse = (MailHeadersResponse) o;
        return Objects.equals(this.from, mailHeadersResponse.from)
                && Objects.equals(this.isRead, mailHeadersResponse.isRead)
                && Objects.equals(this.labels, mailHeadersResponse.labels)
                && Objects.equals(this.mailId, mailHeadersResponse.mailId)
                && Objects.equals(this.recipients, mailHeadersResponse.recipients)
                && Objects.equals(this.subject, mailHeadersResponse.subject)
                && Objects.equals(this.timestamp, mailHeadersResponse.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, isRead, labels, mailId, recipients, subject, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailHeadersResponse {\n");

        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    mailId: ").append(toIndentedString(mailId)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
