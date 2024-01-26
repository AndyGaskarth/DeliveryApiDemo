package com.mbalem.demodeliveryapi.web.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioCreateDto {


    @NotBlank
    @Email(message = "formato de e-mail invalido.")
    private String username;

    @NotBlank
    @Size(min = 6, max = 6)
    private String password;
}
