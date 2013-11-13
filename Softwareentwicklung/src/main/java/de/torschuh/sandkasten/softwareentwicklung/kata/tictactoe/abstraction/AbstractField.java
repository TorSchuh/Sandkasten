package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.abstraction;

import java.util.HashMap;
import java.util.Map;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Locatable;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Token;

/**
 * @author Torsten
 *
 */
public abstract class AbstractField implements Field, Locatable, Neighbours {

    /**
     * Map with all neighbouring fields and there direction.
     */
    private Map<Direction, Field> neighbours;
    
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
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours
     *      #replaceNeighbour(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours.Direction, 
     *      de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field)
     */
    @Override
    public final void replaceNeighbour(final Direction pDirection, final Field pNeighbour) {
        this.neighbours.remove(pDirection);
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
