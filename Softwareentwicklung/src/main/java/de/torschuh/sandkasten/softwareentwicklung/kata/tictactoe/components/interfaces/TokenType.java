package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces;


/**
 * Interface to add the types to a token.
 * 
 * @author Torsten
 *
 */
public interface TokenType {
    
    /**
     * Type enumeration of the available tokens. 
     */
    static enum Type { BLANK, CROSS, CIRCLE };
    
    /**
     * Returns the type of the token.
     * 
     * @return Type of the token
     */
    Type getType();
    
}
