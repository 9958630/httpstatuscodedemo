package com.http.httpstatuscodedemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/getCustomerName")
    public ResponseEntity<String> getMyCustmerName(){
        String str = "Spring boot and micro services ";
        //return new ResponseEntity<>(str, HttpStatus.OK);
        return new ResponseEntity<>(str,HttpStatus.CREATED);
    }

    @PostMapping("/saveCustomer")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customer,HttpStatus.CREATED);
    }

    @PatchMapping("/updateCustomer")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customer,HttpStatus.NO_CONTENT);
    }

    @PutMapping("/updatePutCustomer")
    public ResponseEntity<Customer> updatePutCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customer,HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/deleteCustomer")
    public ResponseEntity<Customer> deleteCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customer,HttpStatus.NO_CONTENT);
    }




}
