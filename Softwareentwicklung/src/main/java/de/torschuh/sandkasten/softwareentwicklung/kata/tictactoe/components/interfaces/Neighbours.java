package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces;

import java.util.Map;

/**
 * Interface to add the ability to handle neighbouring fields.
 * 
 * @author Torsten
 *
 */
public interface Neighbours {

    /**
     * Directions of the neighbouring fileds.
     */
    static enum Direction { N, NE, E, SE, S, SW, W, NW };
    
    /**
     * Map with neighbouring fields and there direction.
     * 
     * @return Map with directions and the according field.
     */
    Map<Direction, Field> getNeighbours();
    
    /**
     * Adds a field with the specified direction.
     * 
     * @param pDirection direction of the field
     * @param pNeighbour the neighbouring field
     */
    void addNeighbour(Direction pDirection, Field pNeighbour);
    
    /**
     * Replaces a specified field.
     * 
     * @param pDirection direction of the requested field
     * @return Field the requested field
     */
    Field getNeighbour(Direction pDirection);
    
}
