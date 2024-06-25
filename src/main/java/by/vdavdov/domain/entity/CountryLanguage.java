package by.vdavdov.domain.entity;

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
@Table(name = "country_language", schema = "world")
public class CountryLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "language", length = 30)
    private String language;

    @Column(name = "is_official")
    private Boolean isOfficial;

    @Column(name = "percentage")
    private BigDecimal percentage;
}
