package com.cognizant.junit;

public class UserManager {
    private NotificationService notificationService;

    public UserManager(NotificationService service) {
        this.notificationService = service;
    }

    public void registerUser(String email) {
        notificationService.sendEmail(email);
    }
}
