package romanNumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralGeneratorTest {
    @Test public void
    generate_a_roman_numeral_for_a_given_decimal_number() {
        assertEquals("I", RomanNumeralGenerator.romanFor(1));
        assertEquals("II", RomanNumeralGenerator.romanFor(2));
        assertEquals("III", RomanNumeralGenerator.romanFor(3));
        assertEquals("IV", RomanNumeralGenerator.romanFor(4));
        assertEquals("V", RomanNumeralGenerator.romanFor(5));
        assertEquals("VII", RomanNumeralGenerator.romanFor(7));
        assertEquals("IX", RomanNumeralGenerator.romanFor(9));
        assertEquals("X", RomanNumeralGenerator.romanFor(10));
        assertEquals("XVIII", RomanNumeralGenerator.romanFor(18));
        assertEquals("XXX", RomanNumeralGenerator.romanFor(30));
        assertEquals("XL", RomanNumeralGenerator.romanFor(40));
        assertEquals("L", RomanNumeralGenerator.romanFor(50));
        assertEquals("XC", RomanNumeralGenerator.romanFor(90));
        assertEquals("C", RomanNumeralGenerator.romanFor(100));
        assertEquals("CD", RomanNumeralGenerator.romanFor(400));
        assertEquals("D", RomanNumeralGenerator.romanFor(500));
        assertEquals("CM", RomanNumeralGenerator.romanFor(900));
        assertEquals("M", RomanNumeralGenerator.romanFor(1000));
        assertEquals("MMDCLXXXVII", RomanNumeralGenerator.romanFor(2687));
        assertEquals("MMMCDXCIX", RomanNumeralGenerator.romanFor(3499));



    }
}