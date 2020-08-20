package com.kirkpinarturizm.ptspro.dto;

import com.kirkpinarturizm.ptspro.converter.base.AbstractDto;
import lombok.Data;

@Data
public class AracTipiDto extends AbstractDto {
    private long id;
    private String model;
    private String aciklama;

}
