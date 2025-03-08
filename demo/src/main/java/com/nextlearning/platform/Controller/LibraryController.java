package com.nextlearning.platform.Controller;

import com.nextlearning.platform.Entity.Library;
import com.nextlearning.platform.Services.LibraryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryController {

    @Autowired
    LibraryServices libraryServices;

    @GetMapping
    public List<Library> getAllLibraries(){
        return libraryServices.getAllLibraries();
    }

    @GetMapping("/{id}")
    public Library getLibraryById(Long id){
        return libraryServices.getLibraryById(id);
    }

    @PostMapping
    public Library createLibrary(@RequestBody Library library){
        return libraryServices.saveLibrary(library);
    }

    @DeleteMapping
    public void deleteLibrary(Long id){
        libraryServices.deleteLibrary(id);
    }
}
