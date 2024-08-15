package com.api.api_vendinha.controller.DOMAIN.repository;

import com.api.api_vendinha.controller.DOMAIN.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer> {
}
