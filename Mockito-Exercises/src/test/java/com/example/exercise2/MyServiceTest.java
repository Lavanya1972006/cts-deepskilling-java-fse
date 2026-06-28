package com.example.exercise2;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // create service with mock
        MyService service = new MyService(mockApi);

        // call method
        service.fetchData();

        // verify interaction
        verify(mockApi).getData();
    }
}