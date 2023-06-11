package com.bilgeadam.like.dto;

import com.bilgeadam.like.common.dto.BaseDto;
import com.bilgeadam.like.consts.MessageConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

/**
 * @author stkey
 * @since 31.03.2023
 */

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PointDto extends BaseDto {
    private UUID userId;
    /**
     * Point category information
     */
    @NotBlank(message = MessageConstants.MESSAGE_NOT_BLANK)
    private String category;

    /**
     * Point title information
     */
    @NotBlank(message = MessageConstants.MESSAGE_NOT_BLANK)
    @Size(min = 5, max = 30)
    private String title;
}
