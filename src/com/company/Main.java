package com.company;

public class Main {

	public static void GetWinner(char board[][])
	{
		
		//sprawdzanie w poziomie
		for(int j=1;j==10;j++)
		{
			int h=0;
			for(int i=1;i==10;i++)
			{
				
				if((board[j][i])==(board[j][i+1]))
				{
					h++;
				}
				
			}
			
			//TODO
			//Jeśli h jest równe liczbie masztów to statek został zatopiony
			//if(h == Ships.mastsQuantity)
			
			
				
			{
					
				System.out.println("Wygrały: "+board[j][1]);
				break;
			}
		}
	}		
	
    public static void main(String[] args) {
	// write your code here
    
    }
}
