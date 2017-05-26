package com.emervel.h2demo.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 0007195 on 25/05/2017.
 */
@Entity
@Table(name = "POST")
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String body;
    private Date postedOn;


    /**
     * Un post tiene un author pero un autor puede tener varios posts
     */
    @ManyToOne
    private Author author;


    /**
     * Se necesita para JPA
     */
    private Post() {

    }
    public Post(String title) {
        this.setTitle(title);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", postedOn=" + postedOn +
                '}';
    }
}
