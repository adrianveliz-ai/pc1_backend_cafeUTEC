package com.example.pc1.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty
    @NotNull
    @NotBlank
    @UniqueElements
    private String username;
    @Email
    @UniqueElements
    private String email;

    @UniqueElements
    private String password;

    public User(Long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotEmpty @NotNull @NotBlank @UniqueElements String getUsername() {
        return username;
    }

    public void setUsername(@NotEmpty @NotNull @NotBlank @UniqueElements String username) {
        this.username = username;
    }

    public @Email @UniqueElements String getEmail() {
        return email;
    }

    public void setEmail(@Email @UniqueElements String email) {
        this.email = email;
    }

    public @UniqueElements String getPassword() {
        return password;
    }

    public void setPassword(@UniqueElements String password) {
        this.password = password;
    }
}
