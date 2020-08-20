package com.kirkpinarturizm.ptspro.service.impl;

import com.kirkpinarturizm.ptspro.dao.AracRepository;
import com.kirkpinarturizm.ptspro.entity.AracTable;
import com.kirkpinarturizm.ptspro.service.AracService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AracServiceImpl implements AracService {


    @Autowired
    private AracRepository aracRepository;

    @Override
    public AracTable save(AracTable aracTable) {
        return aracRepository.save(aracTable);
    }

    @Override
    public List<AracTable> findAll() {
        return aracRepository.findAll();
    }

    @Override
    public void delete(long id) {
        aracRepository.deleteById(id);
    }

    @Override
    public AracTable findById(Long id) {
        return aracRepository.findById(id).get();
    }

    @Override
    public Optional<AracTable> findByIdOptional(Long id) {
        return aracRepository.findById(id);
    }
}
