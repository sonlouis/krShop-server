package com.vti.KrShop.service;

import com.vti.KrShop.dto.AccessoryDto;
import com.vti.KrShop.form.AccessoryCreateForm;
import com.vti.KrShop.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);

    AccessoryDto create(AccessoryCreateForm form);

    AccessoryDto update(AccessoryUpdateForm form, Long id);

    void deleteById(Long id);

}
