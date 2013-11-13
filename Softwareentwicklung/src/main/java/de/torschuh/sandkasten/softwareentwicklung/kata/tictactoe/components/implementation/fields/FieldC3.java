package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenBlank;

/**
 * Implementation for field C3.
 * 
 * @author Torsten
 *
 */
public class FieldC3 extends AbstractField {

    /**
     * Creates fieldC3 with a blank token and the identifier C3.
     * 
     * @param pToken
     * @param pIdentifier
     */
    public FieldC3() {
        super(new TokenBlank(), Identifier.C3);
    }

}
