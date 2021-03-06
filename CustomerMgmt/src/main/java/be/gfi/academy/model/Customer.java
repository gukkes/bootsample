package be.gfi.academy.model;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String address;
    private String postalcode;
    private String city;
    @Column(name = "descr")
    private String description;
    private boolean mailing;
    private boolean active;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    public String getName(){
        return firstname + " " + lastname;
    }
}
