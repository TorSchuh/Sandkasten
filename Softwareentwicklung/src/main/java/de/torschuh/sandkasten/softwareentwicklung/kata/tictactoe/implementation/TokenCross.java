/**
 * 
 */
package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.implementation;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.abstraction.AbstractToken;

/**
 * @author Torsten
 *
 */
public class TokenCross extends AbstractToken {

    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.abstraction.AbstractToken#getType()
     */
    @Override
    public final String getType() {
        return TOKEN_CROSS;
    }

}
