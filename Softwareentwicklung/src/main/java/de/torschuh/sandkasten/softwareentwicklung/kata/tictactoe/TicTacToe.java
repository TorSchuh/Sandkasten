package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.interfaces.FieldIdentifiable.Identifier;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.abstraction.AbstractToken;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.TicTacToePlayboard;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenCircle;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.components.implementation.tokens.TokenCross;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.game.Gameplay;

/**
 * TicTacToe game.
 * 
 * @author Torsten
 *
 */
public class TicTacToe {
    
    /**
     * Starts TicTacToe game.
     * 
     * @param args Parameter for main method
     */
    public static void main(String[] args) {
        
        printHeadline();
        
        Gameplay gameplay = new Gameplay(); 
        TicTacToePlayboard playboard = new TicTacToePlayboard();
        String humanTokenTypeSymbol = askForHumanTokenType();
        boolean endOfGame = false;
                
        do {
            playboard.printPlayboard();
            if (gameplay.isComputerNext()) {
               if (gameplay.moveComputer(playboard, getComputerToken(humanTokenTypeSymbol))) {
                   gameplay.setComputerNext(false);
               }
            } else if (!gameplay.isComputerNext()) {
                if (gameplay.moveHuman(playboard, getHumanToken(humanTokenTypeSymbol), askForHumanNextMove(gameplay, playboard))) {
                    gameplay.setComputerNext(true);
                }
            }
            if (!gameplay.hasBlankFields(playboard) || gameplay.isFinishedGame()) {
                if (!gameplay.hasBlankFields(playboard)) {
                    playboard.printPlayboard();
                    System.out.println("#\n#--> DRAWN :|");                
                } else if (gameplay.isFinishedGame()) {
                    playboard.printPlayboard();
                    if (gameplay.isComputerNext()) {
                        System.out.println("#\n#--> YOU WIN :)");
                    } else {
                        System.out.println("#\n#--> YOU LOSE :(");
                    }
                }
                endOfGame = !askForRematch();
                if (!endOfGame) {
                    gameplay = new Gameplay(); 
                    playboard = new TicTacToePlayboard();
                    humanTokenTypeSymbol = askForHumanTokenType();
                }
            }
        } while (!endOfGame);
    }
       
    private static boolean askForRematch() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        boolean inputAccepted = false;
        String decicion = "";
        try {
            do {
                System.out.print("#\n#\n#\n#--> do you want a rematch [y] or [n]? : ");
                decicion = input.readLine().trim().toUpperCase();    
                if (decicion.equals("Y") || decicion.equals("N")) {
                    inputAccepted = true;
                }
            } while (!inputAccepted);
        } catch (IOException e) {
            System.out.println("Error reading user input!");
        }
        return decicion.equals("Y");
    }
    
    private static String askForHumanTokenType() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        boolean symbolAccepted = false;
        String symbol = "";
        try {
            do {
                System.out.print("#\n#\n#--> please choose your symbol ( "+AbstractToken.TOKEN_CIRCLE+" or "+AbstractToken.TOKEN_CROSS+" ) : ");
                symbol = input.readLine().trim().toUpperCase();    
                if (symbol.equals(AbstractToken.TOKEN_CIRCLE) || symbol.equals(AbstractToken.TOKEN_CROSS)) {
                    System.out.print("#\n#\n#    Human: "+getHumanToken(symbol).getTokenName()+"  vs. Computer: "+getComputerToken(symbol).getTokenName()+"\n");
                    symbolAccepted = true;
                }
            } while (!symbolAccepted);
        } catch (IOException e) {
            System.out.println("Error reading user input!");
        }
        
        return symbol;
    }
    
    private static Identifier askForHumanNextMove(Gameplay pGameplay, TicTacToePlayboard pPlayboard) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        boolean identifierAccepted = false;
        String identifier = ""; 
        try {
            do {
                System.out.print("#\n#--> your turn: ");
                identifier = input.readLine().trim().toUpperCase();    
                if (pGameplay.isValidMove(pPlayboard, Identifier.valueOf(identifier))) {
                    identifierAccepted = true;
                }
            } while (!identifierAccepted);
        } catch (IOException e) {
            System.out.println("Error reading user input!");
        }
        return Identifier.valueOf(identifier);
    }
    
    private static AbstractToken getHumanToken(String pHumanTokenTypeSymbol) {
        return pHumanTokenTypeSymbol.equals(AbstractToken.TOKEN_CIRCLE) ? new TokenCircle() : new TokenCross();
    }
    
    private static AbstractToken getComputerToken(String pHumanTokenTypeSymbol) {
        return pHumanTokenTypeSymbol.equals(AbstractToken.TOKEN_CIRCLE) ? new TokenCross() : new TokenCircle();
    }
    
    private static void printHeadline() {
        System.out.print("################################################\n");
        System.out.print("#   _____ _     _____         _____            #\n");
        System.out.print("#  |_   _(_) __|_   _|_ _  __|_   _|__   ___   #\n");
        System.out.print("#    | | | |/ __|| |/ _` |/ __|| |/ _ \\ / _ \\  #\n");
        System.out.print("#    | | | | (__ | | (_| | (__ | | (_) |  __/  #\n");
        System.out.print("#    |_| |_|\\___||_|\\__,_|\\___||_|\\___/ \\___|  #\n");
        System.out.print("#                                              #\n");
        System.out.print("################################################");
    }
    
}
