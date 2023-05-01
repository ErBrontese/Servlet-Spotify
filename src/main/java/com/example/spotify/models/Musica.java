
package com.example.spotify.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Musica {

   
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private Integer data;


    public Musica(){

    }



    public Musica(long id, String name, String description, Integer data) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.data = data;
    }

    


    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Integer getData(){
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    


}
