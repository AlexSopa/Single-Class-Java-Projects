/*********************************************************************************
* (Combine two lists) Write a method that returns the union of two array lists   *
* of integers using the following header:                                        *
*                                                                                *
* public static ArrayList<Integer> union(                                        *
* ArrayList<Integer> list1, ArrayList<Integer> list2)                            *
*                                                                                *
* For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is        *
* {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two *
* lists, each with five integers, and displays their union. The numbers are      *
* separated by exactly one space in the output.                                  *
*********************************************************************************/
// Driver: Kristi, Navigator: Alex
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_11_14 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();



		System.out.print("Enter five integers for list1: ");
		fill(list1);
		System.out.print("Enter five integers for list2: ");
		fill(list2);


		ArrayList<Integer> list3 = union(list1, list2);


		System.out.print("The combined list is: ");
		for (int i = 0; i < list3.size(); i++) {
			System.out.print(list3.get(i) + " ");
		}
		System.out.println();
	}

	public static ArrayList<Integer> union(
		ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list3 = list1;
		for (int i = 0; i < list2.size(); i++) {
			list3.add(list2.get(i));
		}
		return list3;
	}	


	public static void fill(ArrayList<Integer> list) {

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
	}
}