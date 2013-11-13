package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Token;

/**
 * Represents a token for a TicTacToe playboard.
 * 
 * @author Torsten
 *
 */
public abstract class AbstractToken implements Token {
    
    /**
     * Token represents a placeholder.
     */
    public static final String TOKEN_BLANK = " ";
    
    /**
     * Token represents a circle.
     */
    public static final String TOKEN_CIRCLE = "O";
    
    /**
     * Token represents a cross.
     */
    public static final String TOKEN_CROSS = "X";
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.
     *      kata.tictactoe.interfaces.Token#getType()
     */
    @Override
    public abstract String getType();

}
