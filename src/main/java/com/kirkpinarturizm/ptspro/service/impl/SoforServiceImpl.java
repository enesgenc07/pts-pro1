package com.kirkpinarturizm.ptspro.service.impl;

import com.kirkpinarturizm.ptspro.dao.SoforRepository;
import com.kirkpinarturizm.ptspro.entity.SoforTable;
import com.kirkpinarturizm.ptspro.service.SoforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SoforServiceImpl implements SoforService {


    @Autowired
    private SoforRepository soforRepository;


    @Override
    public SoforTable save(SoforTable soforTable) {
        return soforRepository.save(soforTable);
    }

    @Override
    public List<SoforTable> findAll() {
        return soforRepository.findAll();
    }

    @Override
    public void delete(long id) {
        soforRepository.deleteById(id);
    }

    @Override
    public SoforTable findById(Long id) {
        return soforRepository.findById(id).get();
    }

    @Override
    public SoforTable update(SoforTable aracTable, Long id) {
        return null;
    }
}
