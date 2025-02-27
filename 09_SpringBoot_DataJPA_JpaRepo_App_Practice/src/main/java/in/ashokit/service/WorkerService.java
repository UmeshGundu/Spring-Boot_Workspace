package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Worker;
import in.ashokit.repo.WorkerRepo;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepo workerRepo;

	public void saveWorkersData() {
		Worker w1 = new Worker(1, "Mallesham", 60, "Male", "Panthini");
		Worker w2 = new Worker(2, "Raju", 30, "Male", "Ellanda");
		Worker w3 = new Worker(3, "Sathish", 35, "Male", "Wardhannapet");
		Worker w4 = new Worker(4, "Ramya", 25, "Female", "Ellanda");
		Worker w5 = new Worker(5, "Venkanna", 55, "Male", "Wardhannapet");
		Worker w6 = new Worker(6, "Ravi", 38, "Male", "Inovole");
		Worker w7 = new Worker(7, "Sureka", 36, "Female", "Ellanda");
		Worker w8 = new Worker(8, "lalitha", 40, "Female", "Ellanda");

		List<Worker> asList = Arrays.asList(w1, w2, w3, w4, w5, w6, w7, w8);

		List<Worker> list = workerRepo.saveAll(asList);
		list.forEach(System.out::println);
	}

	public void getWorkersSort() {

		Sort sort = Sort.by("age").descending();

		List<Worker> list = workerRepo.findAll(sort);
		list.forEach(System.out::println);
	}

	public void getWorkerPagination() {

		int pageSize = 3;
		int pageNo = 3;

		PageRequest of = PageRequest.of(pageNo - 1, pageSize);
		Page<Worker> all = workerRepo.findAll(of);
		all.forEach(System.out::println);
	}

	public void getWorkersQBE(String gender, String place) {

		Worker w = new Worker();

		if (gender != null) {
			w.setGender(gender);
		}
		if (place != null) {
			w.setPlace(place);
		}

		Example<Worker> of = Example.of(w);

		List<Worker> all = workerRepo.findAll(of);
		all.forEach(x -> {
			System.out.println(x);
		});
	}

}
