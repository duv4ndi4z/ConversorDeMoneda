package com.alurachallenge.conversordemoneda.models;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ApiConnection {
    String apiurl = "https://v6.exchangerate-api.com/v6/508a54c7a27f8a3215e202de/latest/USD";
    public Currency connectApi() {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiurl))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Ocurrió un error al conectar con el API");
        }catch (Exception e){
            System.out.println("Error desconocido");
        }
        return new Gson().fromJson(response.body(), Currency.class);
    }
}
