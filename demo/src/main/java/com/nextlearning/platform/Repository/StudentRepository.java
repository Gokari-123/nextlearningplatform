package com.nextlearning.platform.Repository;

import com.nextlearning.platform.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
//    Student findByEmail(String email);
//    Student findByPhoneNumber(String phoneNumber);
}
