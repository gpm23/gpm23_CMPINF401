package lab6;

public class original {
	private int x;
	private int y;
	private int startX;
	private int startY;
	
	public void xLine(int startX) {
		this.startX = startX;
	}
	
	public Integer getStartX(){
		return this.startX;
	}
	
	public void setStartX(int startX) {
		this.startX = startX;
	}
	
	// above is getter, setter, and main method for setting startX
	
	public void yLine(int startY) {
		this.startY = startY;
	}
	
	public Integer getStartY() {
		return this.startY;
	}
	public void setStartY(int startY) {
		this.startY = startY;
	}
	
	// above is getter, setter, and main method for setting startY
	
	public void width(int x) {
		this.x = x;
	}
	
	public Integer getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	// above is getter, setter, and main method for setting width
	
	public void length(int y) {
		this.y = y;
	}
	
	public Integer getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// above is getter, setter, and main method for setting length
	
	public int area() {
		int	area = y * x;
		return area;
	}
	
	public String toString() {
		System.out.println("The rectangle has a length of " + y + " and a width of " + x + ". The rectangle is " + startX + "")
	}

}



