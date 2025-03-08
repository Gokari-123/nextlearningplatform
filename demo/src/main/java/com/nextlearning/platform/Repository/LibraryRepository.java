package com.nextlearning.platform.Repository;

import com.nextlearning.platform.Entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {
//    Library findByLibraryCode(String libraryCode);
//    Library findByLibraryName(String libraryName);
}
