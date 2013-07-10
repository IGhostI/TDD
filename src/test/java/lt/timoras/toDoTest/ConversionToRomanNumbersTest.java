package lt.timoras.toDoTest;

import lt.timoras.toDo.ConversionToRomanNumbers;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversionToRomanNumbersTest {

    @Test
    public void RomanNumbers() throws Exception {
        assertEquals("1","I", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(1));
        assertEquals("2","II", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(2));
        assertEquals("3","III", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(3));
        assertEquals("4","IV", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(4));
        assertEquals("5","V", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(5));
        assertEquals("6","VI", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(6));
        assertEquals("7","VII", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(7));
        assertEquals("8","VIII", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(8));
        assertEquals("9","IX", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(9));
        assertEquals("10","X", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(10));
        assertEquals("11","XI", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(11));
        assertEquals("999","CMXCIX", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(999));
        assertEquals("3000","MMM", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(3000));
        assertEquals("3001","MMMI", ConversionToRomanNumbers.getRomanNumberFromSequanceAtIndex(3001));
    }

}