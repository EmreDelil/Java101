package Loops;
import java.util.Scanner;
public class HarmonicNumbers {

	public static void main(String[] args) {
		/* Java ile girilen sayının harmonik serisini bulan program yazacağız.
		 * Harmonik Sayı formülü :
		 *                                 sonsuz
		 * 1 + 1/2 + 1/3 + 1/4 + .... = toplam sembolü  1/n
		 *                                  n = 0
		 */
		
		int i, number;
		double total = 0.0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		number = scan.nextInt();
		
		/* Bölüm işlemlerinde int / int yaparsak sonuç double olsa bile int sonucunu çıkartıyor.
		 * bölümlerden en az biri double olmalı. Örnek :
		 * double result;
		 * result = 1/2; -> result = 0 çıkar. 0.5 teki virgülden sonrasını siler int sonucu çıkar.
		 * fakat bu bölenlerden herhangi biri double olursa sonucu da double verir. Örnek :
		 * result = 1.0/2 veya result = 1/2.0 veya result = 1.0/2.0 işleminin sonucu result = 0.5 olur.
		 */
		for(i = 1; i <= number; i++) {
			total += Math.pow(i, -1);
		}
		System.out.println(total);
	}

}
