package Arrays;

public class ForEach {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4};
		
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
		
		for(int i: list) {
			System.out.print(i + " ");
		}
		System.out.println();
		int sum = 0;
		for(int i: list) {
			sum += i;
		}
		System.out.println(sum);
		
		String[] cars = {"Mercedes", "BMW", "Audi"};
		for(String str : cars) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		int[][] matris = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}
		};
		
		for(int i = 0; i < matris.length; i++) {
			for(int k = 0; k < matris[i].length; k++) {
				System.out.print(matris[i][k] + " ");
			}
			System.out.println();
		}
		
		for(int[] row : matris) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
