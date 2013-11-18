package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.game;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractField;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractToken;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToePlayboard;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToeToken;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Field;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.FieldIdentifiable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.Token;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenTypeable;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.TokenTypeable.Type;

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
    
    public boolean moveComputer(TicTacToePlayboard pPlayboard, AbstractToken pToken) {      
        
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
            AbstractToken tokenOpponent = new TicTacToeToken(Type.CIRCLE, TicTacToeToken.TOKEN_CIRCLE);
            if (pToken.getType().equals(TokenTypeable.Type.CIRCLE)) {
                tokenOpponent = new TicTacToeToken(Type.CROSS, TicTacToeToken.TOKEN_CROSS);
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
        if (((AbstractToken) pPlayboard.getField(Identifier.B2).getToken()).getType().equals(TokenTypeable.Type.BLANK)) {
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
    
    public boolean moveHuman(TicTacToePlayboard pPlayboard, AbstractToken pToken, Identifier pIdentifier) {
        if (isValidMove(pPlayboard, pIdentifier)) {
            pPlayboard.getField(pIdentifier).setToken(pToken);
            if (isFinishingMove(pPlayboard, pIdentifier, pToken)) {
                this.isFinishedGame = true;
            }
            return true;
        }
        return false;
    }
    
    public boolean isValidMove(final TicTacToePlayboard pPlayboard, final Identifier pIdentifier) {
        return ((AbstractToken) pPlayboard.getField(pIdentifier).getToken()).getType().equals(Type.BLANK);
    }
    
    public boolean hasBlankFields(final TicTacToePlayboard pPlayboard) {
        for (Field field : pPlayboard.getFields()) {
            if (field.getToken().getTokenName().equals(TicTacToeToken.TOKEN_BLANK)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isFinishingMove(final TicTacToePlayboard pPlayboard, final Identifier pIdentifier, final AbstractToken pToken) {
        return Rules.isSameTokenA1A2A3(pPlayboard, pToken.getType()) || Rules.isSameTokenA1B1C1(pPlayboard, pToken.getType())
                || Rules.isSameTokenA1B2C3(pPlayboard, pToken.getType()) || Rules.isSameTokenA2B2C2(pPlayboard, pToken.getType())
                || Rules.isSameTokenA3B3C3(pPlayboard, pToken.getType()) || Rules.isSameTokenB1B2B3(pPlayboard, pToken.getType())
                || Rules.isSameTokenC1B2A3(pPlayboard, pToken.getType()) || Rules.isSameTokenC1C2C3(pPlayboard, pToken.getType());
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
