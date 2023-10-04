package com.springapp.controller;
import com.examly.springapp.model.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class LaptopController{
    private List<Laptop>laptopDatabase = new ArrayList<>();
    private int nextLaptopId = 1;
    @PostMapping("/")
    public boolean createLaptop(@RequestBody Laptop laptop){
        laptop.setLaptopId(nextLaptopId++);
        
        boolean success = addLaptopToDatabase(laptop);

        return success;

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