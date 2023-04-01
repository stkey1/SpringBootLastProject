package com.bilgeadam.like.repository;

import com.bilgeadam.like.common.repository.BaseRepository;
import com.bilgeadam.like.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository extends BaseRepository<Role, UUID> {

}