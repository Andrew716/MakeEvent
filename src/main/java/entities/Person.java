package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by Andrii on 9/4/2015.
 */
@Entity
@Table(name = "Person")
public class Person {
    @Id @GeneratedValue
    @Column(name = "id_person")
    private int IdPerson;
    @NotNull
    @Column(name = "first_name")
    private String firstName;
    @NotNull
    @Column(name = "last_name")
    private String lastName;
    @NotNull
    @Column(name = "birthday")
    private Date birthday;
    @OneToOne(fetch = FetchType.LAZY)
    @Column(name = "id_facebook")
    private FacebookAccount facebookAccount;
    @OneToOne(fetch = FetchType.LAZY)
    @Column(name = "id_city")
    private City city;
    @ManyToMany
    @JoinTable(name = "Person_On_Event", joinColumns = {@JoinColumn(name = "ID_PERSON", referencedColumnName = "id_person")},
                inverseJoinColumns = {@JoinColumn(name = "ID_EVENT", referencedColumnName = "id_event")})
    private List<Event> events;

    public Person(String firstName, String lastName, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public int getIdPerson() {
        return IdPerson;
    }

    public void setIdPerson(int idPerson) {
        IdPerson = idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public FacebookAccount getFacebookAccount() {
        return facebookAccount;
    }

    public void setFacebookAccount(FacebookAccount facebookAccount) {
        this.facebookAccount = facebookAccount;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
