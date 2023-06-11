package com.bilgeadam.like.service.mapper;
/**
 * @author stkey
 * @since 29.03.2023
 */
import com.bilgeadam.like.common.mapper.BaseMapper;
import com.bilgeadam.like.dto.PointDto;
import com.bilgeadam.like.entity.Point;
import org.mapstruct.Builder;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR, builder = @Builder)
public interface PointMapper extends BaseMapper<PointDto, Point> {

}