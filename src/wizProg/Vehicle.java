package wizProg;

public class Vehicle {

	Point curPosition, finPosition;
	int numRide;
	int id;
	static int posID = 0;
	int[] array;
	boolean busy;

	public Vehicle() {
		curPosition.setX(0);
		curPosition.setY(0);
		numRide = 0;
		array = new int[10000];
		id = posID++;
		busy = false;
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
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

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public void putRide(Ride ride) {
		array[array.length] = ride.getId();
	}

	public int getRide() {
		////////////////////////////////////////////
		//           REALIZE THIS                 //
		////////////////////////////////////////////
		return null;
	}
	
}
