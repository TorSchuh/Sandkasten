package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction;

import java.util.HashMap;
import java.util.Map;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Locatable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard;

/**
 * Represents a playground for a TicTacToe game.
 * 
 * @author Torsten
 *
 */
public abstract class AbstractPlayboard implements Playboard {

    /**
     * Map with all neighbouring fields and there direction.
     */
    private final Map<Identifier, Field> fields = new HashMap<Identifier, Field>();
    
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard#clearPlayboard()
     */
    @Override
    public final void clearPlayboard() {
        this.fields.clear();
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard
     *      #addField(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field)
     */
    @Override
    public final void addField(final Identifier pIdentifier, final Field pField) {
        this.fields.put(pIdentifier, pField);
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard
     *      #getField(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field)
     */
    @Override
    public final Field getField(final Identifier pIdentifier) {
        return this.fields.get(pIdentifier);
    }
    
}
