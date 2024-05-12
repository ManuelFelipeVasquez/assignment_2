////////////////////////////////////////////////////////////////////
// MANUEL FELIPE VASQUEZ 2074625
// FRANCESCO SAVIO 2085846
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.TreeMap;

import it.unipd.mtss.exceptions.RomanConversionException;

public class IntegerToRoman {
    private static final TreeMap<Integer, String> ROMAN_NUMERALS = new TreeMap<>();

    static {
        ROMAN_NUMERALS.put(1, "I");
        ROMAN_NUMERALS.put(4, "IV");
        ROMAN_NUMERALS.put(5, "V");
        ROMAN_NUMERALS.put(9, "IX");
        ROMAN_NUMERALS.put(10, "X");        
    }
 
    public static String convert(int number) throws RomanConversionException {
        if (number < 0 || number > 20) {
            throw new RomanConversionException(20);
        }
 
        StringBuilder romanNumber = new StringBuilder("");
 
        while (number > 0) {
            romanNumber.append(ROMAN_NUMERALS.get(ROMAN_NUMERALS.floorKey(number)));
            number -= ROMAN_NUMERALS.floorKey(number);
        }
 
        return romanNumber.toString();
    }
}