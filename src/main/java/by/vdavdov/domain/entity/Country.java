package by.vdavdov.domain.entity;


import by.vdavdov.domain.constant.Continent;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "country", schema = "world")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "continent")
    @Enumerated(EnumType.ORDINAL)
    private Continent continent;

    @Column(name = "code", nullable = false, length = 3)
    private String code;

    @Column(name = "code_2", nullable = false, length = 2)
    private String secondCode;

    @Column(name = "name", nullable = false, length = 52)
    private String name;

    @Column(name = "region", nullable = false, length = 26)
    private String region;

    @Column(name = "surface_area")
    private BigDecimal surfaceArea;

    @Column(name = "indep_year")
    private Short independenceYear;

    @Column(name = "population", nullable = false)
    private Integer population;

    @Column(name = "life_expectancy")
    private BigDecimal lifeExpectancy;

    @Column(name = "gnp")
    private BigDecimal GNP;

    @Column(name = "gnpo_id")
    private BigDecimal GNPOId;

    @Column(name = "local_name", length = 45)
    private String localName;

    @Column(name = "government_form", length = 45)
    private String governmentForm;

    @Column(name = "head_of_state", length = 60)
    private String headOfState;

    @Column(name = "capital")
    private City capital;

}