package com.app.hausmasbd.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Der Name darf nicht leer sein.")
    @Size (min = 2, max = 50)
    private String name;

    @Column(nullable = true)
    @Email(message = "Falsches E-Mail-Format")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Telefon erforderlich")
    @Pattern(regexp = "^(\\+?\\d{1,3}[- ]?)?\\d{10}$", message = "Falsches Telefonformat")
    private String phone;

    @Column(columnDefinition = "TEXT")
    @NotBlank(message = "Fügen Sie mindestens ein paar Worte darüber hinzu, was getan werden muss.")
    private String description;
}
