package com.nextlearning.platform.Controller;


import com.nextlearning.platform.Entity.Attendance;
import com.nextlearning.platform.Repository.AttendanceRepository;
import com.nextlearning.platform.Services.AttendanceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    @Autowired
    AttendanceServices attendanceServices;

    @GetMapping
    public List<Attendance> getAllAttendances(){
        return attendanceServices.getAllAttendances();
    }

    @GetMapping("/{id}")
    public Attendance getAttendanceById(@PathVariable Long id){
        return attendanceServices.getAttendanceById(id);
    }

    @PostMapping
    public Attendance createAttendance(@RequestBody Attendance attendance){
        return attendanceServices.saveAttendance(attendance);
    }

    @DeleteMapping("/{id}")
    public void deleteAttendance(@PathVariable Long id){
        attendanceServices.deleteAttendance(id);
    }
}
