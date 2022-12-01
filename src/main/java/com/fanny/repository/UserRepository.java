package com.fanny.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fanny.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{


}
