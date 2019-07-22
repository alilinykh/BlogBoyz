package com.blogBoys.blogBoys.models;

import javax.persistence.*;

@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer post_id;
    String title;
    String content;
    String image;
    String date;
    String tag;


    @ManyToOne(cascade = CascadeType.ALL)

    private Users users;

    public Posts() {
    }

    public Posts(String title, String content, String image, String date, String tag, Users users) {
        this.title = title;
        this.content = content;
        this.image = image;
        this.date = date;
        this.tag = tag;
        this.users = users;
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
