package com.bilgeadam.like.common.dto;

/**
 * @author stkey
 * @customize
 * @add
 * @components
 * @throws
 * @return
 * @since 29.03.2023
 */
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseDto implements Serializable {

    /**
     * Dto id information
     */
    private UUID id;

    /**
     * Dto state information
     * deleted=0 or undeleted=1 values
     */
    private final short state = 1;

    /**
     * Dto version information
     */
    private Long version;
}