package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.repo.WorkerRepo;

@Service
public class WorkerServiceImpl implements IWorkerService {
	
	@Autowired
	private WorkerRepo workerRepo;
	
	@Override
	public void saveWorker() {


	}
}
