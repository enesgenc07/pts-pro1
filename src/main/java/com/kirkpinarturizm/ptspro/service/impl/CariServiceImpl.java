package com.kirkpinarturizm.ptspro.service.impl;

import com.kirkpinarturizm.ptspro.dao.CariRepository;
import com.kirkpinarturizm.ptspro.entity.CariTable;
import com.kirkpinarturizm.ptspro.service.CariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CariServiceImpl implements CariService {


    @Autowired
    private CariRepository cariRepository;

    @Override
    public CariTable save(CariTable cariTable) {
        return cariRepository.save(cariTable);
    }

    @Override
    public List<CariTable> findAll() {
        return cariRepository.findAll();
    }

    @Override
    public void delete(long id) {
         cariRepository.deleteById(id);
    }

    @Override
    public CariTable findById(long id) {
        return cariRepository.findById(id).get();
    }

    @Override
    public Optional<CariTable> getCariById(Long id) {
         return cariRepository.findById(id);
    }


}
