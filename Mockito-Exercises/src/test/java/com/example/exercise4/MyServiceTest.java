package com.example.exercise4;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi).logMessage("Start");

        MyService service = new MyService(mockApi);

        service.startProcess();

        verify(mockApi).logMessage("Start");
    }
}