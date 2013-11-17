package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.gameplay;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractToken;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.playboard.PlayboardTicTacToe;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Locatable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenType;

public class Gameplay {

    public Gameplay() {
     
    }
    
    public boolean isValidMove(PlayboardTicTacToe pPlayboard, Identifier pIdentifier) {
        return ((AbstractToken)pPlayboard.getField(pIdentifier).getToken()).getType().equals(TokenType.Type.BLANK);
    }
    
    public boolean isFinishingMove(Playboard pPlayboard, Identifier pIdentifier, Player pPlayer) {
        return pPlayboard.getField(pIdentifier).;
    }
    
    
    
}
