package com;

import java.util.Arrays;

public class SpringVsSpringBoot {
/**
 *		Spring:-compreshive infrastructure for developing appplication.
 *
 * DI(Dependency Injection),JDBC,MVC,Security,AOP ..
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	  public int canCompleteCircuit(final int[] A, final int[] B) {
	        int length=A.length;
	       int i=0,j=0;
	       if(length>1)
	       {
	       while(i<length-1 || j<length-1)
	       {if(i==length-1)
	                {
	                    break;
	                }
	            if(A[j]>=B[j])
	            {
	            	if(j==length-1)
	            	{
	            		j=0;
	            		continue;
	            	}
	                j++;
	            }else{
	                i++;
	                
	                j=i;
	            }
	       }if(i==length-1)
	       {
	           return -1;
	       }
	       }
	       else{
	           return i;
	       }
	        return i;
	        
	    }

	/*
	 * public int[] plusOne(int[] A) { int length=A.length; int carry=0; for(int
	 * i=length-1;i>=0;i--) {
	 * 
	 * if(A[i]+1>9) { A[i]=0; carry=1; } else{ A[i]=A[i]+1; carry=0; break; } } int
	 * temp[]= new int[length+1]; if(carry==1) { temp[0]=1; for(int
	 * i=1;i<length+1;i++) { temp[i]=A[i-1]; } return temp; }else{ temp=A; int j=0;
	 * if(temp[0]==0) { A=Arrays.copyOfRange(temp, 1, temp.length-1); // for(int
	 * i=1;i<length-1;i++) // { // A[j]=temp[i]; // j++; // } return A; }else {
	 * return temp; } }
	 * 
	 * }
	 */
	  public int maxArr(int[] A) {
	        int min=findMin(A);
	        int max=findMax(A);
	        int indexMin=findMinIndex(A);
	        int indexMax=findMaxIndex(A);
	      return Math.abs(min-max)+Math.abs(indexMin-indexMax);
	        
	    }
	    private int findMin(int[] A)
	    {
	        int small=Integer.MAX_VALUE;
	        for(int i=0;i<A.length;i++)
	        {
	            if(A[i]<small)
	            {
	                small=A[i];
	            }
	        }
	        return small;    }
	        
	    private int findMax(int[] A)
	    {
	        int small=Integer.MIN_VALUE;
	        for(int i=0;i<A.length;i++)
	        {
	            if(A[i]>small)
	            {
	                small=A[i];
	            }
	        }
	        return small;    }
	        
	      private int findMinIndex(int[] A)
	    {
	        int index=0;
	        int small=Integer.MAX_VALUE;
	        for(int i=0;i<A.length;i++)
	        {
	            if(A[i]<small)
	            {
	                small=A[i];
	                index=i;
	            }
	        }
	        return index;    }
	        
	        private int findMaxIndex(int[] A)
	    {
	        int index=0;
	        int small=Integer.MIN_VALUE;
	        for(int i=0;i<A.length;i++)
	        {
	            if(A[i]>=small)
	            {
	                small=A[i];
	                index=i;
	            }
	        }
	        return index;    }
	  
	  
	  public int maxSubArray(final int[] A) {
	        int maxValue=Integer.MIN_VALUE;
	        int length=A.length;
	        int currMax = 0;
	        for(int i=0;i<length;i++)
	        {
	            
	        	currMax=currMax+A[i];
	            if(currMax>maxValue)
	            {
	                maxValue=currMax;
//	             currMax=0;
	            }
	            // else{
	            //     currMax=A[i];
	            // }
	        }
	        return maxValue;
	    }

	  
	  
	  public int[] repeatedNumber(final int[] A) {
	        int arr[]= new int[2];
	        for(int i=0;i<A.length;i++)
	        {
	            int abs_val=Math.abs(A[i]);
	            if(A[abs_val]>0)
	            {
	                A[abs_val-1]=-A[abs_val-1];
	            }
	            else{
	                arr[0]=abs_val;
	            }
	        }
	        
	        for(int i=0;i<A.length;i++){
	            if(A[i]>0)
	            {
	                arr[1]=i+1;
	            }
	        }
	        return arr;
	        
	    }
	  
	  
	  
	  public int[] flip(String A) {
	        
	        int length=A.length();
	        int i=0;
	        int max_difference=0;
	        int ans[]=new int[2];
	        int diff=0;
	        int curr=0;
	        while(i<length)
	        {
	            // diff=diff+(A[i]!='0'?1:-1);
	            char c = A.charAt(i);
	        diff =diff+((c == '0') ? 1 : -1) ;
	            
	            if(diff<0)
	            {
	                diff=0;
	                curr=i+1;
	                i+=1;
	                continue;
	            }
	            if(diff>max_difference)
	            {
	                max_difference=diff;
	                ans[0]=curr+1;
	                ans[1]=i+1;
	            }  
	            i+=1; 
	        }
	        return ans;
	    }
	  
	  
	  
