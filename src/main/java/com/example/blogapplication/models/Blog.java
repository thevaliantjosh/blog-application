package com.example.blogapplication.models;

import javax.persistence.*;

@Entity
@Table(name="blogs")
public class Blog {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, length= 1000)
    private String body;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    //Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //Constructors

    public Blog(){

    }

    public Blog(String title, String body){
        this.title = title;
        this.body = body;
    }
}
