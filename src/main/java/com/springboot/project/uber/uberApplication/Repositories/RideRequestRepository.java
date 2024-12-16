package com.springboot.project.uber.uberApplication.Repositories;

import com.springboot.project.uber.uberApplication.Entities.RideRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<Long, RideRequestEntity> {
}
