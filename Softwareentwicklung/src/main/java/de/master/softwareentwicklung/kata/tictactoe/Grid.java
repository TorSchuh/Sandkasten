package de.master.softwareentwicklung.kata.tictactoe;


import java.util.ArrayList;

import de.master.softwareentwicklung.kata.tictactoe.Cell.POSITION;

public class Grid {

	ArrayList<Cell> gridContent = new ArrayList<Cell>();
	private Cell a1, a2, a3, b1, b2, b3, c1, c2, c3 = null;
		
	public Grid() {		
		init();		
	}
	
	public boolean hasEmptyCell() {		
		for (Cell cell : this.gridContent) {
			if (cell.getType().equals(Cell.TYPE.BLANK)) {
				return true;
			}
		}		
		return false;
	}
	
	public void setCell(Cell cell) {
		for (Cell cellTmp : this.gridContent) {
			if (cellTmp.getPosition().equals(cell.getPosition())) {
				cellTmp = cell;
			}
		}
	}
	
	public Cell getCell(POSITION position) {
		for (Cell cell : this.gridContent) {
			if (cell.getPosition().equals(position)) {
				return cell;
			}
		}
		return null;
	}
	
	private void init() {
		
		this.gridContent.add(a1 = new Cell(Cell.POSITION.a1, Cell.TYPE.BLANK));
		this.gridContent.add(a2 = new Cell(Cell.POSITION.a2, Cell.TYPE.BLANK));
		this.gridContent.add(a3 = new Cell(Cell.POSITION.a3, Cell.TYPE.BLANK));
		this.gridContent.add(b1 = new Cell(Cell.POSITION.b1, Cell.TYPE.BLANK));
		this.gridContent.add(b2 = new Cell(Cell.POSITION.b2, Cell.TYPE.BLANK));
		this.gridContent.add(b3 = new Cell(Cell.POSITION.b3, Cell.TYPE.BLANK));
		this.gridContent.add(c1 = new Cell(Cell.POSITION.c1, Cell.TYPE.BLANK));
		this.gridContent.add(c2 = new Cell(Cell.POSITION.c2, Cell.TYPE.BLANK));
		this.gridContent.add(c3 = new Cell(Cell.POSITION.c3, Cell.TYPE.BLANK));
		
	}
		
	public void print() {
		
		System.out.println("      A     B     C");
		System.out.println("");
		System.out.println("1     "+this.a1.getTypeString()+"  |  "+this.b1.getTypeString()+"  |  "+this.c1.getTypeString()+"  ");
		System.out.println("    -----+-----+-----");
		System.out.println("2     "+this.a2.getTypeString()+"  |  "+this.b2.getTypeString()+"  |  "+this.c2.getTypeString()+"  ");
		System.out.println("    -----+-----+-----");
		System.out.println("3     "+this.a3.getTypeString()+"  |  "+this.b3.getTypeString()+"  |  "+this.c3.getTypeString()+"  ");
		
	}
	
}