	    public static void main(String args[])
	    {
	    	SpringVsSpringBoot s= new SpringVsSpringBoot();
//	    	int a[]= {959, 329, 987, 951, 942, 410, 282, 376, 581, 507, 546, 299, 564, 114, 474, 163, 953, 481, 337, 395, 679, 21, 335, 846, 878, 961, 663, 413, 610, 937, 32, 831, 239, 899, 659, 718, 738, 7, 209};
//	    	int b[]= {862, 783, 134, 441, 177, 416, 329, 43, 997, 920, 289, 117, 573, 672, 574, 797, 512, 887, 571, 657, 420, 686, 411, 817, 185, 326, 891, 122, 496, 905, 910, 810, 226, 462, 759, 637, 517, 237, 884};
//	    		int a[]= { 389, 299, 65, 518, 361, 103, 342, 406, 24, 79, 192, 181, 178, 205, 38, 298, 218, 143, 446, 324, 82, 41, 312, 166, 252, 59, 91, 6, 248, 395, 157, 332, 352, 57, 106, 246, 506, 261, 16, 470, 224, 228, 286, 121, 193, 241, 203, 36, 264, 234, 386, 471, 225, 466, 81, 58, 253, 468, 31, 197, 15, 282, 334, 171, 358, 209, 213, 158, 355, 243, 75, 411, 43, 485, 291, 270, 25, 100, 194, 476, 70, 402, 403, 109, 322, 421, 313, 239, 327, 238, 257, 433, 254, 328, 163, 436, 520, 437, 392, 199, 63, 482, 222, 500, 454, 84, 265, 508, 416, 141, 447, 258, 384, 138, 47, 156, 172, 319, 137, 62, 85, 154, 97, 18, 360, 244, 272, 93, 263, 262, 266, 290, 369, 357, 176, 317, 383, 333, 204, 56, 521, 502, 326, 353, 469, 455, 190, 393, 453, 314, 480, 189, 77, 129, 439, 139, 441, 443, 351, 528, 182, 101, 501, 425, 126, 231, 445, 155, 432, 418, 95, 375, 376, 60, 271, 74, 11, 419, 488, 486, 54, 460, 321, 341, 174, 408, 131, 115, 107, 134, 448, 532, 292, 289, 320, 14, 323, 61, 481, 371, 151, 385, 325, 472, 44, 335, 431, 187, 51, 88, 105, 145, 215, 122, 162, 458, 52, 496, 277, 362, 374, 26, 211, 452, 130, 346, 10, 315, 459, 92, 531, 467, 309, 34, 281, 478, 477, 136, 519, 196, 240, 12, 288, 302, 119, 356, 503, 527, 22, 27, 55, 343, 490, 127, 444, 308, 354, 278, 497, 191, 294, 117, 1, 396, 125, 148, 285, 509, 208, 382, 297, 405, 245, 5, 330, 311, 133, 274, 275, 118, 463, 504, 39, 99, 442, 337, 169, 140, 104, 373, 221, 499, 413, 124, 510, 159, 465, 80, 276, 83, 329, 524, 255, 387, 259, 397, 491, 517, 23, 4, 230, 48, 349, 412, 142, 114, 487, 381, 164, 35, 67, 498, 73, 440, 108, 226, 96, 132, 144, 207, 235, 33, 69, 128, 236, 364, 198, 475, 173, 493, 150, 90, 515, 111, 68, 232, 340, 112, 526, 492, 512, 495, 429, 146, 336, 17, 350, 251, 7, 184, 76, 380, 359, 293, 19, 49, 345, 227, 212, 430, 89, 474, 279, 201, 398, 347, 273, 37, 185, 177, 102, 304, 295, 422, 94, 426, 514, 116, 183, 180, 494, 42, 305, 152, 390, 30, 247, 451, 32, 388, 331, 78, 424, 368, 394, 188, 306, 449, 8, 214, 120, 179, 280, 511, 409, 338, 153, 507, 370, 461, 217, 161, 483, 147, 242, 86, 417, 268, 71, 462, 420, 167, 513, 379, 307, 522, 435, 113, 296, 457, 525, 45, 529, 423, 427, 2, 438, 64, 316, 46, 40, 13, 516, 367, 233, 110, 318, 250, 283, 216, 186, 310, 237, 377, 365, 175, 479, 378, 66, 414, 473, 165, 210, 50, 348, 372, 363, 339, 20, 168, 284, 415, 505, 206, 53, 223, 434, 202, 123, 399, 400, 135, 269, 428, 219, 456, 28, 464, 267, 489, 98, 391, 195, 366, 300, 484, 533, 229, 213, 149, 160, 256, 303, 530, 301, 29, 404, 344, 401, 220, 287, 9, 407, 170, 450, 523, 249, 72, 410, 3, 21, 200, 260  };
//	    		int b[]= {909, 535, 190, 976};
	    	System.out.print(Arrays.toString(s.flip("010")));
	    }

		@Override
		public String toString() {
			return "SpringVsSpringBoot [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}

	
	
}
