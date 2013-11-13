package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.PlayboardTicTacToe;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields.FieldA1;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields.FieldA2;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields.FieldA3;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields.FieldB1;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields.FieldB2;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields.FieldB3;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields.FieldC1;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields.FieldC2;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.fields.FieldC3;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Locatable;

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
        PlayboardTicTacToe playboard = (PlayboardTicTacToe) initializePlayboard();
        printPlayboard(playboard);
//        do {
//            endOfGame = nextMove(playboard); 
//        } while (endOfGame);
    }

    /**
     * Creates TicTacToe playboard.
     * 
     * @return playboard TicTacToe playboard
     */
    private static PlayboardTicTacToe initializePlayboard() {
        PlayboardTicTacToe playboard = new PlayboardTicTacToe(); 
            playboard.addField(new FieldA1());
            playboard.addField(new FieldA2());
            playboard.addField(new FieldA3());
            playboard.addField(new FieldB1());
            playboard.addField(new FieldB2());
            playboard.addField(new FieldB3());
            playboard.addField(new FieldC1());
            playboard.addField(new FieldC2());
            playboard.addField(new FieldC3());
        return playboard;
    }
    
    /**
     * Prints out the actual playboard.
     * 
     * @param pPlayboard playboard of the TicTacToe game
     */
    private static void printPlayboard(final PlayboardTicTacToe pPlayboard) {
        try {
            System.out.println("     A       B       C");
            System.out.println("");
            System.out.println("1     " + pPlayboard.getField(Locatable.Identifier.A1).getToken().getType() + "  " 
                                + "|" + pPlayboard.getField(Locatable.Identifier.B1).getToken().getType() + "      |  " 
                                + pPlayboard.getField(Locatable.Identifier.C1).getToken().getType() + "  ");
            System.out.println("   ----- + ----- + -----");
            System.out.println("2     " + pPlayboard.getField(Locatable.Identifier.A2).getToken().getType() + "  "
                                + "|" + pPlayboard.getField(Locatable.Identifier.B2).getToken().getType() + "      |  " 
                                + pPlayboard.getField(Locatable.Identifier.C2).getToken().getType() + "  ");
            System.out.println("   ----- + ----- + -----");
            System.out.println("3     " + pPlayboard.getField(Locatable.Identifier.A3).getToken().getType() + "  "
                                + "|" + pPlayboard.getField(Locatable.Identifier.B3).getToken().getType() + "      |  " 
                                + pPlayboard.getField(Locatable.Identifier.C3).getToken().getType() + "  ");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
