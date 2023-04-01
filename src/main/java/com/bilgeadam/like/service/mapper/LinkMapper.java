package com.bilgeadam.like.service.mapper;

import com.bilgeadam.like.common.mapper.BaseMapper;
import com.bilgeadam.like.dto.LinkDto;
import com.bilgeadam.like.entity.Link;
import org.mapstruct.*;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR, builder = @Builder)
public interface LinkMapper extends BaseMapper<LinkDto, Link> {

}