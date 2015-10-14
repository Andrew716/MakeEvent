package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by Andrii on 9/4/2015.
 */
@Entity
@Table(name = "Country")
public class Country {
    @Id @GeneratedValue
    @Column(name = "id_country")
    private int IdCountry;
    @NotNull
    @Column(name = "country_name")
    private String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public int getIdCountry() {
        return IdCountry;
    }

    public void setIdCountry(int idCountry) {
        IdCountry = idCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
