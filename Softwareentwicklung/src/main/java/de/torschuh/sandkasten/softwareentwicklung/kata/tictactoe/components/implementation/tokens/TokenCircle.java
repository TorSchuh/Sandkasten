package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractToken;

/**
 * @author Torsten
 *
 */
public class TokenCircle extends AbstractToken {

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.abstraction.AbstractToken#getType()
     */
    @Override
    public final Type getType() {
        return Type.CIRCLE;
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.abstraction.AbstractToken#getTypeString()
     */
    @Override
    public final String getTokenName() {
        return TOKEN_CIRCLE;
    }
}
