package com.devsuperior.sdsmovie.repositories;


import com.devsuperior.sdsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
