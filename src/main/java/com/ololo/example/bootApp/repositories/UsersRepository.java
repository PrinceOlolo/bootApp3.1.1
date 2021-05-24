package com.ololo.example.bootApp.repositories;

import com.ololo.example.bootApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);

}
