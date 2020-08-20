package com.kirkpinarturizm.ptspro.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.kirkpinarturizm.ptspro.enums.EhliyetSinifi;
import com.kirkpinarturizm.ptspro.enums.MedeniDurumu;
import com.kirkpinarturizm.ptspro.enums.OzlukBilgisi;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "SOFOR_TABLE")
public class SoforTable implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long id;

    @Column(name = "AD_SOYAD")
    private String adSoyad;

    @Column(name = "EHLIYET_SINIFI")
    @Enumerated(value = EnumType.STRING)
    private EhliyetSinifi ehliyetSinifi;

    @Column(name = "SRC_BELGESI")
    private boolean srcBelgesi;

    @Temporal(TemporalType.TIME)
    @Column(name = "PSIKO_TEKNIK_BELGESI_TARIHI")
    private Date psikoTeknikBelgesiTarihi;

    @Column(name = "SABIKA_KAYDI")
    private boolean sabikaKaydi;

    @Column(name = "OZLUK_BILGISI")
    @Enumerated(value = EnumType.STRING)
    private OzlukBilgisi ozlukBilgisi;

    @Column(name = "MEDENI_DURUMU")
    @Enumerated(value = EnumType.STRING)
    private MedeniDurumu medeniDurumu;

    @Column(name = "SURUCU_EGITIM")
    private String surucuEgitim;

    @Column(name = "EHLIYET_NO")
    private String ehliyetNo;

    @Column(name = "TC_KIMLIK_NO", unique = true, nullable = false)
    private String tckimlikNo;

    @Column(name = "ADRES")
    private String adres;


    @JsonManagedReference
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(
            name = "SOFOR_ARAC_TABLE",
            joinColumns = @JoinColumn(name = "ARAC_ID", nullable = true),
            inverseJoinColumns = @JoinColumn(name = "SOFOR_ID", nullable = true))
    private Set<AracTable> aracTables = new HashSet<>(0);

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public EhliyetSinifi getEhliyetSinifi() {
        return ehliyetSinifi;
    }

    public void setEhliyetSinifi(EhliyetSinifi ehliyetSinifi) {
        this.ehliyetSinifi = ehliyetSinifi;
    }

    public boolean isSrcBelgesi() {
        return srcBelgesi;
    }

    public void setSrcBelgesi(boolean srcBelgesi) {
        this.srcBelgesi = srcBelgesi;
    }

    public Date getPsikoTeknikBelgesiTarihi() {
        return psikoTeknikBelgesiTarihi;
    }

    public void setPsikoTeknikBelgesiTarihi(Date psikoTeknikBelgesiTarihi) {
        this.psikoTeknikBelgesiTarihi = psikoTeknikBelgesiTarihi;
    }

    public boolean isSabikaKaydi() {
        return sabikaKaydi;
    }

    public void setSabikaKaydi(boolean sabikaKaydi) {
        this.sabikaKaydi = sabikaKaydi;
    }

    public OzlukBilgisi getOzlukBilgisi() {
        return ozlukBilgisi;
    }

    public void setOzlukBilgisi(OzlukBilgisi ozlukBilgisi) {
        this.ozlukBilgisi = ozlukBilgisi;
    }

    public MedeniDurumu getMedeniDurumu() {
        return medeniDurumu;
    }

    public void setMedeniDurumu(MedeniDurumu medeniDurumu) {
        this.medeniDurumu = medeniDurumu;
    }

    public String getSurucuEgitim() {
        return surucuEgitim;
    }

    public void setSurucuEgitim(String surucuEgitim) {
        this.surucuEgitim = surucuEgitim;
    }

    public String getEhliyetNo() {
        return ehliyetNo;
    }

    public void setEhliyetNo(String ehliyetNo) {
        this.ehliyetNo = ehliyetNo;
    }

    public String getTckimlikNo() {
        return tckimlikNo;
    }

    public void setTckimlikNo(String tckimlikNo) {
        this.tckimlikNo = tckimlikNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Set<AracTable> getAracTables() {
        return aracTables;
    }

    public void setAracTables(Set<AracTable> aracTables) {
        this.aracTables = aracTables;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoforTable that = (SoforTable) o;
        return id == that.id &&
                srcBelgesi == that.srcBelgesi &&
                sabikaKaydi == that.sabikaKaydi &&
                Objects.equals(adSoyad, that.adSoyad) &&
                ehliyetSinifi == that.ehliyetSinifi &&
                Objects.equals(psikoTeknikBelgesiTarihi, that.psikoTeknikBelgesiTarihi) &&
                ozlukBilgisi == that.ozlukBilgisi &&
                medeniDurumu == that.medeniDurumu &&
                Objects.equals(surucuEgitim, that.surucuEgitim) &&
                Objects.equals(ehliyetNo, that.ehliyetNo) &&
                Objects.equals(tckimlikNo, that.tckimlikNo) &&
                Objects.equals(adres, that.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adSoyad, ehliyetSinifi, srcBelgesi, psikoTeknikBelgesiTarihi, sabikaKaydi, ozlukBilgisi, medeniDurumu, surucuEgitim, ehliyetNo, tckimlikNo, adres);
    }
}
