/**
 * 
 */
package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractToken;

/**
 * @author Torsten
 *
 */
public class TokenBlank extends AbstractToken {
        
    /* (non-Javadoc)
     * @see de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.abstraction.AbstractToken#getType()
     */
    @Override
    public final String getType() {
        return TOKEN_BLANK;
    }

}
