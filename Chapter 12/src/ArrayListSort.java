
public class ArrayListSort {

	public static void main(String[] args) {
		double[] listy = {5,1,6,3,2,8,19,20};
		for (double d : selectionSort(listy)) {
			System.out.println(d);
		}

	}
	
	public static double[] selectionSort(double[] list) {
		int i, j, minIndex;
		double minValue, temp = 0.0;
		
		for (i = 0; i < list.length; i++) {
			minValue = list[(int) i];
			minIndex = i;
			for (j = i; j < list.length;j++) {
				if (list[j] < minValue) {
					minValue = list[i];
					minIndex = j;
				}
			}
			if (minValue < list[i]) {
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
		
		return list;
	}

}
