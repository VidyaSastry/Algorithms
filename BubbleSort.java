import java.io.*;
import java.util.*;
class BubbleSort{

	public static void main(String[] args){
		BubbleSort sort = new BubbleSort();
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
		System.out.println("Enter\n 1 - Ascending Order \n 2 - Descending Order");
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
		int temp = 0;
		for (int j = 0; j < count; j++){
			for (int k = 1; k < (count-j); k++){
				if(numbers[k-1] > numbers[k]){
					temp = numbers[k-1];
					numbers[k-1] = numbers[k];
					numbers[k] = temp;
				}
			}
		}

		System.out.println("The ordered numbers are: ");
		for(int i = 0; i < count; i++){
			System.out.println(numbers[i]);
		} 		
	}

	public void descending(int numbers[],int count){
		
	}
}