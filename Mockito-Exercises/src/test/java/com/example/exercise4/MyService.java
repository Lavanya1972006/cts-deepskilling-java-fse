package com.example.exercise4;

public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void startProcess() {
        externalApi.logMessage("Start");
    }
}