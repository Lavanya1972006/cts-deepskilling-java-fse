package com.example.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServiceTest {

    @Test
    void testServiceWithMockRepository() {

        // Create mock repository
        Repository mockRepository = mock(Repository.class);

        // Stub the method
        when(mockRepository.getData()).thenReturn("Mock Data");

        // Inject mock into service
        Service service = new Service(mockRepository);

        // Call service method
        String result = service.processData();

        // Verify result
        assertEquals("Processed Mock Data", result);
    }
}