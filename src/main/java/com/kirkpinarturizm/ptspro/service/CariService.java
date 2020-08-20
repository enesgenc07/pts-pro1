package com.kirkpinarturizm.ptspro.service;

import com.kirkpinarturizm.ptspro.entity.CariTable;

import java.util.List;
import java.util.Optional;

public interface CariService {
    CariTable save(CariTable product);

    List<CariTable> findAll();

    void delete(long id);

    CariTable findById(long id);

    Optional<CariTable> getCariById(Long id);

}
