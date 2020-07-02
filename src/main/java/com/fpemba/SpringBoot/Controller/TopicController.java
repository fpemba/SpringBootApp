package com.fpemba.SpringBoot.Controller;

import com.fpemba.SpringBoot.Entity.Topic;
import com.fpemba.SpringBoot.Service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

        @GetMapping("/topics")
        public List<Topic> getAllTopics() {
            return topicService.getAllTopics();
        }

        @GetMapping("/topics/{id}")
        public Topic getTopic(@PathVariable String id) {
            return topicService.getTopic(id);
        }

        @PostMapping("/topics")
        public void addTopic(@RequestBody Topic topic) {
            topicService.addTopic(topic);
        }
    }

