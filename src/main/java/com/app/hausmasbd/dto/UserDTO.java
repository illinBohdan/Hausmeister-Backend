package com.app.hausmasbd.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {

    @NotBlank(message = "Der Name darf nicht leer sein.")
    @Size(min = 2, max = 50)
    private String name;

    @Email(message = "Falsches E-Mail-Format")
    private String email;

    @NotBlank(message = "Telefon erforderlich")
    @Pattern(regexp = "^(\\+?\\d{1,3}[- ]?)?\\d{10}$", message = "Falsches Telefonformat")
    private String phone;

    @NotBlank(message = "Fügen Sie mindestens ein paar Worte darüber hinzu, was getan werden muss.")
    private String description;
}
