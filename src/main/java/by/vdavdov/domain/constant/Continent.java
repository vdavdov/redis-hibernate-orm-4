package by.vdavdov.domain.constant;

import lombok.Getter;

@Getter
public enum Continent {
    ASIA(0),
    EUROPE(1),
    NORTH_AMERICA(2),
    AFRICA(3),
    OCEANIA(4),
    ANTARCTICA(5),
    SOUTH_AMERICA(6);


    private final int value;

    Continent(final int value) {
        this.value = value;
    }

    public static Continent fromValue(final int value) {
        for (final Continent continent : Continent.values()) {
            if (continent.getValue() == value) {
                return continent;
            }
        }
        throw new IllegalArgumentException("Unknown continent: " + value);
    }

}
