package com.kirkpinarturizm.ptspro.dao;

import com.kirkpinarturizm.ptspro.entity.SoforTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoforRepository extends JpaRepository<SoforTable, Long> {

}
