package com.bilgeadam.like.repository;

/**
 * @author stkey
 * @since 29.03.2023
 */
import com.bilgeadam.like.common.repository.BaseRepository;
import com.bilgeadam.like.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository extends BaseRepository<Role, UUID> {

}