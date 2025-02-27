package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Worker;

public interface WorkerRepo extends JpaRepository<Worker, Integer> {

}
