/*********************************************************************************
* (Remove duplicates) Write a method that removes the duplicate elements from    *
* an array list of integers using the following header:                          *
*                                                                                *
* public static void removeDuplicate(ArrayList<Integer> list)                    *
*                                                                                *
* Write a test program that prompts the user to enter 10 integers to a list and  *
* displays the distinct integers separated by exactly one space.                 *
*********************************************************************************/
// Driver: Kristi, Navigator: Alex
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_11_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		ArrayList<Integer> list = new ArrayList<Integer>();


		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}


		removeDuplicate(list);


		System.out.print("The distinct integers are ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}


	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j))
					list.remove(j);
			}
		}
	}
}