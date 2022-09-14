package Loops;

public class ContinueBreak {

	public static void main(String[] args) {
		
		// Break komutu geldiği yerde komutu, döngüyü sonlandırır.

		for (int i = 1; i <= 10; i++) {
			if(i == 5) {
				System.out.println("i is 5.");
				break;
			}
			System.out.println(i);
		}
		System.out.println("--------------------");
		/* Continue ise o anki komutu, döngüyü atlamasını ve sonrasındaki komutu, döngüyü yapmasını sağlar.
	 	Continue komutu çalıştığı zaman altında kalan her komutu atlar hiçbiri çalışmaz. Farklı süslü 
		parantezler dahil. */
		
		for(int k = 1; k <= 10; k++) {
			if(k == 5) {
				continue;
			}
			System.out.println(k);
		}
		
		System.out.println("---------------");
		// ---------------------------------------------------------
		// Tek sayıları yazdıran program.
		
		int j = 1;
		while (j <= 10) {
			j++;
			if(j % 2 == 0) {
				continue;
			}
			System.out.println(j);
		}
	}

}
