package com.bilgeadam.like.common.repository;

/**
 * @author stkey
 * @since 29.03.2023
 */
import com.bilgeadam.like.common.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, ID> extends JpaRepository<T, ID> {
}
