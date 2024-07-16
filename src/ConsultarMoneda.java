import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ConsultarMoneda {
    public Moneda convertirMoneda(double cantidadConvertir, String monedaConvertir, String monedaActual) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/4c4aa0336e53cf3652569ea9/pair/"+monedaConvertir+"/"+monedaActual+"/"+cantidadConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo convertir la moneda: " + e.getMessage());
        }
    }
}