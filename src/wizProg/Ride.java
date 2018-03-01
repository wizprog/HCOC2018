package wizProg;

public class Ride {
	
	int x, y , x1 , y1, startTime, endTime;
	boolean done;
	
	public Ride(int x , int y, int x1, int y1 , int startTime, int endTime) {
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this.y1 = y1;
		this.startTime = startTime;
		this.endTime = endTime;
		done = false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
	
}
