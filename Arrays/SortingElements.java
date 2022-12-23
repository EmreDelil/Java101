package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class SortingElements {
	
	static boolean isFind(int[] arr,int index) {
		for(int find: arr) {
			if(find == index) {
				return true;
			}
		}
		return false;
	}
	
	static int maxValue(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		/* Dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan
		 * alınız. (Don't use Arrays.sort)
		 * (The project do not running perfect if you use 0 and repeating numbers in the array. I will fix these later.)
		 */
		
		Scanner scan = new Scanner(System.in);
		int n, a, b, i, element, indexNo = 0, deneme = 0;
		
		System.out.print("Enter the array's dimension : ");
		n = scan.nextInt();
		
		int[] list = new int[n];
		int[] sorting = new int[list.length];
		
		System.out.println("Dimension of the array : " + n);
		System.out.println("Enter the elements of the array : ");
		for(a = 0; a < list.length; a++) {
			System.out.print(a + 1 + ". Element : ");
			element = scan.nextInt();
			list[a] = element;
		}
		
		int minValue = maxValue(list);
		
		for(b = 0; b < n; b++) {
			for(i = 0; i < list.length; i++) {
				if(!isFind(sorting, list[i])) {
					if(list[i] < minValue) {
						minValue = list[i];
					}
				}
			}
			sorting[indexNo++] = minValue;
			minValue = maxValue(list);
		}
		System.out.println(Arrays.toString(sorting));
	}
}
