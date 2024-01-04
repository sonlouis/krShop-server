package com.vti.KrShop.controller;

import com.vti.KrShop.dto.AccessoryDto;
import com.vti.KrShop.form.AccessoryCreateForm;
import com.vti.KrShop.form.AccessoryUpdateForm;
import com.vti.KrShop.service.AccessoryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Validated
@CrossOrigin("http://127.0.0.1:5500/")
public class AccessoryController {
    private final AccessoryService accessoryService;

    @GetMapping("/api/v1/accessories")
    public Page<AccessoryDto> findAll(Pageable pageable) {
        return accessoryService.findAll(pageable);
    }

    @PostMapping("/api/v1/accessories")
    public AccessoryDto create(@RequestBody @Valid AccessoryCreateForm form) {
        return accessoryService.create(form);
    }

    @PutMapping("/api/v1/accessories/{id}")
    public AccessoryDto update(@RequestBody @Valid AccessoryUpdateForm form, @PathVariable Long id) {
        return accessoryService.update(form, id);
    }

    @DeleteMapping("/api/v1/accessories/{id}")
    public void deleteById(@PathVariable Long id) {
        accessoryService.deleteById(id);
    }

}
