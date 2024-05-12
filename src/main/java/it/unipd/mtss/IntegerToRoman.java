////////////////////////////////////////////////////////////////////
// MANUEL FELIPE VASQUEZ 2074625
// FRANCESCO SAVIO 2085846
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import it.unipd.mtss.exceptions.RomanConversionException;

public class IntegerToRoman {
    public static String convert(int number) throws RomanConversionException {
        if (number < 0 || number > 3) {
            throw new RomanConversionException(3);
        }

        StringBuilder romanNumber = new StringBuilder("");

        while (number > 0) {
            romanNumber.append('I');
            number -= 1;
        }

        return romanNumber.toString();
    }
}