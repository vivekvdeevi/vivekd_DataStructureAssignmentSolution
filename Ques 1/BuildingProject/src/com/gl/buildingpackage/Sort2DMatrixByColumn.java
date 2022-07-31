package com.gl.buildingpackage;

import java.util.*;

public class Sort2DMatrixByColumn {

	// Function to sort by column
	public static void sortbyColumn(int arr[][], int col) {
		// Using built-in sort function Arrays.sort
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			// Compare values according to columns
			public int compare(final int[] entry1, final int[] entry2) {

				// To sort in descending order revert
				// the '>' Operator
				if (entry1[col] < entry2[col])
					return 1;

				else
					return -1;
			}
		}); // End of function call sort().
	}

	// Driver Code
	public static void main(String args[]) {

		/*
		 * int matrix[][] = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 8 }, { 5, 9 }, { 6, 10
		 * }, { 7, 4 }, { 8, 5 }, { 9, 7 }, { 10, 6 }, };
		 */

		Scanner sc = new Scanner(System.in);
		int numOfFloors, floorNum, day, i1, j1;
		System.out.println("enter the total no of floors in the building");
		numOfFloors = sc.nextInt();
		int matrix[][] = new int[numOfFloors][2];

		for (int row = 0; row < matrix.length; row++) {
			System.out.println("enter the floor size given on day : " + (row + 1));

			floorNum = sc.nextInt();
			matrix[row][0] = row + 1;
			matrix[row][1] = floorNum;

		}
		System.out.println();

		// System.out.println("---------------------");
		/*
		 * for (int i = 0; i < matrix.length; i++) { for (int j = 0; j <
		 * matrix[i].length; j++) System.out.print(matrix[i][j] + " ");
		 * System.out.println();
		 * 
		 * }
		 */
		// System.out.println("---------------------");
		// int matrix[][] = { { 4, 5 }, { 2, 3 }, { 3, 2 }, { 1, 4 }, { 5, 1 } };
		// Sort this matrix by Column
		// int[][] finalArray = new int[matrix.length][2];
		int col = 2;
		sortbyColumn(matrix, col - 1);

		// Display the sorted Matrix
		System.out.println("Day  Size");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + "   ");
			System.out.println();
		}

		int i = 0, j = 1, l = 0, int2 = 0;
		// System.out.print("oDay: " + matrix[i][0]);
		System.out.println();
		l = i;

		// trial
		int pCheck = matrix[0][0];

		for (int loopCount1 = 1; loopCount1 < pCheck; loopCount1++) {
			System.out.println();
			System.out.print("Day: " + loopCount1);
			System.out.println();

		}

		for (int loopCount = 0; loopCount < matrix.length; loopCount++) {
			int2 = matrix[i][0];
			if (matrix[i][0] > matrix[loopCount][0]) {

				{
					// finalArray[loopCount][1] = matrix[i][0];

					System.out.print(matrix[loopCount][j] + " ");
					// int2 = matrix[i][0];
				}

			} else {
				i = loopCount;
				if (i != 0) {
					int dayDiff = matrix[loopCount][0] - int2;
					// System.out.println();
					// System.out.println("Day difference " + dayDiff +" "+matrix[i][0] );
					for (int z = (dayDiff - 1); z > 0; z--) {
						System.out.println();
						// System.out.println("Day Blank");
						System.out.print("Day: " + (matrix[i][0] - z));
						System.out.println();

					}
				}
				System.out.println();
				System.out.print("Day: " + matrix[i][0]);
				// Trial

				System.out.println();
				System.out.print(matrix[loopCount][j] + " ");
				// finalArray[loopCount][1] = matrix[i][0];

			}
		}
		/*
		 * System.out.println(); for (i = 0; i < finalArray.length; i++) { for (j = 0; j
		 * < finalArray[i].length; j++) System.out.print(finalArray[i][j] + " ");
		 * System.out.println(); }
		 */

	}
}