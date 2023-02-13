package com.digitazon.onlyrarevideobe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitazon.onlyrarevideobe.model.Collection;

public interface CollectionRepository extends JpaRepository<Collection, Long> {

    /* 1 */

    public Collection findBySanitizeCollectionName(String sanitizeCollectionName);
}
