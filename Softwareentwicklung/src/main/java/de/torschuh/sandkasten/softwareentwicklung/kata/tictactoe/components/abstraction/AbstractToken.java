package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Token;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenType;

/**
 * Represents a token for a TicTacToe playboard.
 * 
 * @author Torsten
 *
 */
public abstract class AbstractToken implements Token, TokenType {
    
    /**
     * Token represents a placeholder.
     */
    public static final String TOKEN_BLANK = "B";
    
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
    public abstract Type getType();

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.
     *      kata.tictactoe.interfaces.Token#getTypeString()
     */
    @Override
    public abstract String getTypeString();
    
}
