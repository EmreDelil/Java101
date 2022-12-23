package Arrays;
import java.util.Arrays;
public class FrequencyOfArray {
	static boolean isFind(int[] arr, int value) {
		for(int i: arr) {
			if(i == value) {
				return true;
			}
		}
		return false;
	}
	static int counter(int[] arr, int value) {
		int repeatCounter = 0;
		for(int i: arr) {
			if(i == value) {
				repeatCounter++;
			}
		}
		return repeatCounter;
	}

	public static void main(String[] args) {
		// Dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
		int[] list = {15,15,35,24,15,86,35,24,35,15};
		int[] list2 = new int[list.length];
		
		System.out.println("Array : " + Arrays.toString(list));
		System.out.println("Number Of Repeating");
		
		for(int i = 0; i < list.length; i++) {
			if(!isFind(list2,list[i])) {
				System.out.println("The number " + list[i] + " was repeated " + counter(list,list[i]) + " times.");				
				list2[i] = list[i];
			}
		}
		
	}

}
