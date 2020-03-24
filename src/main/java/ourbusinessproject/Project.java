package ourbusinessproject;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Project {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String title;
    private String description;
    @NotNull
    private Enterprise enterprise;

    public Enterprise getEnterprise() { return enterprise; }

    public void setEnterprise(Enterprise enterprise) { this.enterprise = enterprise; }



    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }
}
