package com.kirkpinarturizm.ptspro.controller;

import com.kirkpinarturizm.ptspro.converter.AracTipiConverter;
import com.kirkpinarturizm.ptspro.dto.AracTipiDto;
import com.kirkpinarturizm.ptspro.entity.AracTipiTable;
import com.kirkpinarturizm.ptspro.service.AracTipiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/car-type")
@Api(value = "CarType APIs")
public class AracTipiController {

    @Autowired
    private AracTipiService aracTipiService;

    @Autowired
    private AracTipiConverter aracTipiConverter;

    @ApiOperation(value = "Save CarType Operation", response = AracTipiDto.class)
    @PostMapping("/save")
    public AracTipiDto saveCar(@Valid @RequestBody AracTipiDto AracTipiDto) {
        AracTipiTable aracTipiTable = aracTipiService.save(aracTipiConverter.toEntity(AracTipiDto));
        return aracTipiConverter.toDto(aracTipiTable);
    }

    @ApiOperation(value = "Get CarType List Operation", response = AracTipiDto.class)
    @GetMapping("/list")
    public List<AracTipiDto> getAllCar() {
        List<AracTipiTable> aracTipiTables = aracTipiService.findAll();
        return aracTipiConverter.toDto(aracTipiTables);
    }

    @ApiOperation(value = "Find CarType Operation")
    @GetMapping("/get-cartype/{id}")
    public AracTipiDto getCarFindById(@PathVariable Long id) {
        AracTipiTable aracTipiTable = aracTipiService.findById(id);
        return aracTipiConverter.toDto(aracTipiTable);

    }

    @ApiOperation(value = "Delete CarType Operation")
    @DeleteMapping("/delete-cartype/{id}")
    public void deleteCar(@PathVariable Long id) {
        aracTipiService.delete(id);
    }

}
