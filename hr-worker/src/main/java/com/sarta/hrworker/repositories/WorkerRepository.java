package com.sarta.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarta.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
