package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.game;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractToken;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.playboard.PlayboardTicTacToe;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenCircle;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenCross;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Locatable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Token;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenType;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenType.Type;

public class Gameplay {

    private boolean isComputerNext = false;
    private boolean isFinishedGame = false;
    private String humanTokenTypeSymbol = "";
    
    public Gameplay() {
        this.isComputerNext = isComputerFirst();
    }
    
    public void setComputerNext(boolean pComputerIsNext) {
        this.isComputerNext = pComputerIsNext;
    }
    
    public boolean moveComputer(PlayboardTicTacToe pPlayboard, AbstractToken pToken) {      
        
        // test if computer can win
        for (Field field : pPlayboard.getFields()) {
            AbstractField fieldTmp = (AbstractField) field;
            Token tokenTmp = fieldTmp.getToken();
            if (isValidMove(pPlayboard, fieldTmp.getIdentifier())) {
                fieldTmp.setToken(pToken);
                if (isFinishingMove(pPlayboard, ((AbstractField) field).getIdentifier(), pToken)) {
                    this.isFinishedGame = true;
                    return true;
                }
            }
            fieldTmp.setToken(tokenTmp);
        }
        
        // test if human can win
        for (Field field : pPlayboard.getFields()) {
            AbstractField fieldTmp = (AbstractField) field;
            Token tokenTmp = fieldTmp.getToken();
            AbstractToken tokenOpponent = new TokenCircle();
            if (pToken.getType().equals(TokenType.Type.CIRCLE)) {
                tokenOpponent = new TokenCross();
            }
            if (isValidMove(pPlayboard, fieldTmp.getIdentifier())) {
                fieldTmp.setToken(tokenOpponent);
                if (isFinishingMove(pPlayboard, ((AbstractField) field).getIdentifier(), tokenOpponent)) {
                    fieldTmp.setToken(pToken);
                    return true;
                }
            }
            fieldTmp.setToken(tokenTmp);
        }
        
        // test if center field is empty
        if (((AbstractToken) pPlayboard.getField(Identifier.B2).getToken()).getType().equals(TokenType.Type.BLANK)) {
            pPlayboard.getField(Identifier.B2).setToken(pToken);
            return true;
        }
        
        // choose any/next free field
        for (Field field : pPlayboard.getFields()) {
            AbstractField fieldTmp = (AbstractField) field;
            Token tokenTmp = fieldTmp.getToken();
            if (isValidMove(pPlayboard, fieldTmp.getIdentifier())) {
                fieldTmp.setToken(pToken);
                pPlayboard.getField(fieldTmp.getIdentifier()).setToken(pToken);
                return true;
            }
            fieldTmp.setToken(tokenTmp);
        }
        
        // no empty field
        return false;
    }
    
    public boolean moveHuman(PlayboardTicTacToe pPlayboard, AbstractToken pToken, Identifier pIdentifier) {
        if (isValidMove(pPlayboard, pIdentifier)) {
            pPlayboard.getField(pIdentifier).setToken(pToken);
            if (isFinishingMove(pPlayboard, pIdentifier, pToken)) {
                this.isFinishedGame = true;
            }
            return true;
        }
        return false;
    }
    
    public boolean isValidMove(final PlayboardTicTacToe pPlayboard, final Identifier pIdentifier) {
        return ((AbstractToken) pPlayboard.getField(pIdentifier).getToken()).getType().equals(Type.BLANK);
    }
    
    public boolean hasBlankFields(final PlayboardTicTacToe pPlayboard) {
        for (Field field : pPlayboard.getFields()) {
            if (field.getToken().getTokenName().equals(AbstractToken.TOKEN_BLANK)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isFinishingMove(final PlayboardTicTacToe pPlayboard, final Identifier pIdentifier, final AbstractToken pToken) {
        return Rules.isSameToken_A1_A2_A3(pPlayboard, pToken.getType()) || Rules.isSameToken_A1_B1_C1(pPlayboard, pToken.getType())
                || Rules.isSameToken_A1_B2_C3(pPlayboard, pToken.getType()) || Rules.isSameToken_A2_B2_C2(pPlayboard, pToken.getType())
                || Rules.isSameToken_A3_B3_C3(pPlayboard, pToken.getType()) || Rules.isSameToken_B1_B2_B3(pPlayboard, pToken.getType())
                || Rules.isSameToken_C1_B2_A3(pPlayboard, pToken.getType()) || Rules.isSameToken_C1_C2_C3(pPlayboard, pToken.getType());
    }

    private boolean isComputerFirst() {
        return Math.random()<0.5?true:false;
    }

    public boolean isComputerNext() {
        return this.isComputerNext;
    }
 
    public boolean isFinishedGame() {
        return this.isFinishedGame;
    }
    
}
