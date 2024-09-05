package com.example.demo.topic;

import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List <Topic> topics= Arrays.asList(
            new Topic("id1","name1","description1"),
            new Topic("id2","name2","description2"),
            new Topic("id3","name3","description3")
    );

    public List<Topic> getALLTopics()
    {
        return topics;
    }
}
