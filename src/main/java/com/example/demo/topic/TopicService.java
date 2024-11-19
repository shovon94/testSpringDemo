package com.example.demo.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>( Arrays.asList(
//            new Topic("id1", "name1", "description1"),
//            new Topic("id2", "name2", "description2"),
//            new Topic("id3", "name3", "description3")
    ));

    public List<Topic> getALLTopics() {
        return topics;
    }

    public Topic getTopicById(String id) {
        return topics.stream().
                filter(t -> t.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> {
                    return new NoSuchElementException("Topic not found with id: " + id);
                });
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i=0; i<topics.size(); i++)
        {
            Topic t= topics.get(i);
            if (t.getId().equals(id))
            {
                topics.set(i,topic);
                return;
            }


        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
