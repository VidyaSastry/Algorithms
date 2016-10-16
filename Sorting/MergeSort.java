import java.io.*;
import java.util.*;

class MergeSort{

	static int[] numbers;

	public static void main(String[] args){
		MergeSort sort = new MergeSort();
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

		sort.merge_sort(0, count-1, choice);

		System.out.println("The ordered numbers are: ");
		for(int i = 0; i < count; i++)
			System.out.println(numbers[i]);
	}

	public void merge_asc(int low, int middle, int high){
		int[] temp = new int[high+1];

		for(int i = low; i <= high; i++){
			temp[i] = numbers[i];
		}

		int i = low, k = low;
		int j = middle + 1;

		while(i <= middle && j <= high){
			if( temp[i] <= temp[j]){
				numbers[k] = temp[i];
				i++;
			}else{
				numbers[k] = temp[j];
				j++;
			}
			k++;
		}
		while(i <= middle){
			numbers[k] = temp[i];
			k++;
			i++;
		}
		
	}

		public void merge_desc(int low, int middle, int high){
		int[] temp = new int[high+1];

		for(int i = low; i <= high; i++){
			temp[i] = numbers[i];
		}

		int i = low, k = low;
		int j = middle + 1;

		while(i <= middle && j <= high){
			if( temp[i] >= temp[j]){
				numbers[k] = temp[i];
				i++;
			}else{
				numbers[k] = temp[j];
				j++;
			}
			k++;
		}
		while(i <= middle){
			numbers[k] = temp[i];
			k++;
			i++;
		}
		
	}

	public void merge_sort(int low, int high, int choice){
		if(low < high){
			int middle = low + (high - low)/2;
			merge_sort(low, middle, choice);
			merge_sort(middle + 1, high, choice);
			if(choice == 1)
				merge_asc(low, middle, high);
			else if(choice == 2)
				merge_desc(low, middle, high);
		}
	}
}