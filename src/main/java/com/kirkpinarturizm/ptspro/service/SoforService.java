package com.kirkpinarturizm.ptspro.service;

import com.kirkpinarturizm.ptspro.entity.SoforTable;

import java.util.List;

public interface SoforService {

    SoforTable save(SoforTable soforTable);

    List<SoforTable> findAll();

    void delete(long id);

    SoforTable findById(Long id);

    SoforTable update(SoforTable aracTable, Long id);
}
