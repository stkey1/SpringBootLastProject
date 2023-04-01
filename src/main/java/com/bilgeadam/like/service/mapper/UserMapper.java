package com.bilgeadam.like.service.mapper;

import com.bilgeadam.like.common.mapper.BaseMapper;
import com.bilgeadam.like.dto.UserDto;
import com.bilgeadam.like.entity.User;
import org.mapstruct.Builder;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR, builder = @Builder)
public interface UserMapper extends BaseMapper<UserDto, User> {

}