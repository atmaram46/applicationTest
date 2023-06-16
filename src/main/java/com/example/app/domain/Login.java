package com.example.app.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity(name = "login_details")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password", nullable = false, length = 500)
    private String password;

    @Column(name="isLocked")
    private Boolean isLocked = true;

    @Column(name="currInvalidCount")
    private int currInvalidCount = 0;

    @Column(name = "lastInvalidTry")
    private Date lastInvalidTry;

    @Column(name = "isLoggedIn")
    private Boolean isLoggedIn = false;

    /** The salt. */
    @Column(name = "SALT", nullable = false, length = 50)
    private String salt;
}
