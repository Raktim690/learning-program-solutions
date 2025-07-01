package com.cognizant.junit;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserManagerTest {
    @Test
    public void testRegisterUserSendsEmail() {
        NotificationService mockService = mock(NotificationService.class);
        UserManager manager = new UserManager(mockService);

        manager.registerUser("raktim@test.com");

        verify(mockService).sendEmail("raktim@test.com");
    }
}
