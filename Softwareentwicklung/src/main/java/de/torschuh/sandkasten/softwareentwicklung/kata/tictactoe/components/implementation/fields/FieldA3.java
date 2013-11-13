package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenBlank;

/**
 * Implementation for field A3.
 * 
 * @author Torsten
 *
 */
public class FieldA3 extends AbstractField {

    /**
     * Creates fieldA3 with a blank token and the identifier A3.
     * 
     * @param pToken
     * @param pIdentifier
     */
    public FieldA3() {
        super(new TokenBlank(), Identifier.A3);
    }

}
