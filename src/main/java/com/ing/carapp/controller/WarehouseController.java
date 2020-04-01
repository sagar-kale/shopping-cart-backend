package com.ing.carapp.controller;

import com.ing.carapp.entity.Warehouse;
import com.ing.carapp.model.CarDetails;
import com.ing.carapp.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "*")
public class WarehouseController {

    @Autowired
    private WarehouseService service;

    @GetMapping("/cars")
    public List<CarDetails> findAllCars() {
        return service.findAllVehicles();
    }

    @PostMapping("/addWarehouse")
    public String addWarehouse(@RequestBody Warehouse warehouse) {
        service.save(warehouse);
        return "Saved successfully...!!!";
    }


    @PostMapping(value = "/order", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<Map> placeOrder(@RequestBody String map) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("msg", "success");
        stringMap.put("transactionID", UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(stringMap);
    }

    @GetMapping("/car/{warehouseId}/{carId}")
    public Optional<CarDetails> findCar(@PathVariable int warehouseId, @PathVariable int carId) {
        return service.findCarById(warehouseId, carId);
    }
}
