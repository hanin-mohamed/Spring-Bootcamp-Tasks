package main.com.myApp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="passport")
@Setter
@Getter
@NoArgsConstructor
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(
            fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL
    cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.PERSIST
    })
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name="expiry_date")
    private Date expiryDate;

    public Passport(Person person, String passportNumber, Date expiryDate) {
        this.person = person;
        this.passportNumber = passportNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", passportNumber='" + passportNumber + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
