package Functions;
import java.util.Scanner;
public class MethodByPattern {

	static void pattern(int number, int result, int tempNumber) {
		if(tempNumber <= 0) {
			System.out.print(result + " ");
			result += 5;
			if(result == number) {
				System.out.print(result + " ");
				return;
			}
		}else if(tempNumber > 0) {
			System.out.print(result + " ");
			result -= 5;
			if (result <= 0) {
				tempNumber = result;
			}
		}
		pattern(number,result,tempNumber);
	}
	
	public static void main(String[] args) {
		/* Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir
		 * "Recursive" metot yazın.
		 * Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her
		 * çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5
		 * ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
		 */
		int number, result, tempNumber;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		result = number;
		tempNumber = number;
		
		if(number == 0) {
			System.out.println("0 can not be used.");
		}else {
			pattern(number,result,tempNumber);
		}
	}

}
