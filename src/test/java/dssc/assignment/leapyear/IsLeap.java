package dssc.assignment.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsLeap {
    private final LeapYear leap_year = new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {1995,1999,2011})
    void not_divisible_by_4(int number){
        assertEquals(false, leap_year.convert(number));

    }

    @ParameterizedTest
    @ValueSource(ints = {1992,2016,2020,2024})
    void divisible_by_4_not_by_100(int number) {
        assertEquals(true, leap_year.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1900,2100,2300})
    void divisible_by_4_and_100_not_by_400(int number) {
        assertEquals(false, leap_year.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2000,2400})
    void divisible_by_4_and_100_and_400(int number) {
        assertEquals(true, leap_year.convert(number));
    }

}

