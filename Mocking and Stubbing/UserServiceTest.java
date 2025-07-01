package com.cognizant.junit;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    public void testGetUserEmail() {
        UserService mockService = mock(UserService.class);
        when(mockService.getUserEmail(1)).thenReturn("mocked@email.com");

        String result = mockService.getUserEmail(1);
        assertEquals("mocked@email.com", result);
    }
}
