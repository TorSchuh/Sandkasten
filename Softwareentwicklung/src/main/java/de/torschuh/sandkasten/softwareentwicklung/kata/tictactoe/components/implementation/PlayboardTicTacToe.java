package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractPlayboard;
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
 * @author Torsten
 *
 */
public class PlayboardTicTacToe extends AbstractPlayboard {

    /**
     * Creates TicTacToe playboard withe field and blank tokens.
     */
    public PlayboardTicTacToe() {
        this.addField(new FieldA1());
        this.addField(new FieldA2());
        this.addField(new FieldA3());
        this.addField(new FieldB1());
        this.addField(new FieldB2());
        this.addField(new FieldB3());
        this.addField(new FieldC1());
        this.addField(new FieldC2());
        this.addField(new FieldC3());
    }
    
    /**
     * Prints out the actual playboard.
     */
    public final void printPlayboard() {
        try {
            System.out.println("     A       B       C");
            System.out.println("");
            System.out.println("1     " + this.getField(Locatable.Identifier.A1).getToken().getType() + "  " 
                                + "|" + this.getField(Locatable.Identifier.B1).getToken().getType() + "      |  " 
                                + this.getField(Locatable.Identifier.C1).getToken().getType() + "  ");
            System.out.println("   ----- + ----- + -----");
            System.out.println("2     " + this.getField(Locatable.Identifier.A2).getToken().getType() + "  "
                                + "|" + this.getField(Locatable.Identifier.B2).getToken().getType() + "      |  " 
                                + this.getField(Locatable.Identifier.C2).getToken().getType() + "  ");
            System.out.println("   ----- + ----- + -----");
            System.out.println("3     " + this.getField(Locatable.Identifier.A3).getToken().getType() + "  "
                                + "|" + this.getField(Locatable.Identifier.B3).getToken().getType() + "      |  " 
                                + this.getField(Locatable.Identifier.C3).getToken().getType() + "  ");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
