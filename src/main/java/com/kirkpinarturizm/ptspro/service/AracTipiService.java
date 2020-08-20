package com.kirkpinarturizm.ptspro.service;

import com.kirkpinarturizm.ptspro.entity.AracTipiTable;

import java.util.List;

public interface AracTipiService {

    AracTipiTable save(AracTipiTable aracTipiTable);

    List<AracTipiTable> findAll();

    void delete(long id);

    AracTipiTable findById(Long id);

    AracTipiTable update(AracTipiTable aracTipiTable, Long id);


}
