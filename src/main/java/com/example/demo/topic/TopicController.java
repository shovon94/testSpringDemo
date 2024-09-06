package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopics() {
        return topicService.getALLTopics();

    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return (Topic) topicService.getTopicById(id);
    }

    @PostMapping("/topics")
    public void addTopic()   {


    }
}
