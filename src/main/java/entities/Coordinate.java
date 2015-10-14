package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by Andrii on 10/14/2015.
 */
@Entity
@Table(name = "Coordinate")
public class Coordinate {
    @Id @GeneratedValue
    @Column(name = "id_coordinate")
    private int IdCoordinate;
    @NotNull
    @Column(name = "latitude")
    private String latitude;
    @NotNull
    @Column(name = "longitude")
    private String longitude;

    public Coordinate(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getIdCoordinate() {
        return IdCoordinate;
    }

    public void setIdCoordinate(int idCoordinate) {
        IdCoordinate = idCoordinate;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
