package com.kirkpinarturizm.ptspro.dao;

import com.kirkpinarturizm.ptspro.entity.AracTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AracRepository extends JpaRepository<AracTable, Long> {

}
