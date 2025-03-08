package com.nextlearning.platform.Services;

import com.nextlearning.platform.Entity.Fee;
import com.nextlearning.platform.Repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeeServices {

    @Autowired
    FeeRepository feeRepository;

    public List<Fee> getAllFees(){
        return feeRepository.findAll();
    }

    public Fee getFeeById(Long id){
        return feeRepository.findById(id).orElse(null);
    }

    public Fee saveFee(Fee fee){
        return feeRepository.save(fee);
    }

    public void deleteFee(Long id){
        feeRepository.deleteById(id);
    }
}
