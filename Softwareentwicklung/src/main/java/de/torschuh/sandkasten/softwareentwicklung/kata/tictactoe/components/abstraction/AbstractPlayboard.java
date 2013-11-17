package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction;

import java.util.ArrayList;
import java.util.List;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Locatable.Identifier;

/**
 * Represents a playground for a TicTacToe game.
 * 
 * @author Torsten
 *
 */
public abstract class AbstractPlayboard implements Playboard {

    /**
     * List with fields of the playboard.
     */
    private List<Field> fields = new ArrayList<Field>();
    
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
    public final void addField(final Field pField) {
        this.fields.add(pField);
    }

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard
     *      #getField(de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field)
     */
    @Override
    public final Field getField(final Identifier pIdentifier) {
        for (Field field : fields) {
            if (((AbstractField) field).getIdentifier().equals(pIdentifier)) {
                return field;
            }
        }
        return null;
    }
    
}
