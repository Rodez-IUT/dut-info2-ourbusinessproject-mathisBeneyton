package ourbusinessproject;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String title;
    private String description;
    @NotNull @ManyToOne(cascade = CascadeType.ALL)
    private Enterprise enterprise;

    public Enterprise getEnterprise() { return enterprise; }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
        if (enterprise != null) {
            enterprise.setProjects(List.of(this));
        }
    }



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
