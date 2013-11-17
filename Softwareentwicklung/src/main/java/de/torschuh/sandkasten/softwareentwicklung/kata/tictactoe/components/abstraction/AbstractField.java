package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Locatable;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Token;

/**
 * Represents a field on a TicTacToe playboard.
 * 
 * @author Torsten
 *
 */
public abstract class AbstractField implements Field, Locatable {

    /**
     * Unique identifier of the location.
     */
    private final Identifier identifier;
    
    /**
     * Token on the field.
     */
    private Token token;
    
    /**
     * Standard constructor to create Field.
     * 
     * @param pToken token to set 
     * @param pIdentifier identifier to set
     */
    public AbstractField(final Token pToken, final Identifier pIdentifier) {
        this.token = pToken;
        this.identifier = pIdentifier;
    }
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Locatable#getIdentifier()
     */
    @Override
    public final Identifier getIdentifier() {
        return this.identifier;
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field#getToken()
     */
    @Override
    public final Token getToken() {
        return this.token;
    }
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field
     *      #setToken(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Token)
     */
    @Override
    public final void setToken(final Token pToken) {
        this.token = pToken;
    }

}
