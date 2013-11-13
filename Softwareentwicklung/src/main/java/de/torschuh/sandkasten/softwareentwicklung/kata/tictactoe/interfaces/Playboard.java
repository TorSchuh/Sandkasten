package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces;


/**
 * Playboard
 *
 * Interface to implement a playboard with fields.
 * 
 * @author Torsten
 *
 */
interface Playboard {
    
    /**
     * Cleares the playboard.
     */
    void clearPlayboard();
    
    /**
     * Adds a specified field to the playboard.
     * 
     * @param field field to add to the playboard
     */
    void addField(Field field);
    
}
