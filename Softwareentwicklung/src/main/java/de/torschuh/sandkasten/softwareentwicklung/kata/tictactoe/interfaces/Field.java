package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces;


/**
 * Field
 * 
 * Interface for a playboardfield.
 * 
 * @author Torsten
 *
 */
public interface Field {

    /**
     * Returns the set token.
     * 
     * @return Token set token of the field
     */
    Token getToken();

    /**
     * Sets the token of the field.
     * 
     * @param token token to set 
     */
    void setToken(Token token);
    
}
