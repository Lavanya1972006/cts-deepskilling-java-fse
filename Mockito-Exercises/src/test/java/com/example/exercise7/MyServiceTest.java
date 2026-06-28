package com.example.exercise7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVoidMethodWithException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("API Failure"))
                .when(mockApi)
                .deleteData();

        MyService service = new MyService(mockApi);

        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> service.deleteProcess()
        );

        assertEquals("API Failure", exception.getMessage());

        verify(mockApi).deleteData();
    }
}