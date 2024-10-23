package delft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ConvertRomanToNumberTest {

    @Test
    public void oneRomanNumeral(){
        assertEquals(1, ConvertRomanToNumber.convertStringToNumber("I"));
    }


}
