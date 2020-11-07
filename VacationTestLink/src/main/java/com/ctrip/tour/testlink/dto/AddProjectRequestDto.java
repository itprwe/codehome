package com.ctrip.tour.testlink.dto;

/**
 * Created by hbhu on 2018/9/3.
 */
public class AddProjectRequestDto {

    private int id;
    private String projKey;
    private String name;
    private String self;
    private String owner;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjKey() {
        return projKey;
    }

    public void setProjKey(String projKey) {
        this.projKey = projKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
