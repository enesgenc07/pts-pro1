package com.kirkpinarturizm.ptspro.service;

import com.kirkpinarturizm.ptspro.entity.AracTable;

import java.util.List;
import java.util.Optional;

public interface AracService {

    AracTable save(AracTable aracTable);

    List<AracTable> findAll();

    void delete(long id);

    AracTable findById(Long id);

    Optional<AracTable> findByIdOptional(Long id);
}
