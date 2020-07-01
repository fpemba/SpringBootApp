package com.fpemba.SpringBoot.Service;

import com.fpemba.SpringBoot.Entity.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(

                new Topic("spring","Spring Framework","Spring Framework Description"),
                new Topic("java","Core Java","Core Java Description"),
                new Topic("javaScript","JavaScript","JavaScript Description")
        );

    public List<Topic> getAllTopics() {
        return topics;
    }
}
