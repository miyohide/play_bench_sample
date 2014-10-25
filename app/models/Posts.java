package models;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class Posts extends Model {
    @Id
    public Integer id;
    
    public String title;

    @Column(columnDefinition = "TEXT") 
    public String body;
    
    public static Finder<Integer, Posts> find = new Finder<>(
            Integer.class, Posts.class
            );

}


