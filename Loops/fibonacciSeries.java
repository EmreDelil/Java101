package Loops;
import java.util.Scanner;
public class fibonacciSeries {

	public static void main(String[] args) {
		/* Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını
		 * kullanıcıdan alın.
		 * 
		 * Fibonacci Serisi Nedir ?
		 * 
		 * Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu
		 * şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir
		 * sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
		 * 
		 * Fibonacci dizisi, 0'dan başlar ve sonsuza kadar gider. Her rakam, bir önceki rakamla toplanır. Elde
		 * edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
		 * 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
		 * 
		 * 0 + 1 = 1
		 * 1 + 1 = 2
		 * 1 + 2 = 3
		 * 2 + 3 = 5
		 * 3 + 5 = 8
		 * 5 + 8 = 13
		 * 8 + 13 = 21
		 * 13 + 21 = 34
		 */
		int i, elements, tempTotal = 0, total = 1, result;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		elements = input.nextInt();
		System.out.print(tempTotal + " ");
		for(i = 1; i < elements; i++) {
			result = tempTotal + total;
			tempTotal = total;
			total = result;
			System.out.print(tempTotal + " ");
		}

	}
}
