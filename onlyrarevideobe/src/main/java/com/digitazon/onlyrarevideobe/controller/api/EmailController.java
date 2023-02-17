package com.digitazon.onlyrarevideobe.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitazon.onlyrarevideobe.model.Email;
import com.digitazon.onlyrarevideobe.service.EmailService;

@RestController
@RequestMapping("/api/email")
@CrossOrigin
public class EmailController {

    @Autowired
    EmailService emailService;

    @GetMapping("/all")
    public ResponseEntity<List<Email>> getAllEmail() {
        return new ResponseEntity<>(emailService.getAllEmail(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Email> createEmail(@RequestBody Email email) {

        if (emailService.createEmail(email) == null) {

            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

        }

        return new ResponseEntity<>(emailService.createEmail(email), HttpStatus.CREATED);
    }

}
