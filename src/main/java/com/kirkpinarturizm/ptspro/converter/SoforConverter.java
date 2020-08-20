package com.kirkpinarturizm.ptspro.converter;

import com.kirkpinarturizm.ptspro.converter.base.BaseConverter;
import com.kirkpinarturizm.ptspro.dto.SoforDto;
import com.kirkpinarturizm.ptspro.entity.SoforTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SoforConverter extends BaseConverter<SoforTable, SoforDto> {

}
