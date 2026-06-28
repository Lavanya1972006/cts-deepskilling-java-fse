package com.example.exercise3;

public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void processData(String input) {
        externalApi.sendData(input);
    }
}