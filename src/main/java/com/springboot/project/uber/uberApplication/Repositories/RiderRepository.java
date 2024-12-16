package com.springboot.project.uber.uberApplication.Repositories;

import com.springboot.project.uber.uberApplication.Entities.RiderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Long, RiderEntity> {
}
