package com.ing.carapp.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ing.carapp.entity.Warehouse;
import com.ing.carapp.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Configuration
public class CarAppConfig {

    @Autowired
    private WarehouseRepository repository;

    @PostConstruct
    public void init() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            ClassPathResource classPathResource = new ClassPathResource("CarData.json");
            List<Warehouse> warehouses = Arrays.asList(mapper.readValue(classPathResource.getFile(), Warehouse[].class));
            repository.saveAll(warehouses);
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
