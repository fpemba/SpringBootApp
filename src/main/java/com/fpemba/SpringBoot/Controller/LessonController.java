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

    @GetMapping("/topics/{id}/courses/{courseId}/lessons")
    public List<Lesson> getAllLessons(@PathVariable String id, @PathVariable String courseId) {
        return lessonService.getAllLessons(courseId);
    }

    @GetMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void getLesson(@PathVariable String id) {
        lessonService.getCourse(id);
    }

    @PostMapping("/topics/{topicId}/courses/{courseId}/lessons")
    public void addLesson(@RequestBody Lesson lesson, @PathVariable String courseId, @PathVariable String topicId) {
        lesson.setCourse(new Course(courseId, "", "", ""));
        lessonService.addLesson(lesson);
    }

    @PutMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void updateLesson(@RequestBody Lesson lesson, @PathVariable String courseId, @PathVariable String id, @PathVariable String topicId) {
        lesson.setCourse(new Course(courseId, "", "", ""));
        lessonService.updateLesson(lesson);
    }

    @DeleteMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void deleteLesson(@PathVariable String id) {
        lessonService.deleteLesson(id);
    }


}


