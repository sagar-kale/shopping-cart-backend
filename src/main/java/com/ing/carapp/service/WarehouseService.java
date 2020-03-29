package com.ing.carapp.service;

import com.ing.carapp.entity.Warehouse;
import com.ing.carapp.model.CarDetails;

import java.util.List;
import java.util.Optional;

public interface WarehouseService {

    Warehouse save(Warehouse warehouse);

    List<Warehouse> findAll();

    Optional<CarDetails> findCarById(int warehouseId, int carId);

    List<CarDetails> findAllVehicles();
}
