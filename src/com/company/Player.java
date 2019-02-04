package com.company;
public class Player 
{
	private String name;
	private int points;
	//do wyznaczania kolejki
	private boolean first;
	
	
		public String getName()
		{
			return(name);
		}
		public int getPoints()
		{
			return(points);
		}
		public boolean first()
		{
			return(first);
		}
	
			public void setName(String name)
			{
				this.name = name;
			}
			public void setPoints(int points) 
			{
				this.points = points;
			}
			public void setFirst(boolean first)
			{
				this.first = first;
			}
}