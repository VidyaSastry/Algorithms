import java.io.*;
import java.util.*;

class SelectionSort{
	SelectionSort sort = new SelectionSort();
	Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int count = s.nextInt();
		s.nextLine();
		System.out.println("Enter the numbers");

		int [] numbers = new int[count];
		Scanner numScanner = new Scanner(s.nextLine());
		for (int i = 0; i < count; i++) {
			if (numScanner.hasNextInt()) {
				numbers[i] = numScanner.nextInt();
			}
		}

		System.out.println("Select\n1 - Ascending Order \n2 - Descending Order");
		int choice = s.nextInt();

		switch(choice){
			case 1: sort.ascending(numbers,count);
			break;
			case 2: sort.descending(numbers,count);
			break;
			default: System.out.println("Invalid choice");
			break;
		}
}