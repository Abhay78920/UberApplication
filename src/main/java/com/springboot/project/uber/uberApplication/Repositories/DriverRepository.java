package com.springboot.project.uber.uberApplication.Repositories;

import com.springboot.project.uber.uberApplication.Entities.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Long, DriverEntity> {
}
