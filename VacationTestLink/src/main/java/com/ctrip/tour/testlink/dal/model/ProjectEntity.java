package com.ctrip.tour.testlink.dal.model;

import javax.persistence.*;

/**
 * Created by hbhu on 2018/9/3.
 */
@Entity
@Table(name , schema = "testlink", catalog = "")
public class ProjectEntity {
    private int id;
    private String projKey;
    private String name;
    private String self;
    private String owner;
    private String description;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "proj_key", nullable = false, length = 20)
    public String getProjKey() {
        return projKey;
    }

    public void setProjKey(String projKey) {
        this.projKey = projKey;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "self", nullable = true, length = 200)
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    @Basic
    @Column(name = "owner", nullable = false, length = 20)
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 500)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectEntity that = (ProjectEntity) o;

        if (id != that.id) return false;
        if (projKey != null ? !projKey.equals(that.projKey) : that.projKey != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (self != null ? !self.equals(that.self) : that.self != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (projKey != null ? projKey.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (self != null ? self.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
