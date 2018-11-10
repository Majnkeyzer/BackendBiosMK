package bios.springframework.spring5webapp.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * Created by mk on 21/10/18.
 */
@Entity
@Table(name = "Voorstellingen")
public class Voorstelling {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "film_id")
    private Film films;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "zaal_id")
    private Zaal zalen;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "tijd")
    private String tijd;

    public Voorstelling() {

    }

    public Voorstelling(Long id) {
        this.id = id;
    }

    @JsonGetter(value = "Voorstelling")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonGetter(value = "Film")
    public Film getFilms() {
        return films;
    }

    public void setFilms(Film films) {
        this.films = films;
    }

    @JsonGetter(value = "Zaal")
    public Zaal getZalen() {
        return zalen;
    }

    public void setZalen(Zaal zalen) {
        this.zalen = zalen;
    }

    @JsonGetter(value = "Datum")
    public Date getDatum() {
        return datum;
    }

    @JsonGetter(value =  "Tijd")
    public String getTijd() {
        return tijd;
    }



    }




