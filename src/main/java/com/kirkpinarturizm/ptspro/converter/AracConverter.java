package com.kirkpinarturizm.ptspro.converter;

import com.kirkpinarturizm.ptspro.converter.base.BaseConverter;
import com.kirkpinarturizm.ptspro.dto.AracDto;
import com.kirkpinarturizm.ptspro.entity.AracTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AracConverter extends BaseConverter<AracTable, AracDto> {

}
