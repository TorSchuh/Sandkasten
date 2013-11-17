package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces;

/**
 * TokenType
 * 
 * Interface to add types to the tokens.
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
