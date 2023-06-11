package com.bilgeadam.like.service.mapper;
/**
 * @author stkey
 * @since 29.03.2023
 */
import com.bilgeadam.like.common.mapper.BaseMapper;
import com.bilgeadam.like.dto.UserDto;
import com.bilgeadam.like.entity.Role;
import com.bilgeadam.like.entity.User;
import org.aspectj.lang.annotation.After;
import org.mapstruct.*;

import java.util.UUID;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR, builder = @Builder)
public interface UserMapper extends BaseMapper<UserDto, User> {

//    User toEntity(UUID id);
//    @AfterMapping
//    default void setParentToChild(@MappingTarget User user){
//        if(user.getRoles() != null){
//            user.getRoles().forEach(e -> e.setUser(user));
//        }
//    }
//
}
