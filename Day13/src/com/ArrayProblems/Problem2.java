package com.ArrayProblems;

public class Problem2{
	static int N = 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int arr[][] = { { 1, 2, 3, 4 },
                 { 5, 6, 7, 8 },
                 { 9, 10, 11, 12 },
                 { 13, 14, 15, 16 } };
rotate90Clockwise(arr);
printMatrix(arr);
	}

	private static void printMatrix(int[][] arr) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < N; i++)
		    {
		        for (int j = 0; j < N; j++)
		        System.out.print( arr[i][j] + " ");
		        System.out.println();
		    }
	}

	private static void rotate90Clockwise(int[][] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < N / 2; i++)
	    {
	        for (int j = i; j < N - i - 1; j++)
	        {
	 
	            // Swap elements of each cycle
	            // in clockwise direction
	            int temp = a[i][j];
	            a[i][j] = a[N - 1 - j][i];
	            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
	            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
	            a[j][N - 1 - i] = temp;
	        }
	    }
	}

}
