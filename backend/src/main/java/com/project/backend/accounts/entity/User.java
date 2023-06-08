package com.project.backend.accounts.entity;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
@Table(name = "user")
public class User {

    @Id
    @Column(name = "email", unique = true, length = 50)
    private String email;

    @NotNull
    @Column(name = "password", length = 50)
    private String password;

    @NotNull
    @Column(name = "nickname", unique = true, length = 30)
    private String nickname;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "birth")
    private Date birth;

    @NotNull
    @Column(name = "phone_number",length = 15)
    private String phoneNumber;

    @NotNull
    @Column(name = "user_address")
    private String userAddress;

    @Column(name = "review_count")
    private int reviewCount;

}
