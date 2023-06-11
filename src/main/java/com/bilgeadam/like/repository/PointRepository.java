package com.bilgeadam.like.repository;
/**
 * @author stkey
 * @since 29.03.2023
 */
import com.bilgeadam.like.common.repository.BaseRepository;
import com.bilgeadam.like.entity.Point;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PointRepository extends BaseRepository<Point, UUID> {

    /**
     * Example of derived query in spring data jpa
     *
     * @param title of point which has comments
     * @return Point object related with selected title
     */
    Point findByIgnoreCaseTitle(String title);

    /**
     * Example of derived query in spring data jpa
     *
     * @param category of point which has category
     * @return list of Point objects related with selected category
     */
    List<Point> findByCategory(String category);



}