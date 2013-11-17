package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.playboard;

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
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Identifiable.Identifier;;

/**
 * Implementation for TicTacToe playboard.
 * 
 * @author Torsten
 *
 */
public class PlayboardTicTacToe extends AbstractPlayboard {

    /**
     * Creates TicTacToe playboard withe field and blank tokens.
     */
    public PlayboardTicTacToe() {        
        this.addField(Identifier.A1, new FieldA1());
        this.addField(Identifier.A2, new FieldA2());
        this.addField(Identifier.A3, new FieldA3());
        this.addField(Identifier.B1, new FieldB1());
        this.addField(Identifier.B2, new FieldB2());
        this.addField(Identifier.B3, new FieldB3());
        this.addField(Identifier.C1, new FieldC1());
        this.addField(Identifier.C2, new FieldC2());
        this.addField(Identifier.C3, new FieldC3());       
    }
    
    /**
     * Prints out the actual playboard.
     */
    public final void printPlayboard() {
        System.out.println("#\n#");
        System.out.println("#         A       B       C");
        System.out.println("#    ");
        System.out.println("#    1    " + this.getField(Identifier.A1).getToken().getTokenName() + "   " 
                            + "|   " + this.getField(Identifier.B1).getToken().getTokenName() + "   |   " 
                            + this.getField(Identifier.C1).getToken().getTokenName() + "  ");
        System.out.println("#       ----- + ----- + -----");
        System.out.println("#    2    " + this.getField(Identifier.A2).getToken().getTokenName() + "   " 
                + "|   " + this.getField(Identifier.B2).getToken().getTokenName() + "   |   " 
                + this.getField(Identifier.C2).getToken().getTokenName() + "  ");
        System.out.println("#       ----- + ----- + -----");
        System.out.println("#    3    " + this.getField(Identifier.A3).getToken().getTokenName() + "   " 
                + "|   " + this.getField(Identifier.B3).getToken().getTokenName() + "   |   " 
                + this.getField(Identifier.C3).getToken().getTokenName() + "  ");
        System.out.println("#\n#");
    }
    
}
