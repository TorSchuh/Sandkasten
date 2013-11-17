package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractToken;

/**
 * @author Torsten
 *
 */
public class TokenBlank extends AbstractToken {
        
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.abstraction.AbstractToken#getType()
     */
    @Override
    public final Type getType() {
        return Type.BLANK;
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.abstraction.AbstractToken#getTypeString()
     */
    @Override
    public final String getTypeString() {
        return TOKEN_BLANK;
    }
}
