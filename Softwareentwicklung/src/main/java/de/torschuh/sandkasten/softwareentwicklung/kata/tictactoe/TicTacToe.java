package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.PlayboardTicTacToe;

/**
 * TicTacToe game.
 * 
 * @author Torsten
 *
 */
public class TicTacToe {

    /**
     * 
     */
    private static boolean endOfGame = false;
    
    /**
     * Starts TicTacToe game.
     * 
     * @param args Parameter for main method
     */
    public static void main(final String[] args) {
        PlayboardTicTacToe playboard = new PlayboardTicTacToe();
        playboard.printPlayboard();
//        do {
//            endOfGame = nextMove(playboard); 
//        } while (endOfGame);
    }
    
}
