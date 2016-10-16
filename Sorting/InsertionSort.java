import java.io.*;
import java.util.*;

class InsertionSort{

	public static void main(String[] args){
		InsertionSort sort = new InsertionSort();
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

	public void ascending(int numbers[], int count){
		int key;
		for (int j = 1; j < count; j++){
			key = numbers[j];
			int i = j - 1;
			while( i >= 0 && numbers[i] > key){
				numbers[i+1] = numbers[i];
				i = i - 1;
			}
			numbers[i+1] = key;
		}

		System.out.println("The ordered numbers are: ");
		for (int i = 0; i < count; i++){
			System.out.println(numbers[i]);
		}

	}

	public void descending(int numbers[], int count){
				int key;
		for (int j = 1; j < count; j++){
			key = numbers[j];
			int i = j - 1;
			while( i >= 0 && numbers[i] < key){
				numbers[i+1] = numbers[i];
				i = i - 1;
			}
			numbers[i+1] = key;
		}

		System.out.println("The ordered numbers are: ");
		for (int i = 0; i < count; i++){
			System.out.println(numbers[i]);
		}

	}
}