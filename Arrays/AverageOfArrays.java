package Arrays;

public class AverageOfArrays {

	public static void main(String[] args) {
		int[] list = {5,68,180,15,-56,-16,-6,-5,2,-48,84};
		
		double sum = 0, average;
		
		for(int i: list) {
			sum += i;
		}
		average = sum/list.length;
		System.out.println(average);
		
		/* Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
		 * Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
		 * Harmonik Seri Formülü : 1 + (1/2) + (1/3) + (1/4) + ..... 
		 */
		double harmonic = 0.0, harmAver;
		for(double j: list) {
			harmonic += 1 / j;
		}
		harmAver = list.length / harmonic;
		System.out.println(harmAver);
	}

}
