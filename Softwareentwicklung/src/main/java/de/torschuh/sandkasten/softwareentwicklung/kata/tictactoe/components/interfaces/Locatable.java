package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces;


/**
 * Interface to add the ability to locate a field.
 * 
 * @author Torsten
 *
 */
public interface Locatable {
    
    /**
     * Identifier enumeration of the available locations. 
     */
    static enum Identifier { A1, A2, A3, B1, B2, B3, C1, C2, C3 };
    
    /**
     * Returns the identifier of the field.
     * 
     * @return Identifier location of the field
     */
    Identifier getIdentifier();
    
}
