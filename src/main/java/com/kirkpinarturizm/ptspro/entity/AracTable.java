package com.kirkpinarturizm.ptspro.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "ARAC_TABLE")
public class AracTable implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long id;

    @Column(name = "MARKA")
    private String marka;

    @Column(name = "MODEL")
    @Email
    private String model;

    @Column(name = "MODEL_YIL")
    private Integer modelYil;

    @Temporal(TemporalType.DATE)
    @Column(name = "VIZE_BITIS_TARIHI")
    private Date vizeBitisTarihi;

    @Temporal(TemporalType.DATE)
    @Column(name = "KASKO_BITIS_TARIHI")
    private Date kaskoBitisTarihi;

    @Temporal(TemporalType.DATE)
    @Column(name = "SIGORTA_BITIS_TARIHI")
    private Date sigortaBitisTarihi;

    @Temporal(TemporalType.DATE)
    @Column(name = "FERDI_KAZA_SIGORTA_TARIHI")
    private Date ferdiKazaSigortaTarihi;

    @Column(name = "BELEDIYE_RUHSAT")
    private String belediyeRuhsat;

    @Column(name = "KAPASITE")
    private short kapasite;

    @Column(name = "PLAKA")
    private String plaka;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ARAC_TIPI_ID")
    private AracTipiTable aracTipiId;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CARI_ID")
    private CariTable aracCariId;

    @JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "aracTables")
    private Set<SoforTable> soforTables = new HashSet<>(0);

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getModelYil() {
        return modelYil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AracTable aracTable = (AracTable) o;
        return id == aracTable.id &&
                kapasite == aracTable.kapasite &&
                Objects.equals(marka, aracTable.marka) &&
                Objects.equals(model, aracTable.model) &&
                Objects.equals(modelYil, aracTable.modelYil) &&
                Objects.equals(vizeBitisTarihi, aracTable.vizeBitisTarihi) &&
                Objects.equals(kaskoBitisTarihi, aracTable.kaskoBitisTarihi) &&
                Objects.equals(sigortaBitisTarihi, aracTable.sigortaBitisTarihi) &&
                Objects.equals(ferdiKazaSigortaTarihi, aracTable.ferdiKazaSigortaTarihi) &&
                Objects.equals(belediyeRuhsat, aracTable.belediyeRuhsat) &&
                Objects.equals(plaka, aracTable.plaka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marka, model, modelYil, vizeBitisTarihi, kaskoBitisTarihi, sigortaBitisTarihi, ferdiKazaSigortaTarihi, belediyeRuhsat, kapasite, plaka);
    }

    public void setModelYil(Integer modelYil) {
        this.modelYil = modelYil;
    }

    public Date getVizeBitisTarihi() {
        return vizeBitisTarihi;
    }

    public void setVizeBitisTarihi(Date vizeBitisTarihi) {
        this.vizeBitisTarihi = vizeBitisTarihi;
    }

    public Date getKaskoBitisTarihi() {
        return kaskoBitisTarihi;
    }

    public void setKaskoBitisTarihi(Date kaskoBitisTarihi) {
        this.kaskoBitisTarihi = kaskoBitisTarihi;
    }

    public Date getSigortaBitisTarihi() {
        return sigortaBitisTarihi;
    }

    public void setSigortaBitisTarihi(Date sigortaBitisTarihi) {
        this.sigortaBitisTarihi = sigortaBitisTarihi;
    }

    public Date getFerdiKazaSigortaTarihi() {
        return ferdiKazaSigortaTarihi;
    }

    public void setFerdiKazaSigortaTarihi(Date ferdiKazaSigortaTarihi) {
        this.ferdiKazaSigortaTarihi = ferdiKazaSigortaTarihi;
    }

    public String getBelediyeRuhsat() {
        return belediyeRuhsat;
    }

    public void setBelediyeRuhsat(String belediyeRuhsat) {
        this.belediyeRuhsat = belediyeRuhsat;
    }

    public short getKapasite() {
        return kapasite;
    }

    public void setKapasite(short kapasite) {
        this.kapasite = kapasite;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public AracTipiTable getAracTipiId() {
        return aracTipiId;
    }

    public void setAracTipiId(AracTipiTable aracTipiId) {
        this.aracTipiId = aracTipiId;
    }

    public CariTable getAracCariId() {
        return aracCariId;
    }

    public void setAracCariId(CariTable aracCariId) {
        this.aracCariId = aracCariId;
    }

    public Set<SoforTable> getSoforTables() {
        return soforTables;
    }

    public void setSoforTables(Set<SoforTable> soforTables) {
        this.soforTables = soforTables;
    }
}
