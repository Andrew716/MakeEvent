package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by Andrii on 9/4/2015.
 */
@Entity
@Table(name = "City")
public class City {
    @Id @GeneratedValue
    @Column(name = "id_city")
    private int IdCity;
    @NotNull
    @Column(name = "city_name")
    private String cityName;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_country")
    private Country country;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public int getIdCity() {
        return IdCity;
    }

    public void setIdCity(int idCity) {
        IdCity = idCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
