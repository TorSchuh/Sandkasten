package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction;

import java.util.HashMap;
import java.util.Map;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Locatable;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Neighbours;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Token;

/**
 * Represents a field on a TicTacToe playboard.
 * 
 * @author Torsten
 *
 */
public abstract class AbstractField implements Field, Locatable, Neighbours {

    /**
     * Map with all neighbouring fields and there direction.
     */
    private final Map<Direction, Field> neighbours;
    
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
        this.neighbours = new HashMap<Neighbours.Direction, Field>();
        this.token = pToken;
        this.identifier = pIdentifier;
    }
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours#getNeighbours()
     */
    @Override
    public final Map<Direction, Field> getNeighbours() {
        return this.neighbours;
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours
     *      #addNeighbour(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field, 
     *      de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours.Direction)
     */
    @Override
    public final void addNeighbour(final Direction pDirection, final Field pNeighbour) {
        this.neighbours.put(pDirection, pNeighbour);
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Locatable#getNeighbour( 
     *      de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours.Direction)
     */
    @Override
    public final Field getNeighbour(final Direction pDirection) {
        return this.neighbours.get(pDirection);
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
