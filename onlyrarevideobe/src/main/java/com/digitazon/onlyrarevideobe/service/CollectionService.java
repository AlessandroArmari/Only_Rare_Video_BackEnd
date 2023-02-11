package com.digitazon.onlyrarevideobe.service;

import java.util.List;
import com.digitazon.onlyrarevideobe.model.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.onlyrarevideobe.repository.CollectionRepository;

@Service
public class CollectionService {

    @Autowired
    CollectionRepository collectionRepository;

    public Collection createCollection(Collection collection) {
        return collectionRepository.save(collection);
    }

    public List<Collection> getAllCollections() {
        return collectionRepository.findAll();
    }
}
