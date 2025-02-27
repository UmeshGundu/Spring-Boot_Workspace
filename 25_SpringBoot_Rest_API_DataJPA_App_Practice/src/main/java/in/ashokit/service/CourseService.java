package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.Course;

public interface CourseService {
	
	public String upsert(Course course);
	
	public List<Course> showCourses();
	
	public Course showCourse(Integer id);

	public String deleteCourseById(Integer id);
}
