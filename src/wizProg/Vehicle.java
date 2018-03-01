package wizProg;

public class Vehicle {

	Point curPosition, finPosition;
	int numRide;
	
	public Vehicle() {
		curPosition.setX(0);
		curPosition.setY(0);
		numRide=0;
	}

	public Point getCurPosition() {
		return curPosition;
	}

	public void setCurPosition(Point curPosition) {
		this.curPosition = curPosition;
	}

	public Point getFinPosition() {
		return finPosition;
	}

	public void setFinPosition(Point finPosition) {
		this.finPosition = finPosition;
	}

	public int getNumRide() {
		return numRide;
	}

	public void setNumRide(int numRide) {
		this.numRide = numRide;
	}
	
	
	
}
