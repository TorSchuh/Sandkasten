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

    Map<Direction, Field> neighbours = new HashMap<Neighbours.Direction, Field>();
    Identifier identifier;
    Token token;
    
    public AbstractField(Token token, Identifier identifier) {
        this.neighbours = new HashMap<Neighbours.Direction, Field>();
        this.token = token;
        this.identifier = identifier;
    }
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours#getNeighbours()
     */
    @Override
    public final Map<Direction, Field> getNeighbours() {
        return this.neighbours;
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours#addNeighbour(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field, de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours.Direction)
     */
    @Override
    public void addNeighbour(final Direction direction, final Field neighbour) {
        this.neighbours.put(direction, neighbour);
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours#replaceNeighbour(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Neighbours.Direction, de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field)
     */
    @Override
    public void replaceNeighbour(final Direction direction, final Field neighbour) {
        this.neighbours.remove(direction);
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
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Field#setToken(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces.Token)
     */
    @Override
    public void setToken(final Token token) {
        this.token = token;
    }

}
