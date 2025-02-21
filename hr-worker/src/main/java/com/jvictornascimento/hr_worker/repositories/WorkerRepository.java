package com.jvictornascimento.hr_worker.repositories;

import com.jvictornascimento.hr_worker.models.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
