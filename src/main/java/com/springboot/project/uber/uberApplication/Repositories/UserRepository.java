package com.springboot.project.uber.uberApplication.Repositories;

import com.springboot.project.uber.uberApplication.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Long, UserEntity> {
}
