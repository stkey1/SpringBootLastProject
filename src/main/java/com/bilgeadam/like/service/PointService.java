package com.bilgeadam.like.service;

import com.bilgeadam.like.dto.PointDto;
import com.bilgeadam.like.entity.Point;

import java.util.List;
import java.util.UUID;

/**
 * @author stkey
 * @since 29.03.2023
 */
public interface PointService  {
    PointDto savePoint(PointDto pointDto);

    PointDto updatePoint(PointDto pointDto);

    List<PointDto> saveAllPoints(List<PointDto> pointDtoList);

    List<PointDto> findAll();

    List<PointDto> findByCategory(String categoryName);

    PointDto findByName(String name);

    PointDto findById(UUID uuid);

    void delete(PointDto pointDto);

    void deleteById(UUID uuid);

    void deleteAll(List<PointDto> pointDtos);

}
