package com.ing.carapp.repository;

import com.ing.carapp.entity.Warehouse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseRepository extends MongoRepository<Warehouse, Integer> {

    @Query(value = "{'id':?0}")
    List<Warehouse> findCarById(String warehouseId, int vehicleId);

}
