package com.example.exercise6;

public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void executeProcess() {
        externalApi.firstStep();
        externalApi.secondStep();
    }
}