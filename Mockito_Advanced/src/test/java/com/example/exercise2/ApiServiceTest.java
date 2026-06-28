package com.example.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ApiServiceTest {

    @Test
    void testServiceWithMockRestClient() {

        // Create mock REST client
        RestClient mockRestClient = mock(RestClient.class);

        // Stub the method
        when(mockRestClient.getResponse()).thenReturn("Mock Response");

        // Inject mock into service
        ApiService apiService = new ApiService(mockRestClient);

        // Call service method
        String result = apiService.fetchData();

        // Verify result
        assertEquals("Fetched Mock Response", result);
    }
}