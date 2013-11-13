package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenBlank;

/**
 * Implementation for field B3.
 * 
 * @author Torsten
 *
 */
public class FieldB3 extends AbstractField {

    /**
     * Creates fieldB3 with a blank token and the identifier B3.
     * 
     * @param pToken
     * @param pIdentifier
     */
    public FieldB3() {
        super(new TokenBlank(), Identifier.B3);
    }

}
