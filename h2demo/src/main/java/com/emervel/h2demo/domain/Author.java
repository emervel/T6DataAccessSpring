package com.emervel.h2demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by 0007195 on 25/05/2017.
 */
@Entity
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    private String firtName;
    private String lastName;

    /**
     * Un post puede tener un solo autor y es el dueño de la aplicacion
     */
    @OneToMany(mappedBy = "author")
    private List<Post> posts;

    private Author() {

    }
    public Author(String firtName, String lastName) {
        this.setFirtName(firtName);
        this.setLastName(lastName);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
