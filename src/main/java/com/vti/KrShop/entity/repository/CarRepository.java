package com.vti.KrShop.entity.repository;

import com.vti.KrShop.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Car.PrimaryKey> {

}
