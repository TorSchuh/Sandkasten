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
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Neighbours.Direction;

/**
 * @author Torsten
 *
 */
public class PlayboardTicTacToe extends AbstractPlayboard {

    /**
     * Creates TicTacToe playboard withe field and blank tokens.
     */
    public PlayboardTicTacToe() {
        
        // create fields
        FieldA1 a1 = new FieldA1();
        FieldA2 a2 = new FieldA2();
        FieldA3 a3 = new FieldA3();        
        FieldB1 b1 = new FieldB1();
        FieldB2 b2 = new FieldB2();
        FieldB3 b3 = new FieldB3();        
        FieldC1 c1 = new FieldC1();
        FieldC2 c2 = new FieldC2();
        FieldC3 c3 = new FieldC3();
        
        // add neighbours to field a1
        a1.addNeighbour(Direction.E, b1);
        a1.addNeighbour(Direction.SE, b2);
        a1.addNeighbour(Direction.S, a2);
        
        // add neighbours to field a2
        a2.addNeighbour(Direction.N, a1);
        a2.addNeighbour(Direction.NE, b1);
        a2.addNeighbour(Direction.E, b2);
        a2.addNeighbour(Direction.SE, b3);
        a2.addNeighbour(Direction.S, a3);
        
        // add neighbours to field a3
        a3.addNeighbour(Direction.N, a2);
        a3.addNeighbour(Direction.NE, b2);
        a3.addNeighbour(Direction.E, b3);
        
        // add neighbours to field b1
        b1.addNeighbour(Direction.E, c1);
        b1.addNeighbour(Direction.SE, c2);
        b1.addNeighbour(Direction.S, b2);
        b1.addNeighbour(Direction.W, a1);
        b1.addNeighbour(Direction.SW, a2);
                
        // add neighbours to field b2
        b2.addNeighbour(Direction.N, b1);
        b2.addNeighbour(Direction.NE, c1);
        b2.addNeighbour(Direction.E, c2);
        b2.addNeighbour(Direction.SE, c3);
        b2.addNeighbour(Direction.S, b3);
        b2.addNeighbour(Direction.N, b1);
        b2.addNeighbour(Direction.NW, a1);
        b2.addNeighbour(Direction.W, a2);
        b2.addNeighbour(Direction.SW, a3);
                
        // add neighbours to field b3
        b3.addNeighbour(Direction.N, a2);
        b3.addNeighbour(Direction.NE, b2);
        b3.addNeighbour(Direction.E, b3);
        
        // add neighbours to field c1
        c1.addNeighbour(Direction.W, b1);
        c1.addNeighbour(Direction.SW, b2);
        c1.addNeighbour(Direction.S, c2);
        
        // add neighbours to field c2
        c2.addNeighbour(Direction.N, c1);
        c2.addNeighbour(Direction.NW, b1);
        c2.addNeighbour(Direction.W, b2);
        c2.addNeighbour(Direction.SW, b3);
        c2.addNeighbour(Direction.S, c3);
        
        // add neighbours to field c3
        c3.addNeighbour(Direction.N, c2);
        c3.addNeighbour(Direction.NW, b2);
        c3.addNeighbour(Direction.W, b3);
        
        // add fields to playboard
        this.addField(a1);
        this.addField(a2);
        this.addField(a3);        
        this.addField(b1);
        this.addField(b2);
        this.addField(b3);        
        this.addField(c1);
        this.addField(c2);
        this.addField(c3);
    }
    
    /**
     * Prints out the actual playboard.
     */
    public final void printPlayboard() {
        try {
            System.out.println("     A       B       C");
            System.out.println("");
            System.out.println("1     " + this.getField(Locatable.Identifier.A1).getToken().getTypeString() + "  " 
                                + "|" + this.getField(Locatable.Identifier.B1).getToken().getTypeString() + "      |  " 
                                + this.getField(Locatable.Identifier.C1).getToken().getTypeString() + "  ");
            System.out.println("   ----- + ----- + -----");
            System.out.println("2     " + this.getField(Locatable.Identifier.A2).getToken().getTypeString() + "  "
                                + "|" + this.getField(Locatable.Identifier.B2).getToken().getTypeString() + "      |  " 
                                + this.getField(Locatable.Identifier.C2).getToken().getTypeString() + "  ");
            System.out.println("   ----- + ----- + -----");
            System.out.println("3     " + this.getField(Locatable.Identifier.A3).getToken().getTypeString() + "  "
                                + "|" + this.getField(Locatable.Identifier.B3).getToken().getTypeString() + "      |  " 
                                + this.getField(Locatable.Identifier.C3).getToken().getTypeString() + "  ");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
