package com.backend.Backend.User.Management.System.repository;

import com.backend.Backend.User.Management.System.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
