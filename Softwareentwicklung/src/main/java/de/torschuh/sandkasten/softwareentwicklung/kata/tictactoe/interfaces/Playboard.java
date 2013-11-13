package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces;

/**
 * Playboard
 *
 * Interface to create/modify/delete a playboard with fields.
 * 
 * @author Torsten
 *
 */
interface Playboard {
    
    /**
     * Creates a playboard.
     */
    void createPlayboard();
    
    /**
     * Deletes a playboard.
     */
    void deletePlayboard();
    
    /**
     * Adds an specified field to the playboard.
     */
    void addField();
    
    /**
     * Deletes an specified field from the playboard.
     * 
     * @param id id of the field 
     */    
    void removeField(int id);
    
    /**
     * Returns an specified field.
     * 
     * @param id id of the field  
     * @return field with given id
     */
    Object getField(int id);
    
    /**
     * Sets a field with the given id.
     * 
     * @param id id of the field
     * @param field new field object
     */
    void setField(int id, Object field);
    
}
