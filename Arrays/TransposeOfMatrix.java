package Arrays;
import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		/* Çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
		 * 
		 * Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
		 * Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin
		 * transpozu (devriği) nxk’lik bir matris olur.
		 */
		Scanner scan = new Scanner(System.in);
		
		int[][] matrix = new int[2][3];
		int[][] transpose = new int[3][2];
		
		System.out.print("Enter the matrix's rows and columns : ");
		for(int row = 0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = scan.nextInt();
			}
		}
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		System.out.println("The matrix is : ");
		for(int[] a: matrix) {
			for(int b: a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose of the matrix is : ");
		for(int[] k: transpose) {
			for(int l: k) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
