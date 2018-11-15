package bios.springframework.spring5webapp.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "Zalen")
public class Zaal {

    @Id
    @Column(name= "zaalid",nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long zaalid;

    @Column(name= "Zaalnummer", unique = true,nullable=false)
    private String zaalNummer;

    @Column(name= "aantalStoelen",nullable=false)
    private Long aantalStoelen;

    @Column(name="IMAXZaal",nullable=false)
    private boolean IMAXZaal;

    @Column(name="drieDZaal",nullable=false)
    private boolean drieDZaal;

    public Zaal(){

    }



    @JsonIgnore
    public Long getId() {
        return zaalid;
    }

    @JsonIgnore
    public void setId(Long id) {
        this.zaalid = id;
    }

    public String getZaalNummer() {
        return zaalNummer;
    }

    public void setzaalNummer(String zaalNummer) {
        this.zaalNummer = zaalNummer;
    }

    public Long getAantalStoelen(){
        return aantalStoelen;
    }

    public void setAantalStoelen(Long aantalStoelen){
        this.aantalStoelen = aantalStoelen;
    }

    public boolean isIMAXZaal() {
        return IMAXZaal;
    }

    public void setIMAXZaal(boolean IMAXZaal) {
        this.IMAXZaal = IMAXZaal;
    }

    public boolean isDrieDZaal() {
        return drieDZaal;
    }

    public void setDrieDZaal(boolean drieDZaal) {
        this.drieDZaal = drieDZaal;
    }
}
