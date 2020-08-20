package com.kirkpinarturizm.ptspro.service.impl;

import com.kirkpinarturizm.ptspro.dao.AracTipiRepository;
import com.kirkpinarturizm.ptspro.entity.AracTipiTable;
import com.kirkpinarturizm.ptspro.service.AracTipiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AracTipiServiceImpl implements AracTipiService {


    @Autowired
    private AracTipiRepository aracTipiRepository;

    @Override
    public AracTipiTable save(AracTipiTable aracTipiTable) {
        return aracTipiRepository.save(aracTipiTable);
    }

    @Override
    public List<AracTipiTable> findAll() {
        return aracTipiRepository.findAll();
    }

    @Override
    public void delete(long id) {
        aracTipiRepository.deleteById(id);
    }

    @Override
    public AracTipiTable findById(Long id) {
        return aracTipiRepository.findById(id).get();
    }

    @Override
    public AracTipiTable update(AracTipiTable aracTipiTable, Long id) {
        return null;
    }
}
