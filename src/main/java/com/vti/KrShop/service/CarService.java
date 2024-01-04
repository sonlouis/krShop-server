package com.vti.KrShop.service;

import com.vti.KrShop.dto.CarDto;
import com.vti.KrShop.entity.Car;
import com.vti.KrShop.form.CarCreateForm;
import com.vti.KrShop.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarDto> findAll(Pageable pageable);

    CarDto create(CarCreateForm form);

    CarDto update(CarUpdateForm form);

    void deleteById(Car.PrimaryKey id);
}
