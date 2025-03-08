package com.nextlearning.platform.Services;

import com.nextlearning.platform.Entity.Library;
import com.nextlearning.platform.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServices {

    @Autowired
    LibraryRepository libraryRepository;

    public List<Library> getAllLibraries(){
        return libraryRepository.findAll();
    }

    public Library getLibraryById(Long id){
        return libraryRepository.findById(id).orElse(null);
    }

    public Library saveLibrary(Library library){
        return libraryRepository.save(library);
    }

    public void deleteLibrary(Long id){
        libraryRepository.deleteById(id);
    }
}
