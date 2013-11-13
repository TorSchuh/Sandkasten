package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenBlank;

/**
 * Implementation for field A1.
 * 
 * @author Torsten
 *
 */
public class FieldA1 extends AbstractField {

    /**
     * Creates fieldA1 with a blank token and the identifier A1.
     * 
     * @param pToken
     * @param pIdentifier
     */
    public FieldA1() {
        super(new TokenBlank(), Identifier.A1);
    }

}
