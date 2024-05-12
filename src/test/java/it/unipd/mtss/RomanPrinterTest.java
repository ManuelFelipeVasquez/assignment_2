package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import it.unipd.mtss.exceptions.RomanConversionException;
import it.unipd.mtss.exceptions.RomanPrintException;

public class RomanPrinterTest {

    static RomanPrinter printer;

    @BeforeClass
    public static void initializePrinter() {
        printer = new RomanPrinter();
    }

    @Test(expected = RomanPrintException.class)
    public void testInvalidNumerals() throws RomanPrintException, RomanConversionException {
        try (MockedStatic<IntegerToRoman> mocked = Mockito.mockStatic(IntegerToRoman.class)) {
            mocked.when(() -> IntegerToRoman.convert(-1)).thenReturn("Z");
            printer.print(-1);
        }
    }

    @Test
    public void testZero() throws RomanPrintException, RomanConversionException {
        int number = 0;
        String expected = "";

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }
    
    @Test
    public void testNumeralOne() throws RomanPrintException, RomanConversionException {
        int number = 1;
        String expected = new String(
            " _____ \n" +
            "|_   _|\n" +
            "  | |  \n" +
            "  | |  \n" +
            " _| |_ \n" +
            "|_____|\n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void testNumeralThree() throws RomanPrintException, RomanConversionException {
        int number = 3;
        String expected = new String(
            " _____  _____  _____ \n"+
            "|_   _||_   _||_   _|\n"+
            "  | |    | |    | |  \n"+
            "  | |    | |    | |  \n"+
            " _| |_  _| |_  _| |_ \n"+
            "|_____||_____||_____|\n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void testNumeralFour() throws RomanPrintException, RomanConversionException {
        int number = 4;
        String expected = new String(
            " _____ __      __\n"+
            "|_   _|\\ \\    / /\n"+
            "  | |   \\ \\  / / \n"+
            "  | |    \\ \\/ /  \n"+
            " _| |_    \\  /   \n"+
            "|_____|    \\/    \n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void testNumeralFive() throws RomanPrintException, RomanConversionException {
        int number = 5;
        String expected = new String(
            "__      __\n"+
            "\\ \\    / /\n"+
            " \\ \\  / / \n"+
            "  \\ \\/ /  \n"+
            "   \\  /   \n"+
            "    \\/    \n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void testNumeralSix() throws RomanPrintException, RomanConversionException {
        int number = 6;
        String expected = new String(
            "__      __ _____ \n"+
            "\\ \\    / /|_   _|\n"+
            " \\ \\  / /   | |  \n"+
            "  \\ \\/ /    | |  \n"+
            "   \\  /    _| |_ \n"+
            "    \\/    |_____|\n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }
}