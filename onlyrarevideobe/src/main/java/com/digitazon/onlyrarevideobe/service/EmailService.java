package com.digitazon.onlyrarevideobe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.onlyrarevideobe.model.Email;
import com.digitazon.onlyrarevideobe.repository.EmailRepository;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public List<Email> getAllEmail() {
        return emailRepository.findAll();
    }

    public Email createEmail(Email email) {

        if (emailRepository.findByEmail(email.getEmail()) == null) {
            return emailRepository.save(email);
        }
        return null;
    }

}
