public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		

		return cellId%8;
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		return cellId/8;
	}

	public boolean isValidPosition(int cellId) {

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
		
		//check if already there
		if(placedQueens[row][col]) {
			return false;
		}
		//check in same row or column
		for(int i=0;i<8;i++) {
			if(placedQueens[row][i] || placedQueens[i][col])
				return false;
		}
		//check in diagonals
		int tempRow, tempCol;
		tempRow = row+1;
		tempCol = col+1;
		while(tempRow<8 && tempCol<8) {
			if(placedQueens[tempRow++][tempCol++]) {
				return false;
			}
		}
		tempRow = row-1;
		tempCol = col-1;
		while(tempRow>=0 && tempCol>=0) {
			if(placedQueens[tempRow--][tempCol--]) {
				return false;
			}
		}
		tempRow = row+1;
		tempCol = col-1;
		while(tempRow<8 && tempCol>=0) {
			if(placedQueens[tempRow++][tempCol--]) {
				return false;
			}
		}
		tempRow = row-1;
		tempCol = col+1;
		while(tempRow>=0 && tempCol<8) {
			if(placedQueens[tempRow--][tempCol++]) {
				return false;
			}
		}
		placedQueens[row][col]=true;
		numQueens++;
		return true;
	}
}














