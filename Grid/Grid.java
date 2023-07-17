package Grid;

public class Grid {
    protected int coorX;
    protected int coorY;

    public Grid(int coorX, int coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public int getCoorX() {
        return this.coorX;
    }

    public int getCoorY() {
        return this.coorY;
    }


    public String printCoordinates() {
        return "X = " + getCoorX() + " # Y = " + getCoorY();
    }

    public void setCoorX(int coorX, int changeCoorX) {
        this.coorX = coorX + changeCoorX;
    }

    public void setCoorY(int coorY, int changeCoorY) {
        this.coorY = coorY + changeCoorY;
    }
	
	public double calcDistance(Grid place) {
		return Math.sqrt(Math.pow(place.getCoorX() - this.coorX, 2) +
                    Math.pow(place.getCoorY() - this.getCoorY(), 2));
	}
}

