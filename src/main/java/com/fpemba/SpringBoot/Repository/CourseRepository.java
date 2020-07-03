package com.fpemba.SpringBoot.Repository;

import com.fpemba.SpringBoot.Entity.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course> findByTopicId (String topicId);


}
