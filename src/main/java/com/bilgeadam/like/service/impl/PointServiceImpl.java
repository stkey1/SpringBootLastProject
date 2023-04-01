package com.bilgeadam.like.service.impl;

import com.bilgeadam.like.common.service.impl.BaseService;
import com.bilgeadam.like.dto.PointDto;
import com.bilgeadam.like.entity.Point;
import com.bilgeadam.like.repository.PointRepository;
import com.bilgeadam.like.service.PointService;
import com.bilgeadam.like.service.mapper.PointMapper;
import com.bilgeadam.like.validation.PointValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PointServiceImpl extends BaseService<PointRepository, PointMapper, Point, PointDto> implements PointService {

    private final PointValidator pointValidator;
    private final PointRepository pointRepository;

    @Autowired
    protected PointServiceImpl(PointMapper mapper, PointRepository repository, PointValidator pointValidator, PointRepository pointRepository) {
        super(mapper, repository);
        this.pointValidator = pointValidator;
        this.pointRepository = pointRepository;
    }

    /**
     * @param pointDto
     * @return
     */
    public PointDto savePoint(PointDto pointDto) {

        pointValidator.pointSaveValidator(pointDto);
        return super.save(pointDto);
    }

    /**
     * @param pointDto
     * @return
     */
    public PointDto updatePoint(PointDto pointDto) {

        return super.save(pointDto);
    }

    public List<PointDto> saveAllPoints(List<PointDto> pointDtoList) {

        return super.saveAll(pointDtoList);
    }

    /**
     * @return
     */
    @Override
    public List<PointDto> findAll() {

        return super.findAll();
    }

    /**
     * @return
     */
    @Override
    public List<PointDto> findByCategory(String categoryName) {

        return mapper.entityListToDtoList(pointRepository.findByCategory(categoryName));
    }

    /**
     * @return
     */
    @Override
    public PointDto findByName(String name) {

        return mapper.entityToDto(pointRepository.findByIgnoreCaseTitle(name));
    }

    /**
     * @param uuid
     * @return
     */
    @Override
    public PointDto findById(UUID uuid) {

        return super.findById(uuid);
    }

    /**
     * @param pointDto
     */
    @Override
    public void delete(PointDto pointDto) {

        super.delete(pointDto);
    }

    /**
     * @param uuid
     */
    @Override
    public void deleteById(UUID uuid) {

        super.deleteById(uuid);
    }

    /**
     * @param pointDtos
     */
    @Override
    public void deleteAll(List<PointDto> pointDtos) {

        super.deleteAll(pointDtos);
    }

}