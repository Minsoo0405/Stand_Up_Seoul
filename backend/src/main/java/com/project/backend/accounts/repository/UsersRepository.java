package com.project.backend.accounts.repository;

import com.project.backend.accounts.repository.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {

    Users findByEmail(String email);
    Boolean existsByEmail(String email);
    Boolean existsByNickname(String nickname);
    Boolean existsByPhoneNumber(String phoneNumber);
    Users findByEmailAndPassword(String email, String password);
}
