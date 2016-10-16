import java.io.*;
import java.util.*;

class SelectionSort{
	public static void main(String[] args){
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

	public void ascending(int numbers[],int count){

		int temp;
		for(int i = 0; i < count; i++){
			int min = i;
			for(int j = i; j < count; j++){
				if(numbers[j] < numbers[min])
					min = j;
			}

			if(min != i){
				temp = numbers[i];
				numbers[i] = numbers[min];
				numbers[min] = temp;
			}
		}
		System.out.println("The ordered numbers are: ");
		for (int i = 0; i < count; i++){
			System.out.println(numbers[i]);
		}
	}

	public void descending(int numbers[],int count){
		int temp;
		for(int i = 0; i < count; i++){
			int max = i;
			for(int j = i; j < count; j++){
				if(numbers[j] > numbers[max])
					max = j;
			}

			if(max != i){
				temp = numbers[i];
				numbers[i] = numbers[max];
				numbers[max] = temp;
			}
		}
		System.out.println("The ordered numbers are: ");
		for (int i = 0; i < count; i++){
			System.out.println(numbers[i]);
		}
		
	}
}