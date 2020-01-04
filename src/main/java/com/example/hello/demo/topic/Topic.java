package com.example.hello.demo.topic;

public class Topic{
    private Integer id;
    private String name;
    private String description;


    public Topic() {
    }

    public Topic(Integer id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}