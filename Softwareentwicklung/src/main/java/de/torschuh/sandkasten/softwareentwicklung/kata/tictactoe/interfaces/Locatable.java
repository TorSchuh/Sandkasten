package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.interfaces;


/**
 * Interface to add the ability to locate a field.
 * 
 * @author Torsten
 *
 */
public interface Locatable {
    
    static enum Identifier { A1, A2, A3, B1, B2, B3, C1, C2, C3 };
    
    Identifier getIdentifier();
    
}
