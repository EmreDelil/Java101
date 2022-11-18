package Arrays;
import java.util.Scanner;
public class MultiDimensions {

	public static void main(String[] args) {
		int[][] list = new int[6][6];
		list[0][0] = 0;
		list[2][3] = 839;
		System.out.println(list[0][0] + " " + list[2][3]);
		
		int[][] matris = {
				{0, 453, 939, 243, 783, 891},
				{453, 0, 490, 384, 620, 439},
				{939, 490, 0, 839, 863, 423},
				{243, 384, 839, 0, 544, 823},
				{783, 620, 863, 544, 0, 1045},
				{891, 439, 423, 823, 1045, 0}
		};
		System.out.println(matris[3][0]);
		
		int [][] matris2 = new int[3][4];
		System.out.println(matris2.length);
		System.out.println(matris2[0].length);
		
		int number = 1, i, j;
		int[][] matris3 = new int[3][4];
		
		for(i = 0; i < matris3.length; i++) {
			for(j = 0; j < matris3[i].length; j++) {
				matris[i][j] = number++;
			}
		}
		
		for(i = 0; i < matris3.length; i++) {
			for(j = 0; j < matris3[i].length; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
		
		// Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.
		Scanner sc = new Scanner(System.in);
		int a;
		
		int[][] matris4 = new int[3][4];
		
		for(i = 0; i < matris4.length; i++) {
			for(j = 0; j < matris4[i].length ; j++) {
				System.out.println("Enter the number of matris : ");
				a = sc.nextInt();
				matris4[i][j] = a;
			}
		}
		for(int[] b : matris4) {
			for(int c : b) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		
		/* Veya 2. ve mantıklı seçenek olarak :
		 * 
		 * int[][] matrix = new int[3][4];
		 * System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns : ");
		 * for(int row = 0; row < matrix.length; row++){
		 * 		for(int column = 0; column < matrix[row].length; column++){
		 * 			matrix[row][column] = input.nextInt();
		 * 		}
		 * }
		 */
		
		// İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.
		
		double[][] matrix = new double[5][5];
		
		for(double[] row : matrix) {
			for(double column : row) {
				column = Math.random() * 100;
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}

}
