package com.example.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NetworkServiceTest {

    @Test
    void testServiceWithMockNetworkClient() {

        // Create mock network client
        NetworkClient mockNetworkClient = mock(NetworkClient.class);

        // Stub the connect method
        when(mockNetworkClient.connect()).thenReturn("Mock Connection");

        // Create service with mocked dependency
        NetworkService networkService = new NetworkService(mockNetworkClient);

        // Call service method
        String result = networkService.connectToServer();

        // Verify result
        assertEquals("Connected to Mock Connection", result);
    }
}