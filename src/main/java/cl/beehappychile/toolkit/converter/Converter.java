package cl.beehappychile.toolkit.converter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.inject.Singleton;
import java.util.UUID;

@Singleton
public class Converter {

    public JsonNode toJson (String string) {

        try {

            ObjectMapper objectMapper = new ObjectMapper ();

            JsonNode jsonNode = objectMapper.readTree (string);

            if (jsonNode.isNull () || jsonNode.isEmpty ()) {

                return null;

            }

            return objectMapper.readTree (string);

        } catch (Exception ignored) {
        }

        return null;

    }

    public String toString (JsonNode jsonNode) {

        try {

            ObjectMapper objectMapper = new ObjectMapper ();

            String string = objectMapper.writeValueAsString (jsonNode);

            string = string.replaceAll ("\\\\", "");
            string = string.replaceAll ("\"\\{", "{");
            string = string.replaceAll ("}\"", "}");

            return string;

        } catch (Exception ignored) {
        }

        return null;

    }

    public UUID toUUID (String string) {

        if (string == null) {

            return UUID.randomUUID ();

        } else {

            return UUID.fromString (string);

        }

    }

    public StringBuilder trim (StringBuilder stringBuilder) {

        return new StringBuilder (stringBuilder.substring (0, stringBuilder.length () - 1));

    }

}