package com.example.TEST_REPO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class UserDto {
    private long id;
    @Email
    @Size(max = 254, min = 6)
    @NotBlank
    private String email;
    @Size(max = 250, min = 2)
    @NotBlank
    private String name;
    @NotBlank String fail;
}
