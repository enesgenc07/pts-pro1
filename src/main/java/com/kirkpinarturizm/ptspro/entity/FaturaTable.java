package com.kirkpinarturizm.ptspro.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.kirkpinarturizm.ptspro.enums.HesapKapama;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "FATURA_TABLE")
@Data
public class FaturaTable implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long id;

    @Column(name = "FATURA_NO")
    private String faturaNo;

    @Column(name = "YIL", length = 4)
    private Integer yil;

    @Column(name = "HESAP_KAPAMA")
    @Enumerated(EnumType.STRING)
    private HesapKapama hesapKapama;

    @Temporal(TemporalType.DATE)
    @Column(name = "FATURA_TARIHI")
    private Date faturaTarihi;

    // secilen cariye ait sefer hareketlerinden yapmıs oldugu butun hareketlerin toplami firma id si ile beraber farklı frimalar da ayrı ayrı topla
    @Column(name = "MATRAH")
    private BigDecimal matrah;

    @Column(name = "KDV_18")
    private BigDecimal kdv18;

    @Column(name = "ARA_TOPLAM")
    private BigDecimal araToplam;

    @Column(name = "KDV_9")
    private BigDecimal kdv9;

    @Column(name = "GENEL_TOPLAM")
    private BigDecimal genelToplam;

}
