package com.springapp.controller;
import org.springframework.web.bind.annotation.*;
@RestController
public class LaptopController{
    @PostMapping("/")
    public boolean createLaptop(@RequestBody Laptop laptop){
        
        return;

    }
    @GetMapping("/{laptopId}")
    public Laptop getLaptop(@PathVariable int laptopId){
        return;
    }
    @GetMapping("/")
    public List<Laptop> getAllLaptops(){
        return;
    }
}