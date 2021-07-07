public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		//System.out.println(square);
		
		boolean isBlack = false;
		int tempRow = square/8;
		if(tempRow%2==0) {
			if(square%2==1)
				isBlack=true;
		}
		else {
			if(square%2==0)
				isBlack=true;
		}
		return isBlack;
	}
}
