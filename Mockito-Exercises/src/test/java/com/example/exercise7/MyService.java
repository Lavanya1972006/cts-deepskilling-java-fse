package com.example.exercise7;

public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void deleteProcess() {
        externalApi.deleteData();
    }
}