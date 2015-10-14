package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

/**
 * Created by Andrii on 9/4/2015.
 */
@Entity
@Table(name = "Event")
public class Event {
    @Id @GeneratedValue
    @Column(name = "id_event")
    private int IdEvent;
    @NotNull
    @Column(name = "name_of_event")
    private String nameOfEvent;
    @NotNull
    @Column(name = "date_of_event")
    private Date dateOfEvent;
    @Column(name = "time_of_event")
    private Time timeOfEvent;
    @OneToOne(fetch = FetchType.LAZY)
    @Column(name = "id_coordinate")
    private Coordinate coordinate;
    @ManyToMany(mappedBy = "events")
    private List<Person> personList;

    public Event(String nameOfEvent, Date dateOfEvent, Time timeOfEvent) {
        this.nameOfEvent = nameOfEvent;
        this.dateOfEvent = dateOfEvent;
        this.timeOfEvent = timeOfEvent;
    }

    public int getIdEvent() {
        return IdEvent;
    }

    public void setIdEvent(int idEvent) {
        IdEvent = idEvent;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public Date getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(Date dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public Time getTimeOfEvent() {
        return timeOfEvent;
    }

    public void setTimeOfEvent(Time timeOfEvent) {
        this.timeOfEvent = timeOfEvent;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
