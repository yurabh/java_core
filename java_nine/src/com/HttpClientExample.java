package com;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HttpClientExample {
    public static void main(String[] args)
            throws URISyntaxException,
            IOException,
            InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI("//howtodoinjava.com/"))
                .GET()
                .build();
        HttpResponse<String> httpResponse = httpClient
                .send(httpRequest, HttpResponse.BodyHandler.asString());
        System.out.println(httpResponse.body());
    }
}
