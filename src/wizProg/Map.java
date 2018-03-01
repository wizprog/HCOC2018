package wizProg;

public class Map {
	
	void tick();
	
	int distance(int x1, int y1, int x2, int y2) {
		return (Math.abs(x2-x1)+Math.abs(y2-y1));
	}
	
}
