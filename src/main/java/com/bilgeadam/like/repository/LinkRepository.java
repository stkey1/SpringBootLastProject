package com.bilgeadam.like.repository;

import com.bilgeadam.like.common.repository.BaseRepository;
import com.bilgeadam.like.entity.Link;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface LinkRepository extends BaseRepository<Link, UUID> {

    /**
     * Example of derived query in spring data jpa
     *
     * @param title of food which has comments
     * @return Food object related with selected title
     */
    Link findByIgnoreCaseTitle(String title);

    /**
     * Example of derived query in spring data jpa
     *
     * @param category of food which has category
     * @return list of Food objects related with selected category
     */
    List<Link> findByCategory(String category);

}