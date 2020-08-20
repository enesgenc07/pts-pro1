package com.kirkpinarturizm.ptspro.dto;

import com.kirkpinarturizm.ptspro.converter.base.AbstractDto;
import com.kirkpinarturizm.ptspro.enums.CariTipi;
import com.kirkpinarturizm.ptspro.enums.FirmaTipi;
import lombok.Data;

@Data
public class CariDto extends AbstractDto {
    private long id;
    private String unvan;
    private Long cariKod;
    private String cariMail;
    private String cariTelefonNo;
    private String vergiDaire;
    private String vergiNo;
    private String yetkiliAdSoyad;
    private String bankaKod;
    private String bankaSubeKod;
    private String bankaHesapNo;
    private String ibanNo;
    private String yetkiliEmail;
    private String yetkiliTelefonNo;
    private CariTipi cariTipi;
    private String cariAdress;
    private FirmaTipi firmaTipi;
    private String kayitTarihi;
    private boolean durum;

}
