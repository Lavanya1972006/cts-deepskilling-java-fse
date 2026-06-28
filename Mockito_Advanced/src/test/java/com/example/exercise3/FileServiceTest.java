package com.example.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class FileServiceTest {

    @Test
    void testServiceWithMockFileIO() {

        // Create mock objects
        FileReader mockFileReader = mock(FileReader.class);
        FileWriter mockFileWriter = mock(FileWriter.class);

        // Stub the read method
        when(mockFileReader.read()).thenReturn("Mock File Content");

        // Create service with mocked dependencies
        FileService fileService = new FileService(mockFileReader, mockFileWriter);

        // Call service method
        String result = fileService.processFile();

        // Verify write method was called
        verify(mockFileWriter).write("Mock File Content");

        // Verify result
        assertEquals("Processed Mock File Content", result);
    }
}