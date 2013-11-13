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
     */
    void addField();
    
    /**
     * Deletes an existing field from the playboard.
     * 
     * @param fieldId id of the field 
     */    
    void removeField(String fieldId);
    
    /**
     * Returns an existing field.
     * 
     * @param fieldId id of the field  
     * @return field with given id
     */
    Object getField(String fieldId);
    
    /**
     * Sets an existing field with the given id.
     * 
     * @param fieldId id of the field
     * @param field new field object
     */
    void setField(String fieldId, Object field);
    
}
