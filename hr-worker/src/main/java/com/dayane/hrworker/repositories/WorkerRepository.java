package com.dayane.hrworker.repositories;

import org.springframework.stereotype.Repository;

import com.dayane.hrworker.entities.Worker;

import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkerRepository extends JpaRepository<Worker, Long>{
    
    
}
