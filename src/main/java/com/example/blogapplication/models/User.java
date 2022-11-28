package com.example.blogapplication.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    //Instance Variables

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;

    @Column
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    List<Blog> usersBlogs;

    //Getters and Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Blog> getUsersBlogs(){
        return usersBlogs;
    }

    public void setUsersBlogs(List<Blog> usersBlogs){
        this.usersBlogs = usersBlogs;
    }

    //Constructors

    public User(){

    }

    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    public User(long id, String username, String email, List<Blog> usersBlogs){
        this.id = id;
        this.username = username;
        this.email = email;
        this.usersBlogs = usersBlogs;
    }









}//End of User Class
