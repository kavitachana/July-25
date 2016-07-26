package com.tiy.pt_boat_game;

public class PTBoat {

	private String row;
	private int column;

	public PTBoat(String rowLocation, int columnLocation) {
		
		row = rowLocation;
		column = columnLocation;
		
	}
		public boolean isHit(String row, int column) {
	
		return (this.row.equals(row) && this.column == column);
				
	}
}
