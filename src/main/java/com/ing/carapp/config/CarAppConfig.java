package com.ing.carapp.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ing.carapp.entity.Warehouse;
import com.ing.carapp.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class CarAppConfig {

    @Autowired
    private WarehouseService warehouseService;

    /*@Bean
    public List<Warehouse> saveWarehouseDetails() {
        List<Warehouse> warehouses = new ArrayList<>();
        try {
            String data  = Files.readString(Path.of("src/main/resources/CarData.json"));
            ObjectMapper mapper = new ObjectMapper();
            Warehouse warehouse = mapper.readValue(data, Warehouse.class);
            warehouses.add(warehouseService.save(warehouse));
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }

        return warehouses;
    }*/
}
