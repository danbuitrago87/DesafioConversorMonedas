import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class CurrencyConverter {
    private final String apiKey = "c3a7c469aa7dc204163c9d40";
    private final String apiUrl = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/";

    public double convert(String from, String to) {
        try {
            URL url = new URL(apiUrl + from + "/" + to);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Error en la conexión: " + responseCode);
            }

            StringBuilder informationString = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) {
                informationString.append(scanner.nextLine());
            }
            scanner.close();

            JSONObject jsonObject = new JSONObject(informationString.toString());
            return jsonObject.getDouble("conversion_rate");

        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
