package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenBlank;

/**
 * Implementation for field C2.
 * 
 * @author Torsten
 *
 */
public class FieldC2 extends AbstractField {

    /**
     * Creates fieldC2 with a blank token and the identifier C2.
     * 
     * @param pToken
     * @param pIdentifier
     */
    public FieldC2() {
        super(new TokenBlank(), Identifier.C2);
    }

}
