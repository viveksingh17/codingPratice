package com;

public class SpiralMatrixTransform {
	
	private static void printSpiralOrder(int[][] mat)
	{
		int i=0,j=0;
		int leftEnd=mat[0].length-1;
		int bottomEnd=mat.length-1;
		while(i<bottomEnd && j<leftEnd)
		{
			for(int l=i;l<=leftEnd;l++)
			{
				System.out.println(mat[i][l]);
				
			}
			i++;
			for(int l=i;l<=bottomEnd;l++)
			{
				System.out.println(mat[l][leftEnd]);
			}
			leftEnd--;
			if(i<bottomEnd)
			{
				for(int l=leftEnd;l>=j;--l)
				{
					System.out.println(mat[bottomEnd][l]);
				}
				bottomEnd--;
				
			}
			if(j<bottomEnd)
			{
				for(int l=bottomEnd;l>=i;--l)
				{
					System.out.println(mat[l][j]);
				}
				j++;
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		int[][] mat =
		{
			{ 1,  2,  3,  4, 5},
			{16, 17, 18, 19, 6},
			{15, 24, 25, 20, 7},
			{14, 23, 22, 21, 8},
			{13, 12, 11, 10, 9}
		};

		printSpiralOrder(mat);
	}

}
