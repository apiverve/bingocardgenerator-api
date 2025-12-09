// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.apiverve.data.Converter;
//
// Then you can deserialize a JSON string with
//
//     BingoCardGeneratorData data = Converter.fromJsonString(jsonString);

package com.apiverve.bingocardgenerator.data;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Converter {
    // Date-time helpers

    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_INSTANT)
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
            .parseDefaulting(ChronoField.YEAR, 2020)
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static BingoCardGeneratorData fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(BingoCardGeneratorData obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        reader = mapper.readerFor(BingoCardGeneratorData.class);
        writer = mapper.writerFor(BingoCardGeneratorData.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

// BingoCardGeneratorData.java

package com.apiverve.bingocardgenerator.data;

import com.fasterxml.jackson.annotation.*;

public class BingoCardGeneratorData {
    private Card[][] card;
    private String html;
    private long size;
    private boolean freeSpace;
    private long totalCells;
    private String[] winningPatterns;
    private Image image;

    @JsonProperty("card")
    public Card[][] getCard() { return card; }
    @JsonProperty("card")
    public void setCard(Card[][] value) { this.card = value; }

    @JsonProperty("html")
    public String getHTML() { return html; }
    @JsonProperty("html")
    public void setHTML(String value) { this.html = value; }

    @JsonProperty("size")
    public long getSize() { return size; }
    @JsonProperty("size")
    public void setSize(long value) { this.size = value; }

    @JsonProperty("freeSpace")
    public boolean getFreeSpace() { return freeSpace; }
    @JsonProperty("freeSpace")
    public void setFreeSpace(boolean value) { this.freeSpace = value; }

    @JsonProperty("totalCells")
    public long getTotalCells() { return totalCells; }
    @JsonProperty("totalCells")
    public void setTotalCells(long value) { this.totalCells = value; }

    @JsonProperty("winningPatterns")
    public String[] getWinningPatterns() { return winningPatterns; }
    @JsonProperty("winningPatterns")
    public void setWinningPatterns(String[] value) { this.winningPatterns = value; }

    @JsonProperty("image")
    public Image getImage() { return image; }
    @JsonProperty("image")
    public void setImage(Image value) { this.image = value; }
}

// Card.java

package com.apiverve.bingocardgenerator.data;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = Card.Deserializer.class)
@JsonSerialize(using = Card.Serializer.class)
public class Card {
    public Long integerValue;
    public String stringValue;

    static class Deserializer extends JsonDeserializer<Card> {
        @Override
        public Card deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            Card value = new Card();
            switch (jsonParser.currentToken()) {
                case VALUE_NUMBER_INT:
                    value.integerValue = jsonParser.readValueAs(Long.class);
                    break;
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    value.stringValue = string;
                    break;
                default: throw new IOException("Cannot deserialize Card");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<Card> {
        @Override
        public void serialize(Card obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.integerValue != null) {
                jsonGenerator.writeObject(obj.integerValue);
                return;
            }
            if (obj.stringValue != null) {
                jsonGenerator.writeObject(obj.stringValue);
                return;
            }
            throw new IOException("Card must not be null");
        }
    }
}

// Image.java

package com.apiverve.bingocardgenerator.data;

import com.fasterxml.jackson.annotation.*;

public class Image {
    private String imageName;
    private String format;
    private String downloadURL;
    private long expires;

    @JsonProperty("imageName")
    public String getImageName() { return imageName; }
    @JsonProperty("imageName")
    public void setImageName(String value) { this.imageName = value; }

    @JsonProperty("format")
    public String getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(String value) { this.format = value; }

    @JsonProperty("downloadURL")
    public String getDownloadURL() { return downloadURL; }
    @JsonProperty("downloadURL")
    public void setDownloadURL(String value) { this.downloadURL = value; }

    @JsonProperty("expires")
    public long getExpires() { return expires; }
    @JsonProperty("expires")
    public void setExpires(long value) { this.expires = value; }
}