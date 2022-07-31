package com.gl.buildingprojectdriverpkg;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SortList implements Comparable<SortList> {

	int day;
	int floorSize;

	public SortList(int day, int floorSize) {
		this.day = day;
		this.floorSize = floorSize;

	}

	// Override the compareTo() method
	@Override
	public int compareTo(SortList s) {
		if (floorSize < s.floorSize) {
			return 1;
		} else if (floorSize == s.floorSize) {
			return 0;
		} else {
			return -1;
		}
	}

	// public
	public static void main(String[] args) {

		LinkedList<SortList> List = new LinkedList<SortList>();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building ");
		int numOfFloors = sc.nextInt();
		int counter = 0, floorNum = 0;
		for (counter = 0; counter < numOfFloors; counter++) {
			System.out.println("enter the floor size given on day : " + (counter+1));

			floorNum = sc.nextInt();

			List.add(new SortList((counter+1), floorNum));

		}

		Collections.sort(List);

		int temp1 = List.get(0).day, k = 0;

		for (int j = 1; j < temp1; j++) {
			System.out.println();
			System.out.print("Day: " + j + '\n');

		}

		for (int i = 0; i < List.size(); i++) {
			temp1 = List.get(k).day;
			if (List.get(k).day > List.get(i).day) {
				System.out.print(List.get(i).floorSize + " ");
			} else {
				k = i;
				if (k != 0) {
					int dayDiff = List.get(i).day - temp1;
					for (int z = (dayDiff - 1); z > 0; z--) {
						System.out.println();
						System.out.print("Day: " + ((List.get(i).day) - z));
						System.out.println();

					}

				}
				System.out.println();
				System.out.print("Day: " + List.get(k).day);

				System.out.println();
				System.out.print(List.get(i).floorSize + " ");

			}

		}
		sc.close();
	}
}
