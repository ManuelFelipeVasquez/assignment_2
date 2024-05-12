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
    public void testNumeral1() throws RomanPrintException, RomanConversionException {
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
    public void testNumeral3() throws RomanPrintException, RomanConversionException {
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
    public void testNumeral4() throws RomanPrintException, RomanConversionException {
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
    public void testNumeral5() throws RomanPrintException, RomanConversionException {
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
    public void testNumeral6() throws RomanPrintException, RomanConversionException {
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

    @Test
    public void testNumeral9() throws RomanPrintException, RomanConversionException {
        int number = 9;
        String expected = new String(
            " _____ __   __\n"+
            "|_   _|\\ \\ / /\n"+
            "  | |   \\ V / \n"+
            "  | |    > <  \n"+
            " _| |_  / . \\ \n"+
            "|_____|/_/ \\_\\\n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void testNumeral10() throws RomanPrintException, RomanConversionException {
        int number = 10;
        String expected = new String(
            "__   __\n"+
            "\\ \\ / /\n"+
            " \\ V / \n"+
            "  > <  \n"+
            " / . \\ \n"+
            "/_/ \\_\\\n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void testNumeral20() throws RomanPrintException, RomanConversionException {
        int number = 20;
        String expected = new String(
            "__   ____   __\n"+
            "\\ \\ / /\\ \\ / /\n"+
            " \\ V /  \\ V / \n"+
            "  > <    > <  \n"+
            " / . \\  / . \\ \n"+
            "/_/ \\_\\/_/ \\_\\\n"
        );
 
        String result = RomanPrinter.print(number);
 
        assertEquals(expected, result);
    }

    @Test
    public void testNumeral40() throws RomanPrintException, RomanConversionException {
        int number = 40;
        String expected = new String(
            "__   __ _      \n"+ 
            "\\ \\ / /| |     \n"+
            " \\ V / | |     \n"+
            "  > <  | |     \n"+
            " / . \\ | |____ \n"+
            "/_/ \\_\\|______|\n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void testNumeral50() throws RomanPrintException, RomanConversionException {
        int number = 50;
        String expected = new String(
            " _      \n"+  
            "| |     \n"+
            "| |     \n"+
            "| |     \n"+
            "| |____ \n"+
            "|______|\n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void testNumeral90() throws RomanPrintException, RomanConversionException {
        int number = 90;
        String expected = new String(
            "__   __  _____ \n"+
            "\\ \\ / / / ____|\n"+
            " \\ V / | |     \n"+
            "  > <  | |     \n"+
            " / . \\ | |____ \n"+
            "/_/ \\_\\ \\_____|\n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void testNumeral100() throws RomanPrintException, RomanConversionException {
        int number = 100;
        String expected = new String(
            "  _____ \n"+
            " / ____|\n"+
            "| |     \n"+
            "| |     \n"+
            "| |____ \n"+
            " \\_____|\n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void testNumeral400() throws RomanPrintException, RomanConversionException {
        int number = 400;
        String expected = new String(
            "  _____  _____  \n"+ 
            " / ____||  __ \\ \n"+
            "| |     | |  | |\n"+
            "| |     | |  | |\n"+
            "| |____ | |__| |\n"+
            " \\_____||_____/ \n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }

    @Test
    public void testNumeral500() throws RomanPrintException, RomanConversionException {
        int number = 500;
        String expected = new String(
            " _____  \n"+
            "|  __ \\ \n"+
            "| |  | |\n"+
            "| |  | |\n"+
            "| |__| |\n"+
            "|_____/ \n"
        );

        String result = RomanPrinter.print(number);

        assertEquals(expected, result);
    }
}