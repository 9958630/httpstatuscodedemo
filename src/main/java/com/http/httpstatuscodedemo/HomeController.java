package com.http.httpstatuscodedemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class HomeController {

    @GetMapping("/getCustomerName/{name}")
    public ResponseEntity<Object> getMyCustmerName(@PathVariable("name") String name){
        String str = "Customer Details not found in DB ";

        //return new ResponseEntity<>(str, HttpStatus.OK);
        Customer customer = new Customer();
        customer.setCustomerAddr("India");
        if(name.equalsIgnoreCase("customer")){
            return new ResponseEntity<>(customer,HttpStatus.OK);
        }
        return new ResponseEntity<>(str,HttpStatus.OK);
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
