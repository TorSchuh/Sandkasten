package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.game;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractToken;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToePlayboard;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.FieldIdentifiable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenTypeable.Type;

public class Rules {
    
    public static boolean isSameToken_A1_A2_A3(TicTacToePlayboard pPlayboard, Type pTokenType) {
        return ((AbstractToken) pPlayboard.getField(Identifier.A1).getToken()).getType().equals(pTokenType) 
                && ((AbstractToken) pPlayboard.getField(Identifier.A2).getToken()).getType().equals(pTokenType)
                && ((AbstractToken) pPlayboard.getField(Identifier.A3).getToken()).getType().equals(pTokenType);
    }
        
    public static boolean isSameToken_A1_B1_C1(TicTacToePlayboard pPlayboard, Type pTokenType) {
        return ((AbstractToken) pPlayboard.getField(Identifier.A1).getToken()).getType().equals(pTokenType) 
                && ((AbstractToken) pPlayboard.getField(Identifier.B1).getToken()).getType().equals(pTokenType)
                && ((AbstractToken) pPlayboard.getField(Identifier.C1).getToken()).getType().equals(pTokenType);
    }
    
    public static boolean isSameToken_A1_B2_C3(TicTacToePlayboard pPlayboard, Type pTokenType) {
        return ((AbstractToken) pPlayboard.getField(Identifier.A1).getToken()).getType().equals(pTokenType) 
                && ((AbstractToken) pPlayboard.getField(Identifier.B2).getToken()).getType().equals(pTokenType)
                && ((AbstractToken) pPlayboard.getField(Identifier.C3).getToken()).getType().equals(pTokenType);
    }
    
    public static boolean isSameToken_A2_B2_C2(TicTacToePlayboard pPlayboard, Type pTokenType) {
        return ((AbstractToken) pPlayboard.getField(Identifier.A2).getToken()).getType().equals(pTokenType) 
                && ((AbstractToken) pPlayboard.getField(Identifier.B2).getToken()).getType().equals(pTokenType)
                && ((AbstractToken) pPlayboard.getField(Identifier.C2).getToken()).getType().equals(pTokenType);
    }
    
    public static boolean isSameToken_A3_B3_C3(TicTacToePlayboard pPlayboard, Type pTokenType) {
        return ((AbstractToken) pPlayboard.getField(Identifier.A3).getToken()).getType().equals(pTokenType) 
                && ((AbstractToken) pPlayboard.getField(Identifier.B3).getToken()).getType().equals(pTokenType)
                && ((AbstractToken) pPlayboard.getField(Identifier.C3).getToken()).getType().equals(pTokenType);
    }
    
    public static boolean isSameToken_B1_B2_B3(TicTacToePlayboard pPlayboard, Type pTokenType) {
        return ((AbstractToken) pPlayboard.getField(Identifier.B1).getToken()).getType().equals(pTokenType) 
                && ((AbstractToken) pPlayboard.getField(Identifier.B2).getToken()).getType().equals(pTokenType)
                && ((AbstractToken) pPlayboard.getField(Identifier.B3).getToken()).getType().equals(pTokenType);
    }
    
    public static boolean isSameToken_C1_C2_C3(TicTacToePlayboard pPlayboard, Type pTokenType) {
        return ((AbstractToken) pPlayboard.getField(Identifier.C1).getToken()).getType().equals(pTokenType) 
                && ((AbstractToken) pPlayboard.getField(Identifier.C2).getToken()).getType().equals(pTokenType)
                && ((AbstractToken) pPlayboard.getField(Identifier.C3).getToken()).getType().equals(pTokenType);
    }

    public static boolean isSameToken_C1_B2_A3(TicTacToePlayboard pPlayboard, Type pTokenType) {
        return ((AbstractToken) pPlayboard.getField(Identifier.C1).getToken()).getType().equals(pTokenType) 
                && ((AbstractToken) pPlayboard.getField(Identifier.B2).getToken()).getType().equals(pTokenType)
                && ((AbstractToken) pPlayboard.getField(Identifier.A3).getToken()).getType().equals(pTokenType);
    }
    
}
