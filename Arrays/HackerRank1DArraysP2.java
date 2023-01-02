package Arrays;
import java.util.Scanner;

public class HackerRank1DArraysP2 {
	
	static boolean canWin(int leap, int[] game){
        if(leap >= game.length){
            return true;
        }else if(game[leap] == 0) {
        	return true;
        }
        
        return false;
    }

	public static void main(String[] args) {
		
		int n, q, leap;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("q : ");
		q = scan.nextInt();
		if(q >= 1 && q <= 5000) {
			for(int i = 0; i < q; i++) {
				System.out.print("n : ");
				n = scan.nextInt();
				if(n >= 2 && n <= 100) {
					System.out.print("leap : ");
					leap = scan.nextInt();
					if(leap >= 0 && leap <= 100) {
						int[] game = new int[n];
						for(int j = 0; j < n; j++) {
							if(j == 0) {
								game[j] = scan.nextInt();
								if(game[j] != 0) {
									game[j] = 0;
								}
							}else {
								System.out.print("game["+(j+1)+"] : ");
								game[j] = scan.nextInt();
							}
						}
						if(game[1] == 0) {
							if(canWin(leap+1,game)) {
								System.out.println("YES");
							}else {
								System.out.println("NO");
							}
						}else {
							if(canWin(leap,game)) {
								System.out.println("YES");
							}else {
								System.out.println("NO");
							}
						}
					}else {
						q--;
					}
				}else {
					q--;
				}
			}
			scan.close();
		}
		// ------------------------------------------------------------------------------------------------
		// ------------------------------------------------------------------------------------------------
		/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            //System.out.println(n + " " + m);
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
                //System.out.print(arr[j]);
            }
            //System.out.println();
            solve(n,m,arr);
        }
    }
    
    public static void solve(int n, int m, int[] arr) {
        if (solve(n,m,arr,new boolean[n],0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    public static boolean solve(int n, int m, int[] arr, boolean[] visited, int curr) {
        if (curr + m >= n || curr + 1 == n) {
            return true;
        }
        
        boolean[] newVisited = new boolean[n];
        for (int i = 0; i < n; i++) {
            newVisited[i] = visited[i];
        }
        
        boolean s = false;
        if (!visited[curr+1] && arr[curr+1] == 0) {
            newVisited[curr+1] = true;
            s = solve(n,m,arr,newVisited,curr+1);
        }
        if (s) {
            return true;
        }
        if (m > 1 && arr[curr+m] == 0 && !visited[curr+m]) {
            newVisited[curr+m] = true;
            s = solve(n,m,arr,newVisited,curr+m);
        }
        if (s) {
            return true;
        }
        if (curr > 0 && arr[curr-1] == 0 && !visited[curr-1]) {
            newVisited[curr-1] = true;
            s = solve(n,m,arr,newVisited,curr-1); 
        }
        return s;
    }
}
		 */
	}

}
