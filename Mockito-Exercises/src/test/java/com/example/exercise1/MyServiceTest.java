package com.example.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // inject mock into service
        MyService service = new MyService(mockApi);

        // call method
        String result = service.fetchData();

        // verify output
        assertEquals("Mock Data", result);
    }
}