package delft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ConvertRomanToNumberTest {

    //tests to see if method can handle single roman numerals
    @Test
    public void oneRomanNumeral(){
        assertEquals(1, ConvertRomanToNumber.convertStringToNumber("I"));
        assertEquals(5, ConvertRomanToNumber.convertStringToNumber("V"));
        assertEquals(1000, ConvertRomanToNumber.convertStringToNumber("M"));
    }

    //tests to see if it can handle multiple Roman Numerals
    @Test
    public void multipleRomanNumerals(){
        assertEquals(20, ConvertRomanToNumber.convertStringToNumber("XX"));
    }

    @Test
    //this checls to see if convertStringToNumber can handle different numbers that require subtraction to compute
    public void rnSubtractionRule(){
        assertEquals(4, ConvertRomanToNumber.convertStringToNumber("IV"));
        assertEquals(9, ConvertRomanToNumber.convertStringToNumber("IX"));
        assertEquals(90, ConvertRomanToNumber.convertStringToNumber("XC"));
    }

    //+5
    //this tests to see if the convertStringToNumber can handle invalid characters
    @Test
    public void invalidChar(){
        int result = ConvertRomanToNumber.convertStringToNumber("AK");
        assertEquals(33, result);
    }


    //65>76
    //this tests the add method to see if it returns the expected sum of 2 RN
    @Test
    public void addMethod(){
        assertEquals(6, ConvertRomanToNumber.add("I", "V"));
    }

    // (85/100)
    //this tests the bounds of the conversion methods to check if it can hadle large inputs
    @Test
    public void testLargeInput() {
        assertEquals(3888, ConvertRomanToNumber.convertStringToNumber("MMMDCCCLXXXVIII"));
    }
}
