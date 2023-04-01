package com.bilgeadam.like.service.impl;


import com.bilgeadam.like.common.service.impl.BaseService;
import com.bilgeadam.like.dto.LinkDto;
import com.bilgeadam.like.dto.PointDto;
import com.bilgeadam.like.entity.Link;
import com.bilgeadam.like.repository.LinkRepository;
import com.bilgeadam.like.service.LinkService;
import com.bilgeadam.like.service.mapper.LinkMapper;
import com.bilgeadam.like.validation.LinkValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LinkServiceImpl extends BaseService<LinkRepository, LinkMapper, Link, LinkDto> implements LinkService {

    private final LinkValidator linkValidator;
    private final LinkRepository linkRepository;

    @Autowired
    protected LinkServiceImpl(LinkMapper mapper, LinkRepository repository, LinkValidator linkValidator, LinkRepository linkRepository) {
        super(mapper, repository);
        this.linkValidator = linkValidator;
        this.linkRepository = linkRepository;
    }

    /**
     * @param linkDto
     * @return
     */
    public LinkDto saveLink(LinkDto linkDto) {

        linkValidator.linkSaveValidator(linkDto);
        return super.save(linkDto);
    }

    @Override
    public LinkDto updatePoint(LinkDto linkDto) {
        return null;
    }

    @Override
    public LinkDto updateLink(LinkDto linkDto) {
        return null;
    }

    public List<LinkDto> saveAllLinks(List<LinkDto> linkDtoList) {

        return super.saveAll(linkDtoList);
    }

    /**
     * @return
     */
    @Override
    public List<LinkDto> findAll() {

        return super.findAll();
    }

    /**
     * @return
     */
    @Override
    public List<LinkDto> findByCategory(String categoryName) {

        return mapper.entityListToDtoList(linkRepository.findByCategory(categoryName));
    }

    /**
     * @return
     */
    @Override
    public LinkDto findByName(String name) {

        return mapper.entityToDto(linkRepository.findByIgnoreCaseTitle(name));
    }

    /**
     * @param uuid
     * @return
     */
    @Override
    public LinkDto findById(UUID uuid) {

        return super.findById(uuid);
    }

    /**
     * @param linkDto
     */
    @Override
    public void delete(LinkDto linkDto) {

        super.delete(linkDto);
    }

    /**
     * @param uuid
     */
    @Override
    public void deleteById(UUID uuid) {

        super.deleteById(uuid);
    }

    /**
     * @param linkDtos
     */
    @Override
    public void deleteAll(List<LinkDto> linkDtos) {

        super.deleteAll(linkDtos);
    }

}