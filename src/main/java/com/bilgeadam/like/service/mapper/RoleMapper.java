package com.bilgeadam.like.service.mapper;

import com.bilgeadam.like.common.mapper.BaseMapper;
import com.bilgeadam.like.dto.RoleDto;
import com.bilgeadam.like.dto.UserDto;
import com.bilgeadam.like.entity.Role;
import com.bilgeadam.like.entity.User;
import org.mapstruct.*;
import org.springframework.util.CollectionUtils;

import java.util.UUID;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR, builder = @Builder)
public interface RoleMapper extends BaseMapper<RoleDto, Role> {

//    User toEntity(UUID id);
//    @AfterMapping
//    default void setParentToChild(@MappingTarget User user){
//        if(user.getRoles() != null){
//            user.getRoles().forEach(e -> e.setUser(user));
//        }
//    }
//, uses = {UserMapper.class}
//    @Mapping(target = "user" , source = "userId")
//    Role dtoToEntity(RoleDto roleDto);

}

