package com.springboot.project.uber.uberApplication.Repositories;

import com.springboot.project.uber.uberApplication.Entities.RideEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Long, RideEntity> {
}
