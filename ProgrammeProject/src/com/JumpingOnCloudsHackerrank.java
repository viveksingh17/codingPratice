package com;

public class JumpingOnCloudsHackerrank {

	static int jumpingOnClouds(int[] c) {
        int intialCount=0;
        int i=0;
        for(i=0;i<c.length-2;i++)
        {
            if(c[i+1]==0 && c[i+2]==0 )
            {
                i++;
                intialCount++;
            }else if(c[i+1]==0 && c[i+2]!=0 )
            {
                intialCount++;
                }
                else if(c[i+1]==1 && c[i+2]==0)
                {
                    intialCount++;
                    i++;
                } else if(c[i+1]==0 && c[i+2]==1)
                {
                    intialCount++;
                    
                }
                else{
                continue;
            }
          
        }
        
        
        if(i==c.length-2)
        {
        	if(c[i+1]==0)
        	{
        		 intialCount++;
        	}
        	
        }
    return intialCount;
    }

	
	public static void main(String args[]) {
		int a[]= {0 ,1 ,0 ,1 ,0 ,1 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,0 ,0 ,0, 1 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,1 ,0 ,1 ,0 ,0 ,1 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,1 ,0 ,0 ,1 ,0 ,1 ,0 ,0 ,1 ,0 ,1 ,0 ,0 ,1 ,0 ,1 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,1 ,0 ,1 ,0 ,0 ,0 ,1 ,0 ,1 ,0 ,1, 0 ,0 ,0, 0 ,1 ,0};
//		int a[]= {0 ,0 ,0 ,1 ,0 ,0};
		System.out.println(jumpingOnClouds(a));
	}
}
