package com;

import java.util.Arrays;

public class MereSort {
	public static int[] array = { 10, 3, 7, 5, 6, 4, 8, 2, 9 };

	public static void main(String args[]) {
		mergeSort(array,0, array.length - 1);
		printArray(array);
		
	}
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

	private static void mergeSort(int [] array,int low, int high) {
		
		if(low<high)
		{
			int mid=(low+high)/2;
			mergeSort(array,low, mid);
			mergeSort(array,mid+1, high);
			sortArr(low,mid,high);
//			sort(array,low,mid,high);
		}
	}

	private static void sortArr(int low, int mid, int high) {
		
		int tempArr[]=new int[array.length];
		int i=low,j=mid+1,k=low;
		
		while(i<=mid && j<=high)
		{
			if(array[i]<array[j]) {
				tempArr[k]=array[i];
				k++;
				i++;
			}else {
				tempArr[k]=array[j];
				k++;
				j++;
						
			}
		}
		
		while(i<=mid) {
			tempArr[k]=array[i];
			k++;
			i++;
		}
		while(j<=high)
		{
			tempArr[k]=array[j];
			k++;
			j++;
		}
		
		System.out.println(Arrays.toString(tempArr));
		
	}
	private static void sort(int[] array2, int low, int mid, int high) {
		 int n1 = mid - low + 1; 
	        int n2 = high - mid; 
	  
	        /* Create temp arrays */
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i) 
	            L[i] = array[low + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = array[mid + 1+ j]; 
	        int i=0,j=0;
	        int k = low; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                array[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                array[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) 
	        { 
	            array[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) 
	        { 
	            array[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	}
}
