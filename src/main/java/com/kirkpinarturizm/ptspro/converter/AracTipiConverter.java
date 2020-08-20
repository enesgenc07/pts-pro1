package com.kirkpinarturizm.ptspro.converter;

import com.kirkpinarturizm.ptspro.converter.base.BaseConverter;
import com.kirkpinarturizm.ptspro.dto.AracTipiDto;
import com.kirkpinarturizm.ptspro.entity.AracTipiTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AracTipiConverter extends BaseConverter<AracTipiTable, AracTipiDto> {

}
