package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenBlank;

/**
 * Implementation for field C1.
 * 
 * @author Torsten
 *
 */
public class FieldC1 extends AbstractField {

    /**
     * Creates fieldC1 with a blank token and the identifier C1.
     * 
     * @param pToken
     * @param pIdentifier
     */
    public FieldC1() {
        super(new TokenBlank(), Identifier.C1);
    }

}
