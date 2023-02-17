package com.digitazon.onlyrarevideobe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitazon.onlyrarevideobe.model.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {

    // +++1++ CUSTOM METHOD
    public Email findByEmail(String email);

}
