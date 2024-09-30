package org.project.coderlinkapi.dto;

import lombok.Data;

@Data
public class AuthResponseDTO {
    private String token;         // El token JWT
    private String firstName;     // El primer nombre del usuario
    private String lastName;      // El apellido del usuario
    private String role;
}
