import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ResultExtractor {
    public String extract(String responseBody) {
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = jsonParser.parse(responseBody).getAsJsonObject();
        double conversionResult = jsonObject.get("conversion_result").getAsDouble();
        return Double.toString(conversionResult);
    }
}