package de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.Cell.POSITION;
import de.torschuh.sandkasten.softwareentwicklung.kata.tictactoe.Cell.TYPE;


public class TicTacToe {

	private static TYPE computerCellType = Cell.TYPE.CIRCLE;
	private static TYPE playerCellType = Cell.TYPE.CROSS;
	
	private static Grid grid = new Grid();
	
	private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	private static String inputTmp = "";
	
	private static boolean validMove = false;
	
	public static void main(String[] args) {
		
		boolean gameIsFinished = false;
		boolean playerIsNext = isPlayerFirst();
		boolean newGame = false;
		
		System.out.println("player: X  vs.  computer: O \n");
		grid.print();
		
		while(!gameIsFinished) {
			if (grid.hasEmptyCell()) {
				if (playerIsNext) {
					movePlayer();
					playerIsNext = false;
					if (isFinished(grid, playerCellType)) {
						gameIsFinished = true;
						grid.print();
						System.out.println("\n player wins! press [enter] for a new game ");
						input = new BufferedReader(new InputStreamReader(System.in));
						try {
							if (input.readLine().trim() != null) {
								newGame = true;	
							}
						} catch (IOException e) {
						}
					}
				} else {
					moveComputer();
					playerIsNext = true;
					if (isFinished(grid, computerCellType)) {
						gameIsFinished = true;
						grid.print();
						System.out.println("\n computer wins! press [enter] for a new game ");
						input = new BufferedReader(new InputStreamReader(System.in));
						try {
							if (input.readLine().trim() != null) {
								newGame = true;	
							}
						} catch (IOException e) {
						}
					}
				}
			} else {
				gameIsFinished = true;
			}
			if (!gameIsFinished) {
				grid.print();
			} else if (newGame) {
				gameIsFinished = false;
				playerIsNext = isPlayerFirst();
				newGame = false;
				grid = new Grid();
				System.out.println("\n\n player: X  vs.  computer: O \n");
				grid.print();
			}
		}
		
	}
	
	private static void movePlayer() {
		try {
			do {
				input = new BufferedReader(new InputStreamReader(System.in));
				inputTmp = "";
				validMove = false;
				System.out.println("\n X - player: ");
				inputTmp = input.readLine().trim();
				if (isValidMove(grid, inputTmp)) {
					Cell cellTmp = grid.getCell(POSITION.valueOf(inputTmp));
					cellTmp.setType(playerCellType);
					grid.setCell(cellTmp);
					validMove = true;
				}				
			} while (!validMove);
		} catch (IOException e) {
		}
	}
	
	private static void moveComputer() {
		do {
			validMove = false;
			inputTmp = getComputerMove(grid);
			if (isValidMove(grid, inputTmp)) {
				Cell cellTmp = grid.getCell(POSITION.valueOf(inputTmp));
				cellTmp.setType(computerCellType);
				grid.setCell(cellTmp);
				validMove = true;
				System.out.println("\n O - computer: "+ inputTmp);
			}				
		} while (!validMove);
	}
	
	private static boolean isPlayerFirst() {
		return Math.random()<0.5?true:false;
	}
	
	private static String getComputerMove(Grid grid) {
			for (Cell cell : grid.gridContent) {
				if (isValidMove(grid,cell.getPosition().name())) {
					cell.setType(TYPE.BLANK);
					return cell.getPosition().name();
				}			
			} 
		return null;
	}
		
	private static boolean isValidMove(Grid grid, String position) {
		try {
			if (grid.getCell(POSITION.valueOf(position)).getType().equals(Cell.TYPE.BLANK)) {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	private static boolean isFinished(Grid pGrid, TYPE pCellType) {
		if ( 	(pGrid.getCell(Cell.POSITION.a1).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.a2).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.a3).getType().equals(pCellType)) || 
				(pGrid.getCell(Cell.POSITION.b1).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.b2).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.b3).getType().equals(pCellType)) ||
				(pGrid.getCell(Cell.POSITION.c1).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.c2).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.c3).getType().equals(pCellType)) ||
				(pGrid.getCell(Cell.POSITION.a1).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.b1).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.c1).getType().equals(pCellType)) ||
				(pGrid.getCell(Cell.POSITION.a2).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.b2).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.c2).getType().equals(pCellType)) ||
				(pGrid.getCell(Cell.POSITION.a3).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.b3).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.c3).getType().equals(pCellType)) ||
				(pGrid.getCell(Cell.POSITION.a1).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.b2).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.c3).getType().equals(pCellType)) ||
				(pGrid.getCell(Cell.POSITION.a3).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.b2).getType().equals(pCellType) && pGrid.getCell(Cell.POSITION.c1).getType().equals(pCellType)) ) {
			return true;
		}	
		return false;
	}
	
}
