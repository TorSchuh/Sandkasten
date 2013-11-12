package de.master.softwareentwicklung.kata.tictactoe;


public class Cell {
	
	public enum TYPE {CIRCLE, CROSS, BLANK};
	public enum POSITION {a1, a2, a3, b1, b2, b3, c1, c2, c3};
	
	private POSITION position;
	private TYPE type;
	
	public Cell(POSITION position, TYPE type) {		
		this.position = position;
		this.type = type;		
	}

	public TYPE getType() {
		return this.type;
	}

	public String getTypeString() {
		if (this.type.equals(TYPE.CROSS)) {
			return "X";
		} else if (this.type.equals(TYPE.CIRCLE)) {
			return "O";
		} else {
			return " ";
		}
	}
	
	public void setType(TYPE type) {
		this.type = type;
	}

	public POSITION getPosition() {
		return this.position;
	}
	
}
