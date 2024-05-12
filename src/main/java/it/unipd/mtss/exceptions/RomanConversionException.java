////////////////////////////////////////////////////////////////////
// MANUEL FELIPE VASQUEZ 2074625
// FRANCESCO SAVIO 2085846
////////////////////////////////////////////////////////////////////
package it.unipd.mtss.exceptions;

public class RomanConversionException extends Exception {
    public RomanConversionException(int limit) {
        super(String.format("Error: Could not rappresent number higher than %d in roman numerals.", limit));
    }
}