package ourbusinessproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Enterprise {

    @NotEmpty
    private String name;
    @NotEmpty @Size (min = 10)
    private String description;
    @NotEmpty
    private String contactName;
    @NotEmpty @Email
    private String contactEmail;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    public void setName(String name) {

        this.name = name;
    }

    public void setDescription(String description) {

        this.description = description;

    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail= contactEmail;
    }
}
