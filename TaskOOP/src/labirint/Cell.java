package labirint;

public class Cell {

	 int row;
	 int col;
	 int distance;
	 
	public Cell(int row, int col, int distance) {
		super();
		this.row = row;
		this.col = col;
		this.distance = distance;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
}
