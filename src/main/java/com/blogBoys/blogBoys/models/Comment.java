package com.blogBoys.blogBoys.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer commment_Id;
    String content;
    String author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    @JsonBackReference
    private Posts posts;

    public Comment() {}

    public Comment(String content, Posts posts, String author) {
        this.content = content;
        this.posts = posts;
        this.author = author;
    }

    public Integer getCommment_Id() {
        return commment_Id;
    }

    public void setCommment_Id(Integer commment_Id) {
        this.commment_Id = commment_Id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
