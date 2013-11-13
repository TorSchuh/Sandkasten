package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces;

/**
 * Field
 * 
 * Interface to flexible implement a playboardfield.
 * 
 * @author Torsten
 *
 */
public interface Field {
    
    /**
     * Adds a property to the field.
     * 
     * @param propertyId id of the property
     * @param propertyValue value of the property
     */
    void addProperty(String propertyId, String propertyValue);
    
    /**
     * Sets an existing property.
     *  
     * @param propertyId id of the property
     * @param propertyValue value of the property
     */
    void setProperty(String propertyId, String propertyValue);
    
    /**
     * Removes an existing field.
     * 
     * @param propertyId id of the property
     */
    void removeProperty(String propertyId);
    
    /**
     * Clears the properties.
     */
    void clearProperties();
    
    /**
     * Return id and value of an existing field.
     * 
     * @param propertyId id of the property
     * @return id and value of the field
     */
    String[] getProperty(String propertyId);
    
    /**
     * 
     * @param propertyId id of the property
     * @return 'true', if the property exists - else 'false'
     */
    boolean hasProperty(String propertyId);
        
}
