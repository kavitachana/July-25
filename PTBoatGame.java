package com.tiy.pt_boat_game;

public class PTBoatGame {

	private PTBoat[] ptBoats = new PTBoat[6];
	private int numberOfBoats = 0;

	public PTBoatGame() {

	}

	public void addBoat(String row, int column) {

		ptBoats[numberOfBoats] = new PTBoat(row, column);
	}

	public boolean guess(String row, int column) {
		
		boolean isHit = false;

		for (int i = 0; i < 6 && !isHit; i++) {
			isHit = ptBoats[i].isHit(row, column);
		}

		if(isHit)
			System.out.println("Hit!");
		else
			System.out.println("Missed!");

		return isHit;
	

	}

	public static void main(String[] args)
	{
	    PTBoatGame game1 = new PTBoatGame();		
	    game1.addBoat("A", 2);
	    game1.addBoat("D", 4);
	    game1.addBoat("H", 10);
	    game1.addBoat("B", 3);
	    game1.addBoat("F", 8);
	    game1.addBoat("E", 5);
	    
	    
	    game1.guess("F", 5);
	    game1.guess("A", 9);
	    game1.guess("B", 3);
	    game1.guess("C", 4);
	    game1.guess("D", 1);
	    game1.guess("E", 10);
	    	    	        
	}

}
