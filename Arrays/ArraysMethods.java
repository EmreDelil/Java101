package Arrays;
import java.util.Arrays;
public class ArraysMethods {
	public static void main(String[] args) {
		
		/* Ek bilgi : Eğer metotların başına static koyarsak başka sınıfta yeniden nesne üretmeye gerek kalmadan direkt o metodu
		 * sınıfın içinde kullanabiliriz. Mesela başka sınıfta yapılan bir metot için static kullanmazsak ana sınıfın içinde
		 * örnek olarak : Arrays arr = new Arrays(); şeklinde bir nesne üretmemiz gerekir. Static kullandığımız zaman ise hiç nesne
		 * üretmeden direkt o metodu kullanabiliriz. Arrays sınıfı da bunlardan biridir. Arrays sınıfından bir metot kullanacağımız
		 * zaman o metot için bi nesne üretmek yerine direkt metodu kullanabiliyoruz.
		 */
		
		int[] list = {1,2,3,4};
		
		/* Arrays.toString(); = Direkt listeyi print eder.
		 * for(int i = 0; i < list.length; i++){
		 * 		System.out.print(list[i] + " ");
		 * }
		 */
		System.out.println(Arrays.toString(list));
		
		/* Arrays.fill(dizi adı, atanacak değer); = Dizinin elemanlarını değiştirir.
		 * static int[] fill(int[] arr, int value){
		 * 		for(int i = 0; i < arr.length; i++){
		 * 			arr[i] = value;
		 * 		}
		 * 		return arr;
		 * }
		 * Arrays.fill(dizi adı, kaçıncı indisten başlayacağı, kaçıncı indise kadar gideceği, atanacak değer);
		 * static int[] fill(int[] arr, int fromindex, int toindex, int value){
		 * 		for(int i = 0; i < arr.length; i++){
		 * 			if(i >= fromindex && i < toindex){
		 * 				arr[i] = value;
		 * 			}
		 * 		}
		 * 		return arr;
		 * }
		 */
		
		Arrays.fill(list, 10);
		System.out.println(Arrays.toString(list));
		Arrays.fill(list, 1,3,5);
		System.out.println(Arrays.toString(list));
		
		/* Arrays.sort(dizi adı); = Diziyi küçükten büyüğe doğru sıralar.
		 * Arrays.sort(dizi adı, başlangıç indisi, bitiş indisi);
		 */
		
		int[] list2 = {52, 84, -65, 783, -925, -7142, 825, 0, 18, -3};
		Arrays.sort(list2, 2, 5);
		System.out.println(Arrays.toString(list2));
		Arrays.sort(list2);
		System.out.println(Arrays.toString(list2));
		
		/* Arrays.binarySearch(dizi adı, aranacak değer); = dizinin istenilen elemanının kaçıncı indekste olduğunu gösterir
		 * Bu metodun düzgün çalışabilmesi için dizinin sıralı olması gerekir.
		 */
		
		int[] list3 = {-56,2653,-485,12,33,5,95,-15,48,-33,8};
		
		Arrays.sort(list3);
		System.out.println(Arrays.toString(list3));
		System.out.println(Arrays.binarySearch(list3, 8));
		
		/* Arrays.copyOf(dizi adı, yeni dizinin eleman sayısı); = Yeni bir dizi oluşturduktan sonra içine yazılan dizinin istenilen
		 * eleman sayısı kadar elemanını yeni dizinin elemanları yapar.
		 * 
		 * static int[] copyArray(int[] oldArray, int number){
		 * 		int[] newArray = new int[number];
		 * 		for(int i = 0; i < oldArray.length; i++){
		 * 			if(i < number){
		 * 				newArray[i] = oldArray[i];
		 * 			}
		 * 		}
		 * 		return newArray;
		 * }
		 * 
		 * Arrays.copyOfRange(dizi adı, kaçıncı indeksten kopyalamaya başlayacağı, kaçıncı indekse kadar); = Eski dizinin belli bir
		 * indeksinden belli bir indeksine kadar kopyalar.
		 */
		
		int[] list4 = {5, 8, 24, 2, -24, -2, -6248, 2468, 45, -25, -3};
		int[] copyList = Arrays.copyOf(list4, 5);
		System.out.println(Arrays.toString(copyList));
		
		int[] copyList2 = Arrays.copyOfRange(list4, 2, 7);
		System.out.println(Arrays.toString(copyList2));
		
		// Arrays.equals(1. dizi, 2. dizi); = Girilen 2 dizinin eşit olup olmadığını kontrol eder.
		
		System.out.println(Arrays.equals(copyList, copyList2));
		System.out.println(Arrays.equals(list4, list4));
	}
}
