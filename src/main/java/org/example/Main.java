package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.CookieHandler;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        OkHttpClient client = new OkHttpClient.Builder()
                .cookieJar(new CustomCookieJar())
                .build();

        Request request = new Request.Builder()
                .url("https://contoh.com")
                .build();

        try (Response response = client.newCall(request).execute()) {
            // Tangani respons
        } catch (IOException e) {
            // Tangani pengecualian
        }


    }
}