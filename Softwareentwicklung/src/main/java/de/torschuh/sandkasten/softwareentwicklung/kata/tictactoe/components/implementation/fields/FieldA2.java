package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenBlank;

/**
 * Implementation for field A2.
 * 
 * @author Torsten
 *
 */
public class FieldA2 extends AbstractField {

    /**
     * Creates fieldA2 with a blank token and the identifier A2.
     * 
     * @param pToken
     * @param pIdentifier
     */
    public FieldA2() {
        super(new TokenBlank(), Identifier.A2);
    }

}
