package com.company;
public class Ship 
{
	private int mastsQuantity;
	private char ship[][];
	private String owner; 
	
		public int getMastsQuantity()
		{
			return(mastsQuantity);
		}
		//TODO
//		public char[][] getShip()
//		{	
//			for(i=1;i=mastsQuantity;i++)
//			{
//				ships[][]='X';
//			}
//			return(ship);
//		}
			public String getOwner()
			{
				return(owner);
			}
			public void setMastsQuantity(int mastsQuantity)
			{
				this.mastsQuantity = mastsQuantity;
			}
			public void setShip(char [][]ship) 
			{
				this.ship = ship;
			}
			public void setOwner(String owner)
			{
				this.owner = owner;
			}
			
}