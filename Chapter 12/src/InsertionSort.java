
public class InsertionSort {

	public static void main(String[] args) {

		int[] numbers = {2,24,5,1,5,767,12,532,63,12,32,9};
		
		for (int i = 0; i < numbers.length; i++)
			System.out.print(" "+numbers[i]+" ");
		System.out.print("\n");
		Sorts.insertionSort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print(" "+numbers[i]+" ");
	}

}
