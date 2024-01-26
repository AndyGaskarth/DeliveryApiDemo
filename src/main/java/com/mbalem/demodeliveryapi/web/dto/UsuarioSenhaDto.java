package com.mbalem.demodeliveryapi.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioSenhaDto {


    private String senhaAtual;

    private String novaSenha;
    private String confirmaSenha;
}
