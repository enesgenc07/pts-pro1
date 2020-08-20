package com.kirkpinarturizm.ptspro.controller;

import com.kirkpinarturizm.ptspro.converter.CariConverter;
import com.kirkpinarturizm.ptspro.dto.CariDto;
import com.kirkpinarturizm.ptspro.entity.CariTable;
import com.kirkpinarturizm.ptspro.service.CariService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
@Api(value = "Cari APIs")
public class CariController {

    @Autowired
    private CariService cariService;

    @Autowired
    private CariConverter cariConverter;

    @ApiOperation(value = "Save Cari Operation", response = CariDto.class)
    @PostMapping("/cari-kaydet")
    public CariDto cariKaydet(@Valid @RequestBody CariDto cariRequest) {
        CariTable cariTable = cariService.save(cariConverter.toEntity(cariRequest));
        return cariConverter.toDto(cariTable);
    }

    @ApiOperation(value = "Get Cari List Operation", response = CariDto.class)
    @GetMapping("/cari-listele")
    public List<CariDto> cariListesiGetir() {
        List<CariTable> cariTableList = cariService.findAll();
        return cariConverter.toDto(cariTableList);
    }


    @ApiOperation(value = "Find Cari Operation", response = CariDto.class)
    @GetMapping("/cari-getir/{id}")
    public CariDto getCarFindById(@PathVariable Long id) {
        CariTable cariTable = cariService.findById(id);
        return cariConverter.toDto(cariTable);
    }

    @ApiOperation(value = "Delete Cari Operation")
    @DeleteMapping("/cari-sil/{id}")
    public void deleteCar(@PathVariable Long id) {
        cariService.delete(id);
    }
}
