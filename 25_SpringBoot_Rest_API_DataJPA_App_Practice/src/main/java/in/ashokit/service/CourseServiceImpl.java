package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Course;
import in.ashokit.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo courseRepo;

	@Override
	public String upsert(Course course) {
		Course savedCourse = courseRepo.save(course);
		return "Course Saved..!";
	}
	
	@Override
	public Course showCourse(Integer id) {
		Optional<Course> byId = courseRepo.findById(id);
		if (byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	@Override
	public List<Course> showCourses() {
		List<Course> all = courseRepo.findAll();
		return all;
	}

	@Override
	public String deleteCourseById(Integer id) {
		if (courseRepo.existsById(id)) {
			courseRepo.deleteById(id);
			return "Course Deleted Successfully..!";
		}
		return "Course Not Found";
	}
}
