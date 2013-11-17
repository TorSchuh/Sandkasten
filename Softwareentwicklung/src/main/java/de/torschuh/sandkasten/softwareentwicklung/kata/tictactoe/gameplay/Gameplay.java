package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.gameplay;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Locatable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Playboard;

public class Gameplay {

    public Gameplay() {
     
    }
    
    public boolean isValidMove(Playboard pPlayboard, Identifier pIdentifier) {
        return pPlayboard.getField(pIdentifier).getToken();
    }
    
    public boolean isFinishingMove(Playboard pPlayboard, Identifier pIdentifier, Player pPlayer) {
        return pPlayboard.getField(pIdentifier).;
    }
    
    
    
}
