package by.vdavdov.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "city", schema = "world")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 35)
    private String name;

    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

    @Column(name = "district", length = 20)
    private String district;

    @Column(name = "population")
    private Integer population;
}
