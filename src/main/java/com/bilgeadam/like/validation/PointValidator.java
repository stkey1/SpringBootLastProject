package com.bilgeadam.like.validation;

import com.bilgeadam.like.dto.PointDto;
import com.bilgeadam.like.entity.Point;
import com.bilgeadam.like.repository.PointRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

@Component
@Validated
public class PointValidator {

    private final PointRepository pointRepository;

    public PointValidator(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    public void pointSaveValidator(@Valid PointDto pointDto) {

        Point point = pointRepository.findByIgnoreCaseTitle(pointDto.getTitle());
        if (Objects.nonNull(point)) {
            throw new RuntimeException("This point has been added");
        }
    }
}