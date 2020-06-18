package com.autraining.email.management.emailmanagementapi.controller;

import com.autraining.email.management.emailmanagementapi.model.Email;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emails")
public class EmailController {

    @GetMapping("/{user_id}")
    public ResponseEntity<Email> getEmailByUserId(@PathVariable("user_id") Integer userId) {
        Email email = new Email(userId+"@rest.local");
        return ResponseEntity.ok(email);
    }
}
