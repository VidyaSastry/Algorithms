import java.io.*;
import java.util.*;

class HeapSort{

	public static void main(String[] args){
		HeapSort sort = new HeapSort();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int count = s.nextInt();
		s.nextLine();
		System.out.println("Enter the numbers");

		numbers = new int[count];
		Scanner numScanner = new Scanner(s.nextLine());
		for (int i = 0; i < count; i++) {
			if (numScanner.hasNextInt()) {
				numbers[i] = numScanner.nextInt();
			}
		}

		System.out.println("Select\n1 - Ascending Order \n2 - Descending Order");
		int choice = s.nextInt();
	}
}