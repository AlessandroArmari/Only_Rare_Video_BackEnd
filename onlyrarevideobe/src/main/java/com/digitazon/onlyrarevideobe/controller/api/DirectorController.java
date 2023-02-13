package com.digitazon.onlyrarevideobe.controller.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitazon.onlyrarevideobe.model.Director;
import com.digitazon.onlyrarevideobe.service.DirectorService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/director")
@CrossOrigin
public class DirectorController {

    @Autowired
    DirectorService directorService;

    // GET ALL
    @GetMapping("/all")
    public ResponseEntity<List<Director>> getAllDirectors() {
        return new ResponseEntity<>(directorService.getAllDirectors(), HttpStatus.OK);
    }

    // GET BY ID
    @RequestMapping("/id")
    @GetMapping
    public ResponseEntity<Director> getDirectorById(@RequestParam Long id) {
        return new ResponseEntity<>(directorService.getDirectorById(id), HttpStatus.OK);
    }

    // POST A DIRECTOR
    @PostMapping("/create")
    public ResponseEntity<Director> createDirector(@RequestBody Director newDirector) {
        return new ResponseEntity<>(directorService.createDirector(newDirector), HttpStatus.CREATED);
    }

    // DELETE BY ID
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteDirectorById(@RequestParam Long id) {
        directorService.deleteDirectorById(id);
        return new ResponseEntity<String>("Director deleted", HttpStatus.OK);
    }

    // UPDATE

    @PutMapping("/update")
    public ResponseEntity<Director> updateDirectorById(@RequestParam Long id, @RequestBody Director newDirector) {
        return new ResponseEntity<>(directorService.updateDirectorById(id, newDirector), HttpStatus.OK);
    }

}
