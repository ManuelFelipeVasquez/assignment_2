////////////////////////////////////////////////////////////////////
// MANUEL FELIPE VASQUEZ 2074625
// FRANCESCO SAVIO 2085846
////////////////////////////////////////////////////////////////////
package it.unipd.mtss.exceptions;

public class RomanPrintException extends Exception {
    public RomanPrintException() {
        super("Error: Could not print number in roman numerals.");
    }
}