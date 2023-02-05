package com.digitazon.onlyrarevideobe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.onlyrarevideobe.model.Director;
import com.digitazon.onlyrarevideobe.repository.DirectorRepository;

@Service
public class DirectorService {

    @Autowired
    DirectorRepository directorRepository;

    // GET ALL
    public List<Director> getAllDirectors() {
        return directorRepository.findAll();
    }

    // GET BY ID
    public Director getDirectorById(Long id) {
        return directorRepository.findById(id).get();
    }

    // POST A DIRECTOR
    public Director createDirector(Director director) {
        return directorRepository.save(director);
    }

    // DELETE BY ID
    public void deleteDirectorById(Long id) {
        directorRepository.deleteById(id);
    }

    // UPDATE
    public Director updateDirectorById(Long id, Director newDirector) {
        Optional<Director> oldDirectorOpt = directorRepository.findById(id);

        if (oldDirectorOpt.isPresent()) {
            Director oldDirector = oldDirectorOpt.get();

            oldDirector.setFullName(newDirector.getFullName());
            oldDirector.setBirthYear(newDirector.getBirthYear());
            oldDirector.setNationality(newDirector.getNationality());
            oldDirector.setMovies(newDirector.getMovies());

            return directorRepository.save(oldDirector);

        }

        return null;
    }

}
