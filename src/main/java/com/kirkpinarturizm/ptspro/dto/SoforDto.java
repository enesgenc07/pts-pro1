package com.kirkpinarturizm.ptspro.dto;

import com.kirkpinarturizm.ptspro.converter.base.AbstractDto;
import com.kirkpinarturizm.ptspro.enums.EhliyetSinifi;
import com.kirkpinarturizm.ptspro.enums.MedeniDurumu;
import com.kirkpinarturizm.ptspro.enums.OzlukBilgisi;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class SoforDto extends AbstractDto {
    private long id;
    private String adSoyad;
    private EhliyetSinifi ehliyetSinifi;
    private boolean srcBelgesi;
    private Date psikoTeknikBelgesiTarihi;
    private boolean sabikaKaydi;
    private OzlukBilgisi ozlukBilgisi;
    private MedeniDurumu medeniDurumu;
    private String surucuEgitim;
    private String ehliyetNo;
    private String tckimlikNo;
    private String adres;
    private Set<AracIdDto> aracTables;
}
