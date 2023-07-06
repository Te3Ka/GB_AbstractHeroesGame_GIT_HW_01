package Grid;

public class Grid {
    int coorX;
    int coorY;

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
}
