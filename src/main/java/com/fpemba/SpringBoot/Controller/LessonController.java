package com.fpemba.SpringBoot.Controller;

import com.fpemba.SpringBoot.Entity.Course;
import com.fpemba.SpringBoot.Entity.Lesson;
import com.fpemba.SpringBoot.Service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @GetMapping("/topics/{id}/courses/{id}/lessons")
    public List<Lesson> getAllLessons(@PathVariable String id) {
        return lessonService.getAllLessons(id);
    }

    @GetMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void getLesson(@PathVariable String id) {
        lessonService.getCourse(id);
    }

    @PostMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void addLesson(@RequestBody Lesson lesson, @PathVariable String courseId) {
        lesson.setCourse(new Course(courseId,"","",""));
        lessonService.addLesson(lesson);
    }

    @PutMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void updateLesson(@RequestBody Lesson lesson, @PathVariable String courseId, @PathVariable String id) {
       lesson.setCourse(new Course(courseId,"","",""));
        lessonService.updateLesson(lesson);
    }

    @DeleteMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void deleteLesson(@PathVariable String id) {
        lessonService.deleteLesson(id);
    }



}


