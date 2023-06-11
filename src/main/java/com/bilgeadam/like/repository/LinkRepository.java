package com.bilgeadam.like.repository;
/**
 * @author stkey
 * @since 29.03.2023
 */
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
     * @param title of Link which has comments
     * @return Link object related with selected title
     */
    Link findByIgnoreCaseTitle(String title);

    /**
     * Example of derived query in spring data jpa
     *
     * @param category of link which has category
     * @return list of link objects related with selected category
     */
    List<Link> findByCategory(String category);

}