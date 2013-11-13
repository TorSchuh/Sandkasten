package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenBlank;

/**
 * Implementation for field B2.
 * 
 * @author Torsten
 *
 */
public class FieldB2 extends AbstractField {

    /**
     * Creates fieldB2 with a blank token and the identifier B2.
     * 
     * @param pToken
     * @param pIdentifier
     */
    public FieldB2() {
        super(new TokenBlank(), Identifier.B2);
    }

}