package com.example.exercise5;

import com.example.exercise1.Repository;
import com.example.exercise1.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MultiReturnServiceTest {

    @Test
    void testServiceWithMultipleReturnValues() {

        // Create mock repository
        Repository mockRepository = mock(Repository.class);

        // Return different values on consecutive calls
        when(mockRepository.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        // Inject mock into service
        Service service = new Service(mockRepository);

        // Call the method twice
        String firstResult = service.processData();
        String secondResult = service.processData();

        // Verify results
        assertEquals("Processed First Mock Data", firstResult);
        assertEquals("Processed Second Mock Data", secondResult);
    }
}