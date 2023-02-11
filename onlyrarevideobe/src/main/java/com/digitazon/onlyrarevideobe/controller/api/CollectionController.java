package com.digitazon.onlyrarevideobe.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.digitazon.onlyrarevideobe.model.Collection;
import com.digitazon.onlyrarevideobe.service.CollectionService;

@RestController
@RequestMapping("/api/collection")
@CrossOrigin

public class CollectionController {

    @Autowired
    CollectionService collectionService;

    @RequestMapping("/all")
    @GetMapping
    public ResponseEntity<List<Collection>> getAllCollections() {
        return new ResponseEntity<>(collectionService.getAllCollections(), HttpStatus.OK);
    }

}
