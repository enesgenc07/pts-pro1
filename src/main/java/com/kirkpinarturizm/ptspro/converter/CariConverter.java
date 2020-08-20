package com.kirkpinarturizm.ptspro.converter;

import com.kirkpinarturizm.ptspro.converter.base.BaseConverter;
import com.kirkpinarturizm.ptspro.dto.CariDto;
import com.kirkpinarturizm.ptspro.entity.CariTable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CariConverter extends BaseConverter<CariTable, CariDto> {

}
