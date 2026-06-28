package com.example.exercise3;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.eq;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.processData("Hello");

        verify(mockApi).sendData(eq("Hello"));
    }
}