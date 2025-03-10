package com.nextlearning.platform.Services;

import com.nextlearning.platform.Entity.Attendance;
import com.nextlearning.platform.Repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServices {

    @Autowired
    AttendanceRepository attendanceRepository;

    public List<Attendance> getAllAttendances(){
        return attendanceRepository.findAll();
    }

    public Attendance getAttendanceById(Long id){
        return attendanceRepository.findById(id).orElse(null);
    }

    public Attendance saveAttendance(Attendance attendance){
        return attendanceRepository.save(attendance);
    }

    public void deleteAttendance(Long id){
        attendanceRepository.deleteById(id);
    }
}
