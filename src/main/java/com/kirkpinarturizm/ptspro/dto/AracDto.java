package com.kirkpinarturizm.ptspro.dto;

import com.kirkpinarturizm.ptspro.converter.base.AbstractDto;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class AracDto extends AbstractDto {

    private long id;
    private String marka;
    private String model;
    private Integer modelYil;
    private Date vizeBitisTarihi;
    private Date kaskoBitisTarihi;
    private Date sigortaBitisTarihi;
    private Date ferdiKazaSigortaTarihi;
    private String belediyeRuhsat;
    private String plaka;
    private short kapasite;
    private AracTipiId aracTipiId;
    private CariIdDto aracCariId;
}
