package com.example.hello.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService{

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
        new Topic(1,"Spring Framework","This is description"),
        new Topic(2,"CodeIgniter","This is codeigniter description"),
        new Topic(3,"Laravel","This is description of Laravel"),
        new Topic(4,"nodejs","Node JS description"),
        new Topic(5,"Flask","Python lover"),
        new Topic(6,"Django","For python lovers")
    ));

    public List<Topic> getAllTopic(){
        return topics;
    }

    public Topic getTopic(Integer id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }
    
}