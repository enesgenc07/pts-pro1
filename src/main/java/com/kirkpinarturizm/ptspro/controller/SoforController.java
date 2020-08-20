package com.kirkpinarturizm.ptspro.controller;

import com.kirkpinarturizm.ptspro.converter.SoforConverter;
import com.kirkpinarturizm.ptspro.dto.SoforDto;
import com.kirkpinarturizm.ptspro.entity.AracTable;
import com.kirkpinarturizm.ptspro.entity.SoforTable;
import com.kirkpinarturizm.ptspro.service.AracService;
import com.kirkpinarturizm.ptspro.service.SoforService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/driver")
@Api(value = "Sofor APIs")
public class SoforController {

    @Autowired
    private SoforService soforService;

    @Autowired
    private SoforConverter soforConverter;

    @Autowired
    private AracService aracService;

    @ApiOperation(value = "Save Driver Operation", response = SoforDto.class)
    @PostMapping("/save")
    public ResponseEntity<SoforDto> aracKaydet(@Valid @RequestBody SoforDto soforRequest) {
        try {
            SoforTable soforTable = soforConverter.toEntity(soforRequest);
            return new ResponseEntity<>(soforConverter.toDto(soforService.save(soforTable)), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @ApiOperation(value = "Get Driver List Operation", response = SoforDto.class)
    @GetMapping("/list")
    public ResponseEntity<List<SoforDto>> aracListesiGetir() {

        try {
            List<SoforTable> soforTables = new ArrayList<SoforTable>();
            soforService.findAll().forEach(soforTables::add);

            if (soforTables.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(soforConverter.toDto(soforTables), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @ApiOperation(value = "Find Driver Operation", response = SoforDto.class)
    @GetMapping("/get-driver/{id}")
    public SoforDto getCarFindById(@PathVariable Long id) {
        SoforTable soforTable = soforService.findById(id);
        return soforConverter.toDto(soforTable);
    }

    @ApiOperation(value = "Delete Driver Operation")
    @DeleteMapping("/delete-driver/{id}")
    public void deleteCar(@PathVariable Long id) {
        soforService.delete(id);
    }
}
