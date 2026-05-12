package com.example.email;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    @PostMapping("/send")
    public String sendMail(@RequestParam("emails") String emails) {

        try {

            String[] recipients = emails.split(",");

            for (String email : recipients) {

                if (!EMAIL_PATTERN.matcher(email.trim()).matches()) {

                    return "error";

                }

            }

            emailService.sendEmail(recipients);

            return "success";

        }

        catch (Exception e) {

            return "error";

        }
    }
}