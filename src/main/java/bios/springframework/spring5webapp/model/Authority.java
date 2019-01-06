package bios.springframework.spring5webapp.model;

import com.fasterxml.jackson.annotation.JsonGetter;

import javax.persistence.*;


@Entity
@Table(name= "Authorities")
public class Authority {

    @Id
    @Column(name= "id",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "Username",nullable=false)
    private String userName;

    @Column(name= "Rol")
    private String rol;


//    @OneToMany(mappedBy = "zalen", cascade = CascadeType.PERSIST)
//    @JsonIgnoreProperties(value = "zalen")
//    private Set<Voorstelling>voorstellingen = new HashSet<>();

    public Authority(){
    }

    public Authority(Long id) {
        this.id = id;
    }

    @JsonGetter(value= "id")
    public Long getUserId() {
        return id;
    }

//    @JsonSetter(value = "id")
//    public void setZaalId(Long id) {
//        this.id = id;
//    }

    public String getUserName() {
        return userName;
    }

//    public void setzaalNummer(Integer zaalNummer) {
//        this.zaalNummer = zaalNummer;
//    }

    public String getRol(){
        return rol;
    }

    //public void setAantalStoelen(Long aantalStoelen){
      //  this.aantalStoelen = aantalStoelen;
    //}


//    @JsonIgnore
//    public Set<Voorstelling> getVoorstellingen() {
//        return voorstellingen;
//    }
//
//    @JsonIgnore
//    public void setVoorstellingen(Set<Voorstelling> voorstellingen) {
//        this.voorstellingen = voorstellingen;
//    }
}
