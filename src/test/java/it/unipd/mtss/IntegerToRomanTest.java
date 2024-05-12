package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import it.unipd.mtss.exceptions.RomanConversionException;

public class IntegerToRomanTest {
    static IntegerToRoman converter = null;

    @BeforeClass
    public static void initializeConverter() {
        converter = new IntegerToRoman();
    }

    @Test(expected = RomanConversionException.class)
    public void testNegativeNumbers() throws RomanConversionException {
        int arabic_number = -1;

        converter.convert(arabic_number);
    }

    @Test(expected = RomanConversionException.class)
    public void testNumberOverLimit() throws RomanConversionException {
        int arabic_number = 4000;

        converter.convert(arabic_number);
    }

    @Test
    public void testNumberZero() throws RomanConversionException {
        int arabic_number = 0;
        String expected = "";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberOne() throws RomanConversionException {
        int arabic_number = 1;
        String expected = "I";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberThree() throws RomanConversionException {
        int arabic_number = 3;
        String expected = "III";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberFour() throws RomanConversionException {
        int arabic_number = 4;
        String expected = "IV";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberFive() throws RomanConversionException {
        int arabic_number = 5;
        String expected = "V";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberNine() throws RomanConversionException {
        int arabic_number = 9;
        String expected = "IX";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberTen() throws RomanConversionException {
        int arabic_number = 10;
        String expected = "X";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberFourteen() throws RomanConversionException {
        int arabic_number = 14;
        String expected = "XIV";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }


    @Test
    public void testNumberNineteen() throws RomanConversionException {
        int arabic_number = 19;
        String expected = "XIX";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberTwenty() throws RomanConversionException {
        int arabic_number = 20;
        String expected = "XX";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberFourty() throws RomanConversionException {
        int arabic_number = 40;
        String expected = "XL";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }


    @Test
    public void testNumberFourtyfour() throws RomanConversionException {
        int arabic_number = 44;
        String expected = "XLIV";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberFourtynine() throws RomanConversionException {
        int arabic_number = 49;
        String expected = "XLIX";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberFifthy() throws RomanConversionException {
        int arabic_number = 50;
        String expected = "L";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberFiftyfour() throws RomanConversionException {
        int arabic_number = 54;
        String expected = "LIV";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberFiftynine() throws RomanConversionException {
        int arabic_number = 59;
        String expected = "LIX";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberSixty() throws RomanConversionException {
        int arabic_number = 60;
        String expected = "LX";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberSixtyfour() throws RomanConversionException {
        int arabic_number = 64;
        String expected = "LXIV";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberSixtynine() throws RomanConversionException {
        int arabic_number = 69;
        String expected = "LXIX";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberNinety() throws RomanConversionException {
        int arabic_number = 90;
        String expected = "XC";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberNinetyfour() throws RomanConversionException {
        int arabic_number = 94;
        String expected = "XCIV";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberNinetynine() throws RomanConversionException {
        int arabic_number = 99;
        String expected = "XCIX";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberOneHundred() throws RomanConversionException {
        int arabic_number = 100;
        String expected = "C";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberOneHundredSeventeen() throws RomanConversionException {
        int arabic_number = 117;
        String expected = "CXVII";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberOneHundredNinety() throws RomanConversionException {
        int arabic_number = 190;
        String expected = "CXC";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberFourHundred() throws RomanConversionException {
        int arabic_number = 400;
        String expected = "CD";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberFourHundredSeventynine() throws RomanConversionException {
        int arabic_number = 479;
        String expected = "CDLXXIX";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }

    @Test
    public void testNumberFiveHundred() throws RomanConversionException {
        int arabic_number = 500;
        String expected = "D";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }
}