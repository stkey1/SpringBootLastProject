package com.bilgeadam.like.validation;
/**
 * @author stkey
 * @since 29.03.2023
 */
import com.bilgeadam.like.dto.LinkDto;
import com.bilgeadam.like.dto.PointDto;
import com.bilgeadam.like.entity.Link;
import com.bilgeadam.like.entity.Point;
import com.bilgeadam.like.repository.LinkRepository;
import com.bilgeadam.like.repository.PointRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

@Component
@Validated
public class LinkValidator {

    private final LinkRepository linkRepository;

    public LinkValidator(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public void linkSaveValidator(@Valid LinkDto linkDto) {

        Link link = linkRepository.findByIgnoreCaseTitle(linkDto.getTitle());
        if (Objects.nonNull(link)) {
            throw new RuntimeException("This link has been added");
        }
    }
}