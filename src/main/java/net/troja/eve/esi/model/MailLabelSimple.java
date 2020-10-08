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
import java.io.Serializable;

/**
 * label object
 */
@ApiModel(description = "label object")
public class MailLabelSimple implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Hexadecimal string representing label color, in RGB format
     */
    @JsonAdapter(ColorEnum.Adapter.class)
    public enum ColorEnum {
        _0000FE("#0000fe"),

        _006634("#006634"),

        _0099FF("#0099ff"),

        _00FF33("#00ff33"),

        _01FFFF("#01ffff"),

        _349800("#349800"),

        _660066("#660066"),

        _666666("#666666"),

        _999999("#999999"),

        _99FFFF("#99ffff"),

        _9A0000("#9a0000"),

        CCFF9A("#ccff9a"),

        E6E6E6("#e6e6e6"),

        FE0000("#fe0000"),

        FF6600("#ff6600"),

        FFFF01("#ffff01"),

        FFFFCD("#ffffcd"),

        FFFFFF("#ffffff");

        private String value;

        ColorEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ColorEnum fromValue(String value) {
            for (ColorEnum b : ColorEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ColorEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ColorEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ColorEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ColorEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_COLOR = "color";
    @SerializedName(SERIALIZED_NAME_COLOR)
    private String color = ColorEnum.FFFFFF.getValue();
    private ColorEnum colorEnum = ColorEnum.FFFFFF;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public MailLabelSimple color(ColorEnum colorEnum) {

        this.colorEnum = colorEnum;
        return this;
    }

    public MailLabelSimple colorString(String color) {

        this.color = color;
        return this;
    }

    /**
     * Hexadecimal string representing label color, in RGB format
     * 
     * @return color
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Hexadecimal string representing label color, in RGB format")
    public ColorEnum getColor() {
        if (colorEnum == null) {
            colorEnum = ColorEnum.fromValue(color);
        }
        return colorEnum;
    }

    public String getColorString() {
        return color;
    }

    public void setColor(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public void setColorString(String color) {
        this.color = color;
    }

    public MailLabelSimple name(String name) {

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MailLabelSimple mailLabelSimple = (MailLabelSimple) o;
        return Objects.equals(this.color, mailLabelSimple.color) && Objects.equals(this.name, mailLabelSimple.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailLabelSimple {\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
