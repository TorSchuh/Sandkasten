package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces;

import java.util.Map;

/**
 * Interface to add the ability to handle neighbouring fields.
 * 
 * @author Torsten
 *
 */
public interface Neighbours {

    static enum Direction {N, NE, E, SE, S, SW, W, NW};
    
    Map<Direction, Field> getNeighbours();
    
    void addNeighbour(Direction direction, Field neighbour);
    
    void replaceNeighbour(Direction direction, Field neighbour);
    
}
