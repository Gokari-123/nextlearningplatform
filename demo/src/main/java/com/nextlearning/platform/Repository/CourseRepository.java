package com.nextlearning.platform.Repository;

import com.nextlearning.platform.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
//    Course findByCourseCode(String courseCode);
//    Course findByCourseName(String courseName);
}
