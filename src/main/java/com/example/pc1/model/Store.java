package com.example.pc1.model;
import com.example.pc1.model.User;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Store {
    @NotEmpty
    @NotNull
    @GeneratedValue
    private Long id;
    @UniqueElements
   private String name;
   private User ownerId;
   private String location;
   private String status;

    public Store(Long id, String name, User ownerId, String location, String status) {
        this.id = id;
        this.name = name;
        this.ownerId = ownerId;
        this.location = location;
        this.status = status;
    }

    public @NotEmpty @NotNull Long getId() {
        return id;
    }

    public void setId(@NotEmpty @NotNull Long id) {
        this.id = id;
    }

    public @UniqueElements String getName() {
        return name;
    }

    public void setName(@UniqueElements String name) {
        this.name = name;
    }

    public User getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(User ownerId) {
        this.ownerId = ownerId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
