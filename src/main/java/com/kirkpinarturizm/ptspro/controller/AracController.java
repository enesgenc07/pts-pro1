package com.kirkpinarturizm.ptspro.controller;

import com.kirkpinarturizm.ptspro.converter.AracConverter;
import com.kirkpinarturizm.ptspro.dto.AracDto;
import com.kirkpinarturizm.ptspro.entity.AracTable;
import com.kirkpinarturizm.ptspro.service.AracService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/car")
@Api(value = "Car APIs")
public class AracController {

    @Autowired
    private AracService aracService;

    @Autowired
    private AracConverter aracConverter;

    @ApiOperation(value = "Save Car Operation", response = AracDto.class)
    @PostMapping("/save")
    public AracDto saveCar(@Valid @RequestBody AracDto aracRequest) {
        AracTable aracTable = aracService.save(aracConverter.toEntity(aracRequest));
        return aracConverter.toDto(aracTable);
    }

    @ApiOperation(value = "Get Car List Operation", response = AracDto.class)
    @GetMapping("/list")
    public List<AracDto> getAllCar() {
        List<AracTable> aracTables = aracService.findAll();
        return aracConverter.toDto(aracTables);
    }


    @ApiOperation(value = "Find Car Operation", response = AracDto.class)
    @GetMapping("/get-car/{id}")
    public AracDto getCarFindById(@PathVariable Long id) {
        AracTable aracTable = aracService.findById(id);
        return aracConverter.toDto(aracTable);

    }

    @ApiOperation(value = "Delete Car Operation")
    @DeleteMapping("/delete-car/{id}")
    public ResponseEntity<HttpStatus> deleteCar(@PathVariable("id") Long id) {
        try {
            aracService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @ApiOperation(value = "Update Car Operation")
    @PutMapping("/update/{id}")
    public ResponseEntity<AracDto> updateTutorial(@PathVariable("id") long id, @RequestBody AracDto aracDto) {
        Optional<AracTable> aracTable = aracService.findByIdOptional(id);
        if (aracTable.isPresent()) {
            AracTable _tutorial = aracTable.get();
            _tutorial.setPlaka(aracDto.getPlaka());
            return new ResponseEntity<>(aracConverter.toDto(aracService.save(_tutorial)), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
