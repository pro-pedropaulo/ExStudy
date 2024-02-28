package com.app.ExStudy.Repositories;

import com.app.ExStudy.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
