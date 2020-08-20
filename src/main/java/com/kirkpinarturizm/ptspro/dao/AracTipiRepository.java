package com.kirkpinarturizm.ptspro.dao;

import com.kirkpinarturizm.ptspro.entity.AracTipiTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AracTipiRepository extends JpaRepository<AracTipiTable, Long> {

}
