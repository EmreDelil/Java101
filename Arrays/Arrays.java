package Arrays;

public class Arrays {
	static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void printArray(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		/* Diziler köşeli parantez ile gösterilir.
		 * Dizilerin tüm elemanları aynı değişken türünde olmak zorundadır. 10 elemanlı bir dizinin 1 elemanı int biri double vs olamaz.
		 * Dizileri tanımlarken eleman sayısını yazmak zorundayız.
		 * Dİziden eleman çağırırken indisleri ile çağırırız. Elemanların indisleri 0 dan başlar. Mesela 1. eleman 0 indis numarasına,
		 * 10. eleman 9 indis numarasına sahiptir.
		 *         <------------- array size = 10 ----------------->
		 * array = | 10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 | 100|
		 *            0    1    2    3    4    5    6    7    8    9
		 *          <--------------- indis no ---------------------->
		 */
		int[] list = new int[10]; // En sık kullanılan array syntax'ı.
		int list1[] = new int[20]; // Pek kullanılan bir yapı değil.
		
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[1] = 15;
		System.out.println(list[0]);
		
		System.out.println(list.length);
		
		for(int i = 0; i < list.length; i++) {
			list[i] = (i+1) * 10;
			System.out.println(list[i]);
		}
		
		int[] list2 = {10 , 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println(list2[3]);
		
		for(int j = 0; j < list2.length; j++) {
			System.out.println(list2[j]);
		}
		
		printArray(list2);
		
		double[] list3 = {1.1 , 2.2 , 3.3 , 4.4};
		printArray(list3);
		
		double[] list4;
		list4 = new double[10];
	}
}
