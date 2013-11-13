package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenBlank;

/**
 * Implementation for field B1.
 * 
 * @author Torsten
 *
 */
public class FieldB1 extends AbstractField {

    /**
     * Creates fieldB1 with a blank token and the identifier B1.
     * 
     * @param pToken
     * @param pIdentifier
     */
    public FieldB1() {
        super(new TokenBlank(), Identifier.B1);
    }

}
