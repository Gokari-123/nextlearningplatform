package com.nextlearning.platform.Controller;


import com.nextlearning.platform.Entity.Fee;
import com.nextlearning.platform.Services.FeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fee")
public class FeeController {

    @Autowired
    FeeServices feeServices;

    @GetMapping
    public List<Fee> getAllFees(){
        return feeServices.getAllFees();
    }

    @GetMapping("/{id}")
    public Fee getFeeById(Long id){
        return feeServices.getFeeById(id);
    }

    @PostMapping
    public Fee createFee(@RequestBody Fee fee){
        return feeServices.saveFee(fee);
    }

    @DeleteMapping
    public void deleteFee(Long id){
        feeServices.deleteFee(id);
    }

}
