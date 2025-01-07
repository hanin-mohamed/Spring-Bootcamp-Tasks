package main.com.myApp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person")
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private Date birthDate;

    @OneToOne(mappedBy = "person")
    private Passport passport;
    public Person(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}
