package com.fpemba.SpringBoot.Service;

import com.fpemba.SpringBoot.Entity.Lesson;
import com.fpemba.SpringBoot.Repository.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonService {

    private LessonRepository lessonRepository;

    public List<Lesson> getAllLessons(String courseId) {
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findByCourseId(courseId)
                .forEach(lessons::add);
        return lessons;
    }

    public Lesson getCourse(String id) {
        return lessonRepository.findById(id).orElse(null);
    }

    public void addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void updateLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void deleteLesson(String id) {
        lessonRepository.deleteById(id);
    }
}
