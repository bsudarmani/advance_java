package com.example.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {

        this.mailSender = mailSender;

    }

    public void sendEmail(String[] toEmail) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(toEmail);

        message.setSubject("Test Email from Spring Boot");

        message.setText(
                "Hello Sir,\n\n"
                        + "This is Spring Boot Email Sending Application.\n\n"
                        + "Email sent successfully.\n\n"
                        + "Thank You."
        );

        mailSender.send(message);

    }
}