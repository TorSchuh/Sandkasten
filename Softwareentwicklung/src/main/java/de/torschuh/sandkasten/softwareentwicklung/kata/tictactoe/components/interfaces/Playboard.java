package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Locatable.Identifier;


/**
 * Playboard
 *
 * Interface to implement a playboard with fields.
 * 
 * @author Torsten
 *
 */
public interface Playboard {
    
    /**
     * Cleares the playboard.
     */
    void clearPlayboard();
    
    /**
     * Adds a specified field to the playboard.
     * 
     * @param pIdentifier identifier of the field
     * @param pField field to add to the playboard
     */
    void addField(final Identifier pIdentifier, Field pField);
    
    /**
     * Returns field with the specified identifier.
     * 
     * @param pIdentifier 
     * @return Field field with the specified identifier
     */
    Field getField(Identifier pIdentifier);
    
}
