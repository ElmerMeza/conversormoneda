import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda obtener(String from,String to,double cantidad){

        URI url=URI.create("https://v6.exchangerate-api.com/v6/4aa02aa8a024157ccc0c600f/pair/"+from+"/"+to+"/"+cantidad);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response= client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(),Moneda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No se encontro la moneda");
        }
    }

}
