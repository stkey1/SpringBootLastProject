package com.bilgeadam.like.service;

import com.bilgeadam.like.dto.LinkDto;
import com.bilgeadam.like.dto.PointDto;

import java.util.List;
import java.util.UUID;

/**
 * @author stkey
 * @since 29.03.2023
 */
public interface LinkService {

    LinkDto saveLink(LinkDto linkDto);

    LinkDto updatePoint(LinkDto linkDto);

    LinkDto updateLink(LinkDto linkDto);

    List<LinkDto> saveAllLinks(List<LinkDto> linkDtoList);

    List<LinkDto> findAll();

    List<LinkDto> findByCategory(String categoryName);

    LinkDto findByName(String name);

    LinkDto findById(UUID uuid);

    void delete(LinkDto linkDto);

    void deleteById(UUID uuid);

    void deleteAll(List<LinkDto> linkDtos);
}
