package com.bilgeadam.like.dto;
/**
 * @author stkey
 * @since 31.03.2023
 */
import com.bilgeadam.like.common.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleDto extends BaseDto {

    /**
     * Role entity user relation information
     */
    private UUID userId;

    /**
     * Role Entity name information
     */
    private String name;

    
}