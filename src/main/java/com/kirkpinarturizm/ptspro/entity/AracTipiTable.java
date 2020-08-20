package com.kirkpinarturizm.ptspro.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "ARAC_TIPI_TABLE")
@Data
@EqualsAndHashCode(exclude = "aracTables")
public class AracTipiTable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long id;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "ACIKLAMA")
    private String aciklama;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "aracTipiId")
    private Set<AracTable> aracTables;


}
