package com.kirkpinarturizm.ptspro.dao;

import com.kirkpinarturizm.ptspro.entity.CariTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CariRepository extends JpaRepository<CariTable, Long> {

}
