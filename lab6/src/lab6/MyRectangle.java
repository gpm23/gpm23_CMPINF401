package lab6;
// INFSCI0017 Lab 6 - Created by Dr. John Ramirez
// Fill in the indicated code sections to complete this class.  Then test it
// by compiling and executing Lab6.java.

public class MyRectangle
{
	private int startX;
	private int startY;
	private int height;
	private int width;

	public MyRectangle()
	{
		this.startX = 0;
		this.startY = 0;
		this.height = 0;
		this.width = 0;
		
	}

	public MyRectangle(int startX, int startY, int width, int height)
	{
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
		// Initialize instance variables based on parameters shown.
		// Be careful to get the order correct!
	}

	public int area()
	{
		int area = width * height;
		return area;
	}

	// I have written this method for you.  Note how a StringBuilder is
	// utilized, since (as we discussed in lecture) it can be modified
	// without having to create a new object each time (unlike a String).
	public String toString()
	{
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	public boolean isInside(int x, int y)
	{
		
		int edgeX = startX + width;
		int edgeY = startY + height;
		
		if((startX <= x && x <= edgeX) && (startY <= y && y <= edgeY) ) 
		{
			return true;
			
		}
		else 
		{
			return false;
		}
		
		
		
		// This is the trickiest of the methods to write.  This should
		// return true if point (x,y) is anywhere within the borders of the
		// current MyRectangle (including the borders themselves).  Use a
		// pencil and paper to figure out how this can be determined with
		// just a few simple relational operations.
	}

	public void setSize(int newWidth, int newHeight)
	{
		this.width = newWidth;
		this.height = newHeight;
	}

	public void setPosition(int newX, int newY)
	{
		this.startX = newX;
		this.startY = newY;
	}

}
