////////////////////////////////////////////////////////////////////
// MANUEL FELIPE VASQUEZ 2074625
// FRANCESCO SAVIO 2085846
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.HashMap;

import it.unipd.mtss.exceptions.RomanConversionException;
import it.unipd.mtss.exceptions.RomanPrintException;

public class RomanPrinter {    
    private static HashMap<Character, String[]> letters = new HashMap<Character, String[]>();
   
    static {
        letters.put('I', new String[] { 
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|" 
        });

        letters.put('V', new String[] {               
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    "
        });

        letters.put('X', new String[] {
           "__   __",
           "\\ \\ / /",
           " \\ V / ",
           "  > <  ",
           " / . \\ ",
           "/_/ \\_\\"
        });

        letters.put('L', new String[] {
           " _      ",  
           "| |     ",
           "| |     ",
           "| |     ",
           "| |____ ",
           "|______|"
        });

        letters.put('C', new String[] {
            "  _____ ", 
            " / ____|",
            "| |     ",
            "| |     ",
            "| |____ ",
            " \\_____|"
        });

        letters.put('D', new String[] {
           " _____  ",
           "|  __ \\ ",
           "| |  | |",
           "| |  | |",
           "| |__| |",
           "|_____/ "
        });

        letters.put('M', new String[] {
           " __  __ " ,
           "|  \\/  |",
           "| \\  / |",
           "| |\\/| |",
           "| |  | |",
           "|_|  |_|"
        });
    }
                
    public static String print(int num) throws RomanPrintException, RomanConversionException {
        return printAsciiArt(IntegerToRoman.convert(num));
    }
 
    private static String printAsciiArt(String romanNumber) throws RomanPrintException {
        if (romanNumber.length() == 0) {
            return "";
        }

        StringBuilder romanAsciiArt = new StringBuilder();

        for (int i = 0; i < 6; i++) {   
            for (int j=0; j < romanNumber.length(); j++) {
                char c = romanNumber.charAt(j);
                
                if (!letters.containsKey(c)) {
                    throw new RomanPrintException();
                }

                romanAsciiArt.append(letters.get(c)[i]);
            }
            romanAsciiArt.append("\n");
        }
        return romanAsciiArt.toString();
    }
}