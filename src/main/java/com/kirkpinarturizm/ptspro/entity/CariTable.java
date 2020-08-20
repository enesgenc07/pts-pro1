package com.kirkpinarturizm.ptspro.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.kirkpinarturizm.ptspro.enums.CariTipi;
import com.kirkpinarturizm.ptspro.enums.FirmaTipi;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CARI_TABLE")
@Data
@EqualsAndHashCode(exclude = "cariAracList")
public class CariTable implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long id;

    @Column(name = "UNVAN")
    private String unvan;

    @Column(name = "CARI_KOD")
    private Long cariKod;

    @Column(name = "CARI_EMAIL")
    @Email
    private String cariMail;

    @Column(name = "CARI_TELEFON_NO")
    private String cariTelefonNo;

    @Column(name = "VERGI_DAIRE")
    private String vergiDaire;

    @Column(name = "VERGI_NO")
    private String vergiNo;

    @Column(name = "YETKILI_AD_SOYAD")
    private String yetkiliAdSoyad;

    @Column(name = "BANKA_KOD")
    private String bankaKod;

    @Column(name = "BANKA_SUBE_KOD")
    private String bankaSubeKod;

    @Column(name = "BANKA_HESAP_NO")
    private String bankaHesapNo;

    @Column(name = "IBAN_NO")
    private String ibanNo;

    @Column(name = "YETKILI_EMAIL")
    @Email
    private String yetkiliEmail;

    @Column(name = "YETKILI_TELEFON_NO")
    private String yetkiliTelefonNo;

    @Column(name = "CARI_TIPI")
    @Enumerated(EnumType.STRING)
    private CariTipi cariTipi;

    @Column(name = "CARI_ADRESS")
    private String cariAdress;

    @Column(name = "FIRMA_TIPI")
    @Enumerated(EnumType.STRING)
    private FirmaTipi firmaTipi;

    @Column(name = "KAYIT_TARIHI")
    private String kayitTarihi;

    @Column(name = "DURUM")
    private boolean durum;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "aracCariId")
    private Set<AracTable> cariAracList = new HashSet<AracTable>(0);

}
